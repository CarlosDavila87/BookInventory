package Master;
/**
 * This class represents a Book object in the Book Inventory
 * @author Carlos
 *
 */
public class Book {
	private String name;
	private Genre genre;
	private int isbn;
	private int pn;
	private double height, width, length;
	
	/**
	 * this constructs a book object when only the name of the book is known
	 * @param bookName the name of this book
	 */
	public Book(String bookName){
		this.name = bookName;
		genre = null;	
	}
	/**
	 * this constructs a Book object with a known name and genre only
	 * @param Name the name of this book
	 * @param genre this book's genre
	 */
	public Book(String bookName, Genre genre){
		this.name = bookName;
		this.genre = genre;
	}
	/**
	 * this constructs a Book object with a known name and company part number only
	 * @param Name Name the name of this book
	 * @param pn assigned company part number
	 */
	public Book(String bookName, int pn, Genre genre){
		this.name = bookName;
		this.pn = pn;
		this.genre = genre;
	}
	/**
	 * this constructs a Book object when the Book Name, Company part Number, and Width, Height, Length  are known
	 * @param bookName
	 * @param pn
	 * @param newHeight
	 * @param newWidth
	 * @param newLength
	 * @param genre
	 */
	public Book(String bookName, int pn, double newHeight, double newWidth, double newLength, Genre genre){
		this.name = bookName;
		this.pn = pn;
		this.height = newHeight;
		this.width = newWidth;
		this.length = newLength;
		this.genre = genre;
	}
	public String getName() {
		return name;
	}
	public void setName(String newName) {
		this.name = newName;
	}
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public int getPn() {
		return pn;
	}
	public void setPn(int pn) {
		this.pn = pn;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	

}
