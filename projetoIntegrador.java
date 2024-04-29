/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Random;


/**
 *
 * @author lucas.dcamilo
 */
public class projetoIntegrador {
    public static void main(String[] args) {
             boolean y = true;
            boolean n = false;
            System.out.println("Primeiramente vamos definir alguns parametros. 1- Sim e 2- Nao");
            HashMap c1 = new HashMap();c1.put("name","Computacao");c1.put("exatas",y);c1.put("humanas",n);c1.put("calculo", y);c1.put("computador",y);c1.put("arte",n);c1.put("moda",n);
            HashMap c2 = new HashMap();c2.put("name","Administracao");c2.put("exatas",y);c2.put("humanas",n);c2.put("calculo",y);c2.put("computador",n);c2.put("arte",n);c2.put("moda",n);
            HashMap c3 = new HashMap();c3.put("name","Design grafico");c3.put("exatas",n);c3.put("humanas",y);c3.put("calculo",n);c3.put("computador",y);c3.put("arte",y);c3.put("moda",n);
            HashMap c4 = new HashMap();c4.put("name","Arte");c4.put("exatas",n);c4.put("humanas",y);c4.put("calculo",n);c4.put("computador",n);c4.put("arte",y);c4.put("moda",n);
            HashMap c5 = new HashMap();c5.put("name","Moda");c5.put("exatas",n);c5.put("humanas",y);c5.put("calculo",n);c5.put("computador",n);c5.put("arte",y);c5.put("moda",y);
            HashMap c6 = new HashMap();c6.put("name","Humanas");c6.put("exatas",n);c6.put("humanas",y);c6.put("calculo",n);c6.put("computador",n);c6.put("arte",n);c6.put("moda",n);
            ArrayList database = new ArrayList();
            database.add(c1);database.add(c2);database.add(c3);database.add(c4);database.add(c5);database.add(c6);

            Scanner sc = new Scanner(System.in);
            int[] meuArray;
            meuArray = new int[6];
            
           Random pergunta = new Random();
            for (int i = 0; i < 6; ) {
            try{
            System.out.println(meuArray[pergunta.nextInt()]);
            
            }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("parceiro deu bom");
            i++;
            }
        }
            
            
            System.out.println("Voce gosta de matematica?");
            take_input(sc.nextInt(), "exatas", database);

            System.out.println("Voce se familiariza com materias de humanas?");
            take_input(sc.nextInt(),"humanas",database);

            System.out.println("Voce se familiariza com calculos?");
            take_input(sc.nextInt(),"calculo",database);

            System.out.println("Voce gosta de computadores?");
            take_input(sc.nextInt(),"computador",database);

            System.out.println("Voce gosta de arte?");
            take_input(sc.nextInt(),"arte",database);

            System.out.println("Voce gosta de moda?");
            take_input(sc.nextInt(),"moda",database);
        }

        public static void take_input(int answer, String property, ArrayList database){
            boolean ans;
            if ( answer == 1){
                ans = true;
            }
            else{
                ans = false;
            }
            ArrayList to_remove = new ArrayList();
            for (Object d: database){
                HashMap character = (HashMap) d;
                boolean prop = (boolean)character.get(property);
                if (prop != ans){
                        to_remove.add(character);
                }

            }
            for (Object ch: to_remove){
                database.remove(ch);
            }
            if (database.size() == 1){

                HashMap character = (HashMap)database.get(0);
                String name = (String)character.get("name");
                System.out.println("Eu te recomendo o curso: "+name);
                System.exit(0);
            }
    }
}
