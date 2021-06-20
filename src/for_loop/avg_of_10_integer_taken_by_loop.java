package for_loop;
import java.util.Scanner;
public class avg_of_10_integer_taken_by_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 integer");
        int sum=0;
        for(int i=0;i<10;i++) {
            int num = sc.nextInt();
            sum += num;
        }
        double avg = (float)sum/10.0;
        System.out.println("average is "+avg);
    }
}
