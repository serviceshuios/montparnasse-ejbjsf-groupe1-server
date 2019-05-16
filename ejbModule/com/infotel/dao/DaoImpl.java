package com.infotel.dao;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.infotel.metier.Lotissement;
import com.infotel.metier.Personne;

@Stateless
public class DaoImpl implements IdaoLocal, IdaoRemote {

	@PersistenceContext(unitName = "BP_UNIT")
	private EntityManager em;

	/*
	 * ==========METHODES PERSONNE==========
	 */

	@Override
	public void ajouterPersonne(Personne p) {
		em.persist(p);
	}

	@Override
	public List<Personne> listerPersonnes() {
		Query q = null;
		List<Personne> l = new ArrayList<Personne>();
		q = em.createQuery("SELECT p FROM Personne p");
		l = q.getResultList();
		return l;
	}

	@Override
	public Personne getPersonne(long idPersonne) {
		return em.find(Personne.class, idPersonne);
		
	}



	@Override
	public long supprimerPersonne(long idPersonne) {
		Query q = null;
		try {
			q = em.createQuery("DELETE FROM Personne p where p.idPersonne = :id").setParameter("id", idPersonne);
			idPersonne = q.executeUpdate();
		
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}	
		return idPersonne;
	}


	@Override
	public void modifierPersonne(Personne p) {
		em.merge(p);
	}

	/*
	 * ==========METHODE LOTTISSEMENT==========
	 */

	@Override
	public void ajouterLotissement(Lotissement l) {
		em.persist(l);
	}

	@Override
	public List<Lotissement> listerLotissements() {
		Query q = null;
		List<Lotissement> l = new ArrayList<Lotissement>();
		q = em.createQuery("SELECT l FROM Lotissement l");
		l = q.getResultList();
		return l;
	}

	@Override
	public Lotissement getLotissement(long idLot) {
		Lotissement l = em.find(Lotissement.class, idLot);
		return l;
	}


	@Override
	public long supprimerLotissement(long idLot) {
		Query q = null;
		try {
			q = em.createQuery("DELETE FROM Lotissement l where l.idLot = :id").setParameter("id", idLot);
			idLot = q.executeUpdate();
		
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}	
		return idLot;
	}

	@Override
	public void modifierLotissement(Lotissement l) {
		em.merge(l);
	}

	/*
	 * METHODE CUSTOM
	 */

	@Override
	public void acheterLotissement(Personne p, Lotissement l) {
		Query q = null;
		try {
			q = em.createQuery("UPDATE Personne set personne.idPersonne = :idPP where idPersonne = :iP")
					.setParameter("idP",  l.getIdLot()).setParameter("idPP", p.getIdPersonne()).executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

	@Override
	public void seMarier(long idPers1, long idPers2) {
		Personne p1 = new Personne();
		p1.setIdPersonne(idPers1);
		Personne p2 = new Personne();
		p2.setIdPersonne(idPers2);
		Query q = null;
		try {
			q = em.createQuery("UPDATE Personne p set p.personne.idPersonne = :id1 WHERE p.idPersonne = :id2");
			q.setParameter("id1", idPers1);
			q.setParameter("id2", idPers2);
			idPers1 = q.executeUpdate();
			//idPers2 = q.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
