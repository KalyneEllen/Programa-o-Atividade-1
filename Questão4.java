import java.util.Scanner;

public class MediaIdades {


    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        int idade;
        int soma = 0;
        for(int i = 0; i <10 ;i ++){
            System.out.println("Informe a idade "+i);
            idade = input.nextInt();
            soma = idade + soma;
        }
        System.out.println("A média das idades é: "+soma/10);
    }
}
