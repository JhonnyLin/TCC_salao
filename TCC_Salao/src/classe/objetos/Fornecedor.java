package classe.objetos;

public class Fornecedor {
    private String idFornecedor;
    private String CNPJ;
    private String nm_Fornecedor;
    private String ds_Email;
    private String cd_Telefone;    
    private String ds_Endereco;
    
    
    public Fornecedor(String idFornecedor,String CNPJ, String nm_Fornecedor,String ds_Email, String cd_Telefone, String ds_Endereco){
        this.idFornecedor = idFornecedor;
        this.CNPJ = CNPJ;
        this.nm_Fornecedor = nm_Fornecedor;
        this.ds_Email = ds_Email;
        this.cd_Telefone = cd_Telefone;
        this.ds_Endereco = ds_Endereco;
    }
    
    ///////////////////////////////GET///////////////////////////////
    public String getCod(){
        return this.idFornecedor;
    }
    public String nome(){
        return this.nm_Fornecedor;
    }
    public String getCNPJ(){
        return this.CNPJ;
    }
    public String getTelefone(){
        return this.cd_Telefone;
    }
    public String getEmail(){
        return this.ds_Email;
    }
    public String getEndereco(){
        return this.ds_Endereco;
    }
    
    ///////////////////////////////SET///////////////////////////////
    public void nome(String nome){
        this.nm_Fornecedor = nome;
    }
    public void CNPJ(String CNPJ){
        this.CNPJ = CNPJ;
    }
    public void telefone(String telefone){
        this.cd_Telefone = telefone;
    }
    public void email(String email){
        this.ds_Email= email;
    }
    public void endereco(String endereco){
        this.ds_Endereco = endereco;
    }
    
    ///////////////////////////////C\BD///////////////////////////////
    //////////////////////////////OrçBD//////////////////////////////
   
    
//    public void criarTabelas(JTable jTabela, String camposBD, String tabelaBD, int prodServ, String nomes[] ){
//        //prodServ 1 ou 0 que esta na tabela banco de dados
//        // 0 = produtos
//        // 1 = Serviços
//        String query = "SELECT "+ camposBD +" FROM "+ tabelaBD +" WHERE bl_Serv= '"+prodServ+"'";
//        //prepara model para tabela
//        dtm = new DefaultTableModel();
//        //add as colunas na tabela
//        jTabela.setModel(dtm);
//        for(int i =0; i<nomes.length; i++){
//            //adiciona os nomes no dtm que é o model
//            //ele é quem adiciona os dados na tabela
//            dtm.addColumn(nomes[i]);
//        } 
//        inserir(query, nomes.length);
//    }


    //verifica existencia
    public boolean existe(){
        //pesquisar por nome, telefone e email.
        return false;
    }
    //atualizar bd
    public boolean atualizar(){
        return false;
    }
    //inserir bd
    public boolean inserir(){
        //se existir
        if(existe()){
            //colocar nome e telefone  pra vconfirmar ou não a criação
            //JOptionPane.showConfirmDialog(parentComponent, this);
        }
        return false;
    }
    
    //excluir bd
    public boolean excluir(){
        return false;
    }
}
