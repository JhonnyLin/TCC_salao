package classe.objetos;

public class Item {
    
    private int cd_ServProd;
    private boolean bl_Serv;
    private String nm_ServProd;
    private String ds_ServProd;
    private double vl_ServProd;
    private double vl_ServProd_Custo;
    private int qt_prod;
    
    public Item(int cd_ServProd, boolean bl_Serv,String nm_ServProd,
            String ds_ServProd, double vl_ServProd, int qt_prod, double vl_ServProd_Custo){
        this.cd_ServProd = cd_ServProd;
        this.bl_Serv = bl_Serv;
        this.nm_ServProd = nm_ServProd;
        this.ds_ServProd = ds_ServProd;
        this.vl_ServProd = vl_ServProd;
        //se for produto
        if(!this.bl_Serv){
            this.vl_ServProd_Custo = vl_ServProd_Custo;
            this.qt_prod = qt_prod;
        }
        
    }
    ///////////////////////////////SET///////////////////////////////
    public void servico(boolean servico){
        this.bl_Serv = servico;
    }
    public void codigo(int cd_ServProd){
        this.cd_ServProd = cd_ServProd;
    }
    public void nome(String nm_ServProd){
        this.nm_ServProd = nm_ServProd;
    }
    public void descricao(String ds_ServProd){
        this.ds_ServProd = ds_ServProd;
    }
    public void valor(double vl_ServProd){
        this.vl_ServProd = vl_ServProd;
    }
    public void valorCusto(double vl_ServProd_Custo){
        this.vl_ServProd_Custo = vl_ServProd_Custo;
    }
    public void quantidade(int qt_Prod){
        this.qt_prod = qt_Prod;
    }
    
    ///////////////////////////////GET///////////////////////////////   
    public Boolean servico(){
        return this.bl_Serv;
    }
    public Integer codigo(){
        return this.cd_ServProd;
    }
    public String nome(){
        return this.nm_ServProd;
    }
    public String descricao(){
        return this.ds_ServProd;
    }
    public Double valor(){
        return this.vl_ServProd;
    }
    public Double valorCusto(){
        return this.vl_ServProd_Custo;
    }
    public Integer quantidade(){
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
