import java.util.Scanner;
public class Code05_02_1 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a;

        System.out.println("정수를 입력하세요-->");
        a = s.nextInt();
        if (a<100) {
            System.out.println("입력한 수가 100보다 작습니다");
        }

    s.close();
    }
}
