package model;

public class Intermediaire {
	private String nomIntermediaire;
	private String adresseIntermediaire;
	private String tel;
	private String fax;
	public String getNomIntermediaire() {
		return nomIntermediaire;
	}
	public void setNomIntermediaire(String nomIntermediaire) {
		this.nomIntermediaire = nomIntermediaire;
	}
	public String getAdresseIntermediaire() {
		return adresseIntermediaire;
	}
	public void setAdresseIntermediaire(String adresseIntermediaire) {
		this.adresseIntermediaire = adresseIntermediaire;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public Intermediaire(String nomIntermediaire, String adresseIntermediaire, String tel, String fax) {
		super();
		this.nomIntermediaire = nomIntermediaire;
		this.adresseIntermediaire = adresseIntermediaire;
		this.tel = tel;
		this.fax = fax;
	}
}