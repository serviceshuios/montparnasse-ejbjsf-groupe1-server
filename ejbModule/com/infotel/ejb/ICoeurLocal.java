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
	public Personne getPersonneSuppr(long idPersonne);
	public void supprimerPersonne(Personne p);
	public void modifierPersonne(Personne p);
	
	public void ajouterLotissement(Lotissement l);
	public List<Lotissement> listerLotissements();
	public Lotissement getLotissement(long idLot);
	public Lotissement getLotissementSuppr(long idLot);
	public void supprimerLotissement(Lotissement l);
	public void modifierLotissement(Lotissement l);
	
	public void acheterLotissement(Personne p, Lotissement l);
	public void seMarier(Personne p1, Personne p2);
}
