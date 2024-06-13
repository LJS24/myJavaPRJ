import java.util.Scanner;
interface Nipper{
    void chop();
}


interface Longnose{
    void grab();
}


class Multitool implements Nipper, Longnose {
    Scanner s = new Scanner(System.in);
    String name;

    @Override
    public void chop() {
        System.out.println("무엇을 자를까요?");
        name = s.nextLine();
        System.out.println("니퍼로 " + name + "을 잘랐습니다.");
    }

    @Override
    public void grab() {
        System.out.println("무엇을 집을까요?");
        name = s.nextLine();
        System.out.println("롱노우즈로 " + name + "을 집었습니다.");
    }
}
    public class Personal_36 {
        public static void main(String[] args){
            Multitool multi1 = new Multitool();
            multi1.chop();
            multi1.grab();

    }
}