<html>
<head>
	<title>测试freemarker</title>
</head>
<body>
	<h1>这是freemarker页面</h1>
	1.测试简单的数据<br>
	<label>姓名：</label>${name}<br>
	<label>年龄：</label>${age}<br>
	<label>班级：</label>${classzs}<br>
	2.测试list数据<br>
	<#list students as s>		
		${s_index}-${s.name}-${s.age}-${s.classzs}<br>
	</#list>
</body>
</html>
