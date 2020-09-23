package Cola;


public class Cola<T> {
        private Nodo<T> cab;
	private Nodo<T> col;
	
	private int size;
	
	public Cola() {
		cab=null;
		col=null;
		size=0;
	}
	
	
	public boolean add (T t) {
		Nodo<T> nuevo=new Nodo(t);
		
		if(cab==null) {
			cab=nuevo;
			cab.setSig(null);
			col=nuevo;
		}else {
			col.setSig(nuevo);
			nuevo.setSig(null);
			col=nuevo;
		}
		
		
		
		size++;
		return false;
	}
	
	public void addFirst(T t) {
		
		Nodo<T> nuevo=new Nodo(t);
		
		if(cab==null) {
			cab=nuevo;
			cab.setSig(null);
			col=nuevo;
		}else {
			
			nuevo.setSig(cab);
			cab=nuevo;
		}
		
		size++;
	}
	
	
	public void addLast(T t) {
		
		Nodo<T> nuevo=new Nodo(t);
		
		if(cab==null) {
			cab=nuevo;
			cab.setSig(null);
			col=nuevo;
		}else {
			col.setSig(nuevo);
			col=nuevo;
			
		}
		
		size++;
	}	
	
	
	public boolean contains(T t) {
		
		
		
		Nodo<T> aux = cab;

		while (aux != null) {

			if (aux.getT() == t) {

				return true;

			}

			aux = aux.getSig();

		}
	
		
		return false;
	}
	
	public T element() {
		
		Nodo <T> aux=cab;
		
		if(aux!=null) {
			return cab.getT();
		}else {
			return null;
		}
		
	}
	
	public T getFirst() {
		
		Nodo <T> aux=cab;
		
		if(aux!=null) {
			return cab.getT();
		}else {
			return null;
		}
		
	}

	
	public T getLast() {
		Nodo <T> aux=col;
		
		if(aux!=null) {
			return col.getT();
		}else {
			return null;
		}
		
		
	}


	public boolean isEmpty() {
		
		return cab==null;
	}
	
	
	public boolean offerFirst(T t) {
		
		
		Nodo<T> aux=cab;
		if(cab!=null) {
		aux.setT(t);
		}
		
		
		return false;
	}
	
	public boolean offerLast(T t) {
		
		Nodo<T> aux=col;
		if(col!=null) {
			aux.setT(t);
		}
		
		
		return false;
	}
	
	public T peek() {
		
		Nodo <T> aux=cab;
		
		if(aux!=null) {
			return cab.getT();
		}else {
			return null;
		}
		
	}
	
	
	public T remove() {
		
		Nodo<T> aux=cab;
		
		if(cab==null) {
			return null;
		}else {
			
			System.out.println("El proceso se ejecuto " + cab.getT());
			cab=cab.getSig();
			aux=null;
			
		}
		size--;
		return null;
		
		
	}
	
	public T removeLast() {
		Nodo<T> aux=col;
		
		if(cab==null) {
			return null;
		}else {
			
			System.out.println("Proceso ejecutado" + col.getT());
			aux.setSig(null);
			col=aux;
			
		}
		size--;
		return null;
		
		
	}
	
	public T get(int index) {

		Nodo<T> aux = null;

		if (cab != null) {
			if (index > size || index < 1) { 
				return null;
			}else {
				aux=cab;
				for (int i = 1; i < index; i++)  
					aux = aux.getSig();
					return aux.getT();


			}
		}

		return null;
	}
	
	public  int size() {
		return size;
	}
        
        public static void listar(Cola cola){
        
		for(int i=1;i<=cola.size();i++){
            
			System.out.println(cola.get(i));
			
        }
    }
}


