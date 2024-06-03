interface Tree3{
    public void setTree(int color);


}
class AppleTree3 implements Tree3{
    int color;
    @Override
    public void setTree(int color) {
        this.color = color;
        System.out.println(color+"색상으로 설정되었습니다.");
    }
}
public class Quiz_20240603_2 {
}
