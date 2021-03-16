package classe;

import ClasseBD.ConexaoBD;
import java.sql.ResultSet;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Tabela {
    
    //criei dos metodos para conseguir ativar de outra classe
    //dtm esta se sobreescrevendo, assim consigo mudar a tabela pra serviço ou produto
    private DefaultTableModel dtm = new DefaultTableModel();
    private ResultSet rsresultado ; 
    
    public void criarTabelas(JTable jTabela, String camposBD, String tabelaBD, int prodServ, String nomes[] ){
        //prodServ 1 ou 0 que esta na tabela banco de dados
        // 0 = produtos
        // 1 = Serviços
        String query = "SELECT "+ camposBD +" FROM "+ tabelaBD +" WHERE bl_Serv= '"+prodServ+"'";
        //prepara model para tabela
        dtm = new DefaultTableModel();
        //add as colunas na tabela
        jTabela.setModel(dtm);
        for(int i =0; i<nomes.length; i++){
            //adiciona os nomes no dtm que é o model
            //ele é quem adiciona os dados na tabela
            dtm.addColumn(nomes[i]);
        } 
        inserirST(query, nomes.length);
    }
    
    private void inserirST(String q, int col){
        
        try{
            //a execução do comando será feita pelo método rsexecutar, na classe AcesspBD
            //o retorno do metodo sera um Resulset que sera armazenado em rsresultado
            
            rsresultado = ConexaoBD.rsexecutar(q);
           
            //adicionar as linhas
            //array que guarda os dados de cada linha
            String [] row = new String[col];
            while(rsresultado.next()){
                for(int i=0;i<row.length;i++){
                    //adcionaos dados no array
                    row[i] = rsresultado.getString(i+1);
                }
                //adicionar a linha toda na tabela
                dtm.addRow(row);
            }
        }catch(Exception e){e.printStackTrace();}  
    }
}
