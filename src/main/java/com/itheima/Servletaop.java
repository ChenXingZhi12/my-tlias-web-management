package com.itheima; /**
* ClassName: ${NAME}
* Package: ${PACKAGE_NAME}
* Description:
* @Author chenxingzhi
* @Create 2023/10/8 9:51
* @Version 1.0
*/
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Servletaop", value = "/Servletaop")
public class Servletaop extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
