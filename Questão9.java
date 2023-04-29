import java.util.Scanner;
public class Média3 {
    public static void main(String [] args) {
        float nota, soma = 0;
        int qtd = 0;

        Scanner input = new Scanner (System.in);
        while(qtd < 3){
            System.out.println ("Informe a nota: "+qtd);
            nota = input.nextFloat();
            soma = nota + soma;
            qtd++;
        }
        System.out.println ("A média das três notas é: " +soma/3);
    }
}
