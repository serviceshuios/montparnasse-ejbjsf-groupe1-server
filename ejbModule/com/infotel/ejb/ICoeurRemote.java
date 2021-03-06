package com.infotel.ejb;

import java.util.List;

import javax.ejb.Remote;

import com.infotel.metier.Lotissement;
import com.infotel.metier.Personne;

@Remote
public interface ICoeurRemote {
	
	public void ajouterPersonne(Personne p);
	public List<Personne> listerPersonnes();
	public Personne getPersonne(long idPersonne);
	public long supprimerPersonne(long idPersonne);
	public void modifierPersonne(Personne p);
	
	public void ajouterLotissement(Lotissement l);
	public List<Lotissement> listerLotissements();
	public Lotissement getLotissement(long idLot);
	public long supprimerLotissement(long idLot);
	public void modifierLotissement(Lotissement l);
	
	public void acheterLotissement(long idPersonne, long idLot);
	public void seMarier1(long idPers1, long idPers2);
	public void seMarier2(long idPers1, long idPers2);
}
