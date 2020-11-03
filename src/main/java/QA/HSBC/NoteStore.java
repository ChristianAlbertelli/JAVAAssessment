package QA.HSBC;

import java.util.ArrayList;

public class NoteStore {

	ArrayList<String> notes=new ArrayList<String>();
	
	
	public void getTextNotes(String textnote1, String textnote2) {
		notes.add(textnote1);
		notes.add(textnote2);
	}
}
