package dominio;

public class Persona {
    // Declarando variables

    int annoDeNacimiento;
    int annoActual;
    int Edad;
    

    public Persona(int annoDeNacimiento_, int annoActual_) {
        annoDeNacimiento = annoDeNacimiento_;
        annoActual = annoActual_;
        Edad = annoActual_ - annoDeNacimiento_;
    }
    
    public int getEdad() {
        return Edad;

    }


    public void setEdad(int Edad) {
        Edad = annoActual - annoDeNacimiento;


    }

    // Llevando a cabo el calculo
    public int calcularEdad(int Edad) {
        return Edad;
    }
    
    public String toString() {
        return "La edad de dicha persona es" + Edad;
    }


    public static void main (String args[]) {
        Persona Pepe = new Persona(2004, 2022);
        System.out.println(Pepe);
    }

  
}