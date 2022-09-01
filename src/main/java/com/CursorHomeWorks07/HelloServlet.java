package com.CursorHomeWorks07;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/my-hello-servlet")
public class HelloServlet extends HttpServlet {

    private String message = "Hello from my servlet!";

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h2 style=\"color:cadetblue;\">" + message + "</h2>");
        out.println("</body></html>");
    }
}
