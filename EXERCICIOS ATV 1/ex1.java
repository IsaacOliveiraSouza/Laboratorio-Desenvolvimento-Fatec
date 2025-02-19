import java.util.Scanner;
public class ex1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite quantos anos voce tem: ");
        int anos = sc.nextInt();

        System.out.print("quantos meses: ");
        int meses = sc.nextInt();

        System.out.print("e dias: ");
        int dias = sc.nextInt();

        dias = (anos * 365) + (meses * 30) + dias;

        System.out.print("Voce tem "+dias +" de vida");
    }
}
