package filecreator;

public class mainapp {

	int idVoiture = 0;
	
	public static void main(String[] args) {
		fusion f = new fusion();
		f.execute();
	}
	
	public void createPlusieursVoiture(int aPartirDe,int num){
		for(int i=aPartirDe;i<aPartirDe+num;i++)
		{
			System.out.println("\n--Creation de la voiture " + i);
			System.out.println("!new PlatoonVehicule('v"+i + "')");
			setStuff("v" + i, "ID", idVoiture++ + "");
			System.out.println("!new VehiculeController('vc"+i + "')");
			System.out.println("!new Radio('radio" + i+ "')");
			System.out.println("!new Radar('radar"+i+"')");
			System.out.println("!new Camera('cam"+i+"')");
			insertStuff("v" +i, "vc" + i, "ControllePar");
			insertStuff("vc" +i, "cam" + i, "ReceptionCamera");
			insertStuff("vc" +i, "radar" + i, "ReceptionRadar");
			insertStuff("vc" +i, "radio" + i, "sendRadioData");
		}
	}
	
	public void createUnPlatoon(int id, int voitureIdApartirDe, int numVoitures){
		System.out.println("\n--Creation du Peloton " + id);
		System.out.println("!new Platoon('p"+id + "')");
		int position =0;
		for(int i=voitureIdApartirDe;i<voitureIdApartirDe+numVoitures;i++){
			
			insertStuff("p"+id, "v" + i,"PlatoonBuildup");
			setStuff("v" + i, "position", ++position + "");
			if(i!=voitureIdApartirDe){
				insertStuff("cam" + i , "v" + (i-1),"TraquageCamera");
				insertStuff("radar" + i , "v" + (i-1),"TraquageRadar");
			}
			for(int j=0;j<numVoitures;j++)
				if(voitureIdApartirDe + j!=i)
					insertStuff("radio"+i, "v" + (voitureIdApartirDe +j),"TransmissionRadio");
			
		}
	}
	
	public void createConducteur(int id, boolean addtocar) {
		System.out.println("!new Conducteur('c"+id + "')");
		if(addtocar) 
			insertStuff("c" + id, "v" + id, "Conducteur" );
	}
	
	public void insertStuff(String a,String b, String c){
		System.out.println("!insert (@"+ a + ",@" + b + ") into " + c);
	}
	
	public void setStuff(String name, String prperty, String Value){
		System.out.println("!set " + name  +"." + prperty + ":=" +Value);
	}
	
}
