import java.util.Scanner;
public class ex6 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma temperatura em celcius: ");
        float celcius = sc.nextFloat();

        System.out.println("Essa temperatura em Fahrenheit: " +(celcius*1.8+32) );
    }
}
