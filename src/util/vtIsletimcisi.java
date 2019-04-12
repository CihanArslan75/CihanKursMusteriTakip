package util;

import java.lang.reflect.Field;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import models.tbllog;

public class vtIsletimcisi<T> implements Icrud<T> {

	 Session ss;
     Transaction tt;
     logtakip logt = new logtakip();
     
     
     public void sessionAC(){
      ss = hibernateutil.getSessionFactory().openSession();
      tt = ss.beginTransaction();
     }
     
     public void sessionKapat(){
     tt.commit();
     ss.close();
     }
    
     /**
      * 
      * @param t �lgili Pojo ile �a��r�lan s�n�flarda i�lem yapar
      * @return i�lem hatas�z yap�l�r ise true d�ner i�lemde hata olur ise loglama yaparak false de�erini d�nd�r�r
      *         
      */
    @Override
    public boolean kaydet(T t) {
      try{
        sessionAC();
        ss.save(t);
        sessionKapat();
       // JOptionPane.showMessageDialog(null, "Kay�t Ba�ar� �le Ger�ekle�mi�tir.");
         
        return true;
      }catch(Exception ex){
         tbllog log = new tbllog();
          log.setSinif(t.getClass().toString());
          log.setMethod("Kaydet");
          Date dt = new Date();
          log.setTarih(dt);
          log.setHataicerigi(ex.toString());
          logt.kayit(log); 
      //   JOptionPane.showMessageDialog(null, "Bir Hata olu�mu�tur.L�tfen sistem y�neticinize Ba�vurunuz");
     
      return false;
      }
    }

    @Override
    public boolean duzenle(T t) {
      try{
        sessionAC();
        ss.update(t);
        sessionKapat();
        return true;
      }catch(Exception ex){
          tbllog log = new tbllog();
          log.setSinif(t.getClass().toString());
          log.setMethod("D�zenle");
          Date dt = new Date();
          log.setTarih(dt);
          log.setHataicerigi(ex.toString());
          logt.kayit(log);          
      return false;
      }
    }

    /**
     * 
     * @param t NOTTUR.. Sil id sini 0 a �ekerek d�zenlenecek.
     * @return 
     */
    @Override
    public boolean sil(T t) {
        try{
        sessionAC();
        ss.delete(t);
        sessionKapat();
        return true;
        }catch(Exception ex){
          tbllog log = new tbllog();
          log.setSinif(t.getClass().toString());
          log.setMethod("Sil");
          Date dt = new Date();
          log.setTarih(dt);
          log.setHataicerigi(ex.toString());
          logt.kayit(log);    
        return false;
        }
    }
 
       
    @Override
    public List<T> listele(T t) {
        List<T> listem;
        try{
        sessionAC();
        Criteria cr = ss.createCriteria(t.getClass());
        listem = cr.list();
        sessionKapat();
        return listem;
        }catch(Exception ex){
              tbllog log = new tbllog();
          log.setSinif(t.getClass().toString());
          log.setMethod("Listele");
          Date dt = new Date();
          log.setTarih(dt);
          log.setHataicerigi(ex.toString());
          logt.kayit(log);    
        return null;
        }
        
    }
    
    /**
     * 
     * @param t �lgili Pojo s�n�f�n� i�aret eder
     * @return  Silid si 1 olan aktif kay�tlar� listeler
     */
    public List<T> listA(T t) {

		  List<T> listem;
		  Session ss1 = hibernateutil.getSessionFactory().openSession();
	        try{
	        sessionAC();
	        Criteria cr = ss1.createCriteria(t.getClass());
	        cr.add(Restrictions.eq("sil_id", 1));
	        listem = cr.list();
	        sessionKapat();
	        return listem;
	        }catch(Exception ex){
	        	System.out.println("Hata...:"+ ex.toString());           
	        return null;
	        }
		
	}
    
    

    @Override
    public T bul(int id, T t) {
         List<T> listem;
        try{
        sessionAC();
        Criteria cr = ss.createCriteria(t.getClass());
        cr.add(Restrictions.eq("id", id));
        
        listem = cr.list();
        sessionKapat();
        return (T)listem.get(0);
        }catch(Exception ex){
          tbllog log = new tbllog();
          log.setSinif(t.getClass().toString());
          log.setMethod("Bul");
          Date dt = new Date();
          log.setTarih(dt);
          log.setHataicerigi(ex.toString());
          logt.kayit(log);    
        return null;
        }
    }

    @Override
    public List<T> ara(String kolon, String deger, T t) {
         List<T> listem;
        try{
        sessionAC();
        Criteria cr = ss.createCriteria(t.getClass());
        cr.add(Restrictions.like(kolon, "%"+deger+"%"));
        listem = cr.list();
        sessionKapat();
        return listem;
        }catch(Exception ex){
              tbllog log = new tbllog();
          log.setSinif(t.getClass().toString());
          log.setMethod("Listele");
          Date dt = new Date();
          log.setTarih(dt);
          log.setHataicerigi(ex.toString());
          logt.kayit(log);    
        return null;
        }
    }

    @Override
    public List<T> araFull(String kolon, String deger, T t) {
         List<T> listem;
        try{
        sessionAC();
        Criteria cr = ss.createCriteria(t.getClass());
        cr.add(Restrictions.eq(kolon, deger));
        listem = cr.list();
        sessionKapat();
        return listem;
        }catch(Exception ex){
              tbllog log = new tbllog();
          log.setSinif(t.getClass().toString());
          log.setMethod("Listele");
          Date dt = new Date();
          log.setTarih(dt);
          log.setHataicerigi(ex.toString());
          logt.kayit(log);    
        return null;
        }
    }
    
    @Override
    public List<T> ara(T t) {
         List<T> listem;
         Class tm = t.getClass();
         Field[] sl = tm.getDeclaredFields();
        try{
        sessionAC();
        Criteria cr = ss.createCriteria(t.getClass());
            for (int i = 0; i < sl.length; i++) {
                if(sl[i]!=null) 
                cr.add(Restrictions.like(sl[i].getName(), "%"+sl[i]+"%"));
            }
      
        
        
        listem = cr.list();
        sessionKapat();
        return listem;
        }catch(Exception ex){
              tbllog log = new tbllog();
          log.setSinif(t.getClass().toString());
          log.setMethod("Listele");
          Date dt = new Date();
          log.setTarih(dt);
          log.setHataicerigi(ex.toString());
          logt.kayit(log);    
        return null;
        }
    }
    
}
