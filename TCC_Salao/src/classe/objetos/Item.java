package classe.objetos;



public class Item {
    
    private String cd_ServProd;
    private String bl_Serv;
    private String nm_ServProd;
    private String ds_ServProd;
    private String vl_ServProd;
    private String vl_ServProd_Custo; //criar coluna
    private String qt_prod;
    
    public Item(String cd_ServProd, String bl_Serv,String nm_ServProd,
            String ds_ServProd, String vl_ServProd, String qt_prod, String vl_ServProd_Custo){
        this.cd_ServProd = cd_ServProd;
        this.bl_Serv = bl_Serv;
        this.nm_ServProd = nm_ServProd;
        this.ds_ServProd = ds_ServProd;
        this.vl_ServProd = vl_ServProd;
        this.vl_ServProd_Custo = vl_ServProd_Custo; //passar vazio
        this.qt_prod = qt_prod; 
        
    }
    ///////////////////////////////SET///////////////////////////////
    public void servico(String servico){
        this.bl_Serv = servico;
    }
    public void codigo(String cd_ServProd){
        this.cd_ServProd = cd_ServProd;
    }
    public void nome(String nm_ServProd){
        this.nm_ServProd = nm_ServProd;
    }
    public void descricao(String ds_ServProd){
        this.ds_ServProd = ds_ServProd;
    }
    public void valor(String vl_ServProd){
        this.vl_ServProd = vl_ServProd;
    }
    public void valorCusto(String vl_ServProd_Custo){
        this.vl_ServProd_Custo = vl_ServProd_Custo;
    }
    public void quantidade(String qt_Prod){
        this.qt_prod = qt_Prod;
    }
    
    ///////////////////////////////GET///////////////////////////////   
    public String getServico(){
        return this.bl_Serv;
    }
    public String getCodigo(){
        return this.cd_ServProd;
    }
    public String getNome(){
        return this.nm_ServProd;
    }
    public String getDescricao(){
        return this.ds_ServProd;
    }
    public String getValor(){
        return this.vl_ServProd;
    }
    public String getValorCusto(){
        return this.vl_ServProd_Custo;
    }
    public String getQuantidade(){
        return this.qt_prod;
    }
      
    ///////////////////////////////C\BD///////////////////////////////
    //Inserir banco
    public boolean inserirBD(){
        return false;
    }
    //Atualizar banco
    public boolean atualizarBD(){
        return false;
    }
    //Excluir banco
    public boolean excluirBD(){
        return false;
    }
}
