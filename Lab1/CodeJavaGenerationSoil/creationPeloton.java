package filecreator;

public class creationPeloton {
	public void execute(){
		mainapp m = new mainapp();
		
		m.createSystem();
		
		m.createPlusieursVoiture(0, 3);
		m.createConducteur(0, true);
		
		m.openEnter("s1 createPeloton(v0,{v1,v2});
	}
}
