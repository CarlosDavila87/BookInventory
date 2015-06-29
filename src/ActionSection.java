import java.util.Iterator;

import Master.Aisle;
import Master.Genre;
import Master.Section;


public class ActionSection extends Section<Aisle>{

	
	public ActionSection(Genre newGenre) {
		super(newGenre);

	}

	public ActionSection(Genre newGenre, int newCaseCount) {
		super(newGenre, newCaseCount);	
	}
		
	@Override
	public Iterator<Aisle> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	

	
}
