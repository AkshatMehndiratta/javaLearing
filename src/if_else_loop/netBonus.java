package if_else_loop;
import java.util.Scanner;
public class netBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your salary");
        int salary = sc.nextInt();
        System.out.println("Enter your service years");
        int netbonus = salary;
        int yearOfService = sc.nextInt();
        if(yearOfService>=5){
            netbonus = (5*netbonus)/100;
            System.out.println("netbonus is "+ netbonus);
        }
        else
            System.out.println("not eligible for bonus");
    }
}
