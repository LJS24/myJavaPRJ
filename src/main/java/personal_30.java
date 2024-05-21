public class personal_30 { //public class 선언//
    public static void main(String[] args) {  //main함수 정의//
        int j = 2;    //정수형 변수 j 선언//
        int hap;    //정수형 변수 hap 선언//

        for (int a = 1; a <=9; a++) {      //for문 루프 생성//
            hap=a*j;               //hap을 변수 둘의 곱으로 설정//
            System.out.printf("%2d X%2d=%2d", j, a, hap);   //구구단 출력//
            if(a == 9){         //줄바꿈 조건 설정//
                System.out.println("");     //줄바꿈//
                a = 0;         //a값을 초기화하여 새 단(루프)이 시작하게끔 설정//
                j++;        //같은 목적으로 j값을 1 증가시킴//
            }
            if(j==9){       //무한 반복을 막기 위해 조건문으로 종료 시점 설정//
                break;      //루프를 종료//
            }






        }
    }
}
