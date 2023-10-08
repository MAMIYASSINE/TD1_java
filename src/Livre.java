 class Livre {
	private String titre, auteur; 
	private float nbPages;
	private double prix;
	private boolean prixfixe;
	public Livre (String auteur, String titre) { 
		this.auteur = auteur;
		this.titre = titre;
	}
	public Livre () { 
		this.nbPages=0;
	}
	public Livre ( String titre, float nb) { 
		this.titre = titre;
		this.nbPages=nb;
	}
	public Livre ( String auteur,String titre, float nb) {
		this.auteur = auteur;
		this.titre = titre;
		this.nbPages=nb;
	}
	public Livre (double prix, String titre, String auteur,float nbpages,boolean prixfixe)
	{
		this.prixfixe=prixfixe;
		this.prix=prix;
		this.titre=titre;
		this.auteur=auteur;
		this.nbPages=nbpages;
	}
	public double getprix() {return prix;}
	public String getAuteur() { return auteur;}
	public String gettitre() {
		return this.titre;
	}
	public float getnbpages() {
		return this.nbPages;
	}
	public void setNbPages (float nb) {
		if(20<=nb) {
			nbPages=nb;
		}
		else {
			System.out.println("le nombre indique est faible il faut un nombre depasse 20");
		}
	}
	public void settitre (String t) { titre = t;}
	public void setauteur (String a) { auteur = a;}
	public void setprix(double p){
		if(prixfixe==true)
		{
			this.prix=this.prix;
		}
		else
		{
			this.prix=p;
		}
	}
	@Override
	public String toString()
	{
		return "Livre intitule "+this.titre +" de " + this.auteur +" , contenant "+this.nbPages+" pages";
	}
	public void decrire()
	{
		System.out.println(this.toString());
	}
	public boolean testPrix()
	{
		if(this.prix==0)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	
}
