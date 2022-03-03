package votaduc.controllers;

import java.io.IOException;
import java.sql.Connection;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import votaduc.models.Product;
import votaduc.services.DatabaseService;
import votaduc.services.ProductService;

public class ProductController extends HttpServlet {
	
	
//	@Override

	protected void doGet (HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		
		response.setContentType("text/html;charset=UTF-8");
		
		int id=Integer.parseInt(request.getParameter("id"));
		
		Connection conn = DatabaseService.getConnection();
		
		ProductService productService = new ProductService();
		
		Product product = productService.getProduct(conn,id);
		request.setAttribute("product", product);
		
		List<Product> hotnew = productService.getProductHotNew(conn);
		request.setAttribute("Hotnew", hotnew);
		
		
		RequestDispatcher dispatcher = request.getServletContext().getRequestDispatcher("/WEB-INF/views/product/product.jsp");
		dispatcher.forward (request, response);
	}
}
