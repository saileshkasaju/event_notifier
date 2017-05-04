<%--
  Created by IntelliJ IDEA.
  User: Edge
  Date: 5/4/2017
  Time: 9:07 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <title>Event</title>
    <style>
        .error {
            color: #ff0000;
        }
        .errorblock {
            color: #000;
            background-color: #ffeeee;
            border: 3px solid #ff0000;
            padding: 8px;
            margin: 16px;
        }
    </style>
</head>
<body>
<h1>Event</h1>

<form:form commandName="event">
    <form:errors path="*" cssClass="errorblock" element="div"/>
    <label for="textinput1">Enter minutes</label>
    <form:input path="name" cssErrorClass="error"/>
    <form:errors path="name" cssClass="error" />
    <br>
    <input type="submit" class="btn" value="Enter Event" />
</form:form>
</body>
</html>
