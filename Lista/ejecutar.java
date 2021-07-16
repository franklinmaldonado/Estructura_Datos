package Lista;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ejecutar {
    public static void main(String[] args) throws Exception {

        lista lista = new lista();

        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; // Guardaremos la opcion del usuario

        while (!salir) {

            System.out.println("1. Ingreso de Datos");
            System.out.println("2. Valor de la posicion");
            System.out.println("3. Inserta y actualizar un nodo");
            System.out.println("4. Salir");

            try {

                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado la opcion 1");
                        
                        lista.agregarAlFinal(12);
                        lista.agregarAlFinal(15);
                        lista.agregarAlFinal(9);
                        lista.agregarAlInicio(41);
                        lista.agregarAlInicio(6);

                        System.out.println("Lista");
                        
                        lista.listar();

                        System.out.println("Tamaño");
                        System.out.println(lista.getTamanio());
                        break;
                    case 2:
                        System.out.println("Has seleccionado la opcion 2");
                        System.out.println(" Tamaño");
                        System.out.println(lista.getTamanio());

                        System.out.println("\n<<-- Obtener el valor del nodo en la posicion 3 -->>");
                        System.out.println(lista.getValor(3));
                        break;
                    case 3:
                        System.out.println("Has seleccionado la opcion 3");
                        System.out.println("Insrta un nodo con valor 16 despues del 15");
                        lista.insertarPorReferencia(15, 16);
                        lista.listar();
                        System.out.print(" | Tamaño: ");
                        System.out.println(lista.getTamanio());

                        System.out.println("\n\nInsrta un nodo con valor 44 en la posición 3");
                        lista.insrtarPorPosicion(3, 44);
                        lista.listar();
                        System.out.print("Tamaño: ");
                        System.out.println(lista.getTamanio());

                        System.out.println("\nActualiza el valor 12 del tercer nodo por 13");
                        lista.editarPorReferencia(12, 13);
                        lista.listar();
                        System.out.print("Tamaño: ");
                        System.out.println(lista.getTamanio());

                        System.out.println("\nActualiza el valor nodo en la posición 0 por 17");
                        lista.editarPorPosicion(0, 17);
                        lista.listar();
                        System.out.print("Tamaño: ");
                        System.out.println(lista.getTamanio());
                        break;
                    case 4:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 4");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }

        }
    }
}
