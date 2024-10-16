package week1.day3.homeAssignments;

public class Library {

	/*create a method addBook by getting booktitle as argument
	 * print inside the method
	 * return the book name
	*/
	public String addBook(String bookTitle)
	{
		System.out.println("Book added successfully");
		return bookTitle;
	}
	
	//create a method issueBook and print in the method itself
	
	public void issueBook()
	{
		System.out.println("Book issued successfully");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating a obj for Library and calling 2 methods-addBook and issueBook
		Library libraryObj = new Library();
		String book = libraryObj.addBook("Panchatandra stories");
		System.out.println("Added book : " + book);
		libraryObj.issueBook();

	}

}
