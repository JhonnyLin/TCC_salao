package classe.objetos;

public class Cliente {
    private String idCliente;
    private String nm_Cliente;
    private String cd_Telefone;
    private String ds_Email;
    private String ds_Endereco;
    private String bl_Sexo_F;
    
    public Cliente(String idCliente,String nm_Cliente, String cd_Telefone, String ds_Email, String ds_Endereco, String bl_Sexo_F){
        this.idCliente = idCliente;
        this.nm_Cliente = nm_Cliente;
        this.cd_Telefone = cd_Telefone;
        this.ds_Email = ds_Email;
        this.ds_Endereco = ds_Endereco;
        this.bl_Sexo_F = bl_Sexo_F;
    }
    
    ///////////////////////////////GET///////////////////////////////
    public String getCod(){
        return idCliente;
    }
    public String getNome(){
        return nm_Cliente;
    }
    public String getTelefone(){
        return cd_Telefone;
    }
    public String getEndereco(){
        return ds_Endereco;
    }
    public String getEmail(){
        return ds_Email;
    }
    public String getFeminino(){
        return bl_Sexo_F;
    }
    
    ///////////////////////////////SET///////////////////////////////
    public void nome(String nome){
        this.nm_Cliente = nome;
    }
    public void telefone(String telefone){
        this.cd_Telefone = telefone;
    }
    public void endereco(String endereco){
        this.ds_Endereco = endereco;
    }
    
    ///////////////////////////////C\BD///////////////////////////////
    

  
    //quary pronta
    public String inserirCli(){
        //definindo a tabela e os campos para inserir
        String q = "INSERT INTO cliente(nm_Cliente,cd_Telefone,ds_Email,ds_Endereco,bl_Sexo_F) ";
        //declaração dos campos
        String nm_Cliente, cd_Telefone, ds_Email, ds_Endereco, bl_Sexo_F;
        //pegando o valor das caixas de texto
        nm_Cliente = getNome();
        cd_Telefone = getTelefone();
        ds_Email= getEmail();
        ds_Endereco = getEndereco();
        bl_Sexo_F = getFeminino();
        //colocando as variaveis na quary
        String a = "VALUES('"+ nm_Cliente +"','"+ cd_Telefone +"','"+ ds_Email +"','"+ ds_Endereco +"',"+ bl_Sexo_F+")";
        //teste
        System.out.println(q+a);
        return q+a;
    }
    //verifica existencia
    public boolean existe(){
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
