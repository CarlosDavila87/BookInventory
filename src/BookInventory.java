
public class BookInventory {

	public static void main(String[] args){
		
		// create bookshelf that adds books
		BookShelf action0= new BookShelf(1552,25);
		//action0.addBook(new Book("American Sniper", "978-0-06-237633-6", 4747));
	//	action0.addBook(new Book("Lone Survivor", "111-1-11-111111-1", 4499));
		
		
		
		//add book shelf to this book case
		BookCase actionCase0 = new BookCase(1222, 5);
		actionCase0.addBookShelf(action0);
		
		//add bookcase to this genre section
		
				
		
		
	}
}
