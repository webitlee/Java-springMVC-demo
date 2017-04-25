<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="/springMVC/script/jquery-3.0.0.min.js"></script>
</head>
<body>
	<a href="/springMVC/hello">hello world</a>
	<br/>
	<a href="/springMVC/springmvc/requestMapping">test requestMapping</a>
	<br/>
	<!-- 这里是一个 get请求-->
	<a href="/springMVC/springmvc/requestMapping2">test requestMapping2</a>
	<form action="/springMVC/springmvc/requestMapping2" method="post">
		<input type="submit" value="提交"/>
	</form>
	<br/>
	<a href="/springMVC/springmvc/pathVariable/2222">test PathVariable</a>
	<br/>
	<a href="/springMVC/springmvc/testRest/1">test REST get</a>
	<br/>
	<form action="/springMVC/springmvc/testRest/1" method="post">
		<input type="submit" value="test REST post"/>
	</form>
	<br/>
	<form action="/springMVC/springmvc/testRest/1" method="post">
		<input type="hidden" name="_method" value="DELETE"/>
		<input type="submit" value="test REST DELETE"/>
	</form>
	<br/>
	<form action="/springMVC/springmvc/testRest/1" method="post">
		<input type="hidden" name="_method" value="PUT"/>
		<input type="submit" value="test REST PUT"/>
	</form>
	<br/>
	<a href="/springMVC/springmvc/testRequestParam?user=lee&age=20">test RequestParam</a>
	<br/>
	<form action="/springMVC/springmvc/testPojo" method="post">
		用户名：<input name="username" type="text"/>
		<br/>
		密码：<input name="password" type="password"/>
		<br/>
		年龄：<input name="age" type="text"/>
		<br/>
		省：<input name="address.province" type="text"/>
		<br/>
		市：<input name="address.city" type="text"/>
		<br/>
		<input type="submit" value="提交"/>
	</form>
	<br/>
	<a href="/springMVC/springmvc/testServletApi">test ServletApi</a>
	<br/>
	<a href="/springMVC/testModelAndView">test ModelAndView</a>
	<br/>
	<a href="/springMVC/testMap">test Map</a>
	<br/>
	<a href="/springMVC/testSessionAttribute">test SessionAttribute</a>
	<br/>
	<form action="/springMVC/testModelAttribute" method="post">
		<input type="hidden" name="id" value="1"/>
		username:<input type="text" name="username" value="lee"/>
		<br/>
		age:<input type="text" name="age" value="20"/>
		<br/>
		<input type="submit" value="提交"/>
	</form>
	<br/>
	<a href="/springMVC/testViewResolver">test viewResolver</a>
	<br/>
	<a href="/springMVC/testView">test　View</a>
	<br/>
	<a href="/springMVC/testRedirect">test Redirect</a>
	<br/>
	<a href="/springMVC/testForward">test forward</a>
	<br/>
	<form action="/springMVC/testConvertor" method="post">
		User:<input type="text" name="user"/>
		<input type="submit" value="test Converter"/>
	</form>
	<br/>
	<form action="/springMVC/testDateTimeFormat" method="post">
		<input type="hidden" name="id"/>
		name:<input type="text" name="username"/>
		<br/>
		birth:<input type="text" name="birth"/>
		<br/>
		salary:<input type="text" name="salary"/>
		<br/>
		age:<input type="text" name="age"/>
		<br/>
		province:<input type="text" name="address.province"/>
		<br/>
		city:<input type="text" name="address.city"/>
		<br/>
		<input type="submit" value="test DateTimeFormat"/>
		<br/>
		<a href="/springMVC/testJson" id="return_json">test return JSON</a>
	</form>
	<br/>
	<form action="/springMVC/testResponseBody" method="post" enctype="multipart/form-data">
		<input type="file"/>
		<input type="submit" value="test @ResponseBody"/>
	</form>
	<br/>
	<form action="/springMVC/testFileUpload" method="post" enctype="multipart/form-data">
		<input type="file" name="file"/>
		<input type="text" name="desc"/>
		<input type="submit" value="test fileUpload"/>
	</form>
</body>
<script>
	$('#return_json').click(function(e){
		e.preventDefault();
		$.post($(this).attr('href'),{}, function(data){
			console.log(data);
		})
	})
	
</script>
</html>