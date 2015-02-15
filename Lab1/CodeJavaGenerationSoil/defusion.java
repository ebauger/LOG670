package filecreator;

public class defusion {
	public void execute() {
		mainapp m = new mainapp();
		
		m.createPlusieursVoiture(0, 4);
		m.createUnPlatoon(0, 0, 4);
//		m.createConducteur(2, true);
		
		System.out.println("\n!openter p0 defusion(v2)");
//		
//		m.deleteAssociation("p0", "v2", "PlatoonBuildup");
//		m.deleteAssociation("p0", "v3", "PlatoonBuildup");
//		
//		m.deleteAssociation("cam2", "v1", "TraquageCamera");
//		m.deleteAssociation("radar2", "v1", "TraquageRadar");
//		
//		for(int i=0;i<4;i++){
//			if(i<2){
//				m.deleteAssociation("radio" + i, "v2", "TransmissionRadio");
//				m.deleteAssociation("radio" + i, "v3", "TransmissionRadio");
//			}
//			else
//			{
//				m.deleteAssociation("radio" + i, "v0", "TransmissionRadio");
//				m.deleteAssociation("radio" + i, "v1", "TransmissionRadio");
//			}
//		}
//		
//		m.createUnPlatoon(1, 2, 2);
//		
//		m.openExit();
	}
}
