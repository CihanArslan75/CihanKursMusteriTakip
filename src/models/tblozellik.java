package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
public class tblozellik {
	@Id
	@SequenceGenerator(name="sq_ozellik",sequenceName="sq_tblozellik_id",allocationSize=1,initialValue=1)
	@GeneratedValue(generator="sq_ozellik")
	private int id;
	private int urun_id;
	private String ozellik;
	private String aciklama;
	private int sil_id;
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
	public String getOzellik() {
		return ozellik;
	}
	public void setOzellik(String ozellik) {
		this.ozellik = ozellik;
	}
	public String getAciklama() {
		return aciklama;
	}
	public void setAciklama(String aciklama) {
		this.aciklama = aciklama;
	}
	public int getSil_id() {
		return sil_id;
	}
	public void setSil_id(int sil_id) {
		this.sil_id = sil_id;
	}
	
	
	
}
