public class Code04_13 {
    public static void main(String[] args) {
        String str = "   한글     ABCD   efgh   ";
        String cutStr = "";
        String allStr = "";



        cutStr = str.trim();
        allStr = str.replaceAll(" ", "");

        System.out.println("기존 문자열==>[" + str + "]");
        System.out.println("공백 제거==>[" + cutStr + "]");
        System.out.println("공백 전부 제거==>[" + allStr + "]");
        /* 외우기 */

    }
}
