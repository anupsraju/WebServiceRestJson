package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

@WebServlet(urlPatterns = {"/jsonResponse"})
public class JsonResponse extends HttpServlet {

	private static final long serialVersionUID = -5373671101428331839L;

	@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/json");
        response.setCharacterEncoding("utf-8");
        Student student = new Student(12, "John Doe", "Male", "12378");
        Subject subject1 = new Subject(1, "Computer Fundamentals");
        Subject subject2 = new Subject(2, "Computer Graphics");
        Subject subject3 = new Subject(3, "Data Structures");
        Set subjects = new HashSet();
        subjects.add(subject1);
        subjects.add(subject2);
        subjects.add(subject3);
        student.setSubjects(subjects);
        Address address = new Address(1, "123", "123 Main St", "Seattle", "WA", "USA");
        student.setAddress(address);
        Gson gson = new Gson();
        String jsonData = gson.toJson(student);
        PrintWriter out = response.getWriter();
        try {
            out.println(jsonData);
        } finally {
            out.close();
        }

    }
}