<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>会员系统</title>
<style>
		.mydiv{
			    margin-top: 20px;
			    margin-right: auto;
			    margin-left: auto;
			    margin-bottom: auto;
			    width: 300px;
			    height: 350px;
			    border: 2px solid #000000;
			    background-color: #FFFFFF;
			    padding-right: 0px;
			    padding-top: 40px;
			    color: #209080;
			    font-style: italic;
			    font-size: large;
			}
			
			.d0 {
			    margin-top: 200px;
			    margin-right: auto;
			    margin-left: auto;
			    margin-bottom: auto;
			    background-color: #FFFFFF;
			    width: 400px;
			    padding-top: 30px;
			    background-image: url(preview.jpg);
			    height: 450px;
			}
		form{
			width:300px;
			margin:auto;
		}
		.button{
			background-color:#0AF;
			color:white;
			border:1px solid #ccc;
			border-radius:5px;
			margin-top:30px;
			margin-left:40px;
			height: 35px;
			width: 90px
		}
		input[type=text],input[type=password],input[type=radio],input[type=number]{
			padding:5px 20px;
			margin:10px 0;
		}
	
</style>
</head>
<body>
		<div class="d0">
			<div class="mydiv">
				<p align="center"><strong><em><font style="color:#006274">会 员 系 统</font></em></strong></p>
				<form action="RegisterServlet" method="post">
						<label for="username" style="margin-left:5px">用户名:</label>&nbsp;
						<input type="text" name="username" />
						<br/>
						
						<label for="password" style="margin-left:5px">密码:</label>&nbsp;&nbsp;&nbsp;&nbsp;
						<input type="password" name="password" style="margin-left:5px"/>
						<br/>
						
						<label for="sex" name="sex" id="sex" style="margin-left:5px">性别:</label>&nbsp;&nbsp;&nbsp;
						<input type="radio" name="sex" value="male" required style="margin-left:10px"> 男
				        <input type="radio" name="sex" value="female" required style="margin-left:40px"> 女
				        <br/>
				        
				        <label for="phone" name="phone" id="phone" style="margin-left:5px">电话:</label>&nbsp;&nbsp;&nbsp;
				        <input type="number" name="phone" id="phone" style="margin-left:10px">
				        <br/>
			            <tr>  
			                <td colspan="2" style="text-align:center;"> 
			                    <input type="submit" value="注册" class="button"> 
			                    <input type="reset" value="重置" class="button"> 
			                </td>  
		          		</tr>  
				</form>
			</div>
		</div>
</body>
</html>