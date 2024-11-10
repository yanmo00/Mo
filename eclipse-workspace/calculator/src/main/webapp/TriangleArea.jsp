<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Triangle Area</title>
</head>
<body>
	<form action="homework0929" method="get">
		<div>
			请输入高：<input type="text" name="high" placeholder="Enter Triangle High" value="${high}">
		</div>
		<div>
			请输入底：<input type="text" name="bottom" placeholder="Enter Triangle Bottom" value="${bottom}">
		</div>
		<input type="text" name="area" value="${area}">
		<input type="submit" value="Calculate">
	</form>
</body>
</html>