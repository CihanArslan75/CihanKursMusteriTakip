package beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@SuppressWarnings("deprecation")
@ManagedBean
@SessionScoped

public class indexBean {

	private String url="kategori.xhtml";
	private int id=1;
	
	public void urlVer() {
		switch(id) {
		case 1: url =  "kategori.xhtml";break;
		case 2: url =  "urun.xhtml";break;
		case 3: url =  "fiyat.xhtml";break;
		case 4: url =  "satisiyapilanurunler.xhtml";break;
		case 5: url =  "stok.xhtml";break;
		case 6: url =  "onaydakiurunler.xhtml";break;
		case 7: url =  "excelurunyukleme.xhtml";break;
		case 8: url =  "urunxmlcikart.xhtml";break;
		case 9: url =  "pdfcikart.xhtml";break;
		case 10: url =  "slider.xhtml";break;

		default: url = "kategori.xhtml";break; 
		}
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}
