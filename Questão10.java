import java.util.Scanner;

public class TabuadaN {
    public static void main(String [] args) {
        Scanner input = new Scanner (System.in);
        int numero, contador = 0, final;
        System.out.println("Informe um número: ");
        numero = input.nextInt();
        while(contador < 11){
            result = numero * contador;
            System.out.println(numero+" x "+contador+" = "+final);
            contador++;
        }
    }
}
