package org.example;

public class Main {
    public static void main(String[] args) {


        Cliente clienteUno = new Cliente();
        Cliente clienteDos = new Cliente(56,"Samantha",301586445,"cll 57#37 A 5","samantha@gmail.com","2437","girasol","ramo","efectivo","con aleluyas",true);

        System.out.println(clienteUno.getId());
        System.out.println(clienteDos.getId());
        System.out.println(clienteUno.getNombre());
        System.out.println(clienteDos.getNombre());
        System.out.println(clienteUno.getTelefono());
        System.out.println(clienteDos.getTelefono());
        System.out.println(clienteUno.getDireccion());
        System.out.println(clienteDos.getDireccion());
        System.out.println(clienteUno.getCorreo());
        System.out.println(clienteDos.getCorreo());
        System.out.println(clienteUno.getCodigoPostal());
        System.out.println(clienteDos.getCodigoPostal());
        System.out.println(clienteUno.getFlorEscogida());
        System.out.println(clienteDos.getFlorEscogida());
        System.out.println(clienteUno.getEstiloArreglo());
        System.out.println(clienteDos.getEstiloArreglo());
        System.out.println(clienteUno.getTipoPago());
        System.out.println(clienteDos.getTipoPago());
        System.out.println(clienteUno.getInstruccionEspecial());
        System.out.println(clienteDos.getInstruccionEspecial());

        Flor florUno = new Flor();
        Flor florDos = new Flor("orquidea","Oncydium","moradas",5,"Sub familia Epidendroideae","decadas","luz,agua","regalos/medicinales/culinarias",4500,"las bailarinas",true);

        System.out.println(florUno.getTipo());
        System.out.println(florDos.getTipo());
        System.out.println(florUno.getNombre());
        System.out.println(florDos.getNombre());
        System.out.println(florUno.getColor());
        System.out.println(florDos.getColor());
        System.out.println(florUno.getNumeroPetalos());
        System.out.println(florDos.getNumeroPetalos());
        System.out.println(florUno.getClasificacionBotanica());
        System.out.println(florDos.getClasificacionBotanica());
        System.out.println(florUno.getDurabilidad());
        System.out.println(florDos.getDurabilidad());
        System.out.println(florUno.getCuidados());
        System.out.println(florDos.getCuidados());
        System.out.println(florUno.getUsoComun());
        System.out.println(florDos.getUsoComun());
        System.out.println(florUno.getPrecio());
        System.out.println(florDos.getPrecio());
        System.out.println(florUno.getProveedores());
        System.out.println(florDos.getProveedores());


        Repartidor repartidorUno = new Repartidor();
        Repartidor repartidorDos = new Repartidor(85,"javier","martinez","mjavier9@gmail.com","HKA65B","van",85K,"8am/5pm","area metropolitana","whatsapp",true);

        System.out.println(repartidorUno.getId());
        System.out.println(repartidorDos.getId());
        System.out.println(repartidorUno.getNombre());
        System.out.println(repartidorDos.getNombre());
        System.out.println(repartidorUno.getApellido());
        System.out.println(repartidorDos.getApellido());
        System.out.println(repartidorUno.getCorreo());
        System.out.println(repartidorDos.getCorreo());
        System.out.println(repartidorUno.getMatricula());
        System.out.println(repartidorDos.getMatricula());
        System.out.println(repartidorUno.getTipoVehiculo());
        System.out.println(repartidorDos.getTipoVehiculo());
        System.out.println(repartidorUno.getCapacidadCarga());
        System.out.println(repartidorDos.getCapacidadCarga());
        System.out.println(repartidorUno.getHorarioDisponibilidad());
        System.out.println(repartidorDos.getHorarioDisponibilidad());
        System.out.println(repartidorUno.getZonaEntrega());
        System.out.println(repartidorDos.getZonaEntrega());
        System.out.println(repartidorUno.getMetodoComunicacion());
        System.out.println(repartidorDos.getMetodoComunicacion());


        Proveedor proveedorUno=new Proveedor();
        Proveedor proveedorDos=new Proveedor("las bailarinas","fernando","cll 87 # 35 B80","6048593245","lasbailarinassonput4as@gmail.com","100 flores silvestres",9600U,48h,"1 mes","100% rentable");

        System.out.println(proveedorUno.getNombreEmpresa());
        System.out.println(proveedorDos.getNombreEmpresa());
        System.out.println(proveedorUno.getNombreContacto());
        System.out.println(proveedorDos.getNombreContacto());
        System.out.println(proveedorUno.getDireccion());
        System.out.println(proveedorDos.getDireccion());
        System.out.println(proveedorUno.getNumeroTelefono());
        System.out.println(proveedorDos.getNumeroTelefono());
        System.out.println(proveedorUno.getCorreoElectronico());
        System.out.println(proveedorDos.getCorreoElectronico());
        System.out.println(proveedorUno.getDetalleProducto());
        System.out.println(proveedorDos.getDetalleProducto());
        System.out.println(proveedorUno.getPrecio());
        System.out.println(proveedorDos.getPrecio());
        System.out.println(proveedorUno.getTiempoEntrega());
        System.out.println(proveedorDos.getTiempoEntrega());
        System.out.println(proveedorUno.getGarantia());
        System.out.println(proveedorDos.getGarantia());
        System.out.println(proveedorUno.getSostenibilidad());
        System.out.println(proveedorDos.getSostenibilidad());

        




    }
}