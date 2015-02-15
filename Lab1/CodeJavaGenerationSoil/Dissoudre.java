package filecreator;

public class Dissoudre {
	public void execute(){
		mainapp m = new mainapp();
		
		m.createSystem();
		m.createPlusieursVoiture(0, 3);
		m.createUnPlatoon(0, 0, 3);
		for(int id=0;id<3;id++)
			m.createConducteur(id, true);
		
		m.insertStuff("s1", "p0", "Gestion");
		
		m.openEnter("s1 dissoudrePeloton(p0)");
		
		m.deleteAssociation("s1", "p0", "Gestion");
		for(int i=0;i<3;i++)
		{
			m.setStuff("v"+i, "position", "0");
			m.deleteAssociation("p0", "v"+i, "PlatoonBuildup");
			if(i!=0){
				
				m.deleteAssociation("cam"+i, "v"+(i-1), "TraquageCamera");
				m.deleteAssociation("radar"+i, "v"+(i-1), "TraquageRadar");
			}
			for(int j=0;j<3;j++)
			{
				if(j!=i)
					m.deleteAssociation("radio"+i, "v"+j, "TransmissionRadio");
			}
				
			
		}
		
		m.openExit();
		
	}
}
