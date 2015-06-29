import Master.Aisle;
import Master.Book;
import Master.Case;
import Master.Genre;
import Master.Shelf;




public class BookInventory {

	public static void main(String[] args){
		
		//create Action Section
		ActionSection actionSection = new ActionSection(Genre.ACTION, 8);
		//Create Aisle
		ActionAisle actionAisle1 = new ActionAisle(Genre.ACTION,0);
		
		//Create Book Case
		ActionCase actionCase1 = new ActionCase(554,5,Genre.ACTION);
		//Create Shelves
		ActionShelf actionShelf1 = new ActionShelf(790,5);
		ActionShelf actionShelf2 = new ActionShelf(791,5);
		ActionShelf actionShelf3 = new ActionShelf(792,5);
		ActionShelf actionShelf4 = new ActionShelf(793,5);
		ActionShelf actionShelf5 = new ActionShelf(794,5);		
		//Create Books
		Book lonesurvivor = new Book("Lone Survivor", 111511414, Genre.ACTION);
		Book zombies = new Book("Zombies", 111581454, Genre.ACTION);
		Book marinevet= new Book("Marine Veteran", 112511418, Genre.ACTION);
		Book armyvet = new Book("Army Veteran", 1665711814, Genre.ACTION);
		Book navyvet = new Book("Navy Veteran", 532515417, Genre.ACTION);

		
		
		//Add Books>Shelf>Case>Aisle>Section
		actionShelf1.add(lonesurvivor);
		actionShelf1.add(zombies);
		actionShelf1.add(marinevet);
		actionShelf1.add(armyvet);
		actionShelf1.add(navyvet);
		
		actionCase1.add(actionShelf1);
		actionCase1.add(actionShelf2);
		actionCase1.add(actionShelf3);
		actionCase1.add(actionShelf4);
		actionCase1.add(actionShelf5);
		
		actionAisle1.add(actionCase1);
		
		actionSection.add(actionAisle1);				
		
		for(Book book: actionShelf1){
			System.out.println(book.getName());
		}
	}
}
