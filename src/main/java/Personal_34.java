import java.util.Scanner;
public class Personal_34 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N;
        long M;

        System.out.println("카드는 몇 장입니까? : ");
        N = s.nextInt();

        System.out.println("설정된 값은 몇입니까? : ");
        M = s.nextLong();

        if(M<N){
            System.out.println("잘못된 설정값 입니다. 재시작 하십시오.");
            return;
        }


        int[] arr = new int[N];

        for (int i = 1; i < N + 1; i++) {
            System.out.println(i + "번 카드의 숫자는 무엇입니까? :");
            arr[i - 1] = s.nextInt();
        }
        int l=0;
        for(int p=0;p<N;p++){
            l+=arr[p];
        }
        if(l<=M) {
            System.out.print("카드들의 값: ");
            for (int k = 0; k < N; k++) {
                System.out.print(arr[k] + " ");
            }
        }else{
            System.out.println("카드들의 값의 합이 설정값보다 큽니다. 재시작 하십시오. ");
        }
    }
}
