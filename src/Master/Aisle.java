package Master;

import java.util.ArrayList;
import java.util.Iterator;
/**
 * this class represents a Business' aisle that holds product
 * @author Carlos
 * @version 1.0
 * @param <Case> The business Aisle holds Cases
 */
public abstract class Aisle<Case> implements Iterable<Case> {

	private Genre genre;
	private int aisleNumber;
	private ArrayList<Case> listOfCases;
	
	public Aisle(Genre genre, int aislenumber){
		this.genre = genre;
		this.aisleNumber = aislenumber;
		listOfCases = new ArrayList<Case>();
	}
	/**
	 * add a new Case to this Aisle
	 * @param newCase new case to be added
	 */
	public void add(Case newCase){
		if(newCase!= null)
			listOfCases.add(newCase);
	}
	/**
	 * this method gets the ArrayList of Cases in this aisle
	 * @return the list of cases
	 */
	public ArrayList<Case> getCaseList(){
		return listOfCases;
	}
	/**
	 * this method sets the list of Cases to the parameter
	 * @param newCaseList the new list of cases to replace
	 */
	public void setCaseList(ArrayList<Case> newCaseList){
		this.listOfCases = newCaseList;
	}
	/**
	 * this method returns this Aisle's identifying number
	 * @return this aisle number
	 */
	public int getAisleNumber(){
		return aisleNumber;
	}
	
	@Override
	public Iterator<Case> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

}
