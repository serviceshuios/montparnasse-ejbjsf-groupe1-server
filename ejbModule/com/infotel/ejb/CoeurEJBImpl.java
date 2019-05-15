package com.infotel.ejb;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.infotel.dao.IdaoLocal;
import com.infotel.dao.IdaoRemote;
import com.infotel.metier.Lotissement;
import com.infotel.metier.Personne;

@Stateless
public class CoeurEJBImpl implements ICoeurLocal, ICoeurRemote {

	@EJB
	private IdaoRemote daoR;
	@EJB
	private IdaoLocal daoL;
	
	public IdaoRemote getDaoR() {
		return daoR;
	}

	public void setDaoR(IdaoRemote daoR) {
		this.daoR = daoR;
	}

	public IdaoLocal getDaoL() {
		return daoL;
	}

	public void setDaoL(IdaoLocal daoL) {
		this.daoL = daoL;
	}
	
	//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ Methodes +++++++++++++++++++++++++++++++++++++++++++++++++++++++
	@Override
	public void ajouterPersonne(Personne p) {
		// TODO Auto-generated method stub
		
	}

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
