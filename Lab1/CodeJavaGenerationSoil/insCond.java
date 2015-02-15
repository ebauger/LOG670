package filecreator;

public class insCond {
	public void execute(){
		
		mainapp m = new mainapp();
		
		m.createSystem();
		m.createConducteur(0, false);
		m.setStuff("c0", "name", "'Bob'");
		
		m.insertStuff("s1", "c0", "Inscription");
		
		m.openEnter("s1 inscrireConducteur(c0)");
//		m.setStuff("c0", "ID", "0");
//		m.openExit();
	}
}
