<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Calculator</title>
</head>

<body>
	<form action="homework0927" method="get">
		<p class="all">
			<input class="first" type="text" name="a" placeholder="Enter first number" value="${a}">+
			<input class="second" type="text" name="b" placeholder="Enter second number" value="${b}">=
			<input class="result" type="text" name="result" value="${result}">
			<input class="button" type="submit" value="Calculate">
		</p>
	</form>
</body>

<style>
	.all{
		text-align: center;
		margin-top: 350px;
	}
	.first{
		height: 20px;
		width: 400px;
		
	}
	.second{
		height: 20px;
		width: 400px;
	}
	.result{
		height: 20px;
	}
	.button{
		height: 25px;
	}

</style>
</html>