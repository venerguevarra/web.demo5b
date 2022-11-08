<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java"%>
<jsp:useBean id="registrationFormBean"
	class="com.bootcamp.demo.bean.RegistrationFormBean" scope="request" />
<html>
<head>
<title>Webshoppe::Registration</title>
<style type="text/css">
body {
	margin: 50px;
}

.error {
	color: #FF0000;
	font-weight: bold;
}
</style>
</head>
<body>
	<h2>Success</h2>
	<hr />
	Welcome,
	<c:out value="${registrationFormBean.username}" />
</body>
</html>