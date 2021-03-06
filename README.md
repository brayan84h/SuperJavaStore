# SuperJavaStore

Los clientes del SuperJavaStore tienen una membresía que guarda la información del cliente,
adicional tienen dos atributos especiales, el primero es un carrito de compra donde podemos
saber cuales son los artículos que están comprando en el momento. El segundo atributo es un
historial de todas sus compras por orden.
Los artículos, como información de atributo manejan lo básico, un Id, nombre, descripción,
cantidad, precio.
Cuando la información del carrito se transforma en una orden, si el cliente cuenta con la
suscripción VIP se le dará un descuento del .2. El descuento aplica al gran total. Para ser justos
del beneficio dado el .15 de impuesto se le aplicará después de haber otorgado el descuento.
La persona que afecta la orden de compra es un asistente de venta, en la factura queda la
información del asistente que lo proceso. Aparte de eso el asistente mantiene como atributo la
lista de todas las órdenes que él ha efectuado, por lo que es lógico que la orden tenga la
información del cliente.
