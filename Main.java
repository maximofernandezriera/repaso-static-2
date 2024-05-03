public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona("Tomás Navarra", 22);
        Persona p3 = new Persona("Jonás Estacio", 23);
        Persona p4 = new Persona("Máximo", 42);
        System.out.println("Se han creado:" + Persona.getContadorPersonas() + " personas");
    }
}
