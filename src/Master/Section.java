package Master;
import java.util.ArrayList;

/**
 * A Genre of 'X' amount of Book Cases
 * @author Carlos
 * @version 1.0
 * @param bookGenre Object of Book Cases
 * @param genreName Book Genre Name
 * @param caseCount Current Book Cases in this genre section
 */
public abstract class Section<Aisle> implements Iterable<Aisle> {
	
	private ArrayList<Aisle> listOfAisles;
	private Genre genre;
	private int caseCount;
	
	/**
	 * Default constructor
	 * @param newGenreName New name of the genre
	 */
	public Section(Genre genre){
		listOfAisles = new ArrayList<Aisle>();
		this.genre = genre;
		caseCount = 0;
	} 
	/**
	 * Secondary Constructor 
	 * @param newGenreName New name of the genre
	 * @param newCaseCount New Count of Book Cases in this genre section
	 */
	public Section(Genre genre, int newCount){
		listOfAisles = new ArrayList<Aisle>();
		this.genre = genre;
		caseCount = newCount;
	}
	/**
	 * adds a new book case to this section
	 * @param newBookCase new book case to be added
	 */
	public void add(Aisle newAisle){
		if(newAisle!= null)
			listOfAisles.add(newAisle);
	}
	/**
	 * this method gets a book case located in this book section
	 * @return
	 */
	public ArrayList<Aisle> getAisle() {
		return listOfAisles;
	}
	/**
	 * sets book section genre name
	 * @param bookGenre new book genre
	 */
	public void setAisle(ArrayList<Aisle> newAisles) {
		this.listOfAisles = newAisles;
	}
	/**
	 * this method returns the section genre name
	 * @return this sections genre as a string
	 */
	public String getGenreName() {
		return genre.getGenrename();
	}
	public void setGenreName(String newGenreName) {
		genre.setGenrename(newGenreName);
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
