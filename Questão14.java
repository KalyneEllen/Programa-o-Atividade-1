import java.util.Scanner;

public class IgualSoma {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        int num, soma = 0;

        do {
            System.out.println("Informe um número: ");
            num = input.nextInt();
            soma += num; 

        }while(num != 0);
            System.out.println("A soma dos números digitados é: "+soma);
    }
}
