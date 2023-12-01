public class ForEjemplo1 {
    public static void main(String[] args) {
        int k=1;
        for (; k <=100; k+=12)
            System.out.println("valor de k = " + k);

            System.out.println("K= " + k);

        int m=0;
        for (; m <=100;) {
            System.out.println("m " + m);
            m++;
        }
        int p=0;
        for (; ;) {
            if (p >100) {
                break;
            }
            System.out.println("p= "+ p);
            p++;
        }
        for (int i=1, j=100; i<j; i++, j--) {
            System.out.println(i + "=" + j);
        }

        for (int j=1; j<=100; j++) {
            if (j % 2 ==0) {
                System.out.println("Valor de j = " + j);
            }

            for (j=1; j<=100; j++) {
                if (j %2==0) {
                    continue;
                }
                System.out.println("Valor de j =" +j);
            }
        }
    }



}
