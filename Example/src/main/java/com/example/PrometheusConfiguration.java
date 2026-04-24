package com.example;

import io.prometheus.client.exporter.MetricsServlet;
import javax.servlet.annotation.WebServlet;

// This line tells Tomcat: "Anything that comes to /metrics, give it to Prometheus"
@WebServlet("/metrics")
public class PrometheusConfiguration extends MetricsServlet {
    // You don't need to add any code inside here! 
    // The library handles everything automatically.
}