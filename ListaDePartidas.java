/**
 * Lista de Partidas: classe modelo que deve conter operações básicas que
    permitam incluir, excluir, alterar e consultar partidas.
 * 
 * @author (Gustavo Campos) 
 * @version (um número da versão ou uma data)
 */
public class ListaDePartidas {

    private Partida[] partidas;
    private int index = 0;
    private int codigoPartida;

    public ListaDePartidas(int qtd) {
        if (qtd > 0){
            partidas = new Partida[qtd];

        }
        else {
            partidas = new Partida[1];
        }
    }

    public boolean incluirPartida(Partida partida){
        if (index == partidas.length){
            return false;
        }
        partidas[index] = partida;
        index++;
        return true;
    }

    public boolean excluirPartida(int partida){
        for(int i = 0; i < index; i++){
            if(partidas[i].getCodigoPartida() == partida){
                partidas[i] = null;
                atualizarLista(i);
                index--;
                return true;
            }
        }
        return false;
    }
    
    public boolean alterarPartida(int partida, int dia, int mes, int ano){
        for(int i = 0; i < index; i++){
            if(partidas[i].getCodigoPartida() == partida){
                partidas[i].setDia(dia);
                partidas[i].setMes(mes);
                partidas[i].setAno(ano);
                
                return true;
            }
        }
        return false;
    }
    
    public boolean consultarPartida(int partida){
        for(int i = 0; i < index; i++){
            if(partidas[i].getCodigoPartida() == partida){
                return true;
            }
        }
        return false;
    }

    private void atualizarLista(int indice){
        for(int i = indice; i <= index; i++ ){
            partidas[i] = partidas[i + 1];
            partidas[i + 1] = null;
        }
    }
    
    public boolean listaCheia(){
        if(index == partidas.length) return true;
            else return false;
    }
    
    public boolean listaVazia(){
        if(index == 0) return true;
            else return false;
    }
    
    public String ListaPartidas(){
        String partidasFeitas = "";
        for(int i=0; i<index; i++){
            partidasFeitas = partidasFeitas + partidas[i].toString() + "\n";
        }
        return partidasFeitas;
    }
    
    public int getIndex(){
        return index;
    }
    
    public Partida getPartida(int infoPartida){
    return partidas[infoPartida];
    }
}