import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos eleitores: ");
        int eleitores = sc.nextInt();

        System.out.print("Votos brancos: ");
        int brancos = sc.nextInt();

        System.out.print("nulos: ");
        int nulos = sc.nextInt();

        System.out.print("nulos: ");
        int validos = sc.nextInt();

        System.out.println("brancos: " +(brancos*100)/eleitores + " nulos: "+ (nulos*100)/eleitores + " validos: "+(validos*100)/eleitores);
    }
}
