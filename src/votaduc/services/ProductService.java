package votaduc.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import votaduc.models.Product;

public class ProductService {
	
	public List<Product> getProductDealOfWeek(Connection conn) {
		List<Product> list = new ArrayList<Product>();
		try {
			String sql = "SELECT * FROM products WHERE  hot_deal  = true and cover=true";
			PreparedStatement pstm = conn.prepareStatement(sql);
			ResultSet rs = pstm.executeQuery();

			while (rs.next()) {
				int id = rs.getInt("id");
				String title = rs.getString("title");
				String description = rs.getString("description");
				String detail = rs.getString("detail");
				double price = rs.getDouble("price");
				double price_net = rs.getDouble("price_net");
				int available = rs.getInt("available");
				int sold = rs.getInt("sold");
				int id_category = rs.getInt("id_category");
				String address = rs.getString("address");
				Timestamp deal_timer = rs.getTimestamp("deal_timer");
				String image = rs.getString("image");
				String image2 = rs.getString("image2");
				String image3 = rs.getString("image3");
				String image4 = rs.getString("image4");
				int discount = rs.getInt("discount");
				Product product = new Product(id, title, description,detail, price, price_net, available, sold, deal_timer,
						discount, image,image2,image3,image4,id_category,address);
				list.add(product);
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return list;
	}
	
	public List<Product> getProductFeatured(Connection conn) {
		List<Product> list = new ArrayList<Product>();
		try {
			String sql = "SELECT * FROM products WHERE  hot_deal  = true and cover=false";
			PreparedStatement pstm = conn.prepareStatement(sql);
			ResultSet rs = pstm.executeQuery();

			while (rs.next()) {
				int id = rs.getInt("id");
				String title = rs.getString("title");
				String description = rs.getString("description");
				String detail = rs.getString("detail");
				double price = rs.getDouble("price");
				double price_net = rs.getDouble("price_net");
				int available = rs.getInt("available");
				int sold = rs.getInt("sold");
				int id_category = rs.getInt("id_category");
				String address = rs.getString("address");
				int discount = rs.getInt("discount");
				Timestamp deal_timer = rs.getTimestamp("deal_timer");
				String image = rs.getString("image");
				String image2 = rs.getString("image2");
				String image3 = rs.getString("image3");
				String image4 = rs.getString("image4");
				Product product = new Product(id, title, description,detail ,price, price_net, available, sold, deal_timer,
						discount, image,image2,image3,image4,id_category,address);
				list.add(product);
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return list;
	}
	
	public  List<Product> getProductHotbest(Connection conn)  {
		 List<Product> list = new ArrayList<Product>();
		 try {
			 String sql = "SELECT * FROM products WHERE  hot_best  = true and cover=false";
			 PreparedStatement pstm = conn.prepareStatement(sql);			 			 			 
			 ResultSet rs = pstm.executeQuery();
	 
	        while (rs.next()) {
	        	int id = rs.getInt("id");
	            String title = rs.getString("title");
	            String description = rs.getString("description");
	            String detail = rs.getString("detail");
	            double price = rs.getDouble("price");
	            double price_net = rs.getDouble("price_net");	            
	            int available= rs.getInt("available");
	            int sold = rs.getInt("sold");
	            int id_category = rs.getInt("id_category");
	            String address = rs.getString("address");
	            int discount = rs.getInt("discount");	                     
	            Timestamp  deal_timer = rs.getTimestamp("deal_timer");
	            String image = rs.getString("image");
				String image2 = rs.getString("image2");
				String image3 = rs.getString("image3");
				String image4 = rs.getString("image4");
	            Product product = new Product(id, title, description,detail, price,price_net,available,sold,deal_timer, discount,image,image2,image3,image4,id_category,address);
	            list.add(product);
	        }
		 } catch (SQLException ex) {
			 ex.printStackTrace();
		 }
		 return list;
	} 	
	
	
	public List<Product> getProductHotNew(Connection conn) {
		List<Product> list = new ArrayList<Product>();
		try {
			String sql = "SELECT * FROM products WHERE  hot_new  = true and cover=false";
			PreparedStatement pstm = conn.prepareStatement(sql);
			ResultSet rs = pstm.executeQuery();

			while (rs.next()) {
				int id = rs.getInt("id");
				String title = rs.getString("title");
				String description = rs.getString("description");
				String detail = rs.getString("detail");
				double price = rs.getDouble("price");
				double price_net = rs.getDouble("price_net");
				int available = rs.getInt("available");
				int sold = rs.getInt("sold");
				int id_category = rs.getInt("id_category");
				String address = rs.getString("address");
				Timestamp deal_timer = rs.getTimestamp("deal_timer");
				String image = rs.getString("image");
				String image2 = rs.getString("image2");
				String image3 = rs.getString("image3");
				String image4 = rs.getString("image4");
				int discount = rs.getInt("discount");
				Product product = new Product(id, title, description,detail, price, price_net, available, sold, deal_timer,
						discount, image,image2,image3,image4,id_category,address);
				list.add(product);
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return list;
	}
	
	
	public  Product getProduct(Connection conn, int id)  {
		Product product= null;
		 try {
			 String sql = "SELECT * FROM products WHERE  id  = ?";
			 PreparedStatement pstm = conn.prepareStatement(sql);			 			 			 
			 pstm.setInt(1, id);
			 ResultSet rs = pstm.executeQuery();
			 rs.next();			 
	         String title = rs.getString("title");
	         String description = rs.getString("description"); 
	         String detail = rs.getString("detail");
	         double price = rs.getDouble("price");
	         double price_net = rs.getDouble("price_net");	            
	         int available= rs.getInt("available");
	         int sold = rs.getInt("sold");
	         int id_category = rs.getInt("id_category");
	         String address = rs.getString("address");
	         Timestamp  deal_timer = rs.getTimestamp("deal_timer");
	         String image = rs.getString("image");
				String image2 = rs.getString("image2");
				String image3 = rs.getString("image3");
				String image4 = rs.getString("image4");
	         int discount = rs.getInt("discount");	            	            
	         product = new Product(id, title, description,detail, price,price_net,available,sold,deal_timer,discount,image,image2,image3,image4,id_category,address);
	            	        
		 } catch (SQLException ex) {
			 ex.printStackTrace();      
		 }
		 return product;
	} 
	
	


}
