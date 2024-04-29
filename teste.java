package pi;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class teste {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Variáveis para armazenar as respostas
        int pontosMatematica = 0;
        int pontosGestao = 0;
        int pontosCriatividade = 0;
        int pontosSaude = 0;

        // Perguntas sobre gostos e habilidades
        System.out.println("Responda as perguntas a seguir com 1 - Sim ou 2 - Nao:");

        System.out.println("Voce gosta de lidar com numeros e resolver problemas matematicos?");
        if (scanner.nextInt() == 1) {
            pontosMatematica++;
        }

        System.out.println("Voce tem interesse em gerenciar equipes e tomar decisoes estrategicas?");
        if (scanner.nextInt() == 1) {
            pontosGestao++;
        }

        System.out.println("Voce tem habilidades criativas e gosta de trabalhar com design?");
        if (scanner.nextInt() == 1) {
            pontosCriatividade++;
        }

        System.out.println("Voce se interessa por temas relacionados a saude e bem-estar?");
        if (scanner.nextInt() == 1) {
            pontosSaude++;
        }

        // Calculando o resultado final
        int maxPontos = Math.max(pontosMatematica, Math.max(pontosGestao, Math.max(pontosCriatividade, pontosSaude)));
        if (maxPontos == pontosMatematica) {
            System.out.println("Sua aptidao sugere uma carreira em Matematica, Engenharia ou Ciencia da Computacao.");
        } else if (maxPontos == pontosGestao) {
            System.out.println("Sua aptidao sugere uma carreira em Administracao, Gestao de Projetos ou Marketing.");
        } else if (maxPontos == pontosCriatividade) {
            System.out.println("Sua aptidao sugere uma carreira em Design Grafico, Artes Visuais ou Publicidade.");
        } else if (maxPontos == pontosSaude) {
            System.out.println("Sua aptidao sugere uma carreira em Medicina, Enfermagem ou Nutricao.");
        } else {
            System.out.println("Sua aptidao nao sugere uma profissao especifica. Explore mais areas de interesse!");
        }
    }
}

    }
