package intro02;

import  modificadoresdeacceso.Vehiculo;
public class Main {
    public static void main(String[] args) {
        Vehiculo v1 = new Vehiculo();
        //Llama al constructor por defecto implicito
        v1.color="amarillo";
        v1.Caballos=180;
        v1.Marca = "Nissan";
        v1.Modelo="Primera";
    }
}
