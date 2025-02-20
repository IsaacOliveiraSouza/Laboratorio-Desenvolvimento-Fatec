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
