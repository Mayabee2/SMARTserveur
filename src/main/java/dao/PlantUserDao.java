/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import metier.modele.PlantUser;
import javax.persistence.TypedQuery;

/**
 *
 * @author gdela
 */
public class PlantUserDao {
    public void create (PlantUser user) {
		JpaUtil.obtenirContextePersistance().persist(user);
	}

	public PlantUser update(PlantUser user){
		return JpaUtil.obtenirContextePersistance().merge(user);
	}

	public PlantUser chercherParId(Long id) {
		return JpaUtil.obtenirContextePersistance().find(PlantUser.class, id);
	}
        
	public PlantUser chercherParMail(String mail) {
		String s = "SELECT e FROM USER e WHERE e.mail = :mail";
		TypedQuery<PlantUser> query = JpaUtil.obtenirContextePersistance().createQuery(s, PlantUser.class);
		query.setParameter("mail", mail);
		List<PlantUser> employes = query.getResultList();
		PlantUser resultat = null;
		if (!employes.isEmpty()) {
			resultat = employes.get(0);
		}
		return resultat;
	}
                
        /*
	public List<Client> chercherTousOrdonnee() {
		String s = "SELECT c FROM Client c ORDER BY c.nom, c.prenom ASC";
		TypedQuery<Client> query = JpaUtil.obtenirContextePersistance().createQuery(s, Client.class);
		return query.getResultList();
	}

	public Client chercherParMail(String mail) {
		String s = "SELECT c FROM Client c WHERE c.mail = :mail";
		TypedQuery<Client> query = JpaUtil.obtenirContextePersistance().createQuery(s, Client.class);
		query.setParameter("mail", mail);
		List<Client> clients = query.getResultList();
		Client resultat = null;
		if (!clients.isEmpty()) {
			resultat = clients.get(0);
		}
		return resultat;
	}*/
}

