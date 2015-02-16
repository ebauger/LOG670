import java.util.ArrayList;


public class Platoon {
	
	public static int idCmp = 0;
	public int id;
	public ArrayList<PlatoonVehicule> listPlatoonVehicule;
	
	
	public Platoon(PlatoonVehicule v){
		id = idCmp;
		idCmp++;
		listPlatoonVehicule = new ArrayList<PlatoonVehicule>();
		listPlatoonVehicule.add(v);
		
	}
	
	public Platoon(ArrayList<PlatoonVehicule> p){
		this.listPlatoonVehicule = p;
	}
	
	public void fusion(Platoon peleton1){
		
	}
	
	public Platoon defusion(PlatoonVehicule newLeader){
		return null;
		
	}
	
	public void joindreVoiture(PlatoonVehicule newVehicule){
		
	}

}
