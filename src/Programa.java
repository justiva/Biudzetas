import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        boolean menu = true;
        Scanner scanner = new Scanner(System.in);
        Biudzetas b1 = new Biudzetas();

        while ( menu){
            System.out.println("--------------------------------------------------" +"\n" +
                    " Pasirinkite ka norite daryti : \n 1 - prideti pajamu irasa " +
                    "\n 2 - prideti islaidu irasa \n 3 - pamatyti visus irasus \n 4 - balansas " +
                    "\n 5 - salinti irasa \n 6 - uzdaryti programa" +"\n " +
                    "-----------------------------------------------------");

            String pasirinkimas = scanner.next();

            if ( pasirinkimas.equals("1")){
                b1.pridetiPajamuIirasa();

            }

            if (pasirinkimas.equals("2")){
                b1.pridetiIslaiduIrasa();
            }

            if (pasirinkimas.equals("3")){
                System.out.println("Pasirinkite kokius irasus norite pamatyti : " +
                        "\n Pajamu - 1,\n Islaidu - 2");
                String pamatytiIrasus = scanner.next();
                if (pamatytiIrasus.equals("1")){
                    b1.spausdintiVisasPajamas();
                }
                if(pamatytiIrasus.equals("2")){
                    b1.spausdintiVisasIslaidas();
                }

            }

            if (pasirinkimas.equals("4")){
                b1.balansas();

            }

            if (pasirinkimas.equals("5")){
                System.out.println("Pasirinkite koki irasa norite pasalinti : " +
                        "\n Pajamu - 1,\n Islaidu - 2");
                String salintiIrasa = scanner.next();
                if (salintiIrasa.equals("1")){
                    b1.istrintiPajamuIrasa();
                }
                if(salintiIrasa.equals("2")){
                    b1.istrintiIslaiduIrasa();
                }

            }

            if (pasirinkimas.equals("6")){
                System.out.println("**********Programa uzdaroma********** ");
                menu = false;
                break;
            }
        }
        System.out.println();

    }
}
