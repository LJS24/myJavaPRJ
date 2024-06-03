class Tree2{
    String color;
    public void setTree(String color){
        this.color = color;
    }
}
class AppleTree2 extends Tree2{
    @Override
    public void setTree(String color) {
        super.setTree(color);
        this.color = color;
        System.out.println(color+ "색상으로 설정하였습니다.");
    }
}


public class Quiz_20240603_1 {
}
