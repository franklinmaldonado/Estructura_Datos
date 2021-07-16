import java.util.Scanner;

public class numerosmayoresymenores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        double nota, suma = 0, mayor, menor;;
       
        System.out.println("--------------------------------------");

        do {
            System.out.print("Inngrse la cantidad de numeros:  ");
            n = sc.nextInt(); 
        } while (n <= 0); 

        System.out.print("Numero 1 : ");
        nota = sc.nextDouble();
       
        suma = suma + nota; 
       
        mayor = nota; 
        menor = nota;
       
        for (int i = 2; i <= n; i++) {       
            System.out.print("Numero " + i + ": ");
            nota = sc.nextDouble();
            suma = suma + nota; 
            if (nota > mayor){ 
                mayor = nota;
            } else if (nota < menor) {
                menor = nota;
            }
        }

        System.out.printf("Promedio de Numeros Ingresados: %.2f %n" , suma/n);
        System.out.println("Numero Mayor " + mayor);
        System.out.println("Numero Menor " + menor);
    }
   
}
