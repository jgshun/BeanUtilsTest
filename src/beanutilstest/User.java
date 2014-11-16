/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package beanutilstest;

import java.util.Date;
import java.util.List;

/**
 *
 * @author jgshun
 */
public class User {
    private String username;
    private String id;
    private Date both;
    
    private List intresters;

    
    
    
    @Override
    public String toString() {
        return "User{" + "username=" + username + ", id=" + id + ", both=" + both + '}';
    }

    
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getBoth() {
        return both;
    }

    public void setBoth(Date both) {
        this.both = both;
    }

    public List getIntresters() {
        return intresters;
    }

    public void setIntresters(List intresters) {
        this.intresters = intresters;
    }
    
    
}
