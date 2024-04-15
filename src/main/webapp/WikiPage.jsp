<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    	<meta charset="UTF-8">
        <title>Wiki</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" 
        rel="stylesheet" 
        integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" 
        crossorigin="anonymous">
    </head>
    <body>
    	<c:choose>
	    	<c:when test="${!empty wikis}">
	    		<div style="display: flex; flex-direction: row;">
			    	<span style="width:50%; margin: 40px; padding: 1%;">
					    <form method="get" action="/pris/titleAndContent">
					        <select name="title">
					            <c:forEach items="${wikis}" var="w">
					                <option style="text-align: center;" value="${w.title}">${w.title}</option>
					            </c:forEach>
					        </select>
					        <input type="submit" value="Prikaži"/>
					    </form>
			        </span>
					<span style="text-align: center; margin: 40px; width:80%; padding: 1%;">
						<c:if test="${!empty wiki}">
							<h1>${wiki.title}</h1><br>
						    <p style="text-align: justify;">${wiki.content}</p>
					    </c:if>
					    <c:if test="${!empty error}">
							<p style="color: red">${error}</p>
					    </c:if>
				    </span>
				</div>
	        </c:when>
	        <c:otherwise>
	    		<a href="/pris/wikiLink">Wiki</a>
	    	</c:otherwise>
    	</c:choose>
    </body>
</html>