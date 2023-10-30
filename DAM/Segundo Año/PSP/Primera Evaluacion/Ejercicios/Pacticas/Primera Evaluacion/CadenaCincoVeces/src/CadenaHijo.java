public class CadenaHijo {
    public static void main(String[] args) {
       if (args.length>0) {
           String linea=args[0];
           for (int i=0; i< 5;i++) {
               System.out.println(linea);
           }
       }else {
           System.out.println("NO SE LE ENVIO NINGUN ARGUMENTO");
           System.exit(1);
       }

    }
}
