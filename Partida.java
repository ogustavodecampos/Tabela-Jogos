/**
 * (1,0 pt) Partida: esta classe modelo deve conter:
 * I. Código dos 2 times que irão se enfrentar
 * II. Data da partida
 * III. Dados sobre o score.
     
 * @author (Gustavo Campos) 
 * @version (um número da versão ou uma data)
 */
public class Partida {

    private int codigoPartida = 1;
    private Time time1;
    private Time time2;
    private int dia, mes, ano;

    private int golsTime1;
    private int golsTime2;

    public Partida(Time time1, Time time2, int dia, int mes, int ano, int golsTime1, int golsTime2, int codigoPartida) {
        this.time1 = time1;
        this.time2 = time2;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.golsTime1 = golsTime1;
        this.golsTime2 = golsTime2;
        this.codigoPartida = 1 + codigoPartida;
    }

    public int getCodigoPartida() {
        return codigoPartida;
    }
    public Time getTime1() {
        return time1;
    }
    public Time getTime2() {
        return time2;
    }
    public int getGolsTime1() {
        return golsTime1;
    }
    public int getGolsTime2() {
        return golsTime2;
    }
    public int getDia() {
        return dia;
    }
    public int getMes() {
        return mes;
    }
    public int getAno() {
        return ano;
    }
    
    public void setTime1(Time time1) {
        this.time1 = time1;
    }
    public void setTime2(Time time2) {
        this.time2 = time2;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }

    public int ganhador(){
        if(golsTime1 > golsTime2){
            return time1.getCodigo();
        }
        else if(golsTime2 > golsTime1){
            return time2.getCodigo();
        }
        return  -1;
    }
    
    public String toString(){
        return 
        "\nCodigo partida: " + codigoPartida + 
        "\nTime 1: " + time1.getPais() + " Codigo: " + time1.getCodigo() +  " Gols: " + golsTime1 + 
        "\nTime 2: " + time2.getPais() + " Código: " + time2.getCodigo() + " Gols: " + golsTime2 +
        "\nData partida: " + dia + "/" + mes + "/" + ano + 
        "\nVencedor da Partida: " + ganhador() + "\n";   
    }
}
