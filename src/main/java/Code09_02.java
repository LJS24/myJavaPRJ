import java.util.Scanner;
public class Code09_02 {
    public static void main(String[] args){
        Scanner s =  new Scanner(System.in);
        int[] numAry = new int[4];
        int hap = 0;

        for(int i=0;i<4;i++) {
            System.out.println("숫자: ");
            numAry[i] = s.nextInt();
            hap+=numAry[i];
        }
        System.out.println("합계 ==> " + hap);

        for(int i : numAry){           //한 단계 발전한 for문 형식. 마치 while문과 같은 구조.//
            hap += i;
        }
        System.out.println(".");
        System.out.println(".");
        System.out.println(".");
        System.out.println("합계 ==> " + hap);

        s.close();
    }
}
