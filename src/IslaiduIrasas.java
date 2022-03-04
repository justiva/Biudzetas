import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class IslaiduIrasas {
    public static int visosIslaidos;
    public static int kategirijosIndeksas;
    public int id;
    public int suma;
    public LocalDateTime data = LocalDateTime.now();
    public String papildomaInfo2;

    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy MM dd HH:mm:ss");
    String formatuotaData = data.format(dtf);
    Scanner sc = new Scanner(System.in);

    public IslaiduIrasas(int suma2) {
        kategirijosIndeksas++;
        this.id=kategirijosIndeksas;
        this.suma = suma2;
        System.out.println("Iveskite papildoma informacija.");
        String ivestaInfo = sc.nextLine();
        this.papildomaInfo2 = ivestaInfo;
        this.visosIslaidos += suma2;

        System.out.println(" Iraso ID : " + this.id + "\n Suma " + this.suma +
                "\n Data " + this.formatuotaData + "\n Papildoma informacija : " +
                this.papildomaInfo2);
    }

    public int getSuma() {
        return suma;
    }

    public void setSuma(int suma) {
        this.suma = suma;
    }

    public String getPapildomaInfo() {
        return papildomaInfo2;
    }

    public void setPapildomaInfo(String papildomaInfo2) {
        this.papildomaInfo2 = papildomaInfo2;
    }

    @Override
    public String toString() {
        return " Iraso ID : " + this.id + "\n Suma " + this.suma +
                "\n Data " + this.formatuotaData + "\n Papildoma informacija : " +
                this.papildomaInfo2;
    }
}
