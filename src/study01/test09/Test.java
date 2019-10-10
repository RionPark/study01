package study01.test09;

class Food{
	private String name;
	private int price;
	private String foodType;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getFoodType() {
		return foodType;
	}
	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}
	@Override
	public String toString() {
		return "Food [name=" + name + ", price=" + price + ", foodType=" + foodType + "]";
	}
	
}

public class Test {

	public static void main(String[] args) {
		Food f = new Food();
		f.setName("치킨");
		f.setPrice(15000);
		f.setFoodType("양념반 후라이드반 무 많이");
		System.out.println(f);
	}
}








