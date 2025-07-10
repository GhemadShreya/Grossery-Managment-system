package gocerymanagementsys;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}//main 

class DBSConnection{
	private static final String URL="java:postgresql://localhost/5432:/GroceryDataBase";
	private static final String USER="postgres";
	private static final String PASSWD="root123";
	public static Connection connection() throws SQLException {
		return DriverManager.getConnection(URL,USER,PASSWD);
	}
}//DBSConnection

class User{
	int userId;
	String userName;
	String email;
	String passwd;
	String role;
	public User(int userId, String userName, String email, String passwd, String role) {
		this.userId = userId;
		this.userName = userName;
		this.email = email;
		this.passwd = passwd;
		this.role = role;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", email=" + email + ", passwd=" + passwd
				+ ", role=" + role + "]";
	}
	


	}//user

class Category{
	int catId;
	String catName;
	public Category(int catId, String catName) {
		this.catId = catId;
		this.catName = catName;
	}
	@Override
	public String toString() {
		return "Category [catId=" + catId + ", catName=" + catName + "]";
	}
	public int getCatId() {
		return catId;
	}
	public void setCatId(int catId) {
		this.catId = catId;
	}
	public String getCatName() {
		return catName;
	}
	public void setCatName(String catName) {
		this.catName = catName;
	}
	
}
class Product extends Category{
		int productId;
		String productName;
		float price;
		int quantity;
		public Product(int catId, String catName, int productId, String productName, float price, int quantity) {
			super(catId, catName);
			this.productId = productId;
			this.productName = productName;
			this.price = price;
			this.quantity = quantity;
		}

		@Override
		public String toString() {
			return "Product [productId=" + productId + ", productName=" + productName + ", price=" + price
					+ ", quantity=" + quantity + "]";
		}
		
		public static void addProduct(Product product) {
			String query="insert into products (productnName,price,quantity,catId) values (?,?,?,?) ";
			try(Connection con=DBSConnection.connection();
				PreparedStatement ps=con.prepareStatement(query))
			{
				ps.setString(1,product. productName);
				ps.setFloat(2,product. price);
				ps.setInt(3, product.quantity);
				ps.setInt(4, product.catId);
				ps.executeUpdate();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
		public static List<Product> avilableProducts(){
			List<Product> list =new ArrayList<>();
			String query="select * from products";
			
			try(Connection con =DBSConnection.connection();
			    Statement stmt=con.createStatement();
				ResultSet rs=stmt.executeQuery(query)){
				while(rs.next()) {
					Product p=new Product(
					rs.
					rs.getString("productName"),
					rs.getFloat("price"),
					rs.getInt("quantity"),
					rs.getInt("catId"));
					list.add(p);
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
}//Product

class CartItems {

	
	
}




