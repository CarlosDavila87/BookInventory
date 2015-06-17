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
	public Book(String bookName, int pn){
		this.name = bookName;
		this.pn = pn;
	}
	/**
	 * this constructs a Book object when the Book Name, Company part Number, and Width, Height, Length  are known
	 * @param bookName
	 * @param pn
	 * @param newHeight
	 * @param newWidth
	 * @param newLength
	 */
	public Book(String bookName, int pn, double newHeight, double newWidth, double newLength    ){
		this.name = bookName;
		this.pn = pn;
		this.height = newHeight;
		this.width = newWidth;
		this.length = newLength;
	}
	protected String getName() {
		return name;
	}
	protected void setName(String newName) {
		this.name = newName;
	}
	protected int getIsbn() {
		return isbn;
	}
	protected void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	protected int getPn() {
		return pn;
	}
	protected void setPn(int pn) {
		this.pn = pn;
	}
	protected double getHeight() {
		return height;
	}
	protected void setHeight(double height) {
		this.height = height;
	}
	protected double getWidth() {
		return width;
	}
	protected void setWidth(double width) {
		this.width = width;
	}
	protected double getLength() {
		return length;
	}
	protected void setLength(double length) {
		this.length = length;
	}
	

}
