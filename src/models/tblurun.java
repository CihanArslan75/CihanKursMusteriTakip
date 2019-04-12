package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table
@Entity
public class tblurun {

	@Id
	@SequenceGenerator(name="sq_urun",sequenceName="sq_tblurun_id",allocationSize=1,initialValue=1)
	@GeneratedValue(generator="sq_urun")
	private int id;
	private String ad;
	private String kod;
	@Column(length=1024)
	private String aciklama;
	private int kategori_id;
	private String kategoriadi;
	private String fiyat;
	int sil_id;
	
	
	
	public String getKategoriadi() {
		return kategoriadi;
	}
	public void setKategoriadi(String kategoriadi) {
		this.kategoriadi = kategoriadi;
	}
	public int getKategori_id() {
		return kategori_id;
	}
	public void setKategori_id(int kategori_id) {
		this.kategori_id = kategori_id;
	}
	public String getFiyat() {
		return fiyat;
	}
	public void setFiyat(String fiyat) {
		this.fiyat = fiyat;
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
	public String getKod() {
		return kod;
	}
	public void setKod(String kod) {
		this.kod = kod;
	}
	public String getAciklama() {
		return aciklama;
	}
	public void setAciklama(String aciklama) {
		this.aciklama = aciklama;
	}
	
	
	
}
