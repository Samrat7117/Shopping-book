// import java.io.*;
// import jakarta.servlet.*; //java ee (enterprise editionn)
// import jakarta.servlet.http.*;
// import java.util.*;
// import jakarta.servlet.http.HttpServlet; // IT IS A BASE CLASS FOR CREATING THE HTTP SERVLET
// import jakarta.servlet.http.HttpServletRequest;  // IT IS USED TO GET THE DATA FROM THE CLINT
// import jakarta.servlet.http.HttpServletResponse;
// import jakarta.servlet.http.HttpSession;

// public class ViewCartServlet extends HttpServlet{
//     protected void doGet(HttpServletRequest request, HttpServletResponse response)
//     throws ServletException,IOException{
//         HttpSession session = request.getSession();

//         List<String> cart = (List<String>) session.getAttribute("cart");

//         response.setContentType("text/html"); //it tells the browser that the response is it html form or html content
//         PrintWriter out = response.getWriter(); //it help you send html output to the browser

//         out.println("<h2>Your Cart</h2>");

//         if(cart != null){ //if cart not null print each book line by line 
//             for(String book : cart){
//                 out.println(book + "<br>");
//             }
//         }else{ //if cart null print this line
//             out.println("Cart is empty");
//         }
//     }
// }





// ################  WITH CSS  ##################################
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.util.*;

public class ViewCartServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

        HttpSession session = request.getSession();
        List<String> cart = (List<String>) session.getAttribute("cart");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // HTML Start
        out.println("<html><head><title>My Cart</title>");

        // CSS Design
        out.println("<style>");
        out.println("body { font-family: Arial; background:#f5f5f5; margin:0; }");

        out.println(".navbar { background:#333; color:white; padding:15px; display:flex; justify-content:space-between; }");
        out.println(".logo { font-size:20px; font-weight:bold; }");
        out.println(".home-btn { background:#ff9800; border:none; padding:8px 15px; color:white; border-radius:5px; cursor:pointer; }");

        out.println(".container { width:50%; margin:40px auto; background:white; padding:20px; border-radius:10px; box-shadow:0 0 10px rgba(0,0,0,0.1); }");

        out.println(".book { padding:10px; margin:10px 0; background:#e3f2fd; border-radius:5px; }");

        out.println(".empty { color:red; font-weight:bold; }");

        out.println("</style>");
        out.println("</head><body>");

        // Navbar
        out.println("<div class='navbar'>");
        out.println("<div class='logo'>MyBookStore</div>");
        out.println("<button class='home-btn' onclick=\"window.location.href='index.jsp'\">Home</button>");
        out.println("</div>");

        // Cart Container
        out.println("<div class='container'>");
        out.println("<h2>Your Cart</h2>");

        if (cart != null && !cart.isEmpty()) {
            for (String book : cart) {
                out.println("<div class='book'>" + book + "</div>");
            }
        } else {
            out.println("<p class='empty'>Cart is empty 😢</p>");
        }

        out.println("</div>");

        out.println("</body></html>");
    }
} 