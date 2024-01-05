import java.util.Scanner;
public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner word = new Scanner(System.in);
        System.out.println("Put in a word");
        String word1 = word.nextLine();
        Scanner letter1 = new Scanner(System.in);
        System.out.println("Enter a letter from the word");
        char letter11 = letter1.next().charAt(0);
        Scanner letter2 = new Scanner(System.in);
        System.out.println("Enter another letter from the word");
        char letter22 = letter2.next().charAt(0);
        
        if (word1.indexOf(letter11) >= 0) {
            
        int letter1value = word1.indexOf(letter11);
        int letter2value = word1.indexOf(letter22);
        System.out.println("The first character is located at the " + letter1value + "th position");
        System.out.println("The first character is located at the " + letter2value + "th position");
        
        if(letter1value < letter2value){
            System.out.println("The first letter DOES come before the second letter");
        }
        else if(letter1value > letter2value){
            System.out.println("The first letter DOES NOT come before the second letter");
        }
        int sum = letter1value + letter2value;
        System.out.println("Your first word plus your second word is " + sum);
        
        int length = word1.length();
        System.out.println("the length of your string is " + length);
        
        if(length > sum){
            char index = word1.charAt(sum);
            System.out.println(index);
        }
        else if(length <= sum){
            System.out.println("I cannot output letter number " + sum + " since the length is " + length);
        }
        }
        else if(word1.indexOf(letter11)<0){
            System.out.println("cannot run program");
        }
    }
}
