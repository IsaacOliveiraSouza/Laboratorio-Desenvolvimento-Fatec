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
