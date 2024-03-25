public class Code04_15 {
    public static void main(String[] args) {
        String str = "난생처음 자바를 처음 학습 중입니다. 자바는 처음이지만 재미있네요.";

        System.out.println(str.indexOf("처음"));
        System.out.println(str.lastIndexOf("처음"));
        System.out.println(str.indexOf("처음", 4));
/*lastIndexOf는 찾는 순서만 반대로인 것이지, 반환하는 위치 값은 앞에서부터의 순서값이다.*/
        /*lastIndexOf는 주로 파일 확장자 위치를 반환하려고 쓴다. */
    }
}
