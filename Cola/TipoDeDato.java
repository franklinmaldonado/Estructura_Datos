package Cola;


    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
    
    public class TipoDeDato {
        public static void main(String[] args) throws Exception{
            
        
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int valor, referencia, posicion, op, elemento;
            
            String continuar;
        
            ColaLineal li = new ColaLineal();
            
        
            do
            {
                System.out.println("-----Menu-----");
                System.out.println("1.-Insertar Datos");
                System.out.println("2.-Quitar datos");


                System.out.println("Ingrese la opcion que desea: ");
                op = Integer.parseInt(br.readLine());
        
        
                switch(op){
           
                    case 1:
                    
                    System.out.println("Ingrese el Valor: ");
                    elemento=Integer.parseInt(br.readLine());
                    li.insertar(elemento);
                    break;

                    case 2:
                    
                    li.quitar();
                    break;


                    case 3:
                    
                    elemento=Integer.parseInt(br.readLine());
                    li.frenteCola();
                    break;


        
                }
                System.out.println("Desea Continiar Con La Ejecucion S/N");
                continuar=br.readLine().toUpperCase();
            }while(continuar.equals("S"));
            }
}
