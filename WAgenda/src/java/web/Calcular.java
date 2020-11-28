/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author FIC
 */
@WebServlet(name = "Calcular", urlPatterns = {"/Calcular"})
public class Calcular extends HttpServlet {

   private static final long serialVersionUID = 1L;  
    public Calcular() {  
        super();  
    }  
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {  
    }  
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {  
        float n1 = Float.parseFloat(request.getParameter("n1"));  
        float n2 = Float.parseFloat(request.getParameter("n2"));  
        String resp = "A soma é: " + (n1 + n2);  
        request.setAttribute("resp", resp);  
        response.sendRedirect("caculadora.jsp");  
    }  

}
