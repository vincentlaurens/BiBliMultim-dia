package Appli;

import java.util.ArrayList;

public class Repertoire{
	private String nom;
	private String chemin ;
	private int nbImages;
	private ArrayList<Image> images;
	
	public Repertoire(String chemin, String nom){
		this.nom = nom;
		this.chemin = chemin;
		this.nbImages = 0;
		this.images = new ArrayList<Image>();
	}
	
	public String getnom(){return nom;};
	public String getchemin(){return chemin;};
	public int getnbImages(){return nbImages;};
	public void setnbImages(){this.nbImages = nbImages;};
	public ArrayList<Image> getimages(){return images;};
    
	public void collectFichiers(){}
}
