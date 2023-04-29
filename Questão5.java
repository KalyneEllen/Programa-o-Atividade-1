import java.util.Scanner;

public class ParÍmpar {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        int num, qtdimp = 0, qtdpar = 0;
        for (int i = 0; i< 10; i++){
            System.out.println ("Informe o número da posição "+i);
            num = input.nextInt();
            if(num % 2 == 1){
                qtdimp++;
                }else{
                qtpar++;
            }
        }
        System.out.println ("A quantidade de números ímpares é: "+qtdi);
        System.out.println ("\nA quantidade de números pares é: "+qtdpar);
    }
}
