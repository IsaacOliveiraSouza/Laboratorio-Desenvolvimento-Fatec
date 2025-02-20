import java.util.Scanner;
public class ex5 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("qual seu salario fixo: ");
        float fixo = sc.nextFloat();
        
        System.out.print("quantos carros vendeu: ");
        float qtdCarros = sc.nextFloat();

        System.out.print("qual total de suas vendas: ");
        float totalVendas = sc.nextFloat();

        System.out.print("quanto ganha por carro: ");
        float ValorPorCarro = sc.nextFloat();

        System.out.println("salario final: "+(fixo + qtdCarros*ValorPorCarro + (totalVendas*0.05)));
    }
}
