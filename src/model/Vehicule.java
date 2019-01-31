package model;

public class Vehicule {
	private String marque;
	private String genre;
	private String type;
	private String immatriculation;
	private int cotisation;
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getImmatriculation() {
		return immatriculation;
	}
	public void setImmatriculation(String immatriculation) {
		this.immatriculation = immatriculation;
	}
	public int getCotisation() {
		return cotisation;
	}
	public void setCotisation(int cotisation) {
		this.cotisation = cotisation;
	}
	public Vehicule(String marque, String genre, String type, String immatriculation, int cotisation) {
		super();
		this.marque = marque;
		this.genre = genre;
		this.type = type;
		this.immatriculation = immatriculation;
		this.cotisation = cotisation;
	}
	
	

}
