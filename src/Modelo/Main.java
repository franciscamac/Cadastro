
package Modelo;
import Janelas.JanelaPrincipal;
import Janelas.JanelaCadastro;

import Modelo.Banco;
import Modelo.Cliente;
import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();
        /*Cliente c1 = new Cliente("Fran", "fRan123@gmail.com", 1221324324);
        Cliente c2 = new Cliente("narf", "narf123@gmail.com", 1224523234);
        Cliente c3 = new Cliente("Fran", "Fran123@gmail.com", 456556565);
        Banco banco = new Banco();
        
        banco.cadastrar(c1);
        banco.cadastrar(c2);
        banco.cadastrar(c3);
        banco.imprimir();
        System.out.println(""); */
        
        JanelaPrincipal principal = new JanelaPrincipal(banco);
        principal.setExtendedState(JFrame.MAXIMIZED_BOTH);
        principal.setVisible(true); 
    }
}
