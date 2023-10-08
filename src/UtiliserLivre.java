
public class UtiliserLivre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Livre L1= new Livre("mohamed","bonheur");
		Livre L2=new Livre("mohamed","maladie");
		System.out.println(L1.getAuteur()==L2.getAuteur());
		System.out.println(L1.gettitre());
		L1.setNbPages(20);
		System.out.println(L1.getnbpages());
		L1.setNbPages(400);
		L1.decrire();
		Livre L1= new Livre("Coelho","L'alchimiste",225);
		Livre L2= new Livre("Le Coran",508);
		Livre L3= new Livre("JK Rowling","Harry Potter");
		L1.decrire();
		L2.decrire();
		L3.decrire();
		L2.setauteur("Paulo Coelho");
		L3.setNbPages(461);
		System.out.println("\n");
		L1.decrire();
		L2.decrire();
		L3.decrire();*/
		Livre L1= new Livre(15.6,"L'alchimiste","Coelho",225,true);
		L1.decrire();
		System.out.println(L1.getprix());
		L1.setprix(20);
		System.out.println(L1.getprix());
	}

}
