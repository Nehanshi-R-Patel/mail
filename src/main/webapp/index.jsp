<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="sendMail.do" method="post">
		MailId:
		<input type="text" name="toMailId"><br><br><br>
		
		Subject:
		<input type="text" name="subject"><br><br><br>
		
		Body:
		<textarea rows="5" name="body"></textarea><br><br><br>
		
		<input type="submit" value="SendEmail"> 
		
	</form>
</body>
</html>