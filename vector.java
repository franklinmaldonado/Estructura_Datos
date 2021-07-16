import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class vector {
    public static void main(String[]args)throws IOException{

        int i,n;
        BufferedReader br;
        br=new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Cuantos numeros va a ingresar :");
        n=Integer.parseInt(br.readLine());

        System.out.println("Usted ingresara " + n + " numeros");
        int datos[]= new int[n];

        System.out.println("Ingrese los numeros :" );


        for(i=0;i<n;i++){
        datos[i]=Integer.parseInt(br.readLine()); }
        
        for(i=0;i<n-1;i++) {
        
        int min=i;
        for(int j=i+1;j<n;j++) {
        if(datos[j]<datos[min]) {
        min=j;}
        }
        if(i!=min){

        int aux =datos[i];

        datos[i]=datos[min];
        datos[min] = aux;
    }
    }
        
        System.out.println("Los numero de menor a mayor son :");
        for(int k=0; k<n;k++)
        
        System.out.println(datos[k] + " ");

        
        }
        
        }

