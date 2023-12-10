package Atividades;
import Atividades.Pokemom;
public class Batalha {
    public static void main(String[] args) {
        Pokemom charizart = new Pokemom("Fogo", "Charizard",120, 500 );
        Pokemom blastoise = new Pokemom("Agua", "blastoise", 100, 500);
        
        charizart.ataca(blastoise);
        blastoise.ataca(charizart);
        charizart.curar(50);
        
        
        System.out.println(blastoise);
        System.out.println(charizart);
        
    }
}
