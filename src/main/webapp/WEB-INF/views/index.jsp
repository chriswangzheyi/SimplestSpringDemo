<html>
<body>
	<h2>Hello World!</h2>
	<form id="setDetails" action="uploadFiles" method='post'
		enctype="multipart/form-data">
		<!-- 上传文件必须加enctype="multipart/form-data" -->
		<div>
			<input type="file" id="file" multiple="multiple" name="multifiles" />
		</div>
		
		 <input type="submit" value="upload" />
		
	</form>
</body>
</html>
