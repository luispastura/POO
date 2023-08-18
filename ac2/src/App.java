import java.util.Scanner;

public class App {

        public static void main(String[] args) {
            Scanner leitor = new Scanner(System.in);
            double soma, subtracao, multiplicacao, divisao;
            double num1, num2; 
            int operacao;
            String opcao; 

            while(true){
                System.out.println("Informe o primeiro valor: ");
                num1 = leitor.nextDouble(); 
            
            while(true){
                System.out.println("Informe o segundo valor: ");
                num2 = leitor.nextDouble();
                System.out.println("Escolha uma operação");
                System.out.println("1- Soma");
                System.out.println("2- Subtracao");
                System.out.println("3- Multiplicacao");
                System.out.println("4- Divisao");
                System.out.println("Sair da calculadora");

                operacao = leitor.nextInt();

                       switch (operacao) {
                case 1:
                    soma = num1 + num2;
                    System.out.println("Resultado da soma é: " + soma);
                    break;
                case 2:
                    subtracao = num1 - num2;
                    System.out.println("Resultado da subtração é: " + subtracao);
                    break;
                case 3:
                    multiplicacao = num1 * num2;
                    System.out.println("Resultado da multiplicacao é: " + multiplicacao);
                    break;
                case 4:
                    divisao = num1 / num2;
                    System.out.println("Resultado da divisao é: " + divisao);
                    break;
            }

                System.out.println("Deseja limpar memória?");
                opcao = leitor.next();
                if(opcao.equals("sim")){
                    break;
                }
            }

            System.out.println("Deseja retornar a operação?");
            opcao = leitor.next();
            if(opcao.equals("sim")){
                break;
            }
        }
        }          
}