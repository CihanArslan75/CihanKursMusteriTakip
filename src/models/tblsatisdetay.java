package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table
@Entity
public class tblsatisdetay {
	
	@Id
	@SequenceGenerator(name="sq_satisdetay",sequenceName="sq_tblsatisdetay_id",allocationSize=1,initialValue=1)
	@GeneratedValue(generator="sq_satisdetay")
	
	int id;
	int urun_id;
	int adet;
	int satis_id;
	double fiyat;
	double toplam_fiyat;
	int sil_id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUrun_id() {
		return urun_id;
	}
	public void setUrun_id(int urun_id) {
		this.urun_id = urun_id;
	}
	public int getAdet() {
		return adet;
	}
	public void setAdet(int adet) {
		this.adet = adet;
	}
	public int getSatis_id() {
		return satis_id;
	}
	public void setSatis_id(int satis_id) {
		this.satis_id = satis_id;
	}
	public double getFiyat() {
		return fiyat;
	}
	public void setFiyat(double fiyat) {
		this.fiyat = fiyat;
	}
	public double getToplam_fiyat() {
		return toplam_fiyat;
	}
	public void setToplam_fiyat(double toplam_fiyat) {
		this.toplam_fiyat = toplam_fiyat;
	}
	public int getSil_id() {
		return sil_id;
	}
	public void setSil_id(int sil_id) {
		this.sil_id = sil_id;
	}
	
	
	
	
}
