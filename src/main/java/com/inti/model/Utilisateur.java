package com.inti.model;

public class Utilisateur {
	private Long idUtilisateur;
	private String nomUtilisateur;
	private String prenomUtilisateur;

	public Utilisateur() {

	}

	public Utilisateur(Long idUtilisateur, String nomUtilisateur) {
		this.idUtilisateur = idUtilisateur;
		this.nomUtilisateur = nomUtilisateur;
	}

	public Long getIdUtilisateur() {
		return idUtilisateur;
	}

	public void setIdUtilisateur(Long idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}

	public String getNomUtilisateur() {
		return nomUtilisateur;
	}

	public void setNomUtilisateur(String nomUtilisateur) {
		this.nomUtilisateur = nomUtilisateur;
	}
	

	public String getPrenomUtilisateur() {
		return prenomUtilisateur;
	}

	public void setPrenomUtilisateur(String prenomUtilisateur) {
		this.prenomUtilisateur = prenomUtilisateur;
	}

	@Override
	public String toString() {
		return "Utilisateur [idUtilisateur=" + idUtilisateur + ", nomUtilisateur=" + nomUtilisateur + "]";
	}

}
