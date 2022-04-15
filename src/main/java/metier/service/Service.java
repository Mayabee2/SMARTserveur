/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier.service;

import dao.PlantUserDao;
import metier.modele.PlantUser;
import dao.JpaUtil;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author h4224
 */
public class Service {
    private final PlantUserDao userDao = new PlantUserDao();
    
    public void init() { 
        PlantUser user1 = new PlantUser("a", "b", "c", "d");
        PlantUser user2 = new PlantUser("f", "g", "h", "i");

        JpaUtil.creerContextePersistance();

        try {
                JpaUtil.ouvrirTransaction();

                userDao.create(user1);
                userDao.create(user2);


                JpaUtil.validerTransaction();
        }
        catch (Exception ex) {
                //Logger.getAnonymousLogger().log(Level.SEVERE, "Erreur !", ex);
                JpaUtil.annulerTransaction();
        }
        finally {
                JpaUtil.fermerContextePersistance();
        }
    }
        
    public Long inscrireClient(PlantUser user) {
		Long id;
		//List<String> list;
		JpaUtil.creerContextePersistance();
		try {
			System.out.println("Création d'un user");
			PlantUser registrerdUser = userDao.chercherParMail(user.getMail());
			System.out.println(registrerdUser);
			if (registrerdUser == null){ // Nouveau utilisateur 
			
				JpaUtil.ouvrirTransaction();

				userDao.create(user);

				JpaUtil.validerTransaction();
                                
				id = user.getId();
			}else{
                            System.out.println("------------------ERROR-----------------------");
				throw new Exception("Impossible d'inscrire le client");
			}
		}
		catch (Exception ex) {
			//Logger.getAnonymousLogger().log(Level.SEVERE, "Erreur !", ex);
			JpaUtil.annulerTransaction();

			id = null;
		}
		finally {
			JpaUtil.fermerContextePersistance();
		}
		return id;
	}
}
