package Lista.Pruebas;


    public class Ejecutar
{
    public static void main(String []args)
    {
        Ordenamiento datos=new Ordenamiento();
        int sw,opcion;
 
        datos.ingreso();
        sw=1;
        do{
 
            System.out.println("-----Menu-----");
            
            System.out.println("1. Inserción Directa");
            System.out.println("2. Selección Directa");
            System.out.println("3. Metodo Shell");
            System.out.println("4. QuickShort");
            System.out.println("5. Salir");
            System.out.print("Opcion ==> ");
            opcion=Ingreso.datoInt();
            if(opcion>0)
            {
                System.out.println("Arreglo antes de ordenar");
                datos.reporte();
            }
 
            switch(opcion)
            {
                
               
                case 1: datos.baraja();break;
                case 2: datos.seleccion_directa();break;
                case 3: datos.shell();break;
                case 4: datos.quicksort(datos.a,0,datos.n-1);break;
                case 5: sw=0;break;
            }
            if(opcion>0)
            {
                System.out.println("Arreglo despues de ordenar");
                datos.reporte();
            }
 
            
        }while(sw==1);
    }
}

