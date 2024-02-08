/**Commit 4*/
public class TelefonoMovil {
    private String marca;
    private int almacenamiento;
    private Bateria bateria;
    
    /**Commit 5*/
    public TelefonoMovil(String marca, int almacenamiento, int duracion, int capacidad){
       this.marca = marca;
       this.almacenamiento = almacenamiento;
       this.bateria = new Bateria(duracion, capacidad);
    }
    
    public String getMarca() {
        return marca;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public Bateria getBateria() {
        return bateria;
    }
    
    public void setMarca(String newMarca) {
        marca = newMarca;
    }
    
    public void setAlmacenamiento(int newAlmacenamiento) {
        almacenamiento = newAlmacenamiento;
    }
    
    public void setBateria(int newDuracion, int newCapacidad) {
        bateria.setDuracion(newDuracion);
        bateria.setCapacidad(newCapacidad);
    }
    
    public void imprimirDetalles(){
        System.out.println("Marca: "+marca);
        System.out.println("Almacenamiento: "+almacenamiento);
        System.out.println("Duración de la batería: "+bateria.duracion);
        System.out.println("Capacidad de la batería: "+bateria.capacidad);
    }
}