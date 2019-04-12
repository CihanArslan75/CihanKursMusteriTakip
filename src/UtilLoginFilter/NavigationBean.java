package UtilLoginFilter;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean //Managed Bean genel olarak ön yüzde yazdığımız jsf sayfasının iş mantığını içeririr
@SessionScoped //Scope ; JSF sayfalarını bağladığımız managed bean lerin yaşam süresini tanımlar .Kullanıcı oturum açtığı an bean create edilir . Kullanıcı oturumu kapatana kadar aynı bean saklanır
public class NavigationBean implements Serializable{
    private static final long serialVersionUID = 1520318172495977648L;
    
    public String redirectToLogin() {
    	return "/login.jsf?faces-redirect=true";
    }
    
    public String toLogin() {
    	return "/login.jsf";
    }
    
	public String redirectToWelcome() {
		return "/AdminPanels/index.jsf?faces-redirect=true";
	}
	
	public String toWelcome() {
		return "/AdminPanels/index.jsf";
	}

}
