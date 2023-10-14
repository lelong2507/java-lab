package controller;

import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class DictonaryManagement {
    private HashMap<String,String> wordList = new HashMap<String,String>();

    // ------ Function Add
    public String addList(String elWord, String vnWord){
        return wordList.put(elWord, vnWord);
    }

    // ----- Function Delete
    public String deleEle(String enWord){
        return wordList.remove(enWord);
    }

    // ------ Function Search
    public String transaletEle(String enWord){
        StringTokenizer stz = new StringTokenizer(enWord, " ");
        String meaning = this.wordList.get(enWord);
        while(stz.hasMoreTokens()){
            String nextWord = stz.nextToken();
            if(wordList.containsKey(nextWord)){
                System.out.println("----------------");
                System.out.println("Meaning: " + meaning);
                return meaning;
            }
        }
        return "Not Found!";
    }
}
