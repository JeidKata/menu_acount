package com.globant.java.supermarket;

public class Storage {
    private Product start;
    private Product end;

    public Storage() {
        this.start = null;
        this.end = null;
    }

    public void addProduct(String name, float price, int amount) {
        Product newProduct = new Product(name, price, amount);
        if (start == null) {
            start = newProduct;
            end = newProduct;
        } else {
            end.setNext(newProduct);
            end = newProduct;
        }
    }

    public void listProducts() { // show information of all products
        Product current = start;
        while (current != null) {
            System.out.printf("\tNombre: %s\n\tPrecio: %.2f\n\tCantidad: %d\n\n", current.getName(), current.getPrice(), current.getAmount());
            current = current.getNext();
        }
    }

    public Product listProducts(String name) { // Show information for deleted specific product
        Product current = start;
        Product previous = null;
        while (current != null && !current.getName().toLowerCase().equals(name)) {
            previous = current;
            current = current.getNext();
        }
        return previous;
    }

    private Product nextProductToDeleted(Product previousProductToDeleted) { // Show information for deleted specific product
        Product actualProductToDeleted = previousProductToDeleted.getNext();
        if (actualProductToDeleted.getNext() == null) {
            this.end = previousProductToDeleted;
            return null;
        }
        this.end = actualProductToDeleted.getNext();
        return actualProductToDeleted.getNext();
    }

    public void sellProduct(String name, int cantSell){
        while (this.start != null) {
            if (this.start.getName().equals(name)) {
                if (this.start.getAmount() > 0) {
                    this.start.setAmount(this.start.getAmount() - cantSell);
                    System.out.println("Producto vendido: " + this.start.getName());
                    return;
                } else {
                    System.out.println("No hay suficiente cantidad del producto: " + this.start.getName());
                    return;
                }
            }
            this.start = this.start.getNext();
        }
    }

    public void removeProduct(String name) {
        name = name.toLowerCase();
        Product previousProduct = listProducts(name);
        Product nextProduct = nextProductToDeleted(previousProduct);
        if(nextProduct != null) {
            previousProduct.setNext(nextProduct);
        } else {
            previousProduct.setNext(null);
        }

    }
}
