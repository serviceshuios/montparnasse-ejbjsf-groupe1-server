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
		daoR.ajouterPersonne(p);
	}

	@Override
	public List<Personne> listerPersonnes() {
		// TODO Auto-generated method stub
		return daoR.listerPersonnes();
	}

	@Override
	public Personne getPersonne(long idPersonne) {
		// TODO Auto-generated method stub
		return daoR.getPersonne(idPersonne);
	}



	@Override
	public long supprimerPersonne(long idPersonne) {
	return daoR.supprimerPersonne(idPersonne);
	}

	@Override
	public void modifierPersonne(Personne p) {
		// TODO Auto-generated method stub
		daoR.modifierPersonne(p);
	}

	@Override
	public void ajouterLotissement(Lotissement l) {
		// TODO Auto-generated method stub
		daoR.ajouterLotissement(l);
	}

	@Override
	public List<Lotissement> listerLotissements() {
		// TODO Auto-generated method stub
		return daoR.listerLotissements();
	}

	@Override
	public Lotissement getLotissement(long idLot) {
		// TODO Auto-generated method stub
		return daoR.getLotissement(idLot);
	}



	@Override
	public long supprimerLotissement(long idLot) {
		// TODO Auto-generated method stub
		return daoR.supprimerLotissement(idLot);
	}

	@Override
	public void modifierLotissement(Lotissement l) {
		// TODO Auto-generated method stub
		daoR.modifierLotissement(l);
	}

	@Override
	public void acheterLotissement(long idPersonne, long idLotissement) {
		// TODO Auto-generated method stub
		daoR.acheterLotissement(idPersonne, idLotissement);
	}

	@Override
	public void seMarier(long idPers1, long idPers2) {
		// TODO Auto-generated method stub
		daoR.seMarier(idPers1, idPers2);
	}

	

}
