package UtilLoginFilter;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.*;
import javax.faces.context.FacesContext;

import dal.tblusersDAO;
import models.tblusers;
import util.StaticValues;

@SuppressWarnings("deprecation")
@ManagedBean
@SessionScoped
public class LoginBean implements Serializable{
	  private static final long serialVersionUID = 7765876811740798583L;
	  private String username;
	  private String password;
	  private boolean loggedIn;
	  @ManagedProperty(value="#{navigationBean}")
	  private NavigationBean navigationBean;
	  tblusersDAO db= new tblusersDAO();
	
	  public String doLogin() {
		
		  for(tblusers item : db.listele(new tblusers())) {
				  if(username.equals(item.getAd()) && password.equals(item.getSifre())) {
				  loggedIn=true;
				  StaticValues.kullanici=username;
				  return navigationBean.redirectToWelcome();
			  }
		  }
		  
		  FacesMessage msg = new FacesMessage("Login error!","ERROR MSG");
		  msg.setSeverity(FacesMessage.SEVERITY_ERROR);
		  FacesContext.getCurrentInstance().addMessage(null, msg);
		  return navigationBean.toLogin();
	  }
	  public String doLogout() {
		  loggedIn=false;
		  FacesMessage msg = new FacesMessage("Logout success!", "INFO MSG");
	        msg.setSeverity(FacesMessage.SEVERITY_INFO);
	        FacesContext.getCurrentInstance().addMessage(null, msg);
	         
	        return navigationBean.toLogin();
	  }
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isLoggedIn() {
		return loggedIn;
	}
	public void setLoggedIn(boolean loggedIn) {
		this.loggedIn = loggedIn;
	}
	public NavigationBean getNavigationBean() {
		return navigationBean;
	}
	public void setNavigationBean(NavigationBean navigationBean) {
		this.navigationBean = navigationBean;
	}
	  
	  

}
