import java.util.ArrayList;
import asg.cliche.Command;
import asg.cliche.ShellFactory;
import java.io.IOException;


public class SystemMain {
	
	static ArrayList<Platoon> listPlatoon;
	
	static ArrayList<PlatoonVehicule> listVehicule;
	
	static ArrayList<Conducteur> listConducteur;
	
	public static void init(){
		listPlatoon = new ArrayList<Platoon>();
		listVehicule = new ArrayList<PlatoonVehicule>();
		listConducteur = new ArrayList<Conducteur>();
	}

	public static void main(String[] args) throws IOException {
		init();
		System.err.println("ATTENTION : Pototype! - ?list pour la documentation des commandes interactives");
        ShellFactory.createConsoleShell("CACC", "", new SystemMain())
        	.commandLoop(); // and three.
	}	
	@Command(description="Insert le leader dans la liste à la première position")
	public void createVehicule(){
		
	}
	/*
	 * Insert le leader dans la liste à la première position
	 */
	@Command(description="Creer un platoon")
	public void createPeloton(int leaderIdV){
		createPeloton(searchIdV(leaderIdV), null);
	}
	public Platoon createPeloton(PlatoonVehicule leader, ArrayList<PlatoonVehicule> voitures){
		voitures.add(0, leader);
		return new Platoon(voitures); 
				
	}
	public void ajoutPeloton(Platoon p){
		listPlatoon.add(p);
		System.out.println("Platoon : ID: "+ p.id);
	}
	@Command(description="Dissoude un platoon")
	public void dissoudrePeloton(int idp){
		dissoudrePeloton(searchId(idp));
	}
	public void dissoudrePeloton(Platoon p){
		listPlatoon.remove(p);
	}
	
	@Command(description="Ajouter un véhicule du système")
	public void ajouterVehicule(int idV, int position){
		listVehicule.add(new PlatoonVehicule(idV, position));
	}
	
	@Command(description="Ajouter un conducteur dans un vehicule")
	public void ajouterConducInVehicule(String nom, int idv){
		for(PlatoonVehicule v : listVehicule)
			if(v.ID == idv){
				v.conducteur = searchNomC(nom);	
				break;
			}
	}
	
	@Command(description="Ajouter vehicule dans un platoon")
	public void ajouteVechiculeInPlatoon(int idp, int idv){
		for(Platoon p : listPlatoon)
			if(p.id == idp){
					p.listPlatoonVehicule.add(searchIdV(idv));
					break;
			}
	}
	
	public void enregistrerVoiture(PlatoonVehicule voiture){
		listVehicule.add(voiture);
	}
	
	public void inscrireConducteur(Conducteur conducteur){
		listConducteur.add(conducteur);
	}
	
	@Command(description="Liste les pelotons actifs")
	public void listePelotonsActifs(){
		int cmp = 0;
		for(Platoon platoon : listPlatoon){
			System.out.println("Platoon " + cmp + "ID:" + platoon.id + "instance : " + platoon);
			cmp++;
		}
		System.out.println();
	}
	@Command(description="Liste les vehicules incsrient dans le pelotons")
	public void listeVehiculesInscritsDansPelotons(int idp){
		listeVehiculesInscritsDansPelotons(searchId(idp));
	}
	public void listeVehiculesInscritsDansPelotons(Platoon p) {
		String str = "";
		for(PlatoonVehicule v : p.listPlatoonVehicule){
			str = str + String.format("[ID:%s,POS:]", v.ID, v.position);
		}
		System.out.println(str);
		System.out.println("[ ] = Vehicule");
	}
	
	@Command(description="List des conducteurs inscrient dans le pelotons")
	public void listeConducteursInscritsDansPelotons(int idp) {
		listeVehiculesInscritsDansPelotons(searchId(idp));
	}
	public void listeConducteursInscritsDansPelotons(Platoon p) {
		String str = "";
		for(PlatoonVehicule v : p.listPlatoonVehicule){
			str = str + String.format("[nom:%s]", v.conducteur);
		}
		System.out.println(str);
		System.out.println("[ ] = Vehicule");
	}
	
	@Command(description="Liste pelotons défusionables")
	public void listePelotonsDefusionables() {
		int cmp = 0;
		for(Platoon platoon : listPlatoon){
			if(platoon.listPlatoonVehicule.size() > 1)
				System.out.println("Platoon " + cmp + "instance : " + platoon);
		}
		System.out.println();
	}
	
	public Platoon searchId(int idp){
		for(Platoon p : listPlatoon)
			if(p.id == idp)
					return p;					
		return null;
	}
	
	public PlatoonVehicule searchIdV(int idv){
		for(PlatoonVehicule v : listVehicule)
			if(v.ID == idv)
					return v;					
		return null;
	}
	
	public Conducteur searchNomC(String nom){
		for(Conducteur c : listConducteur)
			if(c.name == nom)
					return c;					
		return null;
	}
	
}
