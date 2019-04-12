package dal;

import models.tblcategori;
import util.vtIsletimcisi;

public class tblCatDAO extends vtIsletimcisi<tblcategori>{
	public void sil(int id) {
		tblCatDAO item = new tblCatDAO();
		tblcategori cat=item.bul(id,new tblcategori());
		cat.setSil_id(0);
		item.duzenle(cat);
		
	}

}
