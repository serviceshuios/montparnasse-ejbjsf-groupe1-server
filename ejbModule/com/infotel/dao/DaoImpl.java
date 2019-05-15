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
		Personne p = em.find(Personne.class, idPersonne);
		return p;
	}

	@Override
	public Personne getPersonneSuppr(long idPersonne) {
		Personne p = em.getReference(Personne.class, idPersonne);
		return p;
	}

	@Override
	public void supprimerPersonne(Personne p) {
		em.remove(p);
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
	public Lotissement getLotissementSuppr(long idLot) {
		Lotissement l = em.getReference(Lotissement.class, idLot);
		return l;
	}

	@Override
	public void supprimerLotissement(Lotissement l) {
		em.remove(l);
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
			q = em.createQuery("update Lotissement l set l.personne = ?1 where p = ?2");
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	@Override
	public void seMarier(Personne p1, Personne p2) {
		Query q = null;
		try {
			q = em.createQuery("update Personne p1 set personne = ?1 where p2 = ?2");
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
