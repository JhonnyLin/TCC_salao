package classe.objetos;

public class Agendamento {
    private int id_Cliente;
    private int id_Atendente;
    private String dt_Atendimento;
    private int hr_Atendimento; //enum
    private String ds_Atendimento;
    
    public Agendamento(int id_Cliente, int id_Atendente, String dt_Atendimento,
            int hr_Atendimento, String ds_Atendimento){
        this. id_Cliente =  id_Cliente;
        this.id_Atendente = id_Atendente;
        this.dt_Atendimento = dt_Atendimento;
        this.hr_Atendimento = hr_Atendimento;
        this.ds_Atendimento = ds_Atendimento;
    }
    ///////////////////////////////SET///////////////////////////////
    public boolean setCliente(int indice) {
        this.id_Cliente = indice;
        return true;
    }
    public boolean setAtendente(int indice) {
        this.id_Atendente = indice;
        return true;
    }
    public boolean setHora(int indice) {
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
    public int getCliente(){
        return id_Cliente;
    }
    public int getAtendente(){
        return id_Atendente;
    }
    public String getData(){
        return dt_Atendimento;
    }
    public int getHora(){
        return hr_Atendimento;
    }
    public String getDescricao(){
        return ds_Atendimento;
    }
    ///////////////////////////////EXP///////////////////////////////
    
    ///////////////////////////////C\BD//////////////////////////////
    ///////////////////////////só mandar parametros//////////////////
    //inserir
    public boolean inserir() {
        return false;
    }

    //alterar
    public boolean alterar() {
        return false;
    }

    //excluir
    public boolean excluir() {
        return false;
    }
}
