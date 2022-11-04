package ejercicios_sesion8;

public class main {
    public static void main(String[] args) {
        Persona persona = new Persona();

        persona.setEdad(36);
        persona.setTelefono(1169695436);
        persona.setNombre("Daro");

        System.out.println(persona.getNombre());
        System.out.println(persona.getEdad());
        System.out.println(persona.getTelefono());

    }

    static class Persona {
        private int edad;
        private String nombre;
        private int telefono;

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public void setTelefono(int telefono) {
            this.telefono = telefono;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }



        public int getEdad() {
            return this.edad;
        }

        public int getTelefono() {
            return this.telefono;
        }

        public String getNombre() {
            return this.nombre;
        }
    }
}
