package model;

public class Client {
	
	private String nomClient;
	private String adresse ; 
	private int numeroClient;
	private int numeroContrat;
	
	public Client(int numeroClient) {
		super();
		this.numeroClient = numeroClient;
	}
	@Override
	public String toString() {
		return "Client [nomClient=" + nomClient + ", adresse=" + adresse + ", numeroClient=" + numeroClient
				+ ", numeroContrat=" + numeroContrat + "]";
	}
	public Client(String nomClient, String adresse, int numeroClient, int numeroContrat) {
		super();
		this.nomClient = nomClient;
		this.adresse = adresse;
		this.numeroClient = numeroClient;
		this.numeroContrat = numeroContrat;
	}
	public String getNomClient() {
		return nomClient;
	}
	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public int getnumeroClient() {
		return numeroClient;
	}
	public void setnumeroClient(int numeroClient) {
		this.numeroClient = numeroClient;
	}
	public int getNumeroContrat() {
		return numeroContrat;
	}
	public void setNumeroContrat(int numeroContrat) {
		this.numeroContrat = numeroContrat;
	}
	
	

}
