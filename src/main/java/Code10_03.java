public class Code10_03 {
    public static int plus(int v1, int v2){  //접근 지시자는 기본적으로 써 주는 것이 좋다.
        int result;
        result = v1 + v2;
        return result;

    }

    public static void main(String[] args){
        int hap;
        hap = plus(100, 200);
        System.out.println("100과 200의 plus() 메서드 결과 : "+hap);
    }
}
