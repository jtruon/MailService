# MailService
MaillingService

Description: This is the mailing service using FreeMarker Template to consume html as the body of the email.

 HOW TO RUN
=====================================================================================
                                             
				      
Postman: POST localhost:8082/sendEmail
===================================
RequestBody: 
{
	"to":"example@mai.com",
	"from":"example@mai.com",
	"subject":"Java Pecan Surge Mail",
	"name":"Joey"
}
===================================
Response
{
    "message": "Email send to : example@mail.com",
    "status": true
}
=====================================================================================
