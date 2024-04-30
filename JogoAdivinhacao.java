import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        Random rnd  = new Random();

        int secretNumber = rnd.nextInt(10) + 1;
        int tentativas = 3;

        System.out.println("Bem vindo ao Jogo de Adivinhação!");
        System.out.println("Tente adivinhar o número secreto entre 1 e 10.");
        System.out.println("Você tem " + tentativas + " chances.");

        while( tentativas > 0){
            System.out.println("Digite um número: ");
            int palpite = input.nextInt();
            
            if(palpite == secretNumber){
                System.out.println("Parabén, você ganhou o jogo!");
                return;
            }else{
                if(Math.abs(palpite - secretNumber) == 1){
                    System.out.println("TÁ QUENTE!");
                }else if(palpite < secretNumber){
                    System.out.println("O número secreto é maior.");
                }else {
                    System.out.println("O número secreto é menor.");
                }
                tentativas--;
                System.out.println("Você tem " + tentativas + " chances restantes.");
            }
        }
        System.out.println("Game Over! O número secreto era: " + secretNumber);
    }
}
