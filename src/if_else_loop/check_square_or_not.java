package if_else_loop;
import java.util.Scanner;
public class check_square_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of length of rectangle");
        int length=sc.nextInt();
        System.out.println("Enter value of breadth rectangle");
        int breadth = sc.nextInt();
        if(length==breadth){
            System.out.println("rectangle is square");
        }
        else
            System.out.println("rectangle is not square");
    }
}
