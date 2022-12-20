/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Dwight Kenneth
 */
public class NullErrorDetector {
    
    public boolean Checker(String result){
        String r = result;
        
        if(null==r)
            return false;
        else switch (r) {
            case "1":
                return true;
            case "2":
                return true;
            case "3":
                return true;
            case "4":
                return true;
            case "5":
                return true;
            default:
                return false;
        }
        
    }
    
    
}
