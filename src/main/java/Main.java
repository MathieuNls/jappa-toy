
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sayHi();
		sayHiAgain();
		saySomething("Something");

	}
	
	public static void sayHi(){
		System.out.println("Hi");
		sayHiAgain();
	}
	
	public static void sayHiAgain(){
		System.out.println("Hi again");
	}
	
	public static void saySomething(String something){
		System.out.println(something);
	}
	

}
