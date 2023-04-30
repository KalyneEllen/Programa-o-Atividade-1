import java.util.Scanner;

public class Entre12E20 {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        int num;
        System.out.println("Informe um número entre 12 e 20");
        num = input.nextInt();
        if(num > 12 && num < 20){
            System.out.println("o número digitado foi: "+num);
        }else{
            while(num <= 12 && num >= 20){
                System.out.println("Entrada inválida.");
            }
        }
    }
}
