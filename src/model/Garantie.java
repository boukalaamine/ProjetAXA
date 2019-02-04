package model;

public class Garantie {


	private String animauxVivants;
	private String frigo;
	private String vehiculesEtRemorques;
	private String citerne;
	private String typeContrat;
	private String activite;
	private String flotte;
	private String typeCotisation;
	private String typeMarchandise;
	private String expositions;
	private String nombreExpositions;
	private String IAC;
	private String HIAC;
	private String garantieVol;
	private int capital;
	private int nombreDeSinistres;
	private int franchiseToutCas;
	private int franchiseParVehiculeRoulant;
	private int cotisationParVehicule;
	private int cotisationParChiffreAffaire;
	private String dateEffet;
	private String  dateFin;
	
	public Garantie(String animauxVivants, String frigo, String vehiculesEtRemorques, String citerne,
			String typeContrat, String activite, String flotte, String typeCotisation, String typeMarchandise,
			String expositions, String nombreExpositions, String iAC, String hIAC, String garantieVol, int capital,
			int nombreDeSinistres, int franchiseToutCas, int franchiseParVehiculeRoulant, int cotisationParVehicule,
			int cotisationParChiffreAffaire, String dateEffet) {
		super();
		this.animauxVivants = animauxVivants;
		this.frigo = frigo;
		this.vehiculesEtRemorques = vehiculesEtRemorques;
		this.citerne = citerne;
		this.typeContrat = typeContrat;
		this.activite = activite;
		this.flotte = flotte;
		this.typeCotisation = typeCotisation;
		this.typeMarchandise = typeMarchandise;
		this.expositions = expositions;
		this.nombreExpositions = nombreExpositions;
		IAC = iAC;
		HIAC = hIAC;
		this.garantieVol = garantieVol;
		this.capital = capital;
		this.nombreDeSinistres = nombreDeSinistres;
		this.franchiseToutCas = franchiseToutCas;
		this.franchiseParVehiculeRoulant = franchiseParVehiculeRoulant;
		this.cotisationParVehicule = cotisationParVehicule;
		this.cotisationParChiffreAffaire = cotisationParChiffreAffaire;
		this.dateEffet = dateEffet;
	}
	
	public String getDateEffet() {
		return dateEffet;
	}

	public void setDateEffet(String dateEffet) {
		this.dateEffet = dateEffet;
	}

	public String getDateFin() {
		return dateFin;
	}

	public void setDateFin(String dateFin) {
		this.dateFin = dateFin;
	}

	public Garantie(String animauxVivants, String frigo, String vehiculesEtRemorques, String citerne,
			String typeContrat, String activite, String flotte, String typeCotisation, String typeMarchandise,
			String expositions, String nombreExpositions, String iAC, String hIAC, String garantieVol, int capital,
			int nombreDeSinistres, int franchiseToutCas, int franchiseParVehiculeRoulant, int cotisationParVehicule,
			int cotisationParChiffreAffaire, String dateEffet , String dateFin) {
		super();
		this.animauxVivants = animauxVivants;
		this.frigo = frigo;
		this.vehiculesEtRemorques = vehiculesEtRemorques;
		this.citerne = citerne;
		this.typeContrat = typeContrat;
		this.activite = activite;
		this.flotte = flotte;
		this.typeCotisation = typeCotisation;
		this.typeMarchandise = typeMarchandise;
		this.expositions = expositions;
		this.nombreExpositions = nombreExpositions;
		IAC = iAC;
		HIAC = hIAC;
		this.garantieVol = garantieVol;
		this.capital = capital;
		this.nombreDeSinistres = nombreDeSinistres;
		this.franchiseToutCas = franchiseToutCas;
		this.franchiseParVehiculeRoulant = franchiseParVehiculeRoulant;
		this.cotisationParVehicule = cotisationParVehicule;
		this.cotisationParChiffreAffaire = cotisationParChiffreAffaire;
		this.dateEffet = dateEffet;
		this.dateFin = dateFin;
	}


	public String getAnimauxVivants() {
		return animauxVivants;
	}
	public void setAnimauxVivants(String animauxVivants) {
		this.animauxVivants = animauxVivants;
	}
	public String getFrigo() {
		return frigo;
	}
	public void setFrigo(String frigo) {
		this.frigo = frigo;
	}
	public String getVehiculesEtRemorques() {
		return vehiculesEtRemorques;
	}
	public void setVehiculesEtRemorques(String vehiculesEtRemorques) {
		this.vehiculesEtRemorques = vehiculesEtRemorques;
	}
	public String getCiterne() {
		return citerne;
	}
	public void setCiterne(String citerne) {
		this.citerne = citerne;
	}
	public String getTypeContrat() {
		return typeContrat;
	}
	public void setTypeContrat(String typeContrat) {
		this.typeContrat = typeContrat;
	}
	public String getActivite() {
		return activite;
	}
	public void setActivite(String activite) {
		this.activite = activite;
	}
	public String getFlotte() {
		return flotte;
	}
	public void setFlotte(String flotte) {
		this.flotte = flotte;
	}
	public String getTypeCotisation() {
		return typeCotisation;
	}
	public void setTypeCotisation(String typeCotisation) {
		this.typeCotisation = typeCotisation;
	}
	public String getTypeMarchandise() {
		return typeMarchandise;
	}
	public void setTypeMarchandise(String typeMarchandise) {
		this.typeMarchandise = typeMarchandise;
	}
	public String getExpositions() {
		return expositions;
	}
	public void setExpositions(String expositions) {
		this.expositions = expositions;
	}
	public String getNombreExpositions() {
		return nombreExpositions;
	}
	public void setNombreExpositions(String nombreExpositions) {
		this.nombreExpositions = nombreExpositions;
	}
	public String getIAC() {
		return IAC;
	}
	public void setIAC(String iAC) {
		IAC = iAC;
	}
	public String getHIAC() {
		return HIAC;
	}
	public void setHIAC(String hIAC) {
		HIAC = hIAC;
	}
	public String getGarantieVol() {
		return garantieVol;
	}
	public void setGarantieVol(String garantieVol) {
		this.garantieVol = garantieVol;
	}
	public int getCapital() {
		return capital;
	}
	public void setCapital(int capital) {
		this.capital = capital;
	}
	public int getNombreDeSinistres() {
		return nombreDeSinistres;
	}
	public void setNombreDeSinistres(int nombreDeSinistres) {
		this.nombreDeSinistres = nombreDeSinistres;
	}
	public int getFranchiseToutCas() {
		return franchiseToutCas;
	}
	@Override
	public String toString() {
		return "Garantie [animauxVivants=" + animauxVivants + ", frigo=" + frigo
				+ ", vehiculesEtRemorques=" + vehiculesEtRemorques + ", citerne=" + citerne + ", typeContrat="
				+ typeContrat + ", activite=" + activite + ", flotte=" + flotte + ", typeCotisation=" + typeCotisation
				+ ", typeMarchandise=" + typeMarchandise + ", expositions=" + expositions + ", nombreExpositions="
				+ nombreExpositions + ", IAC=" + IAC + ", HIAC=" + HIAC + ", garantieVol=" + garantieVol + ", capital="
				+ capital + ", nombreDeSinistres=" + nombreDeSinistres + ", franchiseToutCas=" + franchiseToutCas
				+ ", franchiseParVehiculeRoulant=" + franchiseParVehiculeRoulant + ", cotisationParVehicule="
				+ cotisationParVehicule + ", cotisationParChiffreAffaire=" + cotisationParChiffreAffaire + "]";
	}
	public void setFranchiseToutCas(int franchiseToutCas) {
		this.franchiseToutCas = franchiseToutCas;
	}
	public int getFranchiseParVehiculeRoulant() {
		return franchiseParVehiculeRoulant;
	}
	public void setFranchiseParVehiculeRoulant(int franchiseParVehiculeRoulant) {
		this.franchiseParVehiculeRoulant = franchiseParVehiculeRoulant;
	}
	public int getCotisationParVehicule() {
		return cotisationParVehicule;
	}
	public void setCotisationParVehicule(int cotisationParVehicule) {
		this.cotisationParVehicule = cotisationParVehicule;
	}
	public int getCotisationParChiffreAffaire() {
		return cotisationParChiffreAffaire;
	}
	public void setCotisationParChiffreAffaire(int cotisationParChiffreAffaire) {
		this.cotisationParChiffreAffaire = cotisationParChiffreAffaire;
	}

	
	

	
	
}