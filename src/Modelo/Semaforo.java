
package Modelo;


public class Semaforo  extends Thread{ 
     
        //Color color;
        //JTextArea area;
        boolean contador=true;
        int nombre;
        Controlador controlador;
        
        public Semaforo(int nombre,Controlador controlador){            
            //this.area = area;
           // this.color = color;
            this.nombre = nombre;        
            this.controlador=controlador;
        }

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

   

    public Controlador getControlador() {
        return controlador;
    }

    public void setControlador(Controlador controlador) {
        this.controlador = controlador;
    }
        
        
         
        public void run(){
          while(contador){
        	 
            long rango = (long) (1 * 5000);
           // area.setBackground(color); 
            
            System.err.println(nombre); 
            controlador.cam1();
            try{
                  sleep(rango);  
                  
            }catch(InterruptedException e){
                e.printStackTrace();
                
            }
            controlador.cam2();
            
            }
      
        }
        
        public void detener(){
            contador=false;
        }
    
	
}
