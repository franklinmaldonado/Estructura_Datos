
import java.util.Random;

public class prueba {
    public int Mat [][];
    public int filas, columnas;
    
    
    public void Mat(){
     
    }
    public Mat(int f, int c){
     filas=f;
     columnas=c;
     Mat=new int [filas][columnas];
    }
    
    public void Llenar(int valor, int i, int j){
     Mat[i][j]=valor;
     
    }
    
    public void Mostrar(){ // Muestra los elementos de la matriz. 
   System.out.println("Matriz:"); 
   for(int i=0;i<filas;i++){ 
   for(int j=0;j<columnas;j++){ 
   System.out.print(Mat[i][j]+" "); 
   } 
   System.out.println(); 
   } 
   }
   }
}
