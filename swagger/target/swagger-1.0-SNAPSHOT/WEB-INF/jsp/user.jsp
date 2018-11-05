<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head></head>
<body>
<h1 style="text-align: center">人物</h1>
<table>
    <tr>
        <th>编号</th>
        <th>名字</th>
        <th>密码</th>
        <th>名</th>
        <th>姓</th>
        <th>Email</th>
        <th>手机</th>
        <th>状态</th>
    </tr>
    <tbody>
    <c:forEach var="u" items="${Users}">
        <tr>
            <td> ${u.u_id} </td>
            <td> ${u.u_username} </td>
            <td> ${u.u_password} </td>
            <td> ${u.u_firstName} </td>
            <td> ${u.u_lastName} </td>
            <td> ${u.u_email} </td>
            <td> ${u.u_phone} </td>
            <td> ${u.u_status} </td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>
