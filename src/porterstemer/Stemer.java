/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package porterstemer;


public class Stemer {
    public static String stem(String word){
        
        return word;
    }
 public static boolean isStopWord(String term){
     if(Indexer.stopWord.contains(term.toLowerCase())){
         return true;
     }
     return false;
 }   
 public static String removePrefix(String word){
     for(String pre:Indexer.prefix){
         if(word.startsWith(pre.toLowerCase())){
             word=word.substring(word.indexOf(pre.charAt(pre.length()-1))+1);
             return word;
         }
     }
     return word;
 }
 public static String removeSuffix(String word){
     for(String post:Indexer.suffix){
         if(word.endsWith(post.toLowerCase())){
             word=word.substring(0,word.lastIndexOf(post));
             return word;
         }
     }
     return word;
 }
}
