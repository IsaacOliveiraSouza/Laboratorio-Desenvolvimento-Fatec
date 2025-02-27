import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite o número de horas trabalhadas no mês: ");
        int horasTrabalhadas = sc.nextInt();

        System.out.print("Digite o salário por hora: ");
        float salarioHora = sc.nextFloat();

        // Definições
        int horasSemanais = 40;
        int semanasNoMes = 4;
        int horasMensais = horasSemanais * semanasNoMes;
        float salarioTotal;

        // Cálculo do salário total
        if (horasTrabalhadas > horasMensais) {
            int horasExtras = horasTrabalhadas - horasMensais;
            float valorHoraExtra = salarioHora * 1.5f;
            salarioTotal = (horasMensais * salarioHora) + (horasExtras * valorHoraExtra);
        } else {
            salarioTotal = horasTrabalhadas * salarioHora;
        }

        // Exibir resultado
        System.out.println("Salário total: R$ " + salarioTotal);
    }
}
