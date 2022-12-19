/**
 * (2,0 pts) Lista de times: classe modelo que deve conter as operações básicas que
   permitam incluir times, excluir times e consultar times.
 * 
 * @author (Gustavo Campos) 
 * @version (um número da versão ou uma data)
 */
public class ListaDeTimes {
    private Time[] times;
    private int index = 0;
    
    public ListaDeTimes(int qtd) {
        if (qtd > 0){
            times = new Time[qtd];
        }
        else {
            times = new Time[6];
        }
    }

    public boolean incluirTime(Time time){
        if (index == times.length){
            return false;
        }
        times[index] = time;
        index++;
        return true;
    }

    public boolean excluirTime(int time){
        for(int i = 0; i < index; i++){
            if(times[i].getCodigo() == time){
                times[i] = null;
                atualizarLista(i);
                index--;
                return true;
            }
        }
        return false;
    }

    public boolean consultarTime(int time){
        for(int i = 0; i < index; i++){
            if(times[i].getCodigo() == time){
                return true;
            }
        }
        return false;
    }

    private void atualizarLista(int indice){
        for(int i = indice; i < index-1; i++ ){
            times[i] = times[i + 1];
            times[i + 1] = null;
        }
    }
    
    public boolean listaCheia(){
        if(index == times.length) return true;
            else return false;
    }
    
    public boolean listaVazia(){
        if(index == 0) return true;
            else return false;
    }
    
    public String ListaInscritos(){
        String inscritos = "";
        for(int i=0; i<index; i++){
            inscritos = inscritos + "\nCodigo: " + times[i].getCodigo() + "\nPaís: " + times[i].getPais() + "\n";
        }
        return inscritos;
    }
    
    public Time pegaObjTime(int codigoTime){
        for(int i=0; i<index; i++){
            if(codigoTime==times[i].getCodigo()) return times[i];
        }
        return null;
    }
    
    public int getIndex(){
        return index;
    }
    
    public Time getTime(int infoTime){
        return times[infoTime];
    }
}