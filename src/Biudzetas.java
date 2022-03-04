import java.util.ArrayList;
import java.util.Scanner;

public class Biudzetas {
    ArrayList<PajamuIrasas> pajamos = new ArrayList<PajamuIrasas>();
    ArrayList<IslaiduIrasas> islaidos = new ArrayList<IslaiduIrasas>();

    Scanner scanner = new Scanner(System.in);

    public void pridetiPajamuIirasa() {
        System.out.println("Kiek pinigu norite ideti?");
        int sumaKiekIdeti = scanner.nextInt();
        if (sumaKiekIdeti > 0) {
            pajamos.add(new PajamuIrasas(sumaKiekIdeti));
        } else {
            System.out.println("Negalite prideti nulio ar neigiamo skaiciaus. ");
        }

    }


    public void pridetiIslaiduIrasa() {
        System.out.println("Kiek pinigu norite isimti?");
        int sumaKiekIsimti = scanner.nextInt();
        if (sumaKiekIsimti > 0) {
            islaidos.add(new IslaiduIrasas(sumaKiekIsimti));
        } else {
            System.out.println("Negalite isimti nulio ar neigiamo skaiciaus");

        }
    }

    public void istrintiPajamuIrasa() {
        System.out.println("Kelinta irasa norite istrinti? Nurodykite iraso ID? ");
        int trinti = scanner.nextInt();
        int trintiPataisytas = trinti - 1;

        for (int i = 0; i < pajamos.size(); i++) {
            pajamos.remove(trintiPataisytas);
            break;
        }

    }

    public void istrintiIslaiduIrasa() {
        System.out.println("Kelinta irasa norite istrinti? Nurodykite iraso ID ");
        int trinti = scanner.nextInt();
        int trintiPataisytas = trinti - 1;

        for (int i = 0; i < islaidos.size(); i++) {
            islaidos.remove(trintiPataisytas);
            break;

        }
    }


    public void spausdintiVisasPajamas() {
        for (int i = 0; i < pajamos.size(); i++) {
            String visiPajamuIrasai = String.format(" Iraso ID : " + pajamos.get(i).id + "\n Suma : "
                    + pajamos.get(i).suma +
                    "\n Data : " + pajamos.get(i).formatuotaData +
                    "\n Papildoma informacija : " + pajamos.get(i).papildomaInfo);
            System.out.println(visiPajamuIrasai);
        }
    }

    public void spausdintiVisasIslaidas() {

        for (int i = 0; i < islaidos.size(); i++) {
            String visiIslaiduIrasai = String.format(" Iraso ID : " + islaidos.get(i).id +
                    "\n Suma : " + islaidos.get(i).suma +
                    "\n Data : " + islaidos.get(i).formatuotaData +
                    "\n Papildoma informacija : " + islaidos.get(i).papildomaInfo2);
            System.out.println(visiIslaiduIrasai);
        }
    }

    public void balansas() {
        int visosPajamos = 0;
        int visosIslaidos = 0;

        for (int i = 0; i < pajamos.size(); i++) {
            visosPajamos = pajamos.get(i).visosPajamos;
            //  System.out.println("pajamos : " + visosPajamos);
            break;
        }
        for (int i = 0; i < islaidos.size(); i++) {
            visosIslaidos = islaidos.get(i).visosIslaidos;
            //  System.out.println("islaidos : " + visosIslaidos);
            break;
        }
        double dVisosPajamos = visosPajamos;
        double dVisosIslaidos = visosIslaidos;
        double balansas = dVisosPajamos - dVisosIslaidos;
        System.out.println("Balansas : " + balansas);
    }

}
