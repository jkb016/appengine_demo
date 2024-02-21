java 17 appengine standard demo project to demonstrate failure of email with attachment. Java Mail API in appengine sdk is used.
Issue is in appengine receiving email. 
reference for : Receiving mail with the Mail API https://cloud.google.com/appengine/docs/standard/services/mail/receiving-mail-with-mail-api?tab=java

email without attachment works fine, you can see logs in GCP cloud logging.

email with attachment - there are **no** logs and request handler is not called.

## code walkthrough : 
src/main/java/com/collavate/servlet/MyServlet.java
Servlet to handle incoming emails. methods : 

### first build 
install java 17 or later

install maven 3.5 or later

install gcloud

login to gcloud with command : gcloud auth login

mvn clean package

### run project
mvn package appengine:run

### deploy project
mvn -o package appengine:deploy -Dapp.deploy.projectId={projectId} -Dapp.deploy.version=1

example for project : mail-service-test-dev01
  mvn -o package appengine:deploy -Dapp.deploy.projectId=mail-service-test-dev01 -Dapp.deploy.version=1
  
### email address
email address of appengine project :  mail@{projectId}.appspotmail.com 
  
eg : mail@mail-service-test-dev01.appspotmail.com

send normal email to above address to test issue.

test 1 : send 1 email with subject, body and without any attachment. 

test 2 : send 1 email with subject, body and attachment. 

check logs at gcp cloud logging console. you can filter logs with search query : 

resource.type="gae_app"

resource.labels.module_id="default"

resource.labels.version_id="1"

"/_ah/mail/mail@"