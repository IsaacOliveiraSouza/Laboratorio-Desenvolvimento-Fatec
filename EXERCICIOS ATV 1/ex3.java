import java.util.Scanner;
public class ex3 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu salario atual: ");
        float atual = sc.nextFloat();

        System.out.print("Digite o percentual de reajuste: ");
        float reajuste = sc.nextFloat();
        System.out.println("salario apos reajuste: "+ (atual + ((atual*reajuste)/100)));


    }
}
