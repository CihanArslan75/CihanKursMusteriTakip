package beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import dal.tblCatDAO;
import dal.tblUrunDAO;
import models.tblcategori;
import models.tblurun;
import util.StaticValues;

@ManagedBean
@SessionScoped
@SuppressWarnings("deprecation")
public class urunbean {

	List<tblurun> listem = new ArrayList<>();
	List<tblcategori> listec = new ArrayList<>();
	private int id;
	private String ad;
	private String fiyat;
	private String aciklama;
	private int silinecekid=0;
	private String kategoriadi;
	private int kategoriid;
	private String ortalan="urunlistesi.xhtml";
	private tblurun urun =new tblurun();
	tblUrunDAO DataB = new tblUrunDAO();
	tblCatDAO Cdb = new tblCatDAO();
	
	public void urunsec(){
		urun =DataB.bul(id, new tblurun());
		StaticValues.serileurun=id;
		ortalan="urundetails.xhtml";
	}
	
	public void kaydet() {
		if(!ad.equals("")) {
			tblurun item = new tblurun();
			item.setAciklama(aciklama);
			item.setAd(ad);
			item.setFiyat(fiyat);
			item.setKategori_id(kategoriid);
			item.setKategoriadi(kategoriadi);
			item.setSil_id(1);
			DataB.kaydet(item);
		}
	}
	
	public void sil() {
		
		if(silinecekid!=0) {
			
			DataB.sil(silinecekid);
			silinecekid=0;
		}
		
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
	
	public String getFiyat() {
		return fiyat;
	}
	public void setFiyat(String fiyat) {
		this.fiyat = fiyat;
	}
	
	public int getKategoriid() {
		return kategoriid;
	}

	public void setKategoriid(int kategoriid) {
		this.kategoriid = kategoriid;
	}

	public String getAciklama() {
		return aciklama;
	}
	public void setAciklama(String aciklama) {
		this.aciklama = aciklama;
	}
	public int getSilinecekid() {
		return silinecekid;
	}
	public void setSilinecekid(int silinecekid) {
		this.silinecekid = silinecekid;
	}
	public String getKategoriAdi() {
		return kategoriadi;
	}
	public void setKategoriAdi(String kategoriadi) {
		this.kategoriadi = kategoriadi;
	}
	public String getOrtalan() {
		return ortalan;
	}
	public void setOrtalan(String ortalan) {
		this.ortalan = ortalan;
	}
	public tblurun getUrun() {
		return urun;
	}
	public void setUrun(tblurun urun) {
		this.urun = urun;
	}
	
	public List<tblurun> getListem() {
		return DataB.listA(new tblurun());
	}
	public void setListem(List<tblurun> listem) {
		this.listem = listem;
	}
	public List<tblcategori> getListec() {
		return Cdb.listA(new tblcategori());
	}
	public void setListec(List<tblcategori> listec) {
		this.listec = listec;
	}

	
}
