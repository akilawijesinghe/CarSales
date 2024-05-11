/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB40/StatelessEjbClass.java to edit this template
 */
package user.Auth;

import jakarta.ejb.Stateless;
import jakarta.ejb.LocalBean;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import java.io.Serializable;

/**
 *
 * @author akila
 */
@Named (value = "loginBean")
@SessionScoped
public class loginBean implements Serializable{

    private String username = "";
    private String password = "";

    public loginBean() {
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

    public String login() {
        if (username.equals("admin") && password.equals("admin")) {
            return "success";
        } else {
            return "failure";
        }
    }
    
}
