public class personal_30 {
    public static void main(String[] args) {
        int j = 2;
        int hap;

        for (int a = 1; a <=9; a++) {
            hap=a*j;
            System.out.printf("%2d X%2d=%2d", j, a, hap);
            if(a == 9){
                System.out.println("");
                a = 0;
                j++;
            }
            if(j==9){
                break;
            }






        }
    }
}
