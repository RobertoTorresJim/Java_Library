import java.util.Scanner;

public class author{

	String name;
	String age;
	String nationality;
	
	public author(){
	
		System.out.println("Name of the author:");
		Scanner scName=new Scanner(System.in);
		name=scName.nextLine();
		System.out.println("Age of the author:");
		Scanner scAge=new Scanner(System.in);
		age=scAge.nextLine();
		nationality="Green go";
	}

	public String toString(){
		return "Author name: "+name+"\nAge: "+age+"\nNationality: "+nationality;
	}

}
