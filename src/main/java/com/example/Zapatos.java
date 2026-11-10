package com.example;

public class Zapatos extends Producto {

    protected int talla;
    protected String marca;

    
    public Zapatos(int id, String nombre, double precio, int stock, int talla, String marca) {
        super(id, nombre, precio, stock);
        this.talla = talla;
        this.marca = marca;
    }


    public int getTalla() {
        return talla;
    }


    public void setTalla(int talla) {
        this.talla = talla;
    }


    public String getMarca() {
        return marca;
    }


    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override 
    public double calcularValorInventario() {
        if (precio <= 0 || stock < 0) {
        throw new IllegalArgumentException("El precio o el stock no son válidos");
            }

        return precio * stock;

    }

    public void mostrarInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Talla: " + talla);
    }

    @Override
    public String toString() {
        return "Zapatos [id=" + id + ", talla=" + talla + ", nombre=" + nombre + ", marca=" + marca + ", precio="
                + precio + ", stock=" + stock + "]";
    }

}
