package util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.time.Instant;
import java.util.Date;
import org.hibernate.Session;
import org.hibernate.Transaction;

import models.tbllog;

public class logtakip {

	 Session ss;
	    
	    public void kayit(tbllog lg){
	        try{
	              ss = hibernateutil.getSessionFactory().openSession();
	              if(ss.isConnected())
	              dbKayit(lg);             

	            //  fileKayit(lg);
	        }
	        catch(Exception ex){
	           //   fileKayit(lg);
	        }

	    }
	    
	    
	    private boolean dbKayit(tbllog lg){
	        Transaction tt = ss.beginTransaction();
	        ss.save(lg);
	        tt.commit();
	        ss.close();
	    return true;
	    }
	    
	    private boolean fileKayit(tbllog lg){
	        try{
	        File fl = new File("src//main/java//com//erenresortmvn//LogFiles//log.txt");
	            BufferedWriter bf = new BufferedWriter(new FileWriter(fl,true));
	            bf.append("Tarih..: "+lg.getTarih()+":"+
	                    "S�n�f....: "+lg.getSinif()+":"+
	                    "Method...: "+lg.getMethod()+":"+
	                    "Hata.....: "+lg.getHataicerigi()
	                    );
	            bf.newLine();
	            bf.close();
	            
	            return true;
	        }
	        catch(Exception ex){
	            System.err.println("Hata...:"+ex.toString());
	        return false;
	        }
	        
	    
	    }
}	    
	