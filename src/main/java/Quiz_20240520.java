class Tree{
    private String color;

    public void setTree(String color){
        this.color = color;
    }

}
class AppleTree extends Tree{
    @Override
    public void setTree(String color) {
        super.setTree(color);
        System.out.println(color+" 색상으로 설정하였습니다.");
    }
}
public class Quiz_20240520 {
    public static void main(String[] args) {
        //파일명과 같은 이름의 클래스가 public class이다. 때문에 파일당 1개뿐이다.//
        AppleTree tree1 = new AppleTree();

        tree1.setTree("yellow");

    }
}
