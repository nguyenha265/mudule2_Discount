import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PipedWriter;
import java.io.PrintWriter;

@WebServlet(name = "DiscountServlet", urlPatterns = "/index")
public class DiscountServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nameProducts = request.getParameter("nameProducts");
        float priceProducts = Float.parseFloat(request.getParameter("priceProducts"));
        float discount = Float.parseFloat(request.getParameter("discount"));
        int amount = Integer.parseInt(request.getParameter("amount"));
        float amountDiscount = priceProducts * amount * (discount/100);


        response.setContentType("text/html;charset=UTF-8");
        PrintWriter writer = response.getWriter();

        writer.println("<h1> tên sản phẩm : " + nameProducts + "</h1><br>");
        writer.println("<h1> số tiền sản phẩm : " + priceProducts + "</h1><br>");
        writer.println("<h1> số % chiết khấu : " + discount + "</h1><br>");
        writer.println("<h1> số lượng : " + amount + "</h1><br>");
        writer.println("<h1> số tiền được chiết khấu : " + amountDiscount + "</h1><br>");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}