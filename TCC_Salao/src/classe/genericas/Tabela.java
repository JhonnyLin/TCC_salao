package classe.genericas;

import ClasseBD.ConexaoBD;
import classe.objetos.Item;
import classe.objetos.ItemOrcamento;
import java.sql.ResultSet;
import javax.swing.JTable;
import javax.swing.JTextField;
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
//        System.out.println(query);
        inserir(query, nomes.length);
    }
    
    public void criarTabelas(JTable jTabela, String nomes[]){ 
            jTabela.setModel(dtm);
            for(int i =0; i<nomes.length; i++){
                dtm.addColumn(nomes[i]);
            }
    }
     
    public void limparTabela(JTable jTabela, String nomes[], JTextField txt){
        dtm = new DefaultTableModel();
        criarTabelas(jTabela, nomes);
        txt.setText("");
    }
    public void limparTabela(JTable jTabela, String nomes[]){
        dtm = new DefaultTableModel();
        criarTabelas(jTabela, nomes);
    }

    public boolean inserirItem(Item item){
        String [] row = new String[5];
        row[0] = item.getCodigo();
        row[1] = item.getNome();
        row[2] = "1";
        row[3] = ""+item.getValor();
        row[4] = ""+item.getValor();
        dtm.addRow(row);
        return true;
    }
    
    public boolean inserirItem(ItemOrcamento itemO){
        String [] row = new String[5];
        row[0] = itemO.getCodItem(); //cod
        row[1] = itemO.getNomeItem(); //nome
        row[2] = itemO.getQntdItem();
        row[3] = itemO.getVlUnitario(); //vl un
        row[4] = ""+ Double.parseDouble(itemO.getVlUnitario()) * Double.parseDouble(itemO.getQntdItem()); //vl total
        dtm.addRow(row);
        return true;
    }
    
    public boolean excluir(int x){
        dtm.removeRow(x);
        return true;
    }
    
    public boolean atualizarItem(int x){
        int qntd = Integer.parseInt((String) dtm.getValueAt(x, 2));
        Double valor = Double.parseDouble((String) dtm.getValueAt(x, 3));
        dtm.setValueAt(""+(++qntd), x, 2);
        dtm.setValueAt(""+valor*qntd, x, 4);
        return true;
    }

    public void inserir(String q, int col){
        
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
    
    public String getCod(int linha){
        return (String) dtm.getValueAt(linha, 0);
    }
}
