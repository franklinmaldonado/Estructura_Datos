package Pila;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejecutar {
    public static void main(String[] args) throws Exception{
        
    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int valor, referencia, posicion, op;
        
        String continuar;
    
        Pila li = new Pila();
        
    
        do
        {
            System.out.println("-----Menu-----");
            System.out.println("1.-Apilar lista");
            System.out.println("2.-Eliminar Valor final");
            System.out.println("3.-Concultar el Valor Inicial");
            System.out.println("4.-");
            System.out.println("5.-");
            System.out.println("6.-");
            System.out.println("7.-");
            System.out.println("8.-");
    
            System.out.println("Ingrese la opcion que desea: ");
            op = Integer.parseInt(br.readLine());
    
    
            switch(op){
                case 1:
                System.out.println(li.getTamanio()+"Tamaño");

                case 2:
                System.out.println("Eliminando valor final........ ");
                li.retirar();
                break;
    
                case 3:
                System.out.println("El valor Inicial es: ");
                li.cima();
                break;
    
    
                case 4:
                System.out.println("Ingrese la referencia: ");
                referencia=Integer.parseInt(br.readLine());
                li.buscar(referencia);
                break;
    
                case 5:
                System.out.println("Ingrese la posicon: ");
                valor=Integer.parseInt(br.readLine());
                li.cima();
                break;
    
                case 6:
                System.out.println("Ingrese la Referencia: ");
                referencia=Integer.parseInt(br.readLine());
                li.buscar(referencia);
                break;
    
                case 7:
                System.out.println("Ingrese la Posicion: ");
                posicion=Integer.parseInt(br.readLine());
                System.out.println("Ingrese el Valor: ");
                valor=Integer.parseInt(br.readLine());
                li.remover(referencia);
                break;
    
                case 8:
                System.out.println("Ingrese la Posicion: ");
                posicion=Integer.parseInt(br.readLine());
                
                li.editar(referencia, valor);
                break;

                case 9:
                System.out.println("Ingrese la Posicion: ");
                posicion=Integer.parseInt(br.readLine());
                
                li.eliminar();
                break;

                case 10:
                System.out.println("Ingrese la Posicion: ");
                posicion=Integer.parseInt(br.readLine());
                
                li.listar();
                break;
    
    
            }
            System.out.println("Desea Continiar S/N");
            continuar=br.readLine().toUpperCase();
        }while(continuar.equals("S"));
        }
}
