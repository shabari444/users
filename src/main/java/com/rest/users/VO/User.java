package com.rest.users.VO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class User {
	
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long UserID;

//private Authorities authorities;

private String userName;

private String password;

private String enabled;


public String isEnabled() {
	return enabled;
}

public void setEnabled(String enabled) {
	this.enabled = enabled;
}


public Long getUserID() {
	return UserID;
}

public void String(Long userID) {
	UserID = userID;
}

/*public Authorities getAuthorities() {
	return authorities;
}

public void setAuthorities(Authorities authorities) {
	this.authorities = authorities;
}*/

public String getUserName() {
	return userName;
}

public void setUserName(String userName) {
	this.userName = userName;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}



}
