<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>你好</title>
</head>
<body>
	<h1>你好</h1>
	<p>这个页面很简单，但正如大家所见，它不是预先写好并以html文本的形式存放于服务器，而是由servlet生成的，每发送一次请求就生成一次，这就是所谓动态页面。
	</p>
	<p>这两种方式的区别就像食堂的大锅菜和小炒一样，后者可以根据不同的要求进行处理,获得不同的效果</p>
	<p>例如，以下的页面生成时间必须实时获得，不可能预先写好</p>
	<p>本页面生成时间为：<%=request.getAttribute("buildtime") %></p>
</body>
</html>