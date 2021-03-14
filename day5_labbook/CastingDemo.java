package day5_labbook;

public class CastingDemo {
	public static void main(String[] args) {
		int i=200;
		byte b=(byte)i;
		System.out.println(b);
		
		int x=Integer.parseInt(args[0]);
		System.out.println(x);
	
		//Engineer er=(Engineer)(Object)new OfficeBoy();
		//Engineer er=(Engineer)(Object)new Employee();
		
		//child can replace the parent but parent cannot replace the child....
		//emp can access only its properties and it cannot access the child properties...
		Employee emp=new Engineer();
		emp.met();
		
		Engineer emp1=new Engineer();//cheating...
		emp1.met();
		
	}
	
}
class Employee{
	String s;
	public void met() {System.out.println("parent method...");}
}
class Engineer extends Employee{
	String er;
	public void met() {
		System.out.println("engineer met called...");
	}
}
class OfficeBoy extends Employee{
	
}
