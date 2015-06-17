
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * A single book shelf
 * @author Carlos
 * @version 1.0
 */
public  class BookShelf implements Iterable<Book>, Serializable{
	private ArrayList<Book> shelf;
	private int shelfID, numOfBooks;
	
	/**
	 * Default Constructor for a single Book Shelf
	 * @param newShelfID New Shelf Identifying Number
	 */
	public BookShelf(int newShelfID){
		shelfID = newShelfID;
		numOfBooks = 0;
		shelf = new ArrayList<Book>();
	}
	
	/**
	 * Constructor for a single Bookshelf holding Books
	 * @param ShelfNumber newShelfID New Shelf Identifying Number
	 * @param newNumBooks Number of books on shelf
	 */
	public BookShelf(int newShelfID, int newNumBooks){
		shelf = new ArrayList<Book>();
		shelfID = newShelfID;
		numOfBooks = newNumBooks;
	}
	/**
	 * this method adds a new book to this shelf
	 * @param newBook newBook to be added
	 */
	public void addBook(Book newBook){
		if(newBook != null)
			shelf.add(newBook);		
	}
	
	@Override
	public Iterator<Book> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * this method gets this book shelf as an object containing its books
	 * @return this book shelf
	 */
	public ArrayList<Book> getShelf() {
		return shelf;
	}
	/**
	 * this method sets this shelf
	 * @param shelf new shelf 
	 */
	public void setShelf(ArrayList<Book> shelf) {
		this.shelf = shelf;
	}
	/**
	 * this method gets this shelf's respective company Identification code
	 * @return this shelf's assigned ID
	 */
	public int getShelfID() {
		return shelfID;
	}
	/**
	 * this method changes this shelf's Identification code
	 * @param shelfID the new shelf's ID
	 */
	public void setShelfID(int shelfID) {
		this.shelfID = shelfID;
	}
	/**
	 * this method gets the number of books on shelf currently
	 * @return number of books on shelf
	 */
	public int getNumOfBooks() {
		return numOfBooks;
	}
	/**
	 * this method changes the book count on this shelf
	 * @param numOfBooks sets th book count on shelf
	 */
	public void setNumOfBooks(int numOfBooks) {
		this.numOfBooks = numOfBooks;
	}
	
	
	
}
