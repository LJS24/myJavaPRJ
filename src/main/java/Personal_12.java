import java.util.Scanner;
public class Personal_12 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int X,N, a, b, num=0;
        System.out.println("구매한 물건의 총 가격을 입력하세요:");
        X=s.nextInt();
        System.out.println("구매한 물건의 종류를 숫자만 입력하세요:");
        N=s.nextInt();

        for(int i=0;i<N;i++){
            System.out.println(i+1 + "번째 물건의 가격을 입력하세요:");
            a=s.nextInt();
            System.out.println(i+1 + "번째 물건의 개수를 입력하세요:");
            b=s.nextInt();
            num+=(a*b);
            }
        if(num==X){
            System.out.println(num==X);
        }
        else{
            System.out.println(num==X);
        }
    }
}
