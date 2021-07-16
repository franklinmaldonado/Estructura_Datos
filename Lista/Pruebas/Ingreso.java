package Lista.Pruebas;

import java.io.*;
public class Ingreso{
    public static String dato(){
        String sdato = "";
        try{
        
            InputStreamReader isr =
                new InputStreamReader(System.in);
            BufferedReader flujoE=
                new BufferedReader(isr);
        
            sdato = flujoE.readLine();
        }
        catch(IOException e){
            System.err.println("Error: " + e.getMessage());
        }
        return sdato; 
    }
 
    public static short datoShort(){
        try{
            return Short.parseShort(dato());
        }
        catch(NumberFormatException e){
            
            return Short.MIN_VALUE;
        }
    }
 
    public static int datoInt(){
        try{
            return Integer.parseInt(dato());
        }
        catch(NumberFormatException e){
          
            return Integer.MIN_VALUE;
        }
    }
 
    public static long datoLong(){
        try{
            return Long.parseLong(dato());
        }
        catch(NumberFormatException e){
            
            return Long.MIN_VALUE;
        }
    }
 
    public static float datoFloat(){
        try{
            Float f = new Float(dato());
            return f.floatValue();
        }
        catch(NumberFormatException e){
           
            return Float.NaN;
    }
    }
 
    public static double datoDouble(){
        try{
            Double d = new Double(dato());
            return d.doubleValue();
        }
        catch(NumberFormatException e){
           
            return Double.NaN;
        }
    }
 
    public static String datoString(){
        return dato();
    }
 
    public static char datoChar(){
        int c=0;
        try{
            InputStreamReader isr =
                new InputStreamReader(System.in);
            BufferedReader flujoE=
                new BufferedReader(isr);
            c=flujoE.read();
            char car;
            car=(char) c;
            return car;
        }
        catch(IOException e){
            return '\0';
        }
    }
}