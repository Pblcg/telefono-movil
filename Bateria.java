public class Bateria{
    private int duracion;
    private int capacidad;
    
    public Bateria(int duracion, int capacidad){
        this.duracion = duracion;
        this.capacidad = capacidad;
    }
    
      public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
    public void imprimirDetalles(){
        System.out.println("Duración: "+duracion+" horas | Capacidad: "+capacidad+"mAh");
    }
}