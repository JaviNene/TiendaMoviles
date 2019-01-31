import javax.swing.*;

public class Caracteristicas {
    private final String marca;
    private final String Modelo;
    private final int memoriaInterna;
    private final int megaPixeles;
    private final int memoriaRAM;
    private final String color;
    private int Precio;


    public Caracteristicas(String marca, String Modelo, int memoriaInterna, int megaPixeles,
                           int memoriaRAM, String color, int Precio) {
        this.marca = marca;
        this.Modelo=Modelo;
        this.memoriaInterna = memoriaInterna;
        this.megaPixeles = megaPixeles;
        this.memoriaRAM = memoriaRAM;
        this.color = color;
        this.Precio = Precio;
    }

    public String getMarca() { return marca; }

    public String getModelo() { return Modelo;}

    public int getMemoriaInterna() {
        return memoriaInterna;
    }

    public int getMegaPixeles() {
        return megaPixeles;
    }

    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public String getColor() {
        return color;
    }

    public int getPrecio() { return Precio;}

    @Override
    public String toString(){
        String salida="";
        salida+="Marca: "+getMarca()+
                " Modelo: "+getModelo()+
                " Memria Interna: "+getMemoriaInterna()+" GB"+
                " Camara trasera: "+getMegaPixeles()+" MP"+
                " Memoria RAM: "+getMemoriaRAM()+" GB"+
                " Color: "+getColor()+
                " Precio: "+getPrecio();
        return salida;
    }


    public String InfoMovil(){
        String salida="";
        salida+="El movil "+getModelo()+"\n"+
                "De la marca: "+getMarca()+" tiene:\n"+
                getMemoriaInterna()+" GB de me memoria interna\n"+
                getMegaPixeles()+" MP en la camara trasera\n"+
                getMemoriaRAM()+" GB de memoria RAM\n"+
                "El color del dispositivo es de color "+getColor()+"\n"+
                "y cuesta "+getPrecio()+" €";
        return salida;
    }


    public static void main(String[] args) {
        Caracteristicas Huawei=new Caracteristicas("Huawei","Huawei P smart",64,13,3,"Negro",170);
        Caracteristicas Samsung=new Caracteristicas("Samsung","Samsung Galaxy S9+",64,12,6,"Azul",570);
        Caracteristicas[] listaMoviles = {Huawei, Samsung};

        int opcion






    }
}
