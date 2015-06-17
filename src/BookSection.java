import java.io.Serializable;
import java.util.ArrayList;

/**
 * A Genre of 'X' amount of Book Cases
 * @author Carlos
 * @version 1.0
 * @param bookGenre Object of Book Cases
 * @param genreName Book Genre Name
 * @param caseCount Current Book Cases in this genre section
 */
public abstract class BookSection implements Iterable<BookCase>, Serializable {
	
	private ArrayList<BookCase> bookGenre;
	private String genreName;
	private int caseCount;
	
	/**
	 * Default constructor
	 * @param newGenreName New name of the genre
	 */
	public BookSection(String newGenreName)
	{
		bookGenre = new ArrayList<BookCase>();
		genreName = newGenreName;
		caseCount = 0;
	} 
	/**
	 * Secondary Constructor 
	 * @param newGenreName New name of the genre
	 * @param newCaseCount New Count of Book Cases in this genre section
	 */
	public BookSection(String newGenreName, int newCaseCount)
	{
		bookGenre = new ArrayList<BookCase>();
		genreName = newGenreName;
		caseCount = newCaseCount;
	}
	/**
	 * adds a new book case to this section
	 * @param newBookCase new book case to be added
	 */
	public void addBookCase(BookCase newBookCase)
	{
		if(newBookCase != null)
			bookGenre.add(newBookCase);
	}
	/**
	 * this method gets a book case located in this book section
	 * @return
	 */
	public ArrayList<BookCase> getBookGenre() {
		return bookGenre;
	}
	/**
	 * sets book section genre name
	 * @param bookGenre new book genre
	 */
	public void setBookGenre(ArrayList<BookCase> bookGenre) {
		this.bookGenre = bookGenre;
	}
	/**
	 * this method returns the section genre name
	 * @return this sections genre as a string
	 */
	public String getGenreName() {
		return genreName;
	}
	public void setGenreName(String genreName) {
		this.genreName = genreName;
	}
	/**
	 * this method returns the count of book cases
	 * @return number of cases in this book section
	 */
	public int getCaseCount() {
		return caseCount;
	}
	/**
	 * sets the case count
	 * @param newCaseCount sets this book section's case count 
	 */
	public void setCaseCount(int newCaseCount) {
		this.caseCount = newCaseCount;
	}
	
	

}
