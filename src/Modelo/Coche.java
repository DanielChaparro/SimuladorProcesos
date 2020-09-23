package Modelo;


public class Coche {
 private int Velocidad;
 private int Peso;

    public Coche() {
        Velocidad=0;
        Peso=0;
    }

 
    public Coche(int Velocidad, int Peso) {
        this.Velocidad = Velocidad;
        this.Peso = Peso;
    }

    public int getVelocidad() {
        return Velocidad;
    }

    public void setVelocidad(int Velocidad) {
        this.Velocidad = Velocidad;
    }

    public int getPeso() {
        return Peso;
    }

    public void setPeso(int Peso) {
        this.Peso = Peso;
    }

    public Coche crearCoche(){
        boolean bandera=false;
        
        int peso=1;
        int velocidad=1;
        while(bandera==false){
        peso=(int) (Math.random() * (1400-300)+300);
        if(peso%100==0){
        bandera=true;
        }
      }   
       velocidad=(int)(Math.random()*(21-1)+1);          
       Coche c= new Coche(velocidad,peso);
        
        return c;
    }
    
    @Override
    public String toString() {
        return  "Velocidad: "+Velocidad+" Peso: "+Peso;
    }
 
 
 
}
