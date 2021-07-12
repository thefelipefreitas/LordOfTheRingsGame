import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        //variaveis do jogo
        String[] inimigos = {"Goblin", "Orque", "Warg", "Troll"};
        int maxVidaInimigo = 75;
        int danoAtaqueInimigo = 25;


        //variaveis do jogador
        int vida = 100;
        int danoAtaque = 50;
        int numPocoesVida = 3;
        int pocaoVidaValor = 30;
        int chanceDeReceberPocao = 50; //Porcentagem

        boolean running = true;

        System.out.println("Bem Vindo à Terra-Média!");

        JOGO:
        while (running) {
            System.out.println("-----------------------------------------------");

            int vidaInimigo = rand.nextInt(maxVidaInimigo);
            String inimigo = inimigos[rand.nextInt(inimigos.length)];
            System.out.println("\t# " + inimigo + " apareceu!!! #\n");

            while (vidaInimigo > 0) {
                System.out.println("\tSua vida: " + vida);
                System.out.println("\tVida do " + inimigo + ": " + vidaInimigo);
                System.out.println("\n\tO que você quer fazer?");
                System.out.println("\t1. Atacar");
                System.out.println("\t2. Tomar poção da saúde");
                System.out.println("\t3. Fugir");

                String input = scan.nextLine();

                if (input.equals("1")) {

                    int danoCausado = rand.nextInt(danoAtaque);
                    int danoSofrido = rand.nextInt(danoAtaqueInimigo);

                    vidaInimigo -= danoCausado;
                    vida -= danoSofrido;

                    System.out.println("\t> Você atacou o " + inimigo + " causando " + danoCausado + " de dano!");
                    System.out.println("\t> Você sofreu " + danoSofrido + " em retaliação.");

                    if (vida < 1) {
                        System.out.println("\t> Você sofreu muito dano, estás muito fraco para seguir!");
                        break;
                    }
                } else if (input.equals("2")) {

                    if (numPocoesVida > 0) {
                        vida += pocaoVidaValor;
                        numPocoesVida--;
                        System.out.println("\t> Você bebeu uma poção de vida, curando-se por " + pocaoVidaValor + "."
                                + "\n\t> Agora você têm " + vida + " de vida."
                                + "\n\t> Você ainda têm " + numPocoesVida + " poções.\n");
                    } else {
                        System.out.println("\t> Você não têm poções de vida! Derrote inimigos para ter a chance de pegar uma!\n");
                    }

                } else if (input.equals("3")) {
                    System.out.println("\tVocê fugiu do " + inimigo + "!");
                    continue JOGO;
                } else {
                    System.out.println("\tComando invalido!");
                }

            }

            if (vida < 1) {
                System.out.println("\nVocê MORREU!!! ( X _ X ) ");
                break;
            }

            System.out.println("-----------------------------------------------");
            System.out.println(" # " + inimigo + " foi derrotado! # ");
            System.out.println(" # Você ainda têm " + vida + " de vida. # ");
            if (rand.nextInt(100) < chanceDeReceberPocao) {
                numPocoesVida++;
                System.out.println(" # O " + inimigo + " dropou uma poção! # ");
                System.out.println(" # Agora você têm  " + numPocoesVida + " poção(ões). # ");
            }
            System.out.println("-----------------------------------------------");
            System.out.println("O que você deseja fazer agora?");
            System.out.println("1. Continuar lutando");
            System.out.println("2. Sair do campo de batalha");

            String input = scan.nextLine();

            while (!input.equals("1") && !input.equals("2")) {
                System.out.println("Comando inválido!");
                input = scan.nextLine();
            }

            if (input.equals("1")) {
                System.out.println("Você decidiu continuar na aventura!");
            } else if (input.equals("2")) {
                System.out.println("Você saiu da Terra-Média, bem-sucedido nas suas aventuras!");
                break;
            }
        }

        System.out.println("\n#######################");
        System.out.println("# OBRIGADO POR JOGAR! #");
        System.out.println("#######################");
    }

}
