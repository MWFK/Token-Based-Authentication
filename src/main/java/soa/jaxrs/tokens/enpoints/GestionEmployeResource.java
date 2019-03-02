package soa.jaxrs.tokens.enpoints;

import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.SecurityContext;

import soa.jaxrs.tokens.filters.Secured;
import soa.jaxrs.tokens.java.Employe;

@Path("entreprise")
public class GestionEmployeResource {

	static List<Employe> employes = new ArrayList<Employe>();

	public GestionEmployeResource() {
		GestionEmployeResource.employes.add(new Employe("11542145", "Ahmed", "Ben Ahmed"));
		GestionEmployeResource.employes.add(new Employe("11542455", "Manel", "Ben Mohamed"));
	}

	@GET
	@Secured
	@Produces("application/json")
	public List<Employe> getListeEmployes() {
		if (employes == null)
			return null;
		else
			return employes;
	}

	@GET
	@Path("nonSecured")
	@Produces("application/json")
	public List<Employe> getListeEmployesNS() {
		if (employes == null)
			return null;
		else
			return employes;
	}
}
