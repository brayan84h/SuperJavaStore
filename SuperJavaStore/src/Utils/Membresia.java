package Utils;

import java.util.ArrayList;
import java.util.List;

public class Membresia {

    public String namecliet;
    public String idclient;
    public String phoneclient;
    public boolean vip;
    public List<Articulo> carrito;
    public List<Articulo> orden;


    public Membresia(String namecliet, String idclient, String phoneclient, boolean vip){
        this.idclient = idclient;
        this.namecliet = namecliet;
        this.phoneclient = phoneclient;
        this.vip = vip;
        this.carrito = new ArrayList<Articulo>();
        this.orden = new ArrayList<Articulo>();
    }

    public void assign_art_client(Articulo articulo){
        this.carrito.add(articulo);
    }

    public void assign_art_orden(Articulo articulo){
        this.orden.add(articulo);
    }

    public String saludoclient(){
        String saludoclient="Hola mi nombre es "+this.namecliet+" mi ID es "+this.idclient+"\n";
        return saludoclient;
    }

    public void mostrar_art_encompra(){
        short i=0;
        double totalpriceart= 0;
        System.out.println("Articulos en el carrito del cliente "+this.namecliet+" :");
        for (Articulo c: this.carrito) {
            System.out.println(c.id_art+", "+c.name_art+", "+c.descrip_art+","+"precio por unidad: "+c.price_art+", cantidad de articulos a llevar: "+c.cant_art);
            totalpriceart = totalpriceart+(c.price_art*c.cant_art);
        }
        System.out.println("El total a pagar en el Carrito es :"+totalpriceart);

    }

    public void mostrar_art_orden(Membresia membresia){
        short i=0;
        double totalpriceart= 0;
        double descuento, subtotal, totalpagar, impuesto;
        for (Articulo c: this.orden) {
            System.out.println(c.id_art+", "+c.name_art+", "+c.descrip_art+","+"precio por unidad: "+c.price_art+", cantidad de articulos ordenados: "+c.cant_art);
            totalpriceart = totalpriceart+(c.price_art*c.cant_art);
        }

        if (membresia.vip) {
            descuento=totalpriceart*0.02;
            subtotal=totalpriceart-descuento;
            impuesto=subtotal*0.15;
            totalpagar=subtotal+impuesto;
            System.out.println("Descuento 2% : "+descuento+"\t Subtotal: "+subtotal);
            System.out.println("Impuesto 15% :"+impuesto+"\t Total a Pagar :"+totalpagar);
        }
        else {
            descuento=totalpriceart*0;
            subtotal=totalpriceart-descuento;
            impuesto=subtotal*0.15;
            totalpagar=subtotal+impuesto;
            System.out.println("Descuento 0% : "+descuento+"\t Subtotal: "+subtotal);
            System.out.println("Impuesto 15% :"+impuesto+"\t Total a Pagar :"+totalpagar);
        }
    }
}
