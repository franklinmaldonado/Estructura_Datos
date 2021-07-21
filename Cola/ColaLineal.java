package Cola;

public class ColaLineal {
    private static final int MAXTAMQ = 39;
    protected int frente;
    protected int fin;
    protected TipoDeDato [] listaCola;

    public ColaLineal() {
         frente = 0;
         fin = -1;
         listaCola = new TipoDeDato [MAXTAMQ];
    }

    public void insertar(TipoDeDato elemento) throws Exception {
         if (!colaLlena()) {
              listaCola[++fin] = elemento;
         }else
              throw new Exception("Overflow en la cola");
    }

    public TipoDeDato quitar() throws Exception {
         if (!colaVacia()) {
              return listaCola[frente++];
         }else
              throw new Exception("Cola vacia ");
    }

    public void borrarCola() {
         frente = 0;
         fin = -1;
    }

    public TipoDeDato frenteCola() throws Exception {
         if (!colaVacia()) {
              return listaCola[frente];
         }else
              throw new Exception("Cola vacia ");
    }

    public boolean colaVacia() {
         return frente > fin;
    }

    public boolean colaLlena() {
        return fin == MAXTAMQ - 1;
    }
}
