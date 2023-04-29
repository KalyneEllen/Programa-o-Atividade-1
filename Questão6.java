import java.util.Scanner;

public class Intervalo10E20 {
    public static void main (String [] args){
    Scanner input = new Scanner (System.in);
    int num, pertence = 0,  Npertence= 0;

    for (int i=0;i<10;i++){
        System.out.println ("Informe o número da posição: "+i);
        num = input.nextInt();
        if(num >= 10 && num <= 20){
            pertence++;
        }else{
            Npertence++;
        }
    }
    System.out.println("A quantidade de números entre 10 e 20 é: "+pertence);
    System.out.println("\nA quantidade de números que não estão entre 10 e 20 é: "+Npertence);
