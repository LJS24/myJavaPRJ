public class Code09_04 {
    public static void main(String[] args) {
        int Ary1[] = {100, 200, 300, 400};
        int Ary2[] = new int[]{100, 200, 300};
        int Ary3[];
        Ary3 = new int[]{100, 200};
        int[] Ary4 = new int[1];
        Ary4[0] = 100;


        for(int i=0;i<4;i++) {
            System.out.printf("Ary1[%d]==>%d\t", i, Ary1[i]);
        }
        System.out.println();

        for(int i=0;i<3;i++) {
            System.out.printf("Ary2[%d]==>%d\t", i, Ary2[i]);
        }
        System.out.println();

        for(int i=0;i<2;i++) {
            System.out.printf("Ary3[%d]==>%d\t", i, Ary3[i]);
        }
        System.out.println();

        for(int i=0;i<1;i++) {
            System.out.printf("Ary4[%d]==>%d\t", i, Ary4[i]);
        }
        System.out.println();

        for(int i : Ary1){
            System.out.print("Ary1["+i+"]\t");
        }
        System.out.println();

        for(int i : Ary2){
            System.out.print("Ary2["+i+"]\t");
        }
        System.out.println();

        for(int i : Ary3){
            System.out.print("Ary3["+i+"]\t");
        }
        System.out.println();

        for(int i : Ary4){
            System.out.print("Ary4["+i+"]\t");
        }
        System.out.println();
    }
}