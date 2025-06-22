import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word 1: ");
        String word1 = sc.nextLine();
        System.out.println();

        System.out.print("Enter a word 2: ");
        String word2 = sc.nextLine();
        System.out.println();

        System.out.println("Frequency of Characters are in '"+ word1+"' : " );
        charFrequency(word1);
        System.out.println("-------x-------x-------x-------x-------x-------");
        System.out.println("Frequency of Characters are in '"+ word2+"' : " );
        charFrequency(word2);
        System.out.println("-------x-------x-------x-------x-------x-------");
        System.out.print("Are those words Anagram : " + isAnagram(word1, word2));
    }

    public static void charFrequency(String word) {
        int[] freq = new int[26];
        for (int i = 0; i < word.length(); i++) {
             freq[ (word.charAt(i) - 'a')] += 1;
        }
        for (int i =0 ; i < 26; i++){
            if (freq[i] > 0){
                System.out.println("Frequency of Character '" + (char)(i + 'a') +"' is : " + freq[i]);
            }
        }
    }

    public static boolean isAnagram(String word1, String word2) {
        int[] freq = new int[26];

        if (word1.length() != word2.length()) {
            return false;
        } else{
            for(int i = 0; i < word1.length(); i++ ){
                freq[(word1.charAt(i) - 'a')] +=1;
            }
            for(int i = 0; i < word2.length(); i++){
                freq[(word2.charAt(i) - 'a')] -=1;
            }

            for(int i = 0; i < 26; i++) {
                if(freq[i] != 0){
                    return false;
                }
            }
        }
        return true;
    }
}