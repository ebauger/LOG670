
public class VehiculeController {
	public Camera camera;
	public Radio radio;
	public Radar radar;
	public GPS gps;
	
	public VehiculeController(){
		camera = new Camera();
		radio = new Radio();
		radar = new Radar();
		gps = new GPS();
	}
}
