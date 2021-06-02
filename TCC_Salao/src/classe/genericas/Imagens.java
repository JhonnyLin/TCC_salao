package classe.genericas;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Imagens {
    
    public ImageIcon img(String url){
        ImageIcon imagem = new ImageIcon(getClass().getResource("/img/"+url));
        return imagem;
    }
    
    //mais pra iniciar a pagina
    //ver se da pra paçar um metodo ou dicionario ao envez de 
    public void multiplasImagens(String rotaImg [], JButton btn []){
        for(int i=0; i<rotaImg.length;i++){
            btn[i].setIcon(img(rotaImg[i]));
        }    
    }
}

