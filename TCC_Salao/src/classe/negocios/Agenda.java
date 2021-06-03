package classe.negocios;

import ClasseBD.ConexaoBD;
import classe.objetos.Agendamento;
import classe.objetos.Cliente;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Agenda {
    //agrupamentos
    private ArrayList<Agendamento> agenda;
    private ArrayList<Cliente> cliente;
//    private String [] hora = {"8:00", "8:30", "9:00", "9:30","10:00", "10:30",
//                      "11:00", "11:30", "12:00", "12:30","13:00", "13:30",
//                      "14:00", "14:30", "15:00", "15:30","16:00", "16:30",
//                      "17:00", "17:30", "18:00","18:30", "19:00", "19:30",};
//    //faltam data(String) e atendente(String);
//    //passar qualquer coisa
//    private Cliente cli;
    public Agenda(){
        this.cliente = new ArrayList<Cliente>();
        this.agenda = new ArrayList<Agendamento>();
    }
      
    
    ///////////////////////////////EXP///////////////////////////////
    //Set arrays
    public boolean agendamento(String data){
       classe.objetos.Agendamento agend;
       String query = pesquisaBD(data,"cliente","idcliente");
       ResultSet rs = ConexaoBD.rsexecutar(query);
       try {
            if(rs.next()){
                agend = new classe.objetos.Agendamento( rs.getString(1),                   //id_Agendamento
                                                        rs.getString(2),                   //id_Cliente
                                                        Integer.parseInt(rs.getString(3)), //id_Atendente
                                                        rs.getString(4),                   //dt_Atendimento
                                                        Integer.parseInt(rs.getString(5)), //hr_Atendimento
                                                        rs.getString(6));                  //ds_Atendimento
                agenda.add(agend);
                //Salvando cliente;
                cliente(rs.getString(2));
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Agenda.class.getName()).log(Level.SEVERE, null, ex);
        }
       return false;
    }
    
    public boolean cliente(String id){
        classe.objetos.Cliente cli;
        String query = pesquisaBD(id,"cliente","idcliente");
        ResultSet rs = ConexaoBD.rsexecutar(query);
        try {
            if(rs.next()){
                cli = new classe.objetos.Cliente( rs.getString(1),
                                                  rs.getString(2),
                                                  rs.getString(3),
                                                  rs.getString(4),
                                                  rs.getString(5),
                                                  rs.getString(6));
                cliente.add(cli);
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Agenda.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public boolean exluir(int idList){
        //colocar dados na tela
        //JOptionPane.showConfirmDialog(parentComponent, this);
        //if(){ confirmação
            agenda.get(idList).excluirBD();//depois metodo pra verificar se foi excluido
            agenda.remove(idList);
            cliente.get(idList).excluirBD();
            cliente.remove(idList);
        //}
        return false;
    }
    ///////////////////////////////C\BD//////////////////////////////
    public String pesquisaBD(String texto, String tabela, String campo){
        String q = "SELECT * FROM"+ tabela +"WHERE  ";
        String query = q+campo+"= '"+texto+"'";
        return query;
    }
}
