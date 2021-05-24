import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

@WebServlet(name = "login", urlPatterns = "/login")
//@WebServlet(name = "login", value = "/login",urlPatterns = "/login")
public class Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        PrintWriter writer = response.getWriter();

//        Date today = new Date();
//        writer.println("<h1>" + today + "</h1>");


        String username = request.getParameter("username");
        String password = request.getParameter("password");
//        phương thức request.getParameter() được sử dụng để lấy tham số được đẩy lên từ form.
        PrintWriter writer = response.getWriter();
        writer.println("<html>");

        if ("admin".equals(username) && "admin".equals(password)) {
            writer.println("<h1>Welcome " + username + " to website</h1>");
        } else {
            writer.println("<h1>Login Error</h1>");
        }

        writer.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");
//        phương thức request.getParameter() được sử dụng để lấy tham số được đẩy lên từ form.
        PrintWriter writer = response.getWriter();
        writer.println("<html>");

        if ("admin".equals(username) && "admin".equals(password)) {
            writer.println("<h1>Welcome " + username + " to website</h1>");
        } else {
            writer.println("<h1>Login Error</h1>");
        }

        writer.println("</html>");


    }


}
