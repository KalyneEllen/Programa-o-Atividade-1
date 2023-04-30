import java.util.Scanner;

public class MEnorq1 {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        int num;
        do {
            System.out.println ("Informe um número menor que 1");
            num = input.nextInt();
        }while (num >= 1);
    }
    
}
