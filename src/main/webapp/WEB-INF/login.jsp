<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
     <!DOCTYPE web-app PUBLIC
	"-//Sun Microsystems, Inc.//DTD Web Application 2.3//EN"
	"http://java.sun.com/dtd/web-app_2_3.dtd">

 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
     <%@ page isELIgnored="false" %>
<html>
<head>

<title>Insert title here</title>
</head>
<body>
login page
<c:if test="${param.error!=null }">
<i>invalid login</i>
</c:if>

<c:if test="${param.logout!=null }">
<i>you are logged out</i>
</c:if>
<form:form>
user:<input type="text" name="username"><br>
password:<input type="password" name="password"/><br>
<input type="submit"/>
</form:form>
</body>
</html>