package com.example;

public class Jean extends Producto {

    protected String color;
    protected int talla;

    
    public Jean(int id, String nombre, double precio, int stock, String color, int talla) {
        super(id, nombre, precio, stock);
        this.color = color;
        this.talla = talla;
    }


    public String getColor() {
        return color;
    }


    public void setColor(String color) {
        this.color = color;
    }


    public int getTalla() {
        return talla;
    }


    public void setTalla(int talla) {
        this.talla = talla;
    }


    @Override 
        public double calcularValorInventario() {
        if (precio <= 0 || stock < 0) {
            throw new IllegalArgumentException("El precio o el stock no son válidos");
        }

    return precio * stock;
    }

    public String obtenerCategoriaColor() {
        if (color.equalsIgnoreCase("Azul")) {
            return "Jean clásico";
        } else if (color.equalsIgnoreCase("Negro")) {
            return "Jean elegante";
        } else if (color.equalsIgnoreCase("Blanco")) {
            return "Jean casual";
        }

        return "Jean de color especial";
    }


    @Override
    public String toString() {
        return "Jean [id=" + id + ", color=" + color + ", nombre=" + nombre + ", talla=" + talla + ", precio=" + precio
                + ", stock=" + stock + "]";
    }


    

}
