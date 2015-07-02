public class library{

	
	book oneBook;
	book otherBook;

	public library(){
		oneBook=new book();
		otherBook=new book();
	}
	public String toString(){
		return oneBook.toString()+"\n"+otherBook.toString();
	}
}
