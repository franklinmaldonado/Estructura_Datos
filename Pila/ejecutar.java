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
            System.out.println("3.-Consultar el Valor Inicial");
            System.out.println("4.-Agrega un nuevo nodo a la pila");
            System.out.println("5.-Buscar elemento en la pila");
            System.out.println("6.-Elimina un nodo de la pila ubicado por su valor");
            System.out.println("7.-Actualiza el valor de un nodo en la pila");
            System.out.println("8.-Elimina la pila");
            System.out.println("9.-Despliega en pantalla los elementos de la pìla");
            System.out.println("10.-Ingrese Datos");


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
                System.out.println("Ingrese la nuevo valor: ");
                valor=Integer.parseInt(br.readLine());
                li.apilar(valor);
                break;
    
                case 5:
                System.out.println("Ingrese Referencia: ");
                referencia=Integer.parseInt(br.readLine());
                li.buscar(referencia);
                break;
    
                case 6:
                System.out.println("Ingrese el dato a eliminar: ");
                referencia=Integer.parseInt(br.readLine());
                li.remover(referencia);
                break;
    
                case 7:
                System.out.println("Ingrese la Posicion: ");
                referencia=Integer.parseInt(br.readLine());
                System.out.println("Ingrese el Valor: ");
                valor=Integer.parseInt(br.readLine());
                li.editar(referencia, valor);
                break;
    
                case 8:
                li.eliminar();
                break;

                case 9:
                li.listar();
                break;

                case 10:
                li.Pila();
                break;

                
    
    
            }
            System.out.println("Desea Continiar Con La Ejecucion S/N");
            continuar=br.readLine().toUpperCase();
        }while(continuar.equals("S"));
        }
}
