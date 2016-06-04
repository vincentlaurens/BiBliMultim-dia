package Appli;


public class Image {
	private Repertoire pere;
	private float largeur;
	private float longueur;

	
	
	public Image(Repertoire pere){
		this.pere = pere;
		this.largeur = 150;
		this.longueur = 100;
	}
	
	public Repertoire getpere(){return pere;};
	public float getlargeur(){return largeur;};
	public float getlongueur(){return longueur;};
}