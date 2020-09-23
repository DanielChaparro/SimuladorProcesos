
package Cola;


public class Nodo<T> {//Nodo tipo generico
    private Nodo<T> sig;
    private T t;
    
    public Nodo(T t){
        this.sig=null;
        this.t=t;
    }
    
    public Nodo<T> getSig(){
        
        return sig;
    }
    
    public void setSig(Nodo<T> sig){
        this.sig=sig;
    }
    
    public void setT(T t){
        this.t=t;
    }
    
    public T getT(){
        return t;
    }
}
