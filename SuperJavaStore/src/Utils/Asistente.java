 package Utils;

import Utils.*;

import java.util.ArrayList;
import java.util.List;

public class Asistente {

    public String name_asit;
    public String phone_asit;
    public String email_asist;

    public List<Membresia> orden;

    public Asistente(String name_asit, String phone_asit, String email_asist) {

        this.name_asit = name_asit;
        this.phone_asit = phone_asit;
        this.email_asist = email_asist;
        this.orden = new ArrayList<Membresia>();
    }

    public String saludoasist() {
        String saludoasist = "Buen dia, mi nombre es " + this.name_asit + " y estoy aca para servirle \n";
        return saludoasist;
    }

    public void asig_orden(Membresia carrito) {
        this.orden.add(carrito);
    }

    public void createfactura(Membresia membresia){
        System.out.println("\n\n\t...FACTURA DE ORDEN...");
        System.out.println("Asistente engaragado: " + this.name_asit + "\t" + "Numero de Telefono: " + this.phone_asit);
        System.out.println("Correo del asistente: " + this.email_asist);
        System.out.println("Cliente: " + membresia.namecliet+ "\t Id: "+membresia.idclient);
        if (membresia.vip){
            System.out.println("EL CLIENTE TIENE MEMBRESIA VIP");
        }
        else
            System.out.println("EL CLIENTE NO TIENE MEMBRESIA VIP");
        System.out.println("\t Articulos Comprados:");
    }

}
