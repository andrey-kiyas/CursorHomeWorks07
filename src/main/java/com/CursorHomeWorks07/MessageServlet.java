package com.CursorHomeWorks07;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/my-message-servlet")
public class MessageServlet extends HttpServlet {

    private final String name = "Derek";
    private final String mood = "good";
    private final String place = "Dnepr";

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h2 style=\"color:cadetblue;\">" + "Hi, " + name + ", from " + place + "! You are felling " + mood + ". </h2>");
        out.println("</body></html>");
    }
}
