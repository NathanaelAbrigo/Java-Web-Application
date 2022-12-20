/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dwight Kenneth
 */
public class GenreSetter {
    public List<String> Genres(String type){
        List<String> list = new ArrayList<>();
        
        if (type.equals("1")) {
            list.add("Comedy");
            list.add("https://tinyurl.com/28uvj9u3");
            list.add("Nichijou");
            list.add("https://tinyurl.com/2p96acd8");
            list.add("Asobi Asobase");
            list.add("https://tinyurl.com/yasfarnn");
            list.add("Grand Blue");
            list.add("https://tinyurl.com/spzk62hh");
            list.add("The Devil Is a Part-Timer!");
            list.add("https://tinyurl.com/htkkxkk9");
            list.add("Hinamatsuri");
        } else if (type.equals("2")) {
            list.add("Horror");
            list.add("https://tinyurl.com/2p9sxmx7");
            list.add("Death Parade");
            list.add("https://tinyurl.com/564kfhcb");
            list.add("Corpse Party: Tortured Souls");
            list.add("https://tinyurl.com/8zezhcur");
            list.add("Deadman Wonderland");
            list.add("https://tinyurl.com/ra6wdefa");
            list.add("Death Note");
            list.add("https://tinyurl.com/yzpbxzf9");
            list.add("Elfen Lied");
        } else if (type.equals("3")) {
            list.add("Romance");
            list.add("https://tinyurl.com/tyanzutz");
            list.add("Horimiya");
            list.add("https://tinyurl.com/2jktcw6m");
            list.add("From me to you");
            list.add("https://tinyurl.com/2p8pkpbz");
            list.add("Golden Time");
            list.add("https://tinyurl.com/mrdcvuyu");
            list.add("Wotakoi: Love Is Hard for Otaku");
            list.add("https://tinyurl.com/3bu9nb6e");
            list.add("Tsuki Ga Kirei");
        } else if (type.equals("4")) {
            list.add("Action");
            list.add("https://tinyurl.com/76e4c4jf");
            list.add("Accel World");
            list.add("https://tinyurl.com/yc28k9yy");
            list.add("Sword Art Online");
            list.add("https://tinyurl.com/mu9jhmt3");
            list.add("Haikyuu!!");
            list.add("https://tinyurl.com/yd8dw8rf");
            list.add("Kabaneri of the Iron Fortress");
            list.add("https://tinyurl.com/y2fdayx4");
            list.add("Arifureta: From Commonplace To World's Strongest");
        } else if (type.equals("5")) {
            list.add("Drama");
            list.add("https://tinyurl.com/yeypfswx");
            list.add("Anohana");
            list.add("https://tinyurl.com/55xed9jt");
            list.add("Angel Beats");
            list.add("https://tinyurl.com/mrt92b23");
            list.add("Fruits Basket");
            list.add("https://tinyurl.com/29maxt8r");
            list.add("The Anthem of the Heart");
            list.add("https://tinyurl.com/mvtdk94v");
            list.add("A Silent Voice");
        } 
          else {
            list = null;
        }
        return list; 
    }
    
    
            
}
