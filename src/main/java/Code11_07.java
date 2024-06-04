public class Code11_07 {
    public static void main(String[] args){

        int[] ary = {10, 20, 30};

        try{
            ary[3] = 1234 / 0;
            ary[3] = 1234;
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("배열 첨자 오류입니다." + e);
        } catch (ArithmeticException e){
            System.out.println("0으로 나누는 등의 수식 오류입니다." + e);
        } catch (Exception e) {
            System.out.println("자바의 모든 에러의 최초 조상: "+ e);  //이 부분은 모든 에러를 잡으므로, 가장 나중에 두어야 한다. 다른 캐치들도 범위가 좁은 것부터 써야 한다.
        }finally{
           System.out.println("이 부분은 무조건 보입니다.");
        }
    }
}
