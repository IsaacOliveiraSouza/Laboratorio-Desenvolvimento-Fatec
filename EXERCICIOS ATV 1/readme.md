###Ex1:
```java
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
        
        sc.close(); // Boa prática fechar o Scanner
    }
}
```

### **Teste de Mesa**

| Entrada (anos) | Entrada (meses) | Entrada (dias) | Cálculo `(anos * 365) + (meses * 30) + dias` | Saída |
|--------------|---------------|-------------|--------------------------------------------|---------------------|
| 20          | 6             | 15          | (20 * 365) + (6 * 30) + 15 = 7475         | "Voce tem 7475 de vida" |
| 30          | 0             | 0           | (30 * 365) + (0 * 30) + 0 = 10950         | "Voce tem 10950 de vida" |
| 10          | 3             | 5           | (10 * 365) + (3 * 30) + 5 = 3765          | "Voce tem 3765 de vida" |
| 25          | 10            | 20          | (25 * 365) + (10 * 30) + 20 = 9435        | "Voce tem 9435 de vida" |

### **Observações**
- O código assume que um ano tem **365 dias** e um mês tem **30 dias**. Isso pode gerar pequenas imprecisões, pois alguns meses têm 31 dias e há anos bissextos.
- O Scanner não está sendo fechado (`sc.close()`), o que pode gerar um **warning**. Não é obrigatório, mas é uma boa prática adicionar `sc.close();` ao final.

###Ex2:
```java
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
```
### **Teste de Mesa**

| Entrada (eleitores) | Entrada (brancos) | Entrada (nulos) | Entrada (válidos) | Cálculo | Saída |
|----------------|----------------|--------------|----------------|----------------------------------|--------------------------------|
| 1000          | 200            | 150          | 650            | brancos: (200*100)/1000 = 20% <br> nulos: (150*100)/1000 = 15% <br> válidos: (650*100)/1000 = 65% | "Brancos: 20% Nulos: 15% Válidos: 65%" |
| 500           | 100            | 50           | 350            | brancos: (100*100)/500 = 20% <br> nulos: (50*100)/500 = 10% <br> válidos: (350*100)/500 = 70% | "Brancos: 20% Nulos: 10% Válidos: 70%" |
| 0             | 0              | 0            | 0              | - | "Número de eleitores não pode ser zero." |
| 800           | 300            | 100          | 400            | - | "Erro: a soma dos votos não corresponde ao total de eleitores." |

###Ex3:
```java
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
```
### **Teste de Mesa**

| Entrada (salário atual) | Entrada (percentual de reajuste) | Cálculo `(atual + (atual * reajuste / 100))` | Saída |
|------------------|-------------------------|--------------------------------|----------------------------|
| 1000.00         | 10                      | 1000 + (1000 * 10 / 100) = 1100.00 | "salario apos reajuste: 1100.0" |
| 2500.50         | 5                        | 2500.50 + (2500.50 * 5 / 100) = 2625.53 | "salario apos reajuste: 2625.525" |
| 5000.75         | 15                       | 5000.75 + (5000.75 * 15 / 100) = 5750.86 | "salario apos reajuste: 5750.8625" |
| 1800.00         | 0                        | 1800.00 + (1800.00 * 0 / 100) = 1800.00 | "salario apos reajuste: 1800.0" |

###Ex4:
```java
public class ex4 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do carro: ");
        float valor = sc.nextFloat();

        System.out.println("valor final do carro: "+ (valor+(valor*0.45)+(valor*0.28)));

      

    }
}
```

### **Teste de Mesa**

| Entrada (valor do carro) | Cálculo `(valor + (valor * 0.45) + (valor * 0.28))` | Saída |
|------------------|---------------------------------------------|----------------------------|
| 10000.00        | 10000 + (10000 * 0.45) + (10000 * 0.28) = 17300.00 | "valor final do carro: 17300.0" |
| 25000.50        | 25000.50 + (25000.50 * 0.45) + (25000.50 * 0.28) = 43250.87 | "valor final do carro: 43250.865" |
| 5000.75         | 5000.75 + (5000.75 * 0.45) + (5000.75 * 0.28) = 8651.29 | "valor final do carro: 8651.2875" |
| 180000.00       | 180000 + (180000 * 0.45) + (180000 * 0.28) = 311400.00 | "valor final do carro: 311400.0" |

###Ex5:
```java
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
```
### **Teste de Mesa**

| Entrada (salário fixo) | Entrada (quantidade de carros vendidos) | Entrada (total de vendas) | Entrada (valor por carro) | Cálculo `(fixo + (qtdCarros * ValorPorCarro) + (totalVendas * 0.05))` | Saída |
|------------------|-------------------------------|------------------|-----------------|-------------------------------------------------|----------------------------|
| 1200.00         | 5                             | 30000.00        | 250.00          | 1200 + (5 * 250) + (30000 * 0.05) = 3200.00    | "salario final: 3200.0" |
| 1500.50         | 3                             | 20000.00        | 300.00          | 1500.50 + (3 * 300) + (20000 * 0.05) = 2900.50 | "salario final: 2900.5" |
| 2500.75         | 10                            | 50000.00        | 400.00          | 2500.75 + (10 * 400) + (50000 * 0.05) = 7000.75 | "salario final: 7000.75" |
| 1800.00         | 0                             | 10000.00        | 200.00          | 1800 + (0 * 200) + (10000 * 0.05) = 2300.00    | "salario final: 2300.0" |

###Ex6:
```java
import java.util.Scanner;
public class ex6 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma temperatura em celcius: ");
        float celcius = sc.nextFloat();

        System.out.println("Essa temperatura em Fahrenheit: " +(celcius*1.8+32) );
    }
}
```
### **Teste de Mesa**

| Entrada (Celsius) | Cálculo `(Celsius * 1.8 + 32)` | Saída |
|------------------|--------------------------|----------------------------|
| 0.0             | (0.0 * 1.8) + 32 = 32.0   | "Essa temperatura em Fahrenheit: 32.0" |
| 25.0            | (25.0 * 1.8) + 32 = 77.0  | "Essa temperatura em Fahrenheit: 77.0" |
| 100.0           | (100.0 * 1.8) + 32 = 212.0 | "Essa temperatura em Fahrenheit: 212.0" |
| -10.0           | (-10.0 * 1.8) + 32 = 14.0 | "Essa temperatura em Fahrenheit: 14.0" |
| 37.0            | (37.0 * 1.8) + 32 = 98.6  | "Essa temperatura em Fahrenheit: 98.6" |

###Ex7:
```java
import java.util.Scanner;
public class ex7 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numero = sc.nextInt();
        
        if(numero>10){
            System.out.println("É MAIOR QUE 10!");
        }else{
            System.out.println("NÃO É MAIOR QUE 10!");
        }
    }
}
```
### **Teste de Mesa**

| Entrada (Número) | Condição `numero > 10` | Saída |
|------------------|----------------------|----------------------------|
| 15              | Verdadeiro            | "É MAIOR QUE 10!" |
| 10              | Falso                 | "NÃO É MAIOR QUE 10!" |
| 7               | Falso                 | "NÃO É MAIOR QUE 10!" |
| 25              | Verdadeiro            | "É MAIOR QUE 10!" |
| -3              | Falso                 | "NÃO É MAIOR QUE 10!" |

###Ex8:
```java
import java.util.Scanner;
public class ex8 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numero = sc.nextInt();
        
        if(numero>=0){
            System.out.println("Positivo");
        }else{
            System.out.println("Negativo");
        }
    }
}
```
### **Teste de Mesa**

| Entrada (Número) | Condição `numero >= 0` | Saída      |
|------------------|----------------------|------------|
| 10              | Verdadeiro            | "Positivo" |
| 0               | Verdadeiro            | "Positivo" |
| -5              | Falso                 | "Negativo" |
| 25              | Verdadeiro            | "Positivo" |
| -12             | Falso                 | "Negativo" |

###Ex9:
```java
import java.util.Scanner;
public class ex9 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o numero de maças compradas: ");
        int numero = sc.nextInt();
        
        if(numero<12){
            System.out.println("preço: " + (numero*1.30));
        }else{
            System.out.println("preço: " + numero);
        }
    }
}
```

### **Teste de Mesa**

| Entrada (Número de maçãs) | Condição `numero < 12` | Cálculo | Saída      |
|--------------------------|----------------------|------------------|------------|
| 10                       | Verdadeiro          | 10 * 1.30 = 13.00 | "preço: 13.0" |
| 5                        | Verdadeiro          | 5 * 1.30 = 6.50   | "preço: 6.5" |
| 12                       | Falso               | 12 (preço unitário de 1 real) | "preço: 12" |
| 20                       | Falso               | 20 (preço unitário de 1 real) | "preço: 20" |
| 8                        | Verdadeiro          | 8 * 1.30 = 10.40  | "preço: 10.4" |


###Ex10:
```java
import java.util.Scanner;
public class ex10 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a nota da a1: ");
        Float nota1 = sc.nextFloat();

        System.out.print("Digite a nota da a2: ");
        Float nota2 = sc.nextFloat();
        
        if(((nota1+nota2)/2)>=6){
            System.out.println("Passou com media: "+(nota1+nota2)/2);
        }else{
            System.out.println("Reprovou com media: "+ (nota1+nota2)/2);
        }
    }
}
```
### **Teste de Mesa**

| Entrada (Nota A1) | Entrada (Nota A2) | Cálculo `((nota1 + nota2) / 2)` | Condição `média >= 6` | Saída |
|------------------|------------------|------------------------------|--------------------|----------------------------|
| 7.0             | 8.0              | (7.0 + 8.0) / 2 = 7.5        | Verdadeiro        | "Passou com media: 7.5" |
| 5.0             | 6.0              | (5.0 + 6.0) / 2 = 5.5        | Falso             | "Reprovou com media: 5.5" |
| 10.0            | 4.0              | (10.0 + 4.0) / 2 = 7.0       | Verdadeiro        | "Passou com media: 7.0" |
| 3.0             | 5.0              | (3.0 + 5.0) / 2 = 4.0        | Falso             | "Reprovou com media: 4.0" |
| 6.0             | 6.0              | (6.0 + 6.0) / 2 = 6.0        | Verdadeiro        | "Passou com media: 6.0" |

####Ex11:
```java
import java.util.Scanner;
public class ex11 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o ano atual: ");
        int atual = sc.nextInt();

        System.out.print("Digite o ano de seu nascimento: ");
        int nascimento = sc.nextInt();
        
        if(atual-nascimento>=16){
            System.out.println("Pode votar");
        }else{
            System.out.println("Não pode votar");
        }
    }
}
```
### **Teste de Mesa**

| Entrada (Ano Atual) | Entrada (Ano de Nascimento) | Cálculo `atual - nascimento` | Condição `>= 16` | Saída             |
|--------------------|--------------------------|------------------------------|------------------|-------------------|
| 2025             | 2005                      | 2025 - 2005 = 20            | Verdadeiro      | "Pode votar"     |
| 2024             | 2010                      | 2024 - 2010 = 14            | Falso           | "Não pode votar" |
| 2023             | 2008                      | 2023 - 2008 = 15            | Falso           | "Não pode votar" |
| 2022             | 2006                      | 2022 - 2006 = 16            | Verdadeiro      | "Pode votar"     |
| 2030             | 2015                      | 2030 - 2015 = 15            | Falso           | "Não pode votar" |

###Ex12:
```java
import java.util.Scanner;
public class ex12 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        Float num1 = sc.nextFloat();

        System.out.print("Digite outro numero: ");
        Float num2 = sc.nextFloat();
        
        if(num1>num2){
            System.out.println("O primeiro é maior");
        }else{
            System.out.println("O segundo é maior é maior");
        }
    }
}
```
### **Teste de Mesa**

| Entrada (Número 1) | Entrada (Número 2) | Condição `num1 > num2` | Saída                    |
|------------------|------------------|----------------------|--------------------------|
| 10.5            | 8.2              | Verdadeiro          | "O primeiro é maior"    |
| 7.0             | 15.3             | Falso               | "O segundo é maior é maior" |
| 12.0            | 12.0             | Falso               | "O segundo é maior é maior" |
| 25.6            | 10.1             | Verdadeiro          | "O primeiro é maior"    |
| -5.0            | -10.0            | Verdadeiro          | "O primeiro é maior"    |

###Ex13:
```java
import java.util.Scanner;
public class ex13 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        Float num1 = sc.nextFloat();

        System.out.print("Digite outro numero: ");
        Float num2 = sc.nextFloat();
        
        if(num1>num2){
            System.out.println(num2+", "+num1);
        }else{
            System.out.println(num1+", "+num2);
        }
    }
}
```
### **Teste de Mesa**

| Entrada (Número 1) | Entrada (Número 2) | Condição `num1 > num2` | Saída Ordenada |
|------------------|------------------|----------------------|----------------|
| 10.5            | 8.2              | Verdadeiro          | "8.2, 10.5"    |
| 7.0             | 15.3             | Falso               | "7.0, 15.3"    |
| 12.0            | 12.0             | Falso               | "12.0, 12.0"   |
| 25.6            | 10.1             | Verdadeiro          | "10.1, 25.6"   |
| -5.0            | -10.0            | Verdadeiro          | "-10.0, -5.0"  |

###Ex14:
```java
import java.util.Scanner;
public class ex14 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("hora de inicio: ");
        int inicio = sc.nextInt();

        System.out.print("hora de termino: ");
        int fim = sc.nextInt();
        
        if(fim<inicio){
            System.out.println(24-(inicio-fim));
        }else{
            System.out.println((fim-inicio));
        }
    }
}
```
### **Teste de Mesa**

| Entrada (Hora de Início) | Entrada (Hora de Término) | Condição `fim < inicio` | Cálculo                         | Saída (Duração do Jogo) |
|------------------------|----------------------|----------------------|--------------------------------|-------------------------|
| 10                     | 15                   | Falso                | `15 - 10 = 5`                 | 5 horas                 |
| 22                     | 4                    | Verdadeiro           | `24 - (22 - 4) = 6`           | 6 horas                 |
| 18                     | 18                   | Falso                | `18 - 18 = 0`                 | 0 horas (mesmo horário)  |
| 23                     | 1                    | Verdadeiro           | `24 - (23 - 1) = 2`           | 2 horas                 |
| 6                      | 12                   | Falso                | `12 - 6 = 6`                  | 6 horas                 |

###Ex15:
```java
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

        sc.close();
    }
}
```
| Entrada (Horas Trabalhadas) | Entrada (Salário por Hora) | Horas Extras | Cálculo do Salário | Saída (Salário Total) |
|----------------------------|-------------------------|-------------|--------------------|---------------------|
| 160                        | 20.0                    | 0           | `160 * 20.0`       | R$ 3200.00         |
| 170                        | 15.0                    | 10          | `(160 * 15.0) + (10 * (15.0 * 1.5))` | R$ 2475.00 |
| 180                        | 25.0                    | 20          | `(160 * 25.0) + (20 * (25.0 * 1.5))` | R$ 4750.00 |
| 140                        | 18.0                    | 0           | `140 * 18.0`       | R$ 2520.00         |
| 200                        | 30.0                    | 40          | `(160 * 30.0) + (40 * (30.0 * 1.5))` | R$ 6900.00 |

###Ex16:
```java
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

```
| Entrada (Gastos Janeiro) | Entrada (Gastos Fevereiro) | Entrada (Gastos Março) | Cálculo do Gasto Total | Cálculo da Média Mensal | Saída |
|-------------------------|-------------------------|----------------------|----------------------|----------------------|-------------------------------|
| 15000.0                | 23000.0                | 17000.0             | `15000 + 23000 + 17000 = 55000` | `55000 / 3 = 18333.33` | "Gasto total no trimestre: R$ 55000.0" <br> "Média mensal de gastos: R$ 18333.33" |

###Ex17:
```java
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

        sc.close();
    }
}

```

| Entrada (P1) | Entrada (E1) | Entrada (E2) | Entrada (API) | Entrada (SUB) | Entrada (X) | Cálculo da Média Parcial | Cálculo Ajuste API | Cálculo Média Final | Saída |
|-------------|-------------|-------------|-------------|-------------|-------------|------------------------|----------------|----------------|---------------------|
| 7.0         | 6.0         | 8.0         | 5.0         | 6.5         | 1.0         | `(7.0 * 0.6) + ((6.0 + 8.0) / 2 * 0.4) = 6.8` | `max((6.8 - 5.9), 0) / (6.8 - 5.9) * (5.0 * 0.5) = 2.5` | `(6.8 * 0.5) + 2.5 + 1.0 + (6.5 * 0.3) = 8.65` | "Média final de LP1: 8.65" |
| 5.0         | 4.5         | 6.0         | 7.0         | 5.0         | 0.5         | `(5.0 * 0.6) + ((4.5 + 6.0) / 2 * 0.4) = 5.1` | `max((5.1 - 5.9), 0) / (5.1 - 5.9) * (7.0 * 0.5) = 0` | `(5.1 * 0.5) + 0 + 0.5 + (5.0 * 0.3) = 4.05` | "Média final de LP1: 4.05" |
| 8.0         | 9.0         | 7.5         | 8.0         | 7.0         | 2.0         | `(8.0 * 0.6) + ((9.0 + 7.5) / 2 * 0.4) = 8.0` | `max((8.0 - 5.9), 0) / (8.0 - 5.9) * (8.0 * 0.5) = 4.0` | `(8.0 * 0.5) + 4.0 + 2.0 + (7.0 * 0.3) = 11.1` | "Média final de LP1: 11.1" |
