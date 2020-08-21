package org.launchcode.java.studios.charactercount;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterCount {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);                 //Declare Scanner type variable to get user input
        System.out.println("Enter a word for character count: ");

        String userInput = input.next().toLowerCase();          //Convert userInput to lowercase to mae it case-insensitive

        char[] charactersInString = userInput.toCharArray();    //Convert userInput to an array of characters

        HashMap<Character, Integer> count = new HashMap<>();    //Use HashMap and declare variable of count

        for (char c : charactersInString) {                     //Loop through array for each characters
            if (c >= 'a' && c <= 'z') {                         //Check if the characters are alphabets
                if (count.containsKey(c)) {                     //Check if current character already exists
                    int existCount = count.get(c);              //If it exists; get the current value associated to it
                    count.put(c, existCount + 1);               //Increment the value for the character by 1 and put it back
                } else {
                    count.put(c, 1);                            //If false; put the value of the character as 1
                    }
                }
            }

        for (Map.Entry<Character, Integer> charCount : count.entrySet()) {          //Map through the entries in count
            System.out.println(charCount.getKey() + " : " + charCount.getValue());  //Print the result in 'key-value' pairs
        }
    }
}
