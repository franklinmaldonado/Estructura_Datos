package Lista.LiCircular;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejecutar {
    public static void main(String[] args) throws IOException{
        
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int valor, referencia, posicion, op;
    
    String continuar;

    ListaCircular li = new ListaCircular();
    

    do
    {
        System.out.println("-----Menu-----");
        System.out.println("1.-Obtener el Tamaño");
        System.out.println("2.-Ingresar al final");
        System.out.println("3.-Ingresar al Inicio");
        System.out.println("4.-Lista");
        System.out.println("5.-Remover por posicion");
        System.out.println("6.-Editar por referencia");
        System.out.println("7.-Editar por posicion");
        System.out.println("8.-Remover por Posicion");

        System.out.println("Ingrese la opcion que desea: ");
        op = Integer.parseInt(br.readLine());


        switch(op){
            case 1:
            System.out.println(li.getTamanio()+"Tamaño");

            case 2:
            System.out.println("Ingrese el valor del nodo a insertar: ");
            valor=Integer.parseInt(br.readLine());
            li.agregarAlFinal(valor);
            break;

            case 3:
            System.out.println("Ingrese el valor del nodo a insertar: ");
            valor=Integer.parseInt(br.readLine());
            li.agregarAlInicio(valor);
            break;


            case 4:
            li.listar();;
            break;

            case 5:
            System.out.println("Ingrese la posicon: ");
            valor=Integer.parseInt(br.readLine());
            li.removerPorPosicion(valor);
            break;

            case 6:
            System.out.println("Ingrese la Referencia: ");
            referencia=Integer.parseInt(br.readLine());
            System.out.println("Ingrese el Valor: ");
            valor=Integer.parseInt(br.readLine());
            li.editarPorReferencia(referencia, valor);
            break;

            case 7:
            System.out.println("Ingrese la Posicion: ");
            posicion=Integer.parseInt(br.readLine());
            System.out.println("Ingrese el Valor: ");
            valor=Integer.parseInt(br.readLine());
            li.editarPorPosicion(posicion, valor);
            break;

            case 8:
            System.out.println("Ingrese la Posicion: ");
            posicion=Integer.parseInt(br.readLine());
            
            li.removerPorPosicion(posicion);
            break;


        }
        System.out.println("Desea Continiar S/N");
        continuar=br.readLine().toUpperCase();
    }while(continuar.equals("S"));
    }
}


