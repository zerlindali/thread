package edu.part.one;

import java.io.File;
import java.util.Arrays;
import java.util.List;

/**
 * @author Jianshu Wu create at 2021/5/25 14:34
 * @version 1.0.0
 * @description PartOneB
 */
public class PartOneB {
    static int count = 0;
    public static String[] mergeSort(String[] strs, int low, int high) {

        int mid = (low + high) / 2;
        if (low < high) {
            // left
            mergeSort(strs, low, mid);
            // right
            mergeSort(strs, mid + 1, high);
            // merge left and right
            merge(strs, low, mid, high);
        }

        return strs;
    }

    public static void merge(String[] strs, int low, int mid, int high) {
        count++;
        String[] temp = new String[high - low + 1];
        int i = low;// left point
        int j = mid + 1;// right point
        int k = 0;

        // Move the smaller element into the new array first
        while (i <= mid && j <= high) {
            if (strs[i].compareTo(strs[j]) <= 0) {
                temp[k++] = strs[i++];
            } else {
                temp[k++] = strs[j++];
            }
        }

        // Move the rest of the elements on the left into the array
        while (i <= mid) {
            temp[k++] = strs[i++];
        }

        // Move the rest of the elements on the right into the array
        while (j <= high) {
            temp[k++] = strs[j++];
        }

        // Overwrite the elements of the new array over the strs array
        for (int k2 = 0; k2 < temp.length; k2++) {
            strs[k2 + low] = temp[k2];
        }
    }


    // Merge sort implementation test
    public static void main(String[] args) {
        // read an_article.txt
        File articleFile = new File("E:\\workspace\\thread\\src\\main\\resources\\an_article.txt");
        // read google-10000-english-no-swears.txt
        File googleFile = new File("E:\\workspace\\thread\\src\\main\\resources\\google-10000-english-no-swears.txt");
        // get words from an_article.txt
        List<String> articleWords=PartOneA.getLowerCaseWords(articleFile);
        // get words from google-10000-english-no-swears.txt
        List<String> googleWords=PartOneA.getLowerCaseWords(googleFile);
        // match with google-10000-english-no-swears, get valid words
        List<String> result = PartOneA.getMatchedWords(articleWords, googleWords);
        String [] strs = result.toArray(new String [result.size()]);
        PartOneB.mergeSort(strs, 0, strs.length-1);
        // print the result
        Arrays.stream(strs).forEach(x->System.out.println(x));
        System.out.println("move count : " + count);
    }
}
