import java.util.Iterator;


public class ActionGenre extends BookSection{

	
	public ActionGenre(String newGenreName)
	{
		super(newGenreName);
	}
	public ActionGenre(String newGenreName, int newCaseCount) {
		super(newGenreName, newCaseCount);
		
	}
	@Override
	public Iterator<BookCase> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	

	
}
