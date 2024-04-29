
import java.util.Random;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lucas.dcamilo
 */
public class OPIMALUCO {
    public static void main(String[] args) {
        
        int computacao = 0 , arteVisual= 0, arquitetura= 0, culinaria = 0, arte = 0;
        Scanner scanner = new Scanner(System.in);
        
        //inicio das perguntas
        System.out.println("Você gosta de calcular? 1- sim 2- nao");
        if (scanner.nextInt() == 1) {
            computacao++;
            arquitetura++;
        }
        System.out.println("Voce gosta de arte? 1- sim 2- nao");
        if (scanner.nextInt() == 1) {
            arteVisual++;
            arte++;
            
        }
        System.out.println("Voce gosta de predios? 1- sim 2- nao");
        if (scanner.nextInt() == 1) {
            arquitetura++;
        }
        System.out.println("Você gosta de cozinhar? 1- sim 2- nao");
        if (scanner.nextInt() == 1) {
            culinaria++;
        }
        
        //fim das perguntas
        
        int major = Math.max(culinaria, Math.max(arquitetura, Math.max(arte, arteVisual)));
        System.out.println(major);
       if(major==culinaria){
           System.out.println("faz culinaria!!");    
       }
       if(major==arquitetura){
           System.out.println("faz arquitetura!!");    
       }
       if(major==arte){
           System.out.println("faz arte!!");    
       }
       if(major==computacao){
           System.out.println("faz computacao mlk!!");    
       }
       
    }
}
