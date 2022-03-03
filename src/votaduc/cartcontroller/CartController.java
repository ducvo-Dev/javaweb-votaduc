package votaduc.cartcontroller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import votaduc.beans.CartBean;

public class CartController extends HttpServlet {
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		request.setCharacterEncoding("UTF-8");
		String iAction=request.getParameter("action");
		
		if(iAction!=null&&!iAction.equals("")) {
			if(iAction.equals("Thêm Vào Giỏ Hàng")) {
				addToCart(request);
			}else if(iAction.equals("Cập nhật")) {
				updateCart(request);
			}else if(iAction.equals("Xóa")) {
				deleteCart(request);
			}
			
		}
		response.sendRedirect("ListCart");
	}
	protected void deleteCart(HttpServletRequest request) {
		HttpSession session=request.getSession();
		String ISTT=request.getParameter("stt");
		CartBean cartBean=null;
		Object iObject=session.getAttribute("cart");
		if(iObject!=null) {
			cartBean=(CartBean) iObject;
		}else {
			cartBean=new CartBean();
		}
		cartBean.deleteCart(ISTT);
	}
	protected void addToCart(HttpServletRequest request) {
		HttpSession session=request.getSession();
		String image=request.getParameter("image");
		String title=request.getParameter("title");
	
		String description=request.getParameter("description");
		String price=request.getParameter("price");
		String quantity=request.getParameter("quantity");
		
		CartBean cartBean=null;
		Object iObject=session.getAttribute("cart");
		if(iObject!=null) {
			cartBean=(CartBean) iObject;
		}else {
			cartBean=new CartBean();
			session.setAttribute("cart", cartBean);
		}
		cartBean.addCart(image, title, description, price, quantity);
	}
	protected void updateCart(HttpServletRequest request) {
		HttpSession session=request.getSession();
		String iQuantity=request.getParameter("quantity");
		String ISTT=request.getParameter("stt");
		CartBean cartBean=null;
		Object iObject=session.getAttribute("cart");
		if(iObject!=null) {
			cartBean=(CartBean) iObject;
		}else {
			cartBean=new CartBean();
			
		}
		cartBean.updateCart(ISTT, iQuantity);
	}
}

