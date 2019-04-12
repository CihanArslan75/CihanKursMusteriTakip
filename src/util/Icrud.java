package util;

import java.util.List;

public interface Icrud<T> {
	 public boolean kaydet(T t);
	    public boolean duzenle(T t);
	    public boolean sil(T t);
	    public List<T> listele(T t);
	    public T bul(int id, T t);
	    public List<T> ara(String kolon,String deger,T t);
	    public List<T> araFull(String kolon,String deger,T t);
		   
	    public List<T> ara(T t);
}
