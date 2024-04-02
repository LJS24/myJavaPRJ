import java.util.Scanner;
public class Personal_7 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int x, y;

        System.out.println("X좌표를 입력하세요:");
        x = s.nextInt();
        System.out.println("Y좌표를 입력하세요:");
        y = s.nextInt();

        if(x>0 && y>0) {
            System.out.println("제 1사분면입니다.");
        }
        else if(x<0 && y>0){
            System.out.println("제 2사분면입니다.");
        }
        else if (x<0 && y<0){
            System.out.println("제 3사분면입니다.");
        }
        else if (x>0 && y<0) {
            System.out.println("제 4사분면입니다.");
        }else{
            System.out.println("다시 입력하십시오.");
            }


        s.close();
    }
}
