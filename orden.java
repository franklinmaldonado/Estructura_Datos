public class orden {
  public static void intercambiar(int a [], int i, int j) {
      int aux = a[i];
      a[i] = a[j];
      a[j] = aux;
      
  }
  public static void ordIntercambio(int a[]) {
      int i,j;
      for(i=0;i<a.length;i++){
          for(j = i+1; j<a.length;j++){
              if(a[i] >a[j]){
                  intercambiar(a, i, j);
              }
          }
      }
      
  }  
}
