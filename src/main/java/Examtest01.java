import java.util.Scanner;
public class Examtest01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int hap = 0;

        if (a<b){
            for(int i=a;i<=b;i++){
                if (i%2 !=0){
                    hap +=i;
                }
            }
        } else if (a > b) {
            for (int i = a; i >= b; i--) {
                if (i % 2 != 0) {
                    hap += i;
                }
            }
        }
        System.out.println(hap);
        s.close();
    }
}
