
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;




public class Banco {

    private Connection conexao;
    
    
    
  public Banco(){
    try{ 
      Class.forName("org.mariadb.jdbc.Driver");
      String url="jdbc:mariadb://localhost:3306/empresa";
      String usuario= "root";
      String senha = "";
      this.conexao = DriverManager.getConnection(url,usuario,senha);
        System.out.println("Conexao realizada com sucesso!");
    }catch(ClassNotFoundException ex){
         Logger.getLogger(Banco.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SQLException ex) {
          Logger.getLogger(Banco.class.getName()).log(Level.SEVERE, null, ex);
      }
    
    
  }//fim do banco
  public ArrayList<Cliente> consulta(){
      ArrayList<Cliente> busca = new ArrayList<>();
      String sql = "SELECT * FROM cliente";
        try {
            PreparedStatement instancia = this.conexao.prepareStatement(sql);
            ResultSet resultado = instancia.executeQuery();
            
            while(resultado.next()){
                Cliente c =new Cliente();
                c.setId(resultado.getInt("id"));
                c.setNome(resultado.getString("nome"));
                c.setEmail(resultado.getString("email"));
                c.setTelefone(resultado.getInt("telefone"));
                busca.add(c); 
            }
            return busca;
        } catch (SQLException ex) {
            Logger.getLogger(Banco.class.getName()).log(Level.SEVERE, null, ex);
        }
      return busca;
  }
  public void cadastrar(Cliente c){
      String url = "INSERT INTO cliente (nome, email, telefone)"
              + "VALUES(?,?,?)";

        try {
            PreparedStatement instancia;
            instancia = this.conexao.prepareStatement(url);
            instancia.setString(1, c.getNome());
            instancia.setString(2, c.getEmail());
            instancia.setInt(3, c.getTelefone());
            instancia.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(Banco.class.getName()).log(Level.SEVERE, null, ex);
        }
      
  }
}
