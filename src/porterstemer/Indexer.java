/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package porterstemer;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
public class Indexer {
    public static List<String> stopWord=new ArrayList<String>();
    public static List<String> prefix=new ArrayList<String>();
    public static List<String> suffix=new ArrayList<String>();
    public static HashMap<String,int[]> index=new HashMap<String,int[]>();
    public static List<String> fileList=new ArrayList<String>();
    public static void generate(){
        String[] stop="i is was were that the do doing can may we there done".split(" ");
        String[] pre="after pre pro intra over re post in under on".split(" ");
        String[] post="ing ed er les ion".split(" ");
        for(String s:stop)
            stopWord.add(s);
        for(String p:pre)
            prefix.add(p);
        for(String p:post)
            suffix.add(p);
    }
    public static void buildIndex(String[] list,String path){
        int counter=0;
        fileList.add(path);
        int i=fileList.indexOf(path);
        for(String term:list){
            if(term!=null && !term.isEmpty()){
                if(!Stemer.isStopWord(term)){
                    term=Stemer.removePrefix(term);
                    term=Stemer.removeSuffix(term);
                    index.put(term,new int[]{i,counter});
                    
                }
            }
            counter++;
        }
    }
    
}
