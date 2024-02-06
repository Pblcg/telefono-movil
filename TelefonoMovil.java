/**Commit 4*/
public class TelefonoMovil {
    private String marca;
    private int almacenamiento;
    private Bateria bateria;
    
    /**Commit 5*/
    public TelefonoMovil(String marca, int almacenamiento){
       this.marca = marca;
       this.almacenamiento = almacenamiento;
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
}