package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
public class tblyorum {
	@Id
	@SequenceGenerator(name="sq_yorum",sequenceName="sq_tblyorum_id",allocationSize=1,initialValue=1)
	@GeneratedValue(generator="sq_yorum")
	private int id;
	private int urun_id;
	private int musteri_id;
	private String baslik;
	private String yorum;
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
	public int getMusteri_id() {
		return musteri_id;
	}
	public void setMusteri_id(int musteri_id) {
		this.musteri_id = musteri_id;
	}
	public String getBaslik() {
		return baslik;
	}
	public void setBaslik(String baslik) {
		this.baslik = baslik;
	}
	public String getYorum() {
		return yorum;
	}
	public void setYorum(String yorum) {
		this.yorum = yorum;
	}
	public int getSil_id() {
		return sil_id;
	}
	public void setSil_id(int sil_id) {
		this.sil_id = sil_id;
	}
	
	
}
