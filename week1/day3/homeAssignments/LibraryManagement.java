package week1.day3.homeAssignments;

public class LibraryManagement {
	public static void main(String[] args) {
		
		//creating a obj for Library class and calling its objects
		Library libObj =  new Library();
		String book = libObj.addBook("Suduko puzzles");
		System.out.println("Book inside Management : " + book);
		libObj.issueBook();
	}
	

}
