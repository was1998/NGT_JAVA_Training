package abstraction_and_encapsulation;

 class Demo {
private String name;
private int id;
private int salary;


	public String getName() {
	return name;
}


public int getId() {
	return id;
}


public int getSalary() {
	return salary;
}


public void setName(String name) {
	this.name = name;
}


public void setId(int id) {
	this.id = id;
}


public void setSalary(int salary) {
	this.salary = salary;
}




}
public class DemoEncapsulation{
	public static void main(String[] args) {
		Demo demo=new Demo();
		demo.setName("waseem");
		demo.setId(12);
		demo.setSalary(20000);
		System.out.println(demo.getName());
		System.out.println(demo.getId());
		System.out.println(demo.getSalary());

	}
}
