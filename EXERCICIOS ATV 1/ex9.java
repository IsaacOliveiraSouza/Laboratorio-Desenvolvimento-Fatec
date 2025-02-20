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
