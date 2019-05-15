package com.infotel.ejb;

import java.util.List;

import javax.ejb.Local;

import com.infotel.metier.Lotissement;
import com.infotel.metier.Personne;

@Local
public interface ICoeurLocal {

	public void ajouterPersonne(Personne p);
	public List<Personne> listerPersonnes();
	public Personne getPersonne(long idPersonne);
	public void supprimerPersonne(long idPersonne);
	public void modifierPersonne(long idPersonne);
	
	public void ajouterLotissement(Lotissement l);
	public List<Lotissement> listerLotissements();
	public Lotissement getLotissement(long idLot);
	public void supprimerLotissement(long idLot);
	public void modifierLotissement(long idLot);
	
	public void acheterLotissement(Personne p, Lotissement l);
	public void seMarier(Personne p1, Personne p2);
}
