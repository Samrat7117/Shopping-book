import java.io.*; //import input and output classes used in file and string handling
import jakarta.servlet.*; //import genral servlet class
import jakarta.servlet.http.*; //import hhtp specific servlet classes
import java.util.*; //import utility classes like list or array list

import jakarta.servlet.http.HttpServlet; // IT IS A BASE CLASS FOR CREATING THE HTTP SERVLET
import jakarta.servlet.http.HttpServletRequest;  // IT IS USED TO GET THE DATA FROM THE CLINT REQUEST
import jakarta.servlet.http.HttpServletResponse; //IT IS USED TO SEND RESPONSE BACK TO THE CLINT
import jakarta.servlet.http.HttpSession; //IT IS USED TO STORE USER DATA ACROSS MULTIPLE REQUEST

public class AddToCartServlet extends HttpServlet{ //CLASS DECLARATION
    protected void doGet(HttpServletRequest request, HttpServletResponse response) //doGet - handel the get request
    throws ServletException,IOException{ // used for server related errors
        String book = request.getParameter("book"); //to help you get value of the book from url or the form

        HttpSession session = request.getSession(); //used to create or get a session 

        List<String> cart = (List<String>) session.getAttribute("cart"); //it is a type casting needed session stores the object
        //it retrive the cart from the session

        if(cart == null){
            cart = new ArrayList<>(); //create a new empty cart
        }

        cart.add(book); //adding books to the cart

        session.setAttribute("cart",cart); //it is used to store the updated cart back into the session //it helps create a percentance/consistency across the pages

        response.sendRedirect("index.jsp"); //Back to the screen page or home page // just create the interface     //redirects the user to index.jsp after adding the items
        //prevent dublicate submission if page is refresh
    }
}