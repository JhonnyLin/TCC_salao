package classe.genericas;

import ClasseBD.ConexaoBD;

public class Pesquisa {
        
    public boolean pesquisa(String tabela, String texto, String campo){
        String q = "SELECT * FROM"+ tabela + "WHERE  ";
        String query = q+campo+"= '"+texto+"'";
        if(ConexaoBD.rsexecutar(query)!= null){
            return true;
        }
        return false;
    }
    
}
