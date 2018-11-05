<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head></head>
<body>
<h1 style="text-align: center">宠物</h1>
<table>
    <tr>
        <th>编号</th>
        <th>名字</th>
        <th>类别</th>
        <th>标签</th>
        <th>状态</th>
    </tr>
    <tbody>
    <c:forEach var="p" items="${Pets}">
        <tr>
            <td> ${p.p_id} </td>
            <td> ${p.category.c_name} </td>
            <td> ${p.p_name} </td>
            <td> ${p.tag.t_name} </td>
            <td> ${p.p_status} </td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>
