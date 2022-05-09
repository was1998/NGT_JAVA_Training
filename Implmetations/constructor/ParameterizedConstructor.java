package constructor;

public class ParameterizedConstructor {
	String name;
	int id;
	int age;
	public ParameterizedConstructor(String name,int id,int age) {
		this.name=name;
		this.id=id;
		this.age=age;
	}
	public void display() {
		System.out.println(name+" "+id+" "+age);
	}

	public static void main(String[] args) {
	
ParameterizedConstructor pcons=new ParameterizedConstructor("waseem", 01, 23);
pcons.display();
	}

}
