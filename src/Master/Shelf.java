package Master;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * A single book shelf
 * @author Carlos
 * @version 1.0
 */
public abstract class Shelf<T> implements Iterable<T>{
	private ArrayList<T> listOfObjects;
	private int shelfID;
	
	/**
	 * Default Constructor for a single Book Shelf
	 * @param newShelfID New Shelf Identifying Number
	 */
	public Shelf(int newShelfID){
		shelfID = newShelfID;
		listOfObjects = new ArrayList<T>();
	}
	
	/**
	 * Constructor for a single Bookshelf holding Books
	 * @param ShelfNumber newShelfID New Shelf Identifying Number
	 * @param newNumObjects Number of objects held on this shelf
	 */
	public Shelf(int newShelfID, int newNumObjects){
		listOfObjects = new ArrayList<T>();
		shelfID = newShelfID;
	}
	/**
	 * this method adds a new book to this shelf
	 * @param newBook newBook to be added
	 */
	public void add(T newObject){
		if(newObject != null)
			listOfObjects.add((T) newObject);		
	}
	
	
	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * this method gets this book shelf as an object containing its books
	 * @return this book shelf
	 */
	public ArrayList<T> getListOfObjects() {
		return listOfObjects;
	}
	/**
	 * this method gets this shelf's respective company Identification code
	 * @return this shelf's assigned ID
	 */
	public int getShelfID() {
		return shelfID;
	}
	/**
	 * this method replaces this list of Objects
	 * @param newListOfObjects this replaces this current shelfs objects
	 */
	public void setShelf(ArrayList<T> newListOfObjects) {
		this.listOfObjects = newListOfObjects;
	}
	
	/**
	 * this method changes this shelf's Identification code
	 * @param shelfID the new shelf's ID
	 */
	public void setShelfID(int shelfID) {
		this.shelfID = shelfID;
	}	
}
