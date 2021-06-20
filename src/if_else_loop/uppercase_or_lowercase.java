package if_else_loop;
import java.util.Scanner;
public class uppercase_or_lowercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character");
        char ch = sc.next().charAt(0);
        int ascii = (int)ch;
        if(ascii>=65 && ascii<=90)
            System.out.println("character is uppercase");
        if(ascii>=97 && ascii<=122)
            System.out.println("character is lowercase");
    }
}
