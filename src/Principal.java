
import dao.CarroDAO;
import database.Utilitarios;
import java.awt.EventQueue;
import java.sql.Date;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import model.Carro;
import view.JFrameInicial;

/**
 *
 * @author Iara Silva de Oliveira| 2017-08-14
 */
public class Principal {
    
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                JFrameInicial inicial = new JFrameInicial();
            }
        });
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
       /*CarroDAO dao = new CarroDAO();
        Carro peugeot308 = new Carro();
        peugeot308.setNome("308");
        peugeot308.setFabricante("Peugeot");
        peugeot308.setCor("Rose");
        peugeot308.setAnoFabricacao((short)2013);
        peugeot308.setAnoLancamento((short) 2014);
        peugeot308.setEstaFuncionando(true);
        peugeot308.setPermitidaCircular(false);
        peugeot308.setQuantidadeBatidas((byte)13);
        peugeot308.setPlaca("");
        peugeot308.setPotencia(146);
        peugeot308.setDataCompra(new Date (2013,8,24));
        peugeot308.setTipoPneu((short) 17);
        peugeot308.setRenavam(843751798);
        peugeot308.setQuilometragem(18654.15f);
        peugeot308.setQuantidadePortas((byte) 4);
        peugeot308.setChassi("1878-6544-1879-3548-1425");
        peugeot308.setDescricao("O 308 é um modelo familiar médio da Peugeot, o sucesso do"
                + "Peugeot 307. Como de tradição da marca, é o número que sucede o 307. Foi lançado"
                + "recentemente no Brasil. Em 2014, o Peugeot 308 foi eleito o melhor carro do ano na Europa.");
        
        int condigoInserir = dao.inserir(peugeot308);
        if (condigoInserir != Utilitarios.NAO_FOI_POSSIVEL_INSERIR) {
            peugeot308.setId(condigoInserir);
        }else {
            JOptionPane.showMessageDialog(null, "Não foi Possível inserir");
        }
        
        peugeot308.setNome("Gol");
        peugeot308.setFabricante("VW");
        int codigoAlterar = dao.alterar(peugeot308);

        if (codigoAlterar != Utilitarios.NAO_FOI_POSSIVEL_ALTERAR) {
            JOptionPane.showMessageDialog(null, "Alterado com Sucesso");
        }else {
            JOptionPane.showMessageDialog(null, "Deu ruim mano");
        }
       for (int i = 1; i < 40; i++) {
            dao.excluir(i);
        }
        
        ArrayList<Carro> carros = dao.retornarListagem();
        for (Carro carro : carros) {
            System.out.println(carro.getId() + " - " + carro.getNome());
        }*/
    }
 
}
