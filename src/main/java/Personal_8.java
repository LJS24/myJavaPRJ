import java.util.Scanner;
public class Personal_8 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);              //메인함수, 스캐너 설정 //
        int num;                                         //정수값으로 받을 변수를 지정 //

        System.out.println("자연수를 입력하세요:");         //사용자가 값을 입력하도록 안내 메시지 출력//
        num = s.nextInt();                              //사용자가 입력한 값을 받음//

        if(num%21 == 0) {                               //경우 1//
            System.out.println("3과 7의 공배수입니다.");   // 3의 배수 집합과 7의 배수 집합의 교집합인지 확인 //
        }
        else if(num%7 == 0){                           //경우 2//
            System.out.println("7의 배수입니다.");       //앞의 집합에 속하지 않을 경우 7의 배수 집합인지 확인//
        }
        else if (num%3 == 0){                         //경우 3//
            System.out.println("3의 배수입니다");       //앞의 집합에 속하지 않을 경우 3의 배수 집합인지 확인//
        }
        else {                                       //그 외 경우
            System.out.println("잘못된 선택입니다.");   //설정 외의 값이 입력되었을 때 잘못된 입력임을 출력//
        }

        s.close();
    }
}
