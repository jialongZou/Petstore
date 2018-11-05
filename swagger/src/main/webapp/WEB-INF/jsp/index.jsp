<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>首页</title>
    <link href="../CSS/swagger_index.css" rel="stylesheet" type="text/css"/>
    <script src="../JS/index.js"></script>

</head>
<body>
<h1 id="h1" style="text-align: center">宠物列表</h1>
<input id="btn_1" type="button" value="查看未上架宠物"/><br><br>
<input type="text"/>  <input type="button" id="sele_id" value="ID查找宠物"/><br><br>
<div id="div1">
<table>
    <tr>
        <th>编号</th>
        <th>名字</th>
        <th>类别</th>
        <th>标签</th>
        <th>状态</th>
        <th>操作</th>

    </tr>
    <tbody>
    <c:forEach var="p" items="${Pets}">
        <tr>
            <td> ${p.p_id} </td>
            <td> ${p.p_name} </td>
            <td> ${p.category.c_name} </td>
            <td> ${p.tag.t_name} </td>
            <td> ${p.p_status} </td>
            <td> <a href="/delete/${p.p_id}">删除</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</div>
<div style="display:none" id="div2">
    <table>
        <tr>
            <th>编号</th>
            <th>名字</th>
            <th>类别</th>
            <th>标签</th>
            <th>状态</th>
            <th>操作</th>
        </tr>
        <tbody>
        <c:forEach var="p" items="${Pets2}">
            <tr>
                <td> ${p.p_id} </td>
                <td> ${p.p_name} </td>
                <td> ${p.category.c_name} </td>
                <td> ${p.tag.t_name} </td>
                <td> ${p.p_status} </td>
                <td><a href="/update/${p.p_id}">入店</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>
