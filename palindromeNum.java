import java.util.*;
public class palindromeNum{
    public static void main(String[] args) {
        
        int num =  123321;
        int original = num;
        int rev = 0;

        while(num >0){
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num /10;
        }
        if(original == rev){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}