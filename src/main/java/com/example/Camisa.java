package com.example;

public class Camisa extends Producto {

    protected String marca;
    protected int talla;

    
    public Camisa(int id, String nombre, double precio, int stock, String marca, int talla) {
        super(id, nombre, precio, stock);
        setMarca(marca);
        setTalla(talla);
    }



    public String getMarca() {
        return marca;
    }


    public void setMarca(String marca) {
         if (marca == null || marca.isBlank()) {
        System.out.println("La marca no puede estar vacía");
        return;
    }
        this.marca = marca;
    }


    public int getTalla() {
        return talla;
    }


    public void setTalla(int talla) {
        if (talla >= 0){
            System.out.println("La talla no puede estar vacida");
            return;
        }
        this.talla = talla;
    }

    @Override 
    public double calcularValorInventario() {
        if (precio <= 0 || stock < 0) {
            throw new IllegalArgumentException("El precio o el stock no son válidos");
        }

        return precio * stock;
    }

    public String obtenerDescripcion() {
        return "la camisa es de la marca " + marca + " y su talla es " + talla;
    }



    @Override
    public String toString() {
        return "Camisa [id=" + id + ", marca=" + marca + ", nombre=" + nombre + ", talla=" + talla + ", precio="
                + precio + ", stock=" + stock + "]";
    }

    


    

}
