package jogo;

import inimigos.*;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        //jogador
        int vida = 100;
        int danoAtaque = 50;
        int numPocoesVida = 3;
        int pocaoVidaValor = 30;
        int chanceDeReceberPocao = 50; //Porcentagem
        int score = 0;

        boolean running = true;

        System.out.println("Bem Vindo à Terra-Média!");

        JOGO:
        while (running) {
            System.out.println("-----------------------------------------------");

            Inimigo inimigo = null;

            List<Class<? extends Inimigo>> lista = Arrays.asList(
                    Gobelin.class,
                    Ogro.class,
                    Orque.class,
                    Troll.class,
                    Warg.class
            );

            try {
                inimigo = lista.get(rand.nextInt(lista.size())).newInstance();
            } catch (Exception e) {
                System.out.println(e);
            }

            System.out.println("\t# " + inimigo.getNome() + " apareceu!!! #\n");

            while (inimigo.getVidaInimigo() > 0) {
                System.out.println("\tSua vida: " + vida);
                System.out.println("\tVida do " + inimigo.getNome() + ": " + inimigo.getVidaInimigo());
                System.out.println("\n\tO que você quer fazer?");
                System.out.println("\t1. Atacar");
                System.out.println("\t2. Tomar poção de Miruvor (+vida)");
                System.out.println("\t3. Fugir");

                String input = scan.nextLine();

                switch (input) {
                    case "1":
                        int danoCausado = rand.nextInt(danoAtaque);
                        int danoSofrido = inimigo.atacar();

                        inimigo.sofrerDano(danoCausado);
                        vida -= danoSofrido;

                        System.out.println("\t> Você atacou o " + inimigo.getNome() + " causando " + danoCausado + " de dano!");
                        System.out.println("\t> Você sofreu " + danoSofrido + " em retaliação.");

                        if (vida < 1) {
                            System.out.println("\t> Você sofreu muito dano, estás muito fraco para seguir!");
                            break;
                        }
                        break;

                    case "2":
                        if (numPocoesVida > 0) {
                            vida += pocaoVidaValor;
                            numPocoesVida--;
                            if (vida > 100) {
                                vida = 100;
                            }
                            System.out.println("\t> Você bebeu uma poção de Miruvor, curando-se por " + pocaoVidaValor + "."
                                    + "\n\t> Agora você têm " + vida + " de Miruvor."
                                    + "\n\t> Você ainda têm " + numPocoesVida + " poções.\n");
                        } else {
                            System.out.println("\t> Você não têm poções de Miruvor! Derrote inimigos para ter a chance de pegar uma!\n");
                        }
                        break;

                    case "3":
                        System.out.println("\tVocê fugiu do " + inimigo.getNome() + "!");
                        continue JOGO;

                    default:
                        System.out.println("\tComando invalido!");
                        break;
                }
            }

            if (vida < 1) {
                System.out.println("\nVocê sai mancando para fora do campo de batalha, muito ferido... ");
                System.out.println("\nFIM DE JOGO!");
                break;
            }

            score++;
            System.out.println("-----------------------------------------------");
            System.out.println(" # " + inimigo.getNome() + " foi derrotado! # ");
            System.out.println(" # Você ainda têm " + vida + " de vida. # ");
            if (rand.nextInt(100) < chanceDeReceberPocao) {
                numPocoesVida++;
                System.out.println(" # O " + inimigo.getNome() + " dropou uma poção de Miruvor! # ");
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
                System.out.println("Inimigos derrotados: " + score);
                break;
            }
        }

        System.out.println("\n#######################");
        System.out.println("# OBRIGADO POR JOGAR! #");
        System.out.println("#######################");
    }

}
