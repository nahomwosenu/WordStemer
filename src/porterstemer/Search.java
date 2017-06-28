/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package porterstemer;


public class Search {
    public static int[] search(String term){
        if(!Stemer.isStopWord(term)){
            String original=term;
            term=Stemer.removePrefix(term);
            term=Stemer.removeSuffix(term);
            System.out.println("Original term: "+original+" Stemed: "+term);
            if(Indexer.index.containsKey(term.toLowerCase())){
                int[] result=Indexer.index.get(term.toLowerCase());
                return result;
            }
        }
        return null;
    }
}
