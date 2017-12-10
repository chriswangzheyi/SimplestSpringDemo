<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>  
<head>          
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />   
</head>  
<body>  
<h3>测试下载Excel功能</h3>  
<form action="/file/download" enctype="multipart/form-data" method="post">  
    <input type="submit" value="下载Excel"></input>     
</form>  
  
<h3>测试上传Excel功能</h3>  
<form action="/file/upload" enctype="multipart/form-data" method="post">  
    <input type="file" name="file"></input>  
    <input type="submit" value="上传Excel"></input>     
</form>  
</body>  
</html>  