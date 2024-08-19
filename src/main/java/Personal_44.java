import java.util.Scanner;
public class Personal_44 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(b>a) {
            System.out.println("restart-b must smaller than a");
             return;
        }
        int b_square = (int)(Math.pow(a, 2) - Math.pow(b, 2));
        System.out.println("square root_result: " + b_square);

        sc.close();
    }
}
