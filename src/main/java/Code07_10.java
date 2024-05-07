class Rabbito {
    String shape;
    int xPos;
    int yPos;

    Rabbito(String shape) {
        this.shape = shape;

    }
    void setPosition(int x, int y) {
        this.xPos = x;
        this.yPos = y;
    }
}

           //this를 쓰는 이유는 클래스와 자바 클래스의 변수명을 구분하기 위해서이다.//
public class Code07_10 {
    public static void main(String[] args){
        String rabbitcolor = "알비노";
        Rabbito rabbit = new Rabbito(rabbitcolor);   //이 부분이 생성자. 여기서 실행되는 부분이 생성자 함수인 것. 위에서 넣은 것이 이 함수에 기능을 추가한 것이다.//
        System.out.printf("토끼 객체의 기본 모양은 [%s]입니다.", rabbit.shape);

    }
}
