
package com.example;

public class Producto {

    protected int id;
    protected String nombre;
    protected double precio;
    protected int stock;

    
    public Producto(int id, String nombre, double precio, int stock) {
        this.id = id;
        this.nombre = nombre;
        setPrecio(precio);
        setStock(stock);
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public double getPrecio() {
        return precio;
    }


    public void setPrecio(double precio) {
        if (precio <= 0){
            System.out.println("El precio tiene que ser mayor a 0");
        }
        this.precio = precio;
    }


    public int getStock() {
        return stock;
    }


    public void setStock(int stock) {
         if (stock <= 0){
            System.out.println("No hay productos para vender");
            return;
        }
        this.stock = stock;
    }

    public double calcularValorInventario() {
    if (precio <= 0 || stock < 0) {
        throw new IllegalArgumentException("El precio o el stock no son válidos");
    }

    return precio * stock;
}


    @Override
    public String toString() {
        return "Producto id = " + id + ", nombre = " + nombre + ", precio = " + precio + ", stock = " + stock + "";
    }

    

}
