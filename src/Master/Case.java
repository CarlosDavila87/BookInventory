package Master;
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
public abstract class Case<Shelf> implements Iterable<Shelf>{
	
	protected int caseID;
	protected int shelfCount;
	protected ArrayList<Shelf> listOfShelves;
	protected Genre genre;
	
	/**
	 * @param newCaseID Identifying Number of this Book Case
	 * @param NumOfShelves Number of shelves in this Book Case
	 */
	public Case(int newCaseID,int NumOfShelves, Genre genre){
		caseID = newCaseID;
		shelfCount = NumOfShelves;
		this.genre = genre;
		listOfShelves = new ArrayList<Shelf>();
	}
	
	public void add(Shelf newShelf){
		if(newShelf != null)
			listOfShelves.add(newShelf);		
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

	/**
	 * this method gets tis Case's list of Shelves
	 * @return the list of shelves
	 */
	public ArrayList<Shelf> getlistOfShelves() {
		return listOfShelves;
	}

	public void setBookCase(ArrayList<Shelf> bookCase) {
		this.listOfShelves = bookCase;
	}

	@Override
	public Iterator<Shelf> iterator() {
		// TODO Auto-generated method stub
		return listOfShelves.iterator(); 
	}

	
	

}
