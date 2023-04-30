import java.util.Scanner;

public class Pesquisa{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int idade, maiorIdade = 0, menorIdade = Integer.MAX_VALUE, qtdMulheres = 0;
        char sex;
        double sal, somaSalarios = 0, menorSalario = Double.MAX_VALUE;
        String pessoaMenorSalario = "";
        
        System.out.print("Informe a quantidade de habitantes da região: ");
        int quantidadeHabitantes = input.nextInt();
        
        for (int i = 1; i <= quantidadeHabitantes; i++) {
            System.out.println("\nHabitante " + i + ":");
            
            System.out.print("Idade: ");
            idade = input.nextInt();
            if (idade > maiorIdade) {
                maiorIdade = idade;
            }
            if (idade < menorIdade) {
                menorIdade = idade;
            }
            
            System.out.print("Sexo (M/F): ");
            sex = input.next().charAt(0);
            if (sex == 'F') {
                qtdMulheres++;
            }
            
            System.out.print("Salário: ");
            sal = input.nextDouble();
            somaSalarios += sal;
            if (sal < menorSalario) {
                menorSalario = sal;
                pessoaMenorSalario = idade + ", " + sex;
            }
        }
        
        double mediaSalarios = somaSalarios / quantidadeHabitantes;
        
        System.out.println("\nMédia dos salários: " + mediaSalarios);
        System.out.println("Maior idade: " + maiorIdade);
        System.out.println("Menor idade: " + menorIdade);
        System.out.println("Quantidade de mulheres: " + qtdMulheres);
        System.out.println("Pessoa com menor salário: " + pessoaMenorSalario);
    }
}
