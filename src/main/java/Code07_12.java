class Rabbit12{
    private String shape;
    private int xPos;
    private int yPos;

    void setPosition(int xPos, int yPos){
       this.xPos = xPos;
        this.yPos = yPos;                // = 다음에 x, y만 쓰면 접근 제한 지시자 사용으로 인해 오류가 발생. 지금의 현태로 바꾸어 주어야 함.//

    }
}





public class Code07_12 {
    public static void main(String[] args){
        Rabbit12 rabbit2 = new Rabbit12();

        rabbit2.setPosition(100, 200);
    }
}
