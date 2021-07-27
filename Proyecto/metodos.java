package Proyecto;

public class metodos {
     static String add(String num1, String num2) {
        
        // Compara el numero
        if (num1.length() > num2.length()) {
            String temp = num1;
            num1 = num2;
            num2 = temp;
        }
        int cha = num2.length() - num1.length();
        //agrega 0 en el caso de ser de direnete longitud
        for (int i = 0; i < cha; i++) {
            num1 = '0' + num1; 
        }
        String result = "";
        int w = 0; 
        //operacion
        for (int i = num2.length() - 1; i >= 0; i--) {
        
            int c = num2.charAt(i) + num1.charAt(i) - 96 + w;
            w = c / 10; 
            //regla dividimos todos los numero invitados para 10 
            result = (c % 10) + result;
        }
        
        if (w == 1)
            result = 1 + result;
        return result;
    }
}
