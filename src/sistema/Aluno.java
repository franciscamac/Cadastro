package sistema;


public class Aluno {
    private String matricula;
    private int idade;
    private String nascimento;

    public String getMatricula() {
        return this.matricula;
    }

    public int getIdade() {
        return this.idade;
    }

    public String getNascimento() {
        return this.nascimento;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    } 

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public Aluno(String matricula, int idade, String nascimento) {
        this.matricula = matricula;
        this.idade = idade;
        this.nascimento = nascimento;
    }
    
    @Override
    public String toString() {
        return "Aluno{" + "matricula=" + matricula + ", idade=" + idade + ", nascimento=" + nascimento + '}';
    }

    
      
public String estudar(String assunto){
    String estudando = ("Estou estudando " +assunto);
    return estudando;
}
public void jogar(){
    System.out.println("Estou jogando");
}
}//fim da classe

