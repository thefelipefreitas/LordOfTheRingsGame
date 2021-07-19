package jogo;

import herois.*;
import inimigos.*;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        boolean running = true;

        System.out.println("Bem Vindo à Terra-Média!");
        System.out.println("-----------------------------------------------");

        Heroi heroi = null;
        List<Class<? extends Heroi>> listaHerois = Arrays.asList(
                Aragorn.class,
                Gandalf.class,
                Gimli.class,
                Legolas.class
        );

        System.out.println("Qual herói vc esoclhe?\n");
        System.out.println("\t1. Aragorn");
        System.out.println("\t2. Gandalf");
        System.out.println("\t3. Gimli");
        System.out.println("\t4. Legolas");

        String escolhaDeHeroi = scan.nextLine();

        int convert = Integer.parseInt(escolhaDeHeroi);

        try {
            heroi = listaHerois.get(convert - 1).newInstance();
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Voce escolheu o " + heroi.getNome());

        JOGO:
        while (running) {

            Inimigo inimigo = null;
            List<Class<? extends Inimigo>> listaInimigos = Arrays.asList(
                    Gobelin.class,
                    Ogro.class,
                    Orque.class,
                    Troll.class,
                    Warg.class
            );

            try {
                inimigo = listaInimigos.get(rand.nextInt(listaInimigos.size())).newInstance();
            } catch (Exception e) {
                System.out.println(e);
            }

            System.out.println("\t# " + inimigo.getNome() + " apareceu!!! #\n");

            while (inimigo.getVidaInimigo() > 0) {
                System.out.println("\tSua vida: " + heroi.getVida());
                System.out.println("\tVida do " + inimigo.getNome() + ": " + inimigo.getVidaInimigo());
                System.out.println("\n\tO que você quer fazer?");
                System.out.println("\t1. Atacar");
                System.out.println("\t2. Tomar poção de Miruvor (+vida)");
                System.out.println("\t3. Fugir");

                String input = scan.nextLine();

                switch (input) {
                    case "1":
                        int danoCausado = heroi.atacar();
                        int danoSofrido = inimigo.atacar();

                        inimigo.sofrerDano(danoCausado);
                        heroi.sofrerDano(danoSofrido);

                        System.out.println("\t> Você atacou o " + inimigo.getNome() + " causando " + danoCausado + " de dano!");
                        System.out.println("\t> Você sofreu " + danoSofrido + " em retaliação.");

                        if (heroi.getVida() < 1) {
                            System.out.println("\t> Você sofreu muito dano, estás muito fraco para seguir!");
                            break;
                        }
                        break;

                    case "2":
                        if (heroi.getNumPocoesVida() > 0) {
                            heroi.tomarPocao();
                            if (heroi.getVida() > 100) {
                                heroi.setVida(100);
                            }
                            System.out.println("\t> Você bebeu uma poção de Miruvor, curando-se por " + heroi.getPocaoVidaValor() + "."
                                    + "\n\t> Agora você têm " + heroi.getVida() + " de vida."
                                    + "\n\t> Você ainda têm " + heroi.getNumPocoesVida() + " poções.\n");
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

            if (heroi.getVida() < 1) {
                System.out.println("\nVocê sai mancando para fora do campo de batalha, muito ferido... ");
                System.out.println("\nFIM DE JOGO!");
                break;
            }

            //score++;
            System.out.println("-----------------------------------------------");
            System.out.println(" # " + inimigo.getNome() + " foi derrotado! # ");
            System.out.println(" # Você ainda têm " + heroi.getVida() + " de vida. # ");
            if (rand.nextInt(100) < heroi.getChanceDeReceberPocao()) {
                //numPocoesVida++;
                System.out.println(" # O " + inimigo.getNome() + " dropou uma poção de Miruvor! # ");
                System.out.println(" # Agora você têm  " + heroi.getNumPocoesVida() + " poção(ões). # ");
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
                System.out.println("Inimigos derrotados: " + heroi.getScore());
                break;
            }
        }

        System.out.println("\n#######################");
        System.out.println("# OBRIGADO POR JOGAR! #");
        System.out.println("#######################");
    }

}
