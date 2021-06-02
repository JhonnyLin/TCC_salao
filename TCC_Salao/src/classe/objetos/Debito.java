package classe.objetos;

public class Debito {

    private int id_Pagamento;
    private int id_Orcamento;

    public Debito(int id_Pagamento, int id_Atendimento) {
        this.id_Pagamento = id_Pagamento;
        this.id_Orcamento = id_Atendimento;
    }

    ///////////////////////////////SET///////////////////////////////
    public boolean setPagamento(int indice) {
        this.id_Pagamento = indice;
        return true;
    }

    public boolean setAtendimento(int indice) {
        this.id_Orcamento = indice;
        return true;
    }

    ///////////////////////////////GET///////////////////////////////
    public int getPagamento() {
        return this.id_Pagamento;
    }

    public int getAtendimento() {
        return this.id_Orcamento;
    }
    ///////////////////////////////EXP///////////////////////////////

    ///////////////////////////////C\BD//////////////////////////////
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
