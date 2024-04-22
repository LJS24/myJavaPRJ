public class Personal_18 {
    public static void main(String[] args) {
        int a=100, b=300, hap=0;
        for (int i=a; i<b+1; i++){
            if (i%5 ==0||i%7 ==0){
                hap+=i;
                System.out.println(hap);
            }
        }
    }
}
