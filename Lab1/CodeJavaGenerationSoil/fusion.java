package filecreator;

public class fusion {

	public void execute() {
		mainapp m = new mainapp();
		
		m.createSystem();
		m.createPlusieursVoiture(0, 4);
		m.createUnPlatoon(0, 0, 2);
		m.createUnPlatoon(1, 2, 2);
		m.insertStuff("s1", "p0", "Gestion");
		m.insertStuff("s1", "p1", "Gestion");
		
		System.out.println("!openter p0 fusion(p1)");
		
		for(int i=0;i<2;i++){
			m.deleteAssociation("p1", "v" + (i+2), "PlatoonBuildup");
		}
		
		m.ajouterVoitureToPeloton(0, 2, 2, 3);
		m.deleteAssociation("s1", "p1", "Gestion");
		
		m.openExit();
	}
}
