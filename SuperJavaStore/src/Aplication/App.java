package Aplication;

import Utils.*;

public class App {
    public static void main(String[] args) {

        //Creamos el asistente
        Asistente asist1 = new Asistente("Juan Perez","3244-6517","Juan67rMon@gmail.com");

        //Creamos el o los clientes
        Membresia client1 = new Membresia("Brayan Josue Hernandez Garcia","0801-2001-21124","9865-4909",true);
        Membresia client2 = new Membresia("Keysi Julieth Garcia Villagra","0801-1987-07489","9865-3678",false);

        //Creamos los Articulos a la venta
        Articulo art1 = new Articulo("1101233535","Pantalla AOC","22 Pulgadas, Ultra HD",2,2500);
        Articulo art2 = new Articulo("1101598668","Teclado ARGOM","RGB, MECANICO",1,956.36);
        Articulo art3 = new Articulo("2895435349","Impresora Epson","Modelo L375, Tinta de flujo continuo con WIFI",1,5405.99);
        Articulo art4 = new Articulo("9765634351","Procesador AMD RYSEN 5","8 nucleos, incluido el disipador de calor",1,8064.6);
        Articulo art5 = new Articulo("7668345354","Equipo de Sonido SONY","Ultra Bass incluidos",4,5784.35);
        Articulo art6 = new Articulo("7899511213","Samsung Galaxy s20","Color negro , Dual SIM",1,40000);

        //Proceso de compra
        System.out.println(client1.saludoclient());
        System.out.println(asist1.saludoasist());

        //Asignacion de articulos al Carrito
        client1.assign_art_client(art1);
        client1.assign_art_client(art3);
        client2.assign_art_client(art2);
        client2.assign_art_client(art4);
        client1.assign_art_client(art5);
        client2.assign_art_client(art6);


        //Asignacion del carrito a la orden del cliente

            //asiganacion de articulos al cliente 1
        client1.assign_art_orden(art1);
        client1.assign_art_orden(art3);

        //asiganacion de articulos al cliente 2
        client2.assign_art_orden(art2);
        client2.assign_art_orden(art6);

        //Mostrando Articulos en la carrito por cliente
        client1.mostrar_art_encompra();
        System.out.println(" ");
        client2.mostrar_art_encompra();

        //Mostrando compra actual por factura

            //Factura del cliente 1
        asist1.createfactura(client1);
        client1.mostrar_art_orden(client1);

            //Factura del cliente 2
        asist1.createfactura(client2);
        client2.mostrar_art_orden(client2);
    }
}
