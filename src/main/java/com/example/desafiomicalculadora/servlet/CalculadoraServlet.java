package com.example.desafiomicalculadora.servlet;

import com.example.desafiomicalculadora.service.Calculadora;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "CalculadoraServlet", value = "/calculadora")
public class CalculadoraServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String error;
        int n1;
        int n2;
        String op = req.getParameter("operation");

        try {
            n1 = Integer.parseInt(req.getParameter("numero1"));
            n2 = Integer.parseInt(req.getParameter("numero2"));

        } catch (NumberFormatException e) {
            error = "Ambos valores deben ser numeros enteros.";
            req.setAttribute("error", error);
            RequestDispatcher dispatcher = req.getRequestDispatcher("index.jsp");
            dispatcher.forward(req, resp);
            return;
        }

        // Procesamos los valores.
        Calculadora c = new Calculadora(n1, n2, op);
        try {
            int resultado = c.calcular();
            req.setAttribute("resultado", resultado);
            RequestDispatcher dispatcher = req.getRequestDispatcher("response.jsp");
            dispatcher.forward(req, resp);

        } catch (IllegalArgumentException e) {
            error = e.getMessage();
            req.setAttribute("error", error);
            RequestDispatcher dispatcher = req.getRequestDispatcher("index.jsp");
            dispatcher.forward(req, resp);
        }
    }
}
