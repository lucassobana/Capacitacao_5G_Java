package Questao2;

public class Main {
    public static void main(String[] args) {
        Kart kart = new Kart("Kart1");
        Motor motor = new Motor(50, 100);
        Piloto piloto = new Piloto("Carlos");

        motor.mostraInfo();

        kart.fazerDrift();
        kart.pular();
        kart.soltarTurbo();

        piloto.soltarSuperPoder();
    }
}
