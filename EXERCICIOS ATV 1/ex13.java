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
