package com.example;

import io.prometheus.client.Counter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/increment")
public class MetricController extends HttpServlet {
    // This is the name you will search for in Prometheus!
    static final Counter clickCounter = Counter.build()
        .name("my_button_clicks_total")
        .help("Total number of button clicks.")
        .register();

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        clickCounter.inc(); // This adds 1 to the Prometheus counter
    }
}