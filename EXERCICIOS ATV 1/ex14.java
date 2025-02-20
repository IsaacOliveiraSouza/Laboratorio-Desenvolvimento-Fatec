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
