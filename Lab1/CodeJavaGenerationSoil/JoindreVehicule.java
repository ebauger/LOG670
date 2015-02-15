package filecreator;

public class JoindreVehicule {
	public void execute(){
		mainapp m = new mainapp();
		
		m.createPlusieursVoiture(0, 3);
		m.createUnPlatoon(0, 0, 2);
		
		m.openEnter("p0 joindreVoiture(v2)");
		m.ajouterVoitureToPeloton(0, 2, 1, 3);
		m.insertStuff("radio0", "v2", "TransmissionRadio");
		m.insertStuff("radio1", "v2", "TransmissionRadio");
		m.openExit();
	}
}
