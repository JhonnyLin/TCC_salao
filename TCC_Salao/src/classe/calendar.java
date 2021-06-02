package classe;

import java.util.Calendar;

public class calendar {
    public calendar(){
    
    }
    public boolean dataValida(Calendar agenda){
        //data de hoje padral singleton
        Calendar hoje = Calendar.getInstance();
        if(hoje.getTimeInMillis() <= agenda.getTimeInMillis()){
            System.err.println("foi poha");
            return true;
        }
//        else if(){
//            return true;
//        }
//        System.out.println(hoje.getTimeInMillis());
//        System.out.println(hoje.get(Calendar.HOUR_OF_DAY));
//        System.out.println(hoje.get(Calendar.MINUTE));
//        formatData(agenda);
        return false;
    }
    public String formatData(Calendar calaendar){
        String data = null;
        //Calendar a = data.getCalendar();
        int ano = calaendar.get(Calendar.YEAR); 
        int mes = calaendar.get(Calendar.MONDAY);
        int dia = calaendar.get(Calendar.DAY_OF_MONTH);
        data = dia+"/"+(mes+1)+"/"+ano;
        return data;
    }
}
