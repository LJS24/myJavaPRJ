public class Personal_29 {
    public static void main(String[] args){
        int i;

        int a = 1;
        int [] gugu= new int[9];
        int [] gugu1 = new int[9];

        for (int j = 1; j <=9 ; j++) {
            gugu[j-1] = j;
            gugu1[j-1] = j;
        }
        for(i=0; i<9; i++){
            System.out.printf("%2d X %2d = %2d",gugu[a] , gugu1[i], gugu[a] *gugu[i]);
            if (i == 8){
                System.out.println();
                i = -1;
                a++;
            }
            if (a == 9){
                break;
            }
        }
    }
}
