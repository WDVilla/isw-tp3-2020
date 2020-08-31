
package trabajopractico3;
import java.util.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class CarroDeComprasTest {

Date fechaactual= new Date();

    Producto prod1 = new Producto("Playstation 5", 80000, "Con dos Joystink", 50,1,fechaactual);
    Producto prod2 = new Producto("Notebook", 80000, "Intel i7", 50,2,fechaactual);
    Producto prod3 = new Producto("Tablet", 10000, "5 gb de memoria", 10,3,fechaactual);
    Producto prod4 = new Producto("Smart TV", 60000, "Ultra Definicion", 50,4,fechaactual);
    Producto prod5 = new Producto("Celular", 25000, "Motorola G5", 5,5,fechaactual);
    Cliente cliente1 = new Cliente("Pamela", "Casilla", 25,37519314,"2615568398");
    DetalleCarro detalle1 = new DetalleCarro(prod1,5);
    CarroDeCompras carrito = new CarroDeCompras(150000,detalle1);

    public CarroDeComprasTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of valida_nombre_no_sea_vacio method, of class CarroDeCompras.
     */
    //PRUEBA CARLOS LAURIA
    @Test
    public void testValida_nombre_no_sea_vacio() {
        System.out.println("valida_nombre_no_sea_vacio");
        Producto p = prod1;
        boolean expResult = true;
        boolean result = CarroDeCompras.valida_nombre_no_sea_vacio(p);
        assertEquals(expResult, result);
    }

    /**
     * Test of valida_precio_no_sea_menor_igual_cero method, of class
     * CarroDeCompras.
     */
    @Test
    public void testValida_precio_no_sea_menor_igual_cero() {
        System.out.println("valida_precio_no_sea_menor_igual_cero");
        Producto p = prod1;
        boolean expResult = true;
        boolean result = CarroDeCompras.valida_precio_no_sea_menor_igual_cero(p);
        assertEquals(expResult, result);
    }

    /**
     * Test of valida_cliente_ape_nom_no_sea_vacio method, of class
     * CarroDeCompras.
     */
    //PRUEBA PAMELA CASILLA
    @Test
    public void testValida_cliente_ape_nom_no_sea_vacio() {
        System.out.println("valida_cliente_ape_nom_no_sea_vacio");
        Cliente c = cliente1;
        boolean expResult = true;
        boolean result = CarroDeCompras.valida_cliente_ape_nom_no_sea_vacio(c);
        assertEquals(expResult, result);
    }

    /**
     * Test of valida_edad_mayor_igual_18 method, of class CarroDeCompras.
     */
    @Test
    public void testValida_edad_mayor_igual_18() {
        System.out.println("valida_edad_mayor_igual_18");
        Cliente c = cliente1;
        boolean expResult = true;
        boolean result = CarroDeCompras.valida_edad_mayor_igual_18(c);
        assertEquals(expResult, result);
    }

    //PRUEBA FACUNDO BENGOA
    @Test
    public void testValida_stock_no_sea_menor_igual_cero() {
        Producto p = prod3;
        boolean expResult = true;
        boolean result = CarroDeCompras.valida_stock_no_sea_menor_igual_cero(p);
        assertEquals(expResult, result);
    }

    @Test
    public void testValida_cantidad_no_sea_menor_igual_cero() {
        CarroDeCompras cd = carrito;
        boolean expResult = true;
        boolean result = CarroDeCompras.valida_cantidad_no_sea_menor_igual_cero(cd);
        assertEquals(expResult, result);
    }

    //PRUEBA GONZALO CARBAJAL
    @Test
    public void testValida_dni_no_sea_vacio() {
        Cliente cl = cliente1;
        boolean expResult = true;
        boolean result = Cliente.valida_dni_no_sea_vacio(cl);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testValida_descripcion_no_sea_vacio() {
        Producto p = prod2;
        boolean expResult = true;
        boolean result = Producto.valida_descripcion_no_sea_vacio(p);
        assertEquals(expResult, result);
    }
    
    //PRUEBA DE GABRIELA OCHOA
    @Test
    public void testValida_modelo_producto_no_sea_menor_igual_cero() {
        Producto p = prod3;
        boolean expResult = true;
        boolean result = CarroDeCompras.valida_modelo_producto_no_sea_menor_igual_cero(p);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testValida_celular_no_sea_vacio() {
        Cliente cl = cliente1;
        boolean expResult = true;
        boolean result = Cliente.valida_celular_no_sea_vacio(cl);
        assertEquals(expResult, result);
    }
//PRUEBA DE MAURCIO CAMPOS
        @Test
    public void testValida_fechaproducto_es_menor_a_la_fecha_Actual() {
       Producto p = prod2;
        boolean expResult = true;
        boolean result = Producto.valida_fechaproducto_es_menor_a_la_fecha_Actual(p);
        assertEquals(expResult, result);
        
    }
        @Test
    public void testValida_que_el_nombre_no_tenga_caracteres_especiales() {
       Cliente cl = cliente1;
        boolean expResult = true;
        boolean result = Cliente.valida_que_el_nombre_no_tenga_caracteres_especiales(cl);
        assertEquals(expResult, result);
        
      }
    
    //PRUEBAS DE ENRIQUE VEGA
            @Test
     public void testValida_que_el_teléfono_solo_tenga_caracteres_numericos() {
       Cliente cl = cliente1;
        boolean expResult = true;
        boolean result = Cliente.valida_que_el_teléfono_solo_tenga_caracteres_numericos(cl);
        assertEquals(expResult, result);
        
}
              @Test
     public void testValida_que_exista_por_lo_menos_una_instancia_Cliente(){
       Cliente cl = cliente1;
        boolean expResult = true;
        boolean result = Cliente.valida_que_exista_por_lo_menos_una_instancia_Cliente();
        assertEquals(expResult, result);

}
     
}