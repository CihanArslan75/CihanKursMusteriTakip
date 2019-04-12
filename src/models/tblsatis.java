package models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table
@Entity
public class tblsatis {
	@Id
	@SequenceGenerator(name="sq_satis",sequenceName="sq_tblsatis_id",allocationSize=1,initialValue=1)
	@GeneratedValue(generator="sq_satis")
	private int id;
	private int musteri_id;
	private String adres;
	private String telefon;
	private String odeme_tipi;
	private Date tarih;
	private int durum;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMusteri_id() {
		return musteri_id;
	}
	public void setMusteri_id(int musteri_id) {
		this.musteri_id = musteri_id;
	}
	public String getAdres() {
		return adres;
	}
	public void setAdres(String adres) {
		this.adres = adres;
	}
	public String getTelefon() {
		return telefon;
	}
	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}
	public String getOdeme_tipi() {
		return odeme_tipi;
	}
	public void setOdeme_tipi(String odeme_tipi) {
		this.odeme_tipi = odeme_tipi;
	}
	public Date getTarih() {
		return tarih;
	}
	public void setTarih(Date tarih) {
		this.tarih = tarih;
	}
	public int getDurum() {
		return durum;
	}
	public void setDurum(int durum) {
		this.durum = durum;
	}
	
	
}
