import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class PajamuIrasas {
    public static int visosPajamos;
    public static int kategorijosIndeksas;
    public int id;
    public int suma;
    public LocalDateTime data = LocalDateTime.now();
    public String papildomaInfo;
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy MM dd HH:mm:ss");
    String formatuotaData = data.format(dtf);
    Scanner sc = new Scanner(System.in);

    public PajamuIrasas(int suma) {
        this.kategorijosIndeksas++;
        this.id = kategorijosIndeksas;
        this.suma = suma;
        System.out.println("Iveskite papildoma informacija.");
        String ivestaInfo = sc.next();
        this.papildomaInfo = ivestaInfo;
        this.visosPajamos += suma;

        System.out.println(" Iraso ID : " + this.id + "\n Suma " + this.suma +
                "\n Data " + this.formatuotaData + "\n Papildoma informacija : " + this.papildomaInfo);
    }

    public int getSuma() {
        return suma;
    }

    public void setSuma(int suma) {
        this.suma = suma;
    }

    public String getPapildomaInfo() {
        return papildomaInfo;
    }

    public void setPapildomaInfo(String papildomaInfo) {
        this.papildomaInfo = papildomaInfo;
    }


    @Override
    public String toString() {
        return " Iraso ID : " + this.id + "\n Suma " + this.suma +
                "\n Data " + this.formatuotaData + "\n Papildoma informacija : " + this.papildomaInfo
                ;
    }
}
