package com.ceit.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AppController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH：mm：ss");

		response.setContentType("text/html;charset=utf-8");// <b>必须</b>，规定输出文件类型和字符集
		PrintWriter pw = response.getWriter();// 获得输出流
		pw.println("<h1>你好！世界</h1>");// 在输出流中写入数据
		pw.println("<p>这个页面很简单，但正如大家所见，它不是预先写好并以html文本的形式存放于服务器，而是由servlet生成的，每发送一次请求就生成一次，这就是所谓<b>动态</b>页面。</p>");
		pw.println("<p>这两种方式的区别就像食堂的大锅菜和小炒一样，后者可以根据不同的要求进行处理,获得不同的效果</p>");
		pw.println("<p>例如，以下的页面生成时间就是实时获得，不可能预先写好</p>");
		pw.println("<p>本页面生成时间为："+sdf.format(new Date())+"</p>");
		pw.close();// <b>必须</b>，关闭输出流

	}
}