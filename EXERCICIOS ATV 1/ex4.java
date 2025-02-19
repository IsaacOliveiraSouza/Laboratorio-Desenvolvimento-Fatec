import java.util.Scanner;
public class ex4 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do carro: ");
        float valor = sc.nextFloat();

        System.out.println("valor final do carro: "+ (valor+(valor*0.45)+(valor*0.28)));

      

    }
}
