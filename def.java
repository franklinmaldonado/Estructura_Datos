public class def {
    int tabla[] = new int[6];
    int i, j, x = 0, aux;
    boolean repetido;

    for (i = 0; i < tabla.length; ) {
        repetido=false;//cada vuelta vuelvo a ponerlo a true
        x = (int) (Math.random() * (10- 1) + 1);//Modifique esto para que me saliearan repetidos  con un rango mas pequeño , siempre evitando el 0
     
        //Recorro toda la array para ver si hay alguno igual 
        for(int p=0;p<tabla.length&&!repetido;p++){
            //Si hay alguno igual con un booleno lo cambio y salgo del bucle
             if(x==tabla[p]){
                  repetido=true;
             }
        }
        //si al salir del bucle que compureba algun repetido el booleano no ha cambiado
        if(!repetido){
            tabla[i]=x;//añado 
            i++;//y incremento otra posicion 
        }
     
        //sino ha entrado en el if habra encontrado un repetido y tendra que genera otro numero aleatorio y no incremento para no perder esa posicion 
     
     
    }
    System.out.println("Tabla antes de ordenar");
    for (int h : tabla) {
        System.out.print(h + " ");
     
    }
     
    //Metodo de burbuja , Arrays.sort(array) tambien ordena de menor a mayor 
    for (i = 0; i < tabla.length - 1; i++) {
        for (j = 0; j < tabla.length - i - 1; j++) {
     
            if (tabla[j] > tabla[j + 1]) {
     
                aux = tabla[j];
                tabla[j] = tabla[j + 1];
                tabla[j + 1] = aux;
     
            }
        }
    }
    System.out.println("");
    for (i = 0; i < tabla.length; i++) {
        System.out.println("Aleatorio=" + tabla[i]);
}
}
}

