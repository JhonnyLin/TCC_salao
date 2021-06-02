package classe.objetos;

public class Cliente {
    private int idCliente;
    private String nm_Cliente;
    private String cd_Telefone;
    private String ds_Endereco;
    private boolean bl_Sexo_F;
    
    public Cliente(int idCliente,String nm_Cliente, String cd_Telefone, String ds_Endereco, boolean bl_Sexo_F){
        this.idCliente = idCliente;
        this.nm_Cliente = nm_Cliente;
        this.cd_Telefone = cd_Telefone;
        this.ds_Endereco = ds_Endereco;
        this.bl_Sexo_F = bl_Sexo_F;
    }
    
    ///////////////////////////////GET///////////////////////////////
    public int cod(){
        return idCliente;
    }
    public String nome(){
        return nm_Cliente;
    }
    public String telefone(){
        return cd_Telefone;
    }
    public String endereco(){
        return ds_Endereco;
    }
    public boolean feminino(){
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
