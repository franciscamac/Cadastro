
package Atividades;

public class Pokemom {
    private String Tipo;
    private String Nome;
    private int pontoVidas;
    private int pontoAtaques;

    public Pokemom(String Tipo, String Nome, int pontoVidas, int pontoAtaques) {
        this.Tipo = Tipo;
        this.Nome = Nome;
        this.pontoVidas = pontoVidas;
        this.pontoAtaques = pontoAtaques;
    }

    @Override
    public String toString() {
        return "Pokemom{" + "Tipo=" + Tipo + ", Nome=" + Nome + ", pontoVidas=" + pontoVidas + ", pontoAtaques=" + pontoAtaques + '}';
    }
    
    
    
   public void curar(int cura){
       this.pontoVidas += cura;
   }
   public void ataca(Pokemom inimigo){
       int vidaInimigo = inimigo.getPontoVidas();
       vidaInimigo -= this.pontoAtaques;
       inimigo.setPontoVidas(vidaInimigo);
   }
    public int getPontoVidas() {
        return pontoVidas;
    }
    public int getPontoAtaques() {
        return pontoAtaques;
    }
    public String getTipo() {
        return Tipo;
    }
    public String getNome() {
        return Nome;
    }
    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }
    public void setNome(String Nome) {
        this.Nome = Nome;
    }
    public void setPontoVidas(int pontoVidas) {
        this.pontoVidas = pontoVidas;
    }
    public void setPontoAtaques(int pontoAtaques) {
        this.pontoAtaques = pontoAtaques;
    }

}
