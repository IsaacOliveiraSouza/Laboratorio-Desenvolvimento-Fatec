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
