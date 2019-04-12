package dal;

import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import models.tbllog;
import models.tblurun;
import util.hibernateutil;
import util.vtIsletimcisi;

public class tblUrunDAO extends vtIsletimcisi<tblurun>{
	public void sil(int id) {
		tblUrunDAO item = new tblUrunDAO();
		tblurun cat = item.bul(id, new tblurun());
		cat.setSil_id(0);
		item.duzenle(cat);		
		
	}
	

public List<tblurun> araCategoriyeGore(int categoriid) {
     List<tblurun> listem;
    try{
    Session ss1 = hibernateutil.getSessionFactory().openSession();
    Criteria cr = ss1.createCriteria(tblurun.class);
    cr.add(Restrictions.eq("kategori_id", categoriid));
    listem = cr.list();
    
    return listem;
    }catch(Exception ex){
          tbllog log = new tbllog();
      log.setSinif(tblurun.class.toString());
      log.setMethod("Kategoriye G�re Ara");
      Date dt = new Date();
      log.setTarih(dt);
      log.setHataicerigi(ex.toString());
     // logt.kayit(log);    
    return null;
    }
}
}
