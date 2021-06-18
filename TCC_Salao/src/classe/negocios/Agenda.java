package classe.negocios;

import ClasseBD.ConexaoBD;
import classe.genericas.Tabela;
import classe.objetos.Agendamento;
import classe.objetos.Cliente;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Agenda {
    //agrupamentos
    private ArrayList<Agendamento> agenda;
    private Tabela tb ;
    public Agenda(){
        this.agenda = new ArrayList<Agendamento>();
        this.tb = tb = new Tabela();
    }
    
    ///////////////////////////////EXP///////////////////////////////
    //Set arrays
    
    public boolean agendamento(){
        String query = "SELECT id_agendamento, id_cliente, nm_atendente, dt_agendamento, hr_atendimento, ds_adendamento  FROM agendamento";
       classe.objetos.Agendamento agend = null;
       ResultSet rs = ConexaoBD.rsexecutar(query);
       try {
            if(rs.next()){
                query = "SELECT nm_Cliente FROM cliente WHERE idcliente= '"+rs.getString(2) +"'";
                ResultSet rs1 = ConexaoBD.rsexecutar(query);
                while(rs1.next()){
                agend = new classe.objetos.Agendamento( rs.getString(1),                   //id_Agendamento
                                                        rs1.getString(1),                   //nm_Cliente
                                                        rs.getString(3),                    //nm_Atendente
                                                        rs.getString(4),                   //dt_Atendimento
                                                        rs.getString(5),                    //hr_Atendimento
                                                        rs.getString(6));                  //ds_Aten
                    
//                System.out.println("nome"+rs1.getString(1));
                }
//                System.out.println(rs.getString(1));
//                System.out.println(rs.getString(2));
//                System.out.println(rs.getString(3));
//                System.out.println(rs.getString(4));
//                System.out.println(rs.getString(5));
//                System.out.println(rs.getString(6));
                
                agenda.add(agend);
                return true;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Agenda.class.getName()).log(Level.SEVERE, null, ex);
        }
       return false;
    }
    
    public void insTb(Tabela tb){
        for(int i =0; i < agenda.size(); i++){
//            System.out.println("antes");
//            System.err.println(agenda.get(i).getData());
//            System.out.println("depois");
            tb.insAgendamento(agenda.get(i));
        }
    }

    ///////////////////////////////C\BD//////////////////////////////
    public boolean exluirBD(int idList){
        //colocar dados na tela
        //JOptionPane.showConfirmDialog(parentComponent, this);
        //if(){ confirmação
            agenda.get(idList).excluirBD();//depois metodo pra verificar se foi excluido
            agenda.remove(idList);
        //}
        return false;
    }
    
}
