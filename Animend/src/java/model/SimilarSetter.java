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
public class SimilarSetter {
    public List<String> Similars(String type){
        List<String> list = new ArrayList<String>();
        String selected = type;
        
        if (type.equals("1")) {
            list.add("Gintama");
            list.add("https://tinyurl.com/yhc24fkd");
            list.add("Sket Dance");
            list.add("https://tinyurl.com/4jtnx4rk");
            list.add("Rurouni Kenshin");
            list.add("https://tinyurl.com/ms8v484u");
            list.add("Beelzebub ");
            list.add("https://tinyurl.com/mws8a7br");
            list.add("Space Dandy");
            list.add("https://tinyurl.com/2c7rxd5y");
            list.add("Mr. Osomatsu");
        } else if (type.equals("2")) {
            list.add("Another");
            list.add("https://tinyurl.com/2tbhnd92");
            list.add("Shiki");
            list.add("https://tinyurl.com/3cfpeu42");
            list.add("Higurashi no Naku Koro ni (When They Cry)");
            list.add("https://tinyurl.com/2hma532b");
            list.add("Yami Shibai");
            list.add("https://tinyurl.com/2dhe7uvh");
            list.add("Ghost Hunt");
            list.add("https://tinyurl.com/8cpr2wpx");
            list.add("Future Diary");
        } else if (type.equals("3")) {
            list.add("Toradora");
            list.add("https://tinyurl.com/2n5wtn52");
            list.add("Lovely Complex");
            list.add("https://tinyurl.com/5af9mx34");
            list.add("True Tears");
            list.add("https://tinyurl.com/bs6xhc6b");
            list.add("Kaichou wa Maid-sama!");
            list.add("https://tinyurl.com/55uzavmv");
            list.add("Ef: A Tale of Memories");
            list.add("https://tinyurl.com/yckwwnmf");
            list.add("Shakugan no Shana");
        } else if (type.equals("4")) {
            list.add("My Hero Academia");
            list.add("https://tinyurl.com/2s3prch5");
            list.add("One-Punch Man");
            list.add("https://tinyurl.com/ycxc9wt4");
            list.add("Naruto");
            list.add("https://tinyurl.com/vc76nts3");
            list.add("Black Clover");
            list.add("https://tinyurl.com/yxmr7v73");
            list.add("Tiger and Bunny");
            list.add("https://tinyurl.com/5fek5ahy");
            list.add("Fire Force");
        } else if (type.equals("5")) {
            list.add("Clannad");
            list.add("https://tinyurl.com/mrxbw7pu");
            list.add("Tokyo Magnitude 8.0");
            list.add("https://tinyurl.com/ze9h3f2x");
            list.add("Lucky Star");
            list.add("https://tinyurl.com/5h4fuw32");
            list.add("Your Lie in April");
            list.add("https://tinyurl.com/2p9hwz58");
            list.add("The Melancholy of Haruhi Suzumiya");
            list.add("https://tinyurl.com/bddwe7v7");
            list.add("Hyouka");
        } 
          else {
            list = null;
        }
        return list; 
    }
}
