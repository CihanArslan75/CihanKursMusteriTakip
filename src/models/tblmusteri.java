package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table
@Entity
public class tblmusteri {

	@Id
	@SequenceGenerator(name="sq_musteri",sequenceName="sq_tblmusteri_id",allocationSize=1,initialValue=1)
	@GeneratedValue(generator="sq_musteri")
	int id;
	
 private	String ad;

 private	String soyad;

 private	String telefon;

 private	String adres;
 
 private String email;
 
 private String sifre;
 
 private int durum;

 private	int sil_id;
	
 
	
	public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getSifre() {
	return sifre;
}

public void setSifre(String sifre) {
	this.sifre = sifre;
}

public int getDurum() {
	return durum;
}

public void setDurum(int durum) {
	this.durum = durum;
}

	public String getAdres() {
	return adres;
}

public void setAdres(String adres) {
	this.adres = adres;
}

public int getSil_id() {
	return sil_id;
}

public void setSil_id(int sil_id) {
	this.sil_id = sil_id;
}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}
	
	
	
	
}
