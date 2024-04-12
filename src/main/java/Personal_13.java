import java.util.Scanner;
public class Personal_13 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a, b, hap=0;

        System.out.println("200을 입력:");
        a = s.nextInt();
        System.out.println("300을 입력:");
        b = s.nextInt();

        for (int i = a; i < b + 1; i++) {
            if (i%2 != 0) {
                hap += i;
                System.out.println(hap);
            }
        }
        s.close();
    }
}

