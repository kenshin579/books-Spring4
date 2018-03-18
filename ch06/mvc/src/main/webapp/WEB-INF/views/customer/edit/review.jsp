<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>이메일 주소 화면</title>
</head>
<body>
<h1>이메일 주소 화면</h1>
<form method="post">
    <dl>
        <dt>이름</dt>
        <dd><c:out value="${editCustomer.name}"/></dd>
        <dt>이메일 주소</dt>
        <dd><c:out value="${editCustomer.emailAddress}"/></dd>
        <dt>생일</dt>
        <dd><fmt:formatDate pattern="yyyy/MM/dd" value="${editCustomer.birthday}"/></dd>
        <dt>좋아하는 숫자</dt>
        <dd><c:out value="${editCustomer.favoriteNumber}"/></dd>
    </dl>
    <button type="submit" name="_event_confirmed">업데이트 완료</button>
    <button type="submit" name="_event_revise">다시 입력</button>
</form>
</body>
</html>