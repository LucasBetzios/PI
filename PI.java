/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pi;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/**
 *
 * @author lucas.dcamilo
 */
public class PI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Teste de Aptidão!");
        System.out.println("Por favor, forneça o quanto você gosta de cada área, de 0 a 5.");

        Map<String, Integer> preferencias = new HashMap<>();

        // Adicione mais perguntas conforme necessário
        adicionarPergunta(preferencias, "Matemática");
        adicionarPergunta(preferencias, "Humanas");
        adicionarPergunta(preferencias, "Ciências");

        // Lógica para determinar os cursos com base nas preferências
        String[] cursosSugeridos = determinarCursos(preferencias);

        System.out.println("\nCom base nas suas preferências, sugerimos os seguintes cursos:");
        for (String curso : cursosSugeridos) {
            System.out.println("- " + curso);
        }

        // Pergunta se as sugestões estão corretas
        System.out.print("\nAs sugestões estão corretas? (sim/não): ");
        String resposta = scanner.next().toLowerCase();

        if (resposta.equals("sim")) {
            System.out.println("Ótimo! Espero ter ajudado na sua escolha.");
        } else {
            System.out.println("Vamos tentar novamente. Talvez eu possa te ajudar melhor.");
        }

        scanner.close();
    }

    private static void adicionarPergunta(Map<String, Integer> preferencias, String area) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quanto você gosta de " + area + " (de 0 a 5)? ");
        preferencias.put(area, lerPreferencia(scanner));
    }

    private static int lerPreferencia(Scanner scanner) {
        int preferencia;
        do {
            preferencia = scanner.nextInt();
        } while (preferencia < 0 || preferencia > 5);
        return preferencia;
    }

    // Lógica para determinar cursos com base nas preferências
    private static String[] determinarCursos(Map<String, Integer> preferencias) {
        // Adicione aqui a lógica para sugerir cursos com base nas preferências
        // Por exemplo, use if/else ou switch para determinar os cursos
        // Retorne os cursos como um array de strings
        return new String[]{"Curso A", "Curso B"};
    }    }
    

