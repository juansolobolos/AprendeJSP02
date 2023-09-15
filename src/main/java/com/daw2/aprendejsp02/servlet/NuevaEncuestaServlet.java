package com.daw2.aprendejsp02.servlet;

import com.daw2.aprendejsp02.entity.Encuesta;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

@WebServlet(name = "nuevaencuestaservlet", value = "encuestas/nueva")
public class NuevaEncuestaServlet extends HttpServlet {

    private List<Encuesta> encuestas;

    private String message;

    public void init() {
        System.out.println("INIT");
        encuestas = new ArrayList<>();

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        System.out.println("GET");
        request.getAttribute("encuestas", encuestas);
        request.getRequestDispatcher("/formulario.jsp").forward(request, response);


    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        System.out.println("POST");

        Map<String, String[]> formParams = request.getParameterMap();
        String nif = request.getParameter("nif").trim;
        String nombre = request.getParameter("nombre").trim;
        String apellido1 = request.getParameter("apellido1").trim;
        Encuesta encuesta = new Encuesta();
        encuesta.setNif(nif);
        encuesta.setNombre(nombre);
        encuesta.setApellido1(apellido1);
        encuestas.add(encuesta);

        request.setAttribute("encuestas", encuestas);
        request.getRequestDispatcher("/formulario.jsp").forward(request, response);
    }

    public void destroy() {
    }
}