public class ex16 {
    public static void main(String[] args) {
        // Definição dos gastos mensais
        float janeiro = 15000.0f;
        float fevereiro = 23000.0f;
        float março = 17000.0f;

        // Cálculo do gasto total no trimestre e da média mensal
        float gastoTotal = janeiro + fevereiro + março;
        float mediaMensal = gastoTotal / 3;

        // Exibição dos resultados
        System.out.println("Gasto total no trimestre: R$ " + gastoTotal);
        System.out.println("Média mensal de gastos: R$ " + mediaMensal);
    }
}
