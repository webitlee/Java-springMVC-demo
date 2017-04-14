<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>成功啦</h1>
	当前时间：${requestScope.time}
	名字：${requestScope.name}
	request 用户：${requestScope.user}
	sessionAttribute 用户：${sessionScope.user}
</body>
</html>