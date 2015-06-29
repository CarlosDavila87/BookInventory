package Master;
/**
 * this abstract serves as a general baseline for representing an actual person using the system
 * @author Carlos
 * @version 1.0
 */
public abstract class Person {
	protected String fname, lname;
	protected int ID;
	
	/**
	 * Default Constructor
	 * @param first this person's First name
	 * @param last this person's Last Name
	 */
	public Person(String first, String last){
		fname = first;
		lname = last;
	}
	/**
	 * Secondary Constructor with ID
	 * @param first Person's First name
	 * @param last Person's Last name
	 * @param newID Person'sIdentification number
	 */
	public Person(String first, String last, int newID){
		fname = first;
		lname = last;
		ID = newID;
	}
	protected String getFname() {
		return fname;
	}
	protected void setFname(String fname) {
		this.fname = fname;
	}
	protected String getLname() {
		return lname;
	}
	protected void setLname(String lname) {
		this.lname = lname;
	}
	protected int getWorkerID() {
		return ID;
	}
	protected void setID(int newID) {
		this.ID = newID;
	}
}