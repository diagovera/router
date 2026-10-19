public class Main {
    public static void main(String[] args) {

        Router router1 = new Router("Router Principal", "192.168.1.1", 8);
        Router router2 = new Router("Router Oficina", "192.168.0.1", 4);

        System.out.println(" Estado inicial ");
        mostrar(router1);
        mostrar(router2);

        System.out.println();
        System.out.println(" Se enciende solo el router 1 ");
        router1.encender();
        router1.encender();
        mostrar(router1);
        mostrar(router2);

        System.out.println();
        router1.apagar();
        mostrar(router1);
        mostrar(router2);

        System.out.println();
        System.out.println(" Pruebas de validaciones ");

        try {
            router1.setNombre("");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            router1.setDireccionIP("   ");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            router1.setCantidadPuertos(0);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println();
        router1.setDireccionIP("10.0.0.1");
        router1.setCantidadPuertos(16);
        mostrar(router1);
    }

    private static void mostrar(Router r) {
        System.out.println("Router: " + r.getNombre()
                + " | IP: " + r.getDireccionIP()
                + " | puertos: " + r.getCantidadPuertos()
                + " | activo: " + r.isActivo());
    }
}
