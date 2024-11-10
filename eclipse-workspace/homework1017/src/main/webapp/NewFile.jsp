<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
	table {
	  border-collapse: collapse;
	  width: 80%;
	}
	
	/* 设置所有表行的样式 */
	tr {
	  background-color: #f2f2f2; /* 设置背景颜色 */
	  padding: 5px; /* 设置内边距 */
	}
	 
	/* 设置所有单元格的样式 */
	td {
	  border: 1px solid #ddd; /* 设置边框 */
	  text-align: left; /* 设置文本对齐 */
	  padding: 10px; /* 设置内边距 */
	}
</style>
</head>
	<body>
	<p>成绩录入</p>
		<table algin="center">
			<form action="test" method="post">
				<tr>
				     <td>姓名：</td>
				     <td><input type="text" name="xm"></td>
				</tr>
				<tr>
				     <td>成绩：</td>
				     <td><input type="text" name="cj"></td>
				</tr>
				<tr>
				     <td><input type="submit" value="确定"></td>
				     <td><input type="reset" value="重置"></td>
				</tr>
			</form>
		</table>
	</body>
</html>
