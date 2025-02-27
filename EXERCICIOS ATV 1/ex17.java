import java.util.Scanner;

public class ex17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada das notas
        System.out.print("Digite a nota da P1: ");
        float P1 = sc.nextFloat();

        System.out.print("Digite a nota da E1: ");
        float E1 = sc.nextFloat();

        System.out.print("Digite a nota da E2: ");
        float E2 = sc.nextFloat();

        System.out.print("Digite a nota da API: ");
        float API = sc.nextFloat();

        System.out.print("Digite a nota da SUB: ");
        float SUB = sc.nextFloat();

        System.out.print("Digite o valor de X (se houver, senão digite 0): ");
        float X = sc.nextFloat();

        // Cálculo da média
        float mediaParcial = (P1 * 0.6f + ((E1 + E2) / 2) * 0.4f);
        float ajusteAPI = Math.max((mediaParcial - 5.9f), 0) / (mediaParcial - 5.9f) * (API * 0.5f);
        float mediaFinal = (mediaParcial * 0.5f) + ajusteAPI + X + (SUB * 0.3f);

        // Exibição do resultado
        System.out.println("Média final de LP1: " + mediaFinal);
    }
}
