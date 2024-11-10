<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>会员注册</title>
</head>
<body>
<style>
h2{
	text-align:center;
}
table {
    border-collapse: collapse;
    width: 80%;
}

tr {
    background-color: #f2f2f2;
    padding: 5px;
}

td {
    border: 1px solid #ddd;
    text-align: left;
    padding: 10px;
}
</style>
</head>
<body>
<h2>会员注册</h2>
<form action="register" method="post">
<table align="center">
    <tr>
        <td>用户名：</td>
        <td><input type="text" name="username" required></td>
    </tr>
    <tr>
        <td>密码：</td>
        <td><input type="password" name="password" required></td>
    </tr>
    <tr>
    	<td>性别：</td>
    	<td>
    		<input type="radio" name="sex" value="male" required> 男
            <input type="radio" name="sex" value="female" required> 女
        </td>
    </tr>
    <tr>
    	<td>手机号：</td>
    	<td><input type="number" name="phone"></td>
    </tr>
    <tr>
        <td colspan="2" style="text-align:center;">
            <input type="submit" value="注册">
            <input type="reset" value="重置">
        </td>
    </tr>
</table>
</form>
</body>
</body>
</html>