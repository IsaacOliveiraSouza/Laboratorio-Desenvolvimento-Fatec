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
