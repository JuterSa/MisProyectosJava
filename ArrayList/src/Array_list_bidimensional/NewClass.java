/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array_list_bidimensional;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author pc
 */
public class NewClass {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        final int numAlumnos = 3;  //número de alumnos
        int i, j, nota, cont = 1;
       
        //crear un ArrayList bidimensional de enteros vacío
        //Realmente se crea un ArrayList de ArrayLists de enteros
        ArrayList<ArrayList<Integer>> array = new ArrayList();                                        
       
        //Se leen las notas de cada alumno.
        System.out.println("Introduzca notas. < 0 para acabar");
        for(i=0;i < numAlumnos;i++){
            cont = 1;
            System.out.println("Alumno " + (i+1) + ": ");
            System.out.print("Nota " + cont + ": ");
            nota = sc.nextInt();

           //para cada alumno se añade una nueva fila vacía
           //esto es necesario porque el arrayList se crea vacío
            array.add(new ArrayList<Integer>());

            while(nota >= 0){
                array.get(i).add(nota); //en la fila i se añade un nueva nota
                cont++;
                System.out.print("Nota " + cont + ": ");
                nota = sc.nextInt();             
            }           
        }
       
        //Mostrar todas las notas
        System.out.println("Notas de alumnos");
        for(i=0;i < array.size();i++){                       //para cada alumno (para cada fila)
            System.out.print("Alumno " + i + ": ");
            for(j=0;j < array.get(i).size();j++){            //se recorre todas la columnas de la fila            
                System.out.print(array.get(i).get(j) + " "); //se obtiene el elemento i,j
            }
            System.out.println();          
        }
    }
    
}
