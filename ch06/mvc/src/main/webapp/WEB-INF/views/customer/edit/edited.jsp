<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>업데이트 완료</title>
</head>
<body>
<h1>업데이트 완료</h1>
<dl>
    <dt>애름</dt>
    <dd><c:out value="${editCustomer.name}"/></dd>
    <dt>이메일 주소</dt>
    <dd><c:out value="${editCustomer.emailAddress}"/></dd>
    <dt>생일</dt>
    <dd><fmt:formatDate pattern="yyyy/MM/dd" value="${editCustomer.birthday}"/></dd>
    <dt>좋아하는 숫자</dt>
    <dd><c:out value="${editCustomer.favoriteNumber}"/></dd>
</dl>
<c:url var="url" value="/customer"/>
<a href="${url}">돌아가기</a>
</body>
</html>