package fr.cooparties.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.cooparties.domain.Utilisateur;

public interface UtilisateurDao extends JpaRepository<Utilisateur, Integer> {

}
