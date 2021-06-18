package classe.objetos;

public class Agendamento {
    private String id_Agendamento;
    private String id_Cliente;
    private String id_Atendente;
    private String dt_Atendimento;
    private String hr_Atendimento;
    private String ds_Atendimento;
    
    public Agendamento(String id_Agendamento, String id_Cliente, String id_Atendente, String dt_Atendimento,
            String hr_Atendimento, String ds_Atendimento){
        this.id_Agendamento = id_Agendamento;
        this. id_Cliente =  id_Cliente;
        this.id_Atendente = id_Atendente;
        this.dt_Atendimento = dt_Atendimento;
        this.hr_Atendimento = hr_Atendimento;
        this.ds_Atendimento = ds_Atendimento;
    }
    ///////////////////////////////SET///////////////////////////////
    public boolean setCliente(String indice) {
        this.id_Cliente = indice;
        return true;
    }
    public boolean setAtendente(String indice) {
        this.id_Atendente = indice;
        return true;
    }
    public boolean setHora(String indice) {
        this.hr_Atendimento = indice;
        return true;
    }
    public boolean setData(String data) {
        this.dt_Atendimento = data;
        return true;
    }
    public boolean setDescricao(String descricao) {
        this.ds_Atendimento = descricao;
        return true;
    }
    ///////////////////////////////GET///////////////////////////////
    public String getCliente(){
        return id_Cliente;
    }
    public String getAtendente(){
        return id_Atendente;
    }
    public String getData(){
        return dt_Atendimento;
    }
    public String getHora(){
        return hr_Atendimento;
    }
    public String getDescricao(){
        return ds_Atendimento;
    }
    ///////////////////////////////EXP///////////////////////////////
    
    ///////////////////////////////C\BD//////////////////////////////
    ///////////////////////////só mandar parametros//////////////////
    //inserir
    public String inserirAGD(){
        //definindo a tabela e os campos para inserir
        String q = "INSERT INTO agendamento (id_cliente, nm_atendente, dt_agendamento, hr_atendimento, ds_adendamento) ";
        String a = "VALUES('"+ getCliente() +"', '"+getAtendente() +"' ,'"+ getData()+"','"+ getHora() +"','"+ getDescricao() +"')";
        return q+a;
    }
    
    //excluir
    public boolean excluirBD() {
        return false;
    }
}
