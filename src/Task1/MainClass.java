package Task1;

import java.util.*;

public class MainClass {
    public static void main(String[] args){
        List<String> words = Arrays.asList(
                "Роза", "Ромашка", "Георгин", "Василек", "Кактус",
                "Астра", "Тюльпан", "Нарцисс", "Василек", "Кактус",
                "Ромашка", "Георгин", "Василек", "Тюльпан", "Тюльпан",
                "Георгин", "Василек", "Тюльпан", "Тюльпан", "Василек"
        );

        Set<String> unique = new HashSet<String>(words);

        System.out.println("Первоначальный массив");
        System.out.println(words.toString());
        System.out.println("Уникальные слова");
        System.out.println(unique.toString());
        System.out.println("Частота встречаемости слов");
        for (String key : unique) {
            System.out.println(key + ": " + Collections.frequency(words, key));
        }
    }
}