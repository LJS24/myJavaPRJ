class Proto{
    String side;
    int height;
    int weight;
    static int num;
    Proto() {
        num++;

    }
    public void status(int x, int y){
            height = x;
            weight = y;
    }

}
class Op extends Proto{
    Op() {

        side = "Aut";
    }

    @Override
    public void status(int x, int y) {
        super.status(x, y);
    }

}
class Meg extends Proto{
    Meg() {

        side = "Dec";
    }

    @Override
    public void status(int x, int y) {
        super.status(x, y);
    }
}
public class Personal_26 {
    public static void main(String[] args){
        System.out.println("방문 전 방문자 수: "+ Proto.num);

        Op aut1 = new Op();
        aut1.status(800, 5000);
        System.out.println("첫 번째 방문자의 편은 "+aut1.side+" 입니다.");
        System.out.println("첫 번째 방문자의 키와 몸무게는 각각 "+aut1.height+", "+aut1.weight+" 입니다.");
        System.out.println("현재 방문자의 수: "+ Op.num);

        Meg dec1 = new Meg();
        dec1.status(1000, 7000);
        System.out.println("두 번째 방문자의 편은 "+dec1.side+" 입니다.");
        System.out.println("두 번째 방문자의 키와 몸무게는 각각 "+dec1.height+", "+dec1.weight+" 입니다.");
        System.out.println("현재 방문자의 수: "+ Meg.num);
    }
}
