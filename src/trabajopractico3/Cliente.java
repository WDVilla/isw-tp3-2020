
package trabajopractico3;

import java.util.regex.Pattern;

public class Cliente {

    static boolean valida_que_el_nombre_no_tenga_caracteres_especiales(Cliente cl) {
    
       return Pattern.matches("[a-zA-Z]+", cl.ClienteNom);
    }

    static boolean valida_que_el_teléfono_solo_tenga_caracteres_numericos(Cliente cl) {
 return Pattern.matches("[0-9]+", cl.ClienteCelular);
    }

    static boolean valida_que_exista_por_lo_menos_una_instancia_Cliente() {
        return conteoCli>=1;
    }

   
    //ATRIBUTOS
        String ClienteId;
        String ClienteNom;
        String ClienteApe;
        int ClienteEdad;
        int ClienteDNI;
        String ClienteCelular;
        static int conteoCli=0;

    public Cliente(String ClienteNom, String ClienteApe, int ClienteEdad, int ClienteDNI, String ClienteCelular) {
        this.ClienteNom = ClienteNom;
        this.ClienteApe = ClienteApe;
        this.ClienteEdad = ClienteEdad;
        this.ClienteDNI  = ClienteDNI;
        this.ClienteCelular = ClienteCelular;
        conteoCli++;
    }

    public String getClienteId() {
        return ClienteId;
    }

    public String getClienteNom() {
        return ClienteNom;
    }

    public String getClienteApe() {
        return ClienteApe;
    }

    public int getClienteEdad() {
        return ClienteEdad;
    }

    public void setClienteId(String ClienteId) {
        this.ClienteId = ClienteId;
    }

    public void setClienteNom(String ClienteNom) {
        this.ClienteNom = ClienteNom;
    }

    public void setClienteApe(String ClienteApe) {
        this.ClienteApe = ClienteApe;
    }

    public void setClienteEdad(int ClienteEdad) {
        this.ClienteEdad = ClienteEdad;
    }
        
   public static boolean valida_dni_no_sea_vacio(Cliente c){
      return c.ClienteDNI > 0;
   }
   
   public static boolean valida_celular_no_sea_vacio(Cliente c){
      return !c.ClienteCelular.equals("");
   }
}
