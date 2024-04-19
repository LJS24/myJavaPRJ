import java.util.Scanner;
public class Personal_16 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int N;
        System.out.println("임의의 4의 배수를 입력하세요:");
        N = s.nextInt();
        for(int i=4; i<=N; i+=4){
            if (i%4 == 0){
                System.out.print("long ");
            }
        }
        System.out.print("int");
        System.out.println();
        s.close();
    }
}
