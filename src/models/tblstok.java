package models;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

public class tblstok {

	@Id
	@SequenceGenerator(name="sq_stok",sequenceName="sq_tblstok_id",allocationSize=1,initialValue=1)
	@GeneratedValue(generator="sq_stok")
	
	int id;
	int urun_id;
	int stokadedi;
	int sil_id;
	int uyaridedi;
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
	public int getStokadedi() {
		return stokadedi;
	}
	public void setStokadedi(int stokadedi) {
		this.stokadedi = stokadedi;
	}
	public int getSil_id() {
		return sil_id;
	}
	public void setSil_id(int sil_id) {
		this.sil_id = sil_id;
	}
	public int getUyaridedi() {
		return uyaridedi;
	}
	public void setUyaridedi(int uyaridedi) {
		this.uyaridedi = uyaridedi;
	}
	
	
	
}
