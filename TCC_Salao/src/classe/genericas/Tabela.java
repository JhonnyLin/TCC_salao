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
        inserir(query, nomes.length);
    }
    
    public void criarTabelas(JTable jTabela, String nomes[]){ 
            jTabela.setModel(dtm);
            for(int i =0; i<nomes.length; i++){
                dtm.addColumn(nomes[i]);
            }
    }
    
//    public void confgTabela(String cod, JTextField txt){
//        boolean fdp = true;
//        String q = "SELECT cd_ServProd, nm_ServProd, vl_ServProd FROM servprod WHERE cd_ServProd = '"+cod+"'";
//        if(dtm.getRowCount() != 0){
//            //posso colocar return para melhorar o processamento
//            for(int i =0; i<dtm.getRowCount(); i++ ){
//                if(dtm.getValueAt(i, 0).equals(cod)){
//                    int a = Integer.parseInt(dtm.getValueAt(i, 2).toString());
//                    a++;
//                    dtm.setValueAt(a, i, 2);
//                    fdp = false;
//                    valorQt(i);
//                }
//            }
//        }
//        if(fdp){
//            inserir(q);
//            valorQt(dtm.getRowCount()-1);
//        }
//        somaTotal(txt);
//    }
    
    public void limparTabela(JTable jTabela, String nomes[], JTextField txt){
        dtm = new DefaultTableModel();
        criarTabelas(jTabela, nomes);
        txt.setText("");
    }
    
//    private void somaTotal(JTextField txt){
//        double b = 0;
//        for(int i = 0; i<dtm.getRowCount(); i++){
//            String a = dtm.getValueAt(i, 4).toString();
//            double c = Double.parseDouble(a);
//            b = b + c;
//            txt.setText(""+b);
//        }
//    }
//    
//    private void valorQt(int i){
//        double c = Double.parseDouble(dtm.getValueAt(i, 3).toString());
//        double b = Double.parseDouble(dtm.getValueAt(i, 2).toString());
//        b = b * c;
//        dtm.setValueAt(b, i, 4);
//    }
    
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

//    private void inserir(String q){
//        try{
//            rsresultado = ConexaoBD.rsexecutar(q);
//            String [] row = new String[5];
//            while(rsresultado.next()){
//                int y = 1;
//                for(int i=0;i<row.length;i++){
//                    //adcionaos dados no array
//                    if(i!=2 && i != 4){
//                        row[i] = rsresultado.getString(y);
//                        y++;
//                    }else{
//                        if(i==2){
//                            row[i] = "1";
//                        }
//                    }  
//                }
//                dtm.addRow(row);
//            }
//        }catch(Exception e){e.printStackTrace();}  
//    }
//    
    private void inserir(String q, int col){
        
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
