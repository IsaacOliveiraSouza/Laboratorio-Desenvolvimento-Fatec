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
