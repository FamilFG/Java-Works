package set_map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.TreeSet;

public class NameSort {
    public static void main(String[] args) {
        TreeSet<String> names = new TreeSet<String>();
        names.add("James");
        names.add("John");
        names.add("Julie");
        names.add("Famil");
        names.add("Akif");

        System.out.println(names);



        //2 exercise
        var sentence = "java is fun and java is powerful";
        List<String> sentenceList = Arrays.asList(sentence.split(" "));

        for (int i = 0; i < sentenceList.size(); i++) {
            for (int j = i + 1; j < sentenceList.size(); j++) {
                if (sentenceList.get(i).equals(sentenceList.get(j))) {
                    System.out.println(sentenceList.get(i) + " " + sentenceList.get(j));
                }
            }
        }

        //3 exercise
        HashMap<String, Integer> people = new HashMap<>();
        people.put("James", 15);
        people.put("John", 21);
        people.put("Akif", 22);
        people.put("Famil", 23);
        int max = people.get("James");
        for (int age : people.values()) {
            if (age > max) {
                max = age;
            }
        }
        System.out.println(max);




        HashMap<String, Integer> cumle = new HashMap<>();
        String str = "java is fun and java is powerful";
        String[] words = sentence.split(" ");
        for (String word: words){
            if (cumle.containsKey(word)){
                cumle.put(word, cumle.get(word) + 1);
            }
            else{
                cumle.put(word, 1);
            }
        }
        System.out.println(cumle);
    }


}
