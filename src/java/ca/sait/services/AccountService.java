/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sait.services;
import ca.sait.models.User;
/**
 * Service provider for account 
 * @author Buola Achor
 */
public class AccountService {
    
    public AccountService() {
        
    }
    
    /**
     * Login a user
     * @param username Username
     * @param password Password
     * @return User instance if login credentials are correct, or null.
     */
    public User login(String username, String password) {
        //if (username == null)
            //return null;
                    
        if(("abe").equals(username) && "password".equals(password)) {
            User user = new User(username, password);
            return user;
        }
        else if (("barb").equals(username) && "password".equals(password)) {
            User user = new User(username, password);
            return user;
        }
        else {
            return null;
        }
    }
}
