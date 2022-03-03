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

public class HomeController extends HttpServlet {
	@Override

	public void doGet(HttpServletRequest request,HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		Connection conn = DatabaseService.getConnection();
		
		ProductService productService = new ProductService();	
		List<Product> dealsOfWeek = productService.getProductDealOfWeek(conn);
		request.setAttribute("dealsOfWeek", dealsOfWeek);
		
		List<Product> features = productService.getProductFeatured(conn);
		request.setAttribute("dealsOfFeatured", features);
		
		List<Product> hotbest = productService.getProductHotbest(conn);
		request.setAttribute("Hotbest", hotbest);
		
		List<Product> hotnew = productService.getProductHotNew(conn);
		request.setAttribute("Hotnew", hotnew);
		
		RequestDispatcher dispatcher=request.getRequestDispatcher("WEB-INF/views/home/home.jsp");
		dispatcher.forward(request, response);
		
	}
}

