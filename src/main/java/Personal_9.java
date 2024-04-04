import java.util.Scanner;
public class Personal_9 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a, b, c;
        System.out.println("직사각형의 가로 길이를 입력하세요:");
        a = s.nextInt();
        System.out.println("직사각형의 세로 길이를 입력하세요:");
        b = s.nextInt();

        c =a * b;

        if (a>=1 && a<=100)
        {
            if(b>=1 && b<=100)
            {
            System.out.println("직사각형의 넓이는 " + c + "입니다.");
            }
            else {
                System.out.println("a와 b의 조건은 1 이상 100 이하의 정수입니다.");
            }
        }
        else
        {
            System.out.println("a와 b의 조건은 1 이상 100 이하의 정수입니다.");
        }
        s.close();
    }
}
