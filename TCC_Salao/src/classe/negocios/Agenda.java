package classe.negocios;

import ClasseBD.ConexaoBD;
import classe.genericas.Tabela;
import classe.objetos.Agendamento;
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
        this.tb = new Tabela();
    }
    
    ///////////////////////////////EXP///////////////////////////////
    //Set arrays
    public void limpar(){
        agenda = new ArrayList<Agendamento>();
    }
    
    public boolean agendamento(){
       String query = "SELECT id_agendamento, id_cliente, nm_atendente, dt_agendamento, hr_atendimento, ds_adendamento  FROM agendamento";
       classe.objetos.Agendamento agend = null;
       ResultSet rs = ConexaoBD.rsexecutar(query);
       try {
            while(rs.next()){
                query = "SELECT nm_Cliente FROM cliente WHERE idcliente= '"+rs.getString(2) +"'";
                ResultSet rs1 = ConexaoBD.rsexecutar(query);
                while(rs1.next()){
                agend = new classe.objetos.Agendamento( rs.getString(1),                   //id_Agendamento
                                                        rs1.getString(1),                   //nm_Cliente
                                                        rs.getString(3),                    //nm_Atendente
                                                        rs.getString(4),                   //dt_Atendimento
                                                        rs.getString(5),                    //hr_Atendimento
                                                        rs.getString(6));                  //ds_Aten
                    
                }           
                agenda.add(agend);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Agenda.class.getName()).log(Level.SEVERE, null, ex);
        }
       return false;
    }
    
    public void insTb(Tabela tb){
        for(int i =0; i < agenda.size(); i++){
            tb.insAgendamento(agenda.get(i));
        }
    }
    ///////////////////////////////C\BD//////////////////////////////
    public boolean exluirBD(int idList){
            agenda.get(idList).excluirBD();//depois metodo pra verificar se foi excluido
            agenda.remove(idList);
                       
        return false;
    }
    
}
