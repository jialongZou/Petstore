<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>商店所有宠物</title>
    <link href="../CSS/swagger_index.css" rel="stylesheet" type="text/css"/>
</head>
<body>
<h1 style="text-align: center">商店所有宠物</h1>
<div>
    <table>
        <tr>
            <th>编号</th>
            <th>名字</th>
            <th>类别</th>
            <th>标签</th>
            <th>状态</th>
        </tr>
        <tbody>
        <c:forEach var="p" items="${Pets_2}">
            <tr>
                <td> ${p.p_id} </td>
                <td> ${p.p_name} </td>
                <td> ${p.category.c_name} </td>
                <td> ${p.tag.t_name} </td>
                <td> ${p.p_status} </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>
