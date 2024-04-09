import java.util.Scanner;
public class Code06_quiz3 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a, b;
        System.out.println("첫 번째 수를 입력:");
        a = s.nextInt();
        System.out.println("두 번째 수를 입력:");
        b = s.nextInt();

        if (a<b) {

            for (int i = a; i < b + 1; i++) {
                if (i%3 ==0) {
                    System.out.println(i);
                }

            }
        }
        else if (a>b) {
            for (int i = a; i > b; i--) {
                if (i%3 ==0) {
                    System.out.println(i);
                }

            }
        }
        s.close();
    }
}