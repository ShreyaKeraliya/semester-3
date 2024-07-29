import java.util.*;
public class Vowel{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter character : ");
        char ch =sc.nextLine().charAt(0);
        if(ch =='A'||ch =='E'||ch =='I'||ch =='O'||ch =='U'||ch =='a'||ch =='e'||ch =='i'||ch =='o'||ch =='u'){
            System.out.println("character is Vowel");
        }
        else{
            System.out.println("character is not Vowel");
        }
        

    }
}