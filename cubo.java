import java.util.Calendar;


public class cubo {
    public static void main(String args[])
 {
   int cuadrado[][] = new int[3][3];
   int suma, fil, col, intento = 1;
   boolean posicionCorrecta;
   boolean correcto;
 
   long t1, t2, dif;
   Calendar ahora1 = Calendar.getInstance();
   t1 = ahora1.getTimeInMillis();
 
   do
   {
     correcto = true;
     
     for(int i=0; i<3; i++)
       for(int j=0; j<3; j++)
         cuadrado[i][j] = 0;
   
    
     for(int num=1; num<=9; num++)
     {
       do
       {
         posicionCorrecta = false;
         fil = (int)(Math.random()*3);
         col = (int)(Math.random()*3);
         if(cuadrado[fil][col]==0)
         {
           posicionCorrecta = true;
           cuadrado[fil][col] = num;
         }
       }while(!posicionCorrecta);
     }
   
     intento++;
   
    
     suma = cuadrado[0][0] + cuadrado[0][1] + cuadrado[0][2];
     if(suma!=cuadrado[1][0] + cuadrado[1][1] + cuadrado[1][2])
       correcto = false;
     else
       if(suma!=cuadrado[2][0] + cuadrado[2][1] + cuadrado[2][2])
         correcto = false;
       else
         if(suma!=cuadrado[0][0] + cuadrado[1][0] + cuadrado[2][0])
           correcto = false;
         else
           if(suma!=cuadrado[0][1] + cuadrado[1][1] + cuadrado[2][1])
             correcto = false;
           else
             if(suma!=cuadrado[0][2] + cuadrado[1][2] + cuadrado[2][2])
               correcto = false;
             else
               if(suma!=cuadrado[0][0] + cuadrado[1][1] + cuadrado[2][2])
                 correcto = false;
               else
                 if(suma!=cuadrado[0][2] + cuadrado[1][1] + cuadrado[2][0])
                   correcto = false;
                 else
                   correcto = true;
   }while(!correcto);
 
   Calendar ahora2 = Calendar.getInstance();
   t2 = ahora2.getTimeInMillis();
 

   for(int i=0; i<3; i++)
   {
     for(int j=0; j<3; j++)
       System.out.print(cuadrado[i][j]+" ");
     System.out.println();
   }
 

 }
}
