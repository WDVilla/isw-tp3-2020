
package trabajopractico3;
import java.util.*;
import java.util.regex.Pattern;

public class Producto {

    static boolean valida_fechaproducto_es_menor_a_la_fecha_Actual(Producto p) {
    Date actual=new Date();
    
        return p.ProductofchIngreso.before(actual);
    }


    //ATRIBUTOS
        String ProductoId;
        String ProductoNom;
        double ProductoPrecio;
        String ProductoDescripcion;
        int ProductoStock;
        int ProductoModelo;
        Date ProductofchIngreso;

    public Producto( String ProductoNom, double ProductoPrecio, String ProductoDescripcion, int ProductoStock, int ProductoModelo, Date ProductofchIngreso) {
        this.ProductoNom = ProductoNom;
        this.ProductoPrecio = ProductoPrecio;
        this.ProductoDescripcion = ProductoDescripcion;
        this.ProductoStock = ProductoStock;
        this.ProductoModelo = ProductoModelo;
        this.ProductofchIngreso=ProductofchIngreso;
    }

    public String getProductoId() {
        return ProductoId;
    }

    public String getProductoNom() {
        return ProductoNom;
    }

    public double getProductoPrecio() {
        return ProductoPrecio;
    }

    public String getProductoDescripcion() {
        return ProductoDescripcion;
    }

    public int getProductoStock() {
        return ProductoStock;
    }



    public void setProductoId(String ProductoId) {
        this.ProductoId = ProductoId;
    }

    public void setProductoNom(String ProductoNom) {
        this.ProductoNom = ProductoNom;
    }

    public void setProductoPrecio(double ProductoPrecio) {
        this.ProductoPrecio = ProductoPrecio;
    }

    public void setProductoDescripcion(String ProductoDescripcion) {
        this.ProductoDescripcion = ProductoDescripcion;
    }

    public void setProductoStock(int ProductoStock) {
        this.ProductoStock = ProductoStock;
    }
    
    public static boolean valida_descripcion_no_sea_vacio(Producto p){
        return !p.ProductoDescripcion.equals("");
    }
}


    
