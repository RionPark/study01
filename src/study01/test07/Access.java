package study01.test07;

class Cat{
	private int age;
	private String name;
	private String type;
	
	public void setAge(int age) {
		this.age = (age);
	}
	
	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}
public class Access {

	public static void main(String[] args) {
		Cat c = new Cat();
		c.setAge(5);
		c.setName("동동이");
		c.setType("샴고양이");
		
		System.out.println("고양이의 나이는 " + c.getAge());
		System.out.println("고양이의 이름은 " + c.getName());
		System.out.println("고양이의 종류는 " + c.getType());
	}
}



