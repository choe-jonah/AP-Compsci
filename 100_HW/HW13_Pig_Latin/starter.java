/*
 *	Author: Jonah Choe
 *  Date: 12/8/24
 * 	Collaborator: 
*/

import java.util.Scanner;

public class starter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        System.out.println("Enter a sentence in English: ");
        String sentence = scanner.nextLine();
        

        int start = 0;
        int end = 0; 
        
        while (end <= sentence.length()) {

            if (end == sentence.length() || sentence.charAt(end) == ' ') {
                String word = sentence.substring(start, end);  
                
                if (!word.isEmpty()) {
                    String pigLatinWord = translateToPigLatin(word);
                    
                    System.out.print(pigLatinWord + " ");
                }
                
                start = end + 1;
            }
            end++;
        }
    }
    
     private static boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
    
    private static String translateToPigLatin(String word) {
        word = word.toLowerCase(); 
        
        if (isVowel(word.charAt(0))) {
            return word + "way";
        } else {
            int firstVowelIndex = -1;
            for (int i = 0; i < word.length(); i++) {
                if (isVowel(word.charAt(i))) {
                    firstVowelIndex = i;
                    break;
                }
            }
            
            if (firstVowelIndex > 0) {
                String consonantCluster = word.substring(0, firstVowelIndex);
                String restOfWord = word.substring(firstVowelIndex);
                return restOfWord + consonantCluster + "ay";
            } else {
                return word + "ay";
            }
        }
    }
}
