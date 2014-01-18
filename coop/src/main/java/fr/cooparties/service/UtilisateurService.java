package fr.cooparties.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import fr.cooparties.domain.Utilisateur;

@Path("/utilisateur")
@Consumes({ "application/json" })
@Produces({ "application/json" })
public interface UtilisateurService {

	@Path("/utilisateur/{utilisateurParam}")
	@GET
	Utilisateur getUtilisateur(
			@PathParam("utilisateurParam") String utilisateurParam);

}
