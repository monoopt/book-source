package com.javaee.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/student")
public class StudentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String idStr = request.getParameter("id");
        Long id = Long.parseLong(idStr);

        StudentDao dao = new StudentDao();
        Student student = dao.getById(id);
        String dstUrl="view.jsp";
        request.setAttribute("s", student);
        request.getRequestDispatcher(dstUrl).forward(request, response);
    }
}
