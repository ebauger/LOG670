package filecreator;

public class quitterPlatoon {
	public void execute() {
		mainapp m = new mainapp();
		
		m.createPlusieursVoiture(0, 4);
		m.createUnPlatoon(0, 0, 4);
		m.createConducteur(2, true);
		
		System.out.println("!openter p0 defusion(v2)");
		
		m.deleteAssociation("p0", "v2", "PlatoonBuildup");
		m.setStuff("v2", "position", "1");
		m.setStuff("v3", "position", "3");
		
		m.deleteAssociation("cam2", "v1", "TraquageCamera");
		m.deleteAssociation("radar2", "v1", "TraquageRadar");
		m.deleteAssociation("cam3", "v2", "TraquageCamera");
		m.deleteAssociation("radar3", "v2", "TraquageRadar");
		
		for(int i=0;i<4;i++){
			if(i!=2){
				m.deleteAssociation("radio2", "v" + i, "TransmissionRadio");
				m.deleteAssociation("radio" + i, "v2", "TransmissionRadio");
			}
		}
		
		m.insertStuff("cam3", "v1", "TraquageCamera");
		m.insertStuff("radar3", "v1", "TraquageRadar");
		
		m.openExit();
	}
}
