
public class PlatoonVehicule {
	
	public int ID;
	public int position;
	public Conducteur conducteur;
	private VehiculeController cv;
	
	public PlatoonVehicule(int id, int position){
		this.ID = id;
		this.position = position;
		this.cv = new VehiculeController();
	}
	
	public PlatoonVehicule(int id, int position, Conducteur c){
		this.ID = id;
		this.position = position;
		this.conducteur = c;
		this.cv = new VehiculeController();

	}
	
	public PlatoonVehicule(int id, int position, String nomConducteur){
		this.ID = id;
		this.position = position;
		this.conducteur = new Conducteur(nomConducteur);
		this.cv = new VehiculeController();

	}
	
	public void toConsole(){
		System.out.printf("Vehicule id : %s, position : %s, conducteur : %s", ID, position, conducteur.name);
	}

}
