package Lti.Bank;

public class Person implements Cloneable{

	private String Name;
	private int age;
	
	public Person() {
		this("Ananymous" , -1);
	}
	
	public Person(String name, int age) {
		this.Name = name;
		this.age = age;
	}
	
	public void print() {
		System.out.println("Name: " + Name + "\tAge" + age);
	}
	
	

	@Override
	public String toString() {
		return "Name: " + Name + "\tAge" + age;
	}
	
	

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person)
		{
			Person p = (Person) obj;
			if(Name.equals(p.Name) && age==p.age)
				return true;
		}
		return false;
	}
	

	@Override
	public void finalize() throws Throwable {
		System.out.println("Person is nor more");
	}

	public static void main(String[] args) throws CloneNotSupportedException {

		Person p1 = new Person("lili",21);
		Person pc = (Person) p1.clone();
		
		System.out.println(pc);
		
		
	}
		
	

}
