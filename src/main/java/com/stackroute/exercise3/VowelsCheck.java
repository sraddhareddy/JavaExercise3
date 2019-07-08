package com.stackroute.exercise3;

public class VowelsCheck {
    public String[] removeVowels(String[] places) {
        String[] array = new String[places.length];
        for (int i = 0; i < places.length; i++) {
            char ch=places[i].charAt(0);
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {

                array[i] = places[i].charAt(0) + places[i].replaceAll("[AEIOUaeiou]", "");

            } else {
                array[i] = places[i].replaceAll("[AEIOUaeiou]", "");

            }
        }        //except first character delete vowels from every string

        return array;
    }
}
