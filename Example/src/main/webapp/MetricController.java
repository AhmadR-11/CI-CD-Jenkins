import io.prometheus.client.Counter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/increment")
public class MetricController extends HttpServlet {
    // This is the name you will search for in Prometheus!
    static final Counter clickCounter = Counter.build()
        .name("my_button_clicks_total")
        .help("Total number of button clicks.")
        .register();

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        clickCounter.inc(); // This adds 1 to the Prometheus counter
    }
}