package com.example;

public class Main {
    public static void main(String[] args) {

        
    
        Producto producto1 = new Producto(1, "Iphone 13 Pro Max", 5, 5 );
        Camisa camisa1 = new Camisa(2, "Camisa Nike", 4, 2, "nike", 38);
        Jean jean1 = new Jean(3, "Purple", 4, 2, "negro", 39);
        Zapatos zapato1 = new  Zapatos(3, "Air forze one", 4, 5, 40, "Nike");

        System.out.println(producto1);
        System.out.println(camisa1);
        System.out.println(jean1);
        System.out.println(zapato1);


        System.out.println("Valor del inventario de zapato: " + zapato1.calcularValorInventario());
        zapato1.mostrarInformacion();
        System.out.println("Valor del inventario de Camisa: " + camisa1.calcularValorInventario());
        System.out.println("Valor del inventario de Camisa: " + camisa1.obtenerDescripcion());
        System.out.println("Valor del inventario del jean: " + jean1.calcularValorInventario());
        System.out.println("el color del jean es : " + jean1.obtenerCategoriaColor());


    }
}