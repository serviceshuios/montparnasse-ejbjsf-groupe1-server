package com.infotel.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.infotel.metier.Lotissement;
import com.infotel.metier.Personne;

@Stateless
public class DaoImpl implements IdaoLocal, IdaoRemote {
	
	@PersistenceContext(unitName = "BP_UNIT")
	private EntityManager em;

	@Override
	public void ajouterPersonne(Personne p) {
		// TODO Auto-generated method stub
		
	}

	/*
	 * ==========METHODES PERSONNE==========
	 */
	
	@Override
	public List<Personne> listerPersonnes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Personne getPersonne(long idPersonne) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Personne getPersonneSuppr(long idPersonne) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void supprimerPersonne(Personne p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifierPersonne(Personne p) {
		// TODO Auto-generated method stub
		
	}
	
	/*
	 * ==========METHODE LOTTISSEMENT==========
	 */

	@Override
	public void ajouterLotissement(Lotissement l) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Lotissement> listerLotissements() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Lotissement getLotissement(long idLot) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Lotissement getLotissementSuppr(long idLot) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void supprimerLotissement(Lotissement l) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifierLotissement(Lotissement l) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void acheterLotissement(Personne p, Lotissement l) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void seMarier(Personne p1, Personne p2) {
		// TODO Auto-generated method stub
		
	}

	

}
