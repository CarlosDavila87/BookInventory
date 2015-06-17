import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * The physical Book Case with 'X' amount of shelves.
 * @author Carlos
 * @param bookCaseNumber Book Case Identifying Number
 * @param shelfCount Number of Shelves
 * @param section Collection of Bookshelves
 * @version 1.0
 */
public class BookCase implements Iterable<BookShelf>, Serializable{
	
	protected int caseID;
	protected int shelfCount;
	protected ArrayList<BookShelf> bookCase;
	
	/**
	 * 
	 * @param newCaseID Identifying Number of this Book Case
	 * @param NumOfShelves Number of shelves in this Book Case
	 */
	public BookCase(int newCaseID,int NumOfShelves)
	{
		caseID = newCaseID;
		shelfCount = NumOfShelves;
		bookCase = new ArrayList<BookShelf>();
	}
	
	public void addBookShelf(BookShelf newBookShelf)
	{
		if(newBookShelf != null)
			bookCase.add(newBookShelf);		
	}

	public int getCaseID() {
		return caseID;
	}

	public void setCaseID(int caseID) {
		this.caseID = caseID;
	}

	public int getShelfCount() {
		return shelfCount;
	}

	public void setShelfCount(int shelfCount) {
		this.shelfCount = shelfCount;
	}

	public ArrayList<BookShelf> getBookCase() {
		return bookCase;
	}

	public void setBookCase(ArrayList<BookShelf> bookCase) {
		this.bookCase = bookCase;
	}

	@Override
	public Iterator<BookShelf> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	
	

}
