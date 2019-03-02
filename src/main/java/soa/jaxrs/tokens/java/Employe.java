package soa.jaxrs.tokens.java;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class Employe {
	private String cin;
	private String nom;
	private String prenom;

	
	public Employe() {
		super();
	}

	public Employe(String cin, String nom, String prenom) {
		super();
		this.cin = cin;
		this.nom = nom;
		this.prenom = prenom;
	}

	public String getCin() {
		return cin;
	}

	@XmlAttribute(name="id", required=true)
	public void setCin(String cin) {
		this.cin = cin;
	}

	public String getNom() {
		return nom;
	}

	@XmlElement(name="LastName")
	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	@XmlElement(name="FirstName")
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	
	

	
}
