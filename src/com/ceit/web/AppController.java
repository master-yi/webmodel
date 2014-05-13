package com.ceit.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AppController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		
		response.setContentType("text/html;charset=utf-8");//<b>必须</b>，规定输出文件类型和字符集
		PrintWriter pw = response.getWriter();//获得输出流
		pw.println("<h1>你好！世界</h1>");//在输出流中写入数据
		pw.close();//<b>必须</b>，关闭输出流
		
	}
}