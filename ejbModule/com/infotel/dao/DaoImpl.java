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
			q = em.createQuery("UPDATE Lotissement l set l.personne = ?1 WHERE p = ?2");
			q.setParameter("?1", l);
			q.setParameter("?2", p);
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	@Override
	public void seMarier(Personne p1, Personne p2) {
		Query q = null;
		try {
			q = em.createQuery("UPDATE Personne p1 set p1.personne = ?1 WHERE p2 = ?2");
			q.setParameter("?1", p1);
			q.setParameter("?2", p2);
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
