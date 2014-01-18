package fr.cooparties.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import fr.cooparties.dao.UtilisateurDao;
import fr.cooparties.domain.Utilisateur;
import fr.cooparties.service.UtilisateurService;

@Service("utilisateurService")
public class UtilisateurServiceImpl implements UtilisateurService {

	@Resource
	private UtilisateurDao utilisateurDao;

	@Override
	public Utilisateur getUtilisateur(String utilisateurParam) {
		Utilisateur utilisateur = new Utilisateur();
		utilisateur.setUtilisateur(utilisateurParam);
		utilisateur.setAvatar("avatar");
		utilisateur.setEmail("email");
		utilisateur.setMdp("mdp");
		utilisateurDao.save(utilisateur);
		return utilisateur;
	}
}
