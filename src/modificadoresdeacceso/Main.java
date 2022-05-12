package modificadoresdeacceso;

public class Main {
    public static void main(String[] args) {
        Vehiculo v1 = new Vehiculo();
        //llama al constructor por defecto implicito
        v1.Color="amarillo";
        v1.Caballos=180;
        v1.Marca = "Nissan";
        v1.Modelo="Primera";
    }
}
