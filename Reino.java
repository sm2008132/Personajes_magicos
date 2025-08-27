
class Personaje {

    private String nombre;
    private integer edad;
    private String tipo;

    public Personaje(String nombre, integer edad, String tipo) {
        this.nombre = nombre;
        this.edad = edad;
        this.tipo = tipo;
    }

   
    public String getNombre() {
        return nombre;
    }

    public integer getEdad() {
        return edad;
    }

    public String getTipo() {
        return tipo;
    }

   public void Accion() {
        System.out.println(nombre + " hace algo en el reino.");
    }

  
    public void presentarse() {
        System.out.println("Soy " + nombre + " tengo " + edad + " años y soy " + tipo + ".");
    } 
}
class Gladiador extends Personaje {
    public Gladiador(String nombre, int edad) {
        super(nombre, edad, "Gladiador");
    }

    @Override
    public void Accion() {
        System.out.println(getNombre() + "Pelea duro con su espada.");
    }
}

class Hechizero extends Personaje {
    public Hechizero(String nombre, int edad) {
        super(nombre, edad, "Mago");
    }

    @Override
    public void Accion() {
        System.out.println(getNombre() + " lanza un poder");
    }
}


class Aventurero extends Personaje {
    public Aventurero(String nombre, int edad) {
        super(nombre, edad, "Aventurero");
    }

    @Override
    public void Accion() {
        System.out.println(getNombre() + " explora lugares en el reino");
    }
}

public class Reino {
    public static void main(String[] args) {
       
        Personaje p1 = new Gladiador("Gaitan", 28);
        Personaje p2 = new Hechizero("Zamora", 35);
        Personaje p3 = new Aventurero("Roman", 20);

        
        p1.presentarse();
        p2.presentarse();
        p3.presentarse();

        System.out.println();

        p1.Accion();
        p2.Accion();
        p3.Accion();
    }
}

