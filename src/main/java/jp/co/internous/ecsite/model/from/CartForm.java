package jp.co.internous.ecsite.model.from;

import java.io.Serializable;
import java.util.List;

public class CartForm implements Serializable {
	
	private int userId;
	
	private List<Cart> cartList;
	
	public int getUserId() {
		return userId;
	}
	
	public void getUserId(int userId) {
		this.userId = userId;
	}
	
	public List<Cart> getCartList() {
		return cartList;
	}
	
	public void setCartList(List<Cart> cartList) {
		this.cartList = cartList;
	}
}
