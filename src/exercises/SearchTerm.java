package exercises;

import java.util.Scanner;

public class SearchTerm {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String phrase = ("Alice was beginning to get very tired of sitting by her sister on the bank, and of having " +
                        "nothing to do: once or twice she had peeped into the book her sister was reading, but it had " +
                        "no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without " +
                        "pictures or conversation?'").toLowerCase();

        System.out.println("Enter term to search: ");
        String searchTerm = input.nextLine();
        String search = searchTerm.toLowerCase();

        Boolean status = phrase.contains(search);
        System.out.println("Search status for your term: " + status);

        Integer index = phrase.indexOf(search);
        Integer length = search.length();
        System.out.print("Your search term starts at index of " + index + " and has a length of " + length);

        String newPhrase = phrase.replaceAll(search, "");
        System.out.println("Following is the new phrase without the removed term: \n" + newPhrase);
    }
}
