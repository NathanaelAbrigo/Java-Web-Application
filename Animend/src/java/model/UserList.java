/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Lex Zedrick Lorenzo
 */
public class UserList {
    
    private Map<String, String> userListMap = new HashMap<>();
    private List<String> gensiList = new ArrayList();
    private List<String> userArrangement = new ArrayList();
    
    public void setAll(){
        userListMap.put("lex", "01234");
        userListMap.put("dwight", "56789");
        
        gensiList.add("1");
        gensiList.add("2");
        gensiList.add("3");
        gensiList.add("4");
        
        userArrangement.add("lex");
        userArrangement.add("dwight");
    }
    
    public Map<String, String> getUserListMap(){
        return userListMap;
    }
    
    public List<String> getGensiList(){
        return gensiList;
    }
    public List<String> getuserArrangement(){
        return userArrangement;
    }
    
}
