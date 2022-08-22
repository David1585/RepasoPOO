public class Main {
    public static void main(String[] args) {

        Perro cachorro = new Perro("Ramon","labrador",5);

        System.out.println(cachorro.getNombre());
        System.out.println(cachorro.getRaza());
        System.out.println(cachorro.getEdad());

        cachorro.setNombre("David");
        cachorro.setRaza("Pincher");

        System.out.println(cachorro.getNombre());
        System.out.println(cachorro.getRaza());
        cachorro.setEdad(7);
        System.out.println(cachorro.getEdad());

        /*Se utiliza el constructor vacio*/
        System.out.println("");

        Perro cachorro2 = new Perro();

        cachorro2.setNombre("Daniel");
        cachorro2.setRaza("Golden");
        cachorro2.setEdad(9);

        System.out.println(cachorro2.getNombre());
        System.out.println(cachorro2.getRaza());
        System.out.println(cachorro2.getEdad());

    }
}