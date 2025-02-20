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
