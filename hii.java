import java.util.*;

public class hii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Total number of class");
        int x = sc.nextInt();
        System.out.println("Number of class attended");
        int y = sc.nextInt();
        float z = (y*100)/x;
        System.out.println("if your medical condition was not good then type Y otherwise N");
        char ch = sc.next().charAt(0);
        if(z>=75 || ch=='Y')
        	System.out.println("you can sit in examinations" + z + ch);
        else
        	System.out.println("you cannot sit in examinations" + z + ch);
    }
}
