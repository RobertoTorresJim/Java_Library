import java.util.Scanner;



public class book{

	String name;
	author aut;
	
	public book(){
		aut =new author();
		System.out.println("Name of the book:");
		Scanner sc=new Scanner(System.in);
		name=sc.nextLine();
	}
	public String toString(){
		return "Name of the book: "+name+aut.toString();
	}
}
