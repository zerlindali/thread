package edu.part.one;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * @author Jianshu Wu create at 2021/5/25 10:57
 * @version 1.0.0
 * @description PartOneA
 */
public class PartOneA {

    /**
     * get words from article
     * @param file
     * @return
     */
    public  static List<String >  getLowerCaseWords(File file) {
        Scanner scanner = null;
        Pattern pattern = Pattern.compile("[a-zA-Z]+");
        String text = "";
        List<String > words = new ArrayList<>();
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        if(scanner!=null){
            while(scanner.hasNextLine()){
                text+= " "+scanner.nextLine();
            }
            scanner.close();
        }

        Matcher matcher = pattern.matcher(text);
        while (matcher.find()){
            words.add(matcher.group().toLowerCase());
        }
        return words;
    }

    /**
     * match with google
     * @param source
     * @param target
     * @return
     */
    public static List<String> getMatchedWords(List<String> source ,List<String> target){
        return source.stream().filter(x->target.contains(x)).distinct().collect(Collectors.toList());
    }

    /**
     * mergeSort(бн)
     */


    /**
     * test
     */
    public static void main(String[] args) {
        // read an_article.txt
        File articleFile = new File("E:\\workspace\\thread\\src\\main\\resources\\an_article.txt");
        // read google-10000-english-no-swears.txt
        File googleFile = new File("E:\\workspace\\thread\\src\\main\\resources\\google-10000-english-no-swears.txt");
        // get words from an_article.txt
        List<String> articleWords=getLowerCaseWords(articleFile);
        // get words from google-10000-english-no-swears.txt
        List<String> googleWords=getLowerCaseWords(googleFile);
        // match with google-10000-english-no-swears, get valid words
        List<String> result = getMatchedWords(articleWords, googleWords);
        // print result
        System.out.println(result.size());
        System.out.println(result.toString());
    }
}
