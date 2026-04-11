import java.util.*;
public class reverseString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string to revere :");
        String str= sc.nextLine();
        char[] char1 = str.toCharArray();
        for (int i = char1.length - 1; i >= 0; i--) {
            System.out.print(char1[i]);
        }
        System.out.println();
    }
}