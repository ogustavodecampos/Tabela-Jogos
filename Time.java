/**
 * (0,5 pts) Time: esta classe modelo deve conter:
 * I. Codigo do time (int)
 * II. Nome do país que representa
 * 
 * @author (Gustavo Campos) 
 * @version (um número da versão ou uma data)
 */
public class Time {
    private int codigo;
    private String pais;

    private int totalPontos;
    private int totalJogos;
    private int totalVitorias;
    private int totalEmpates;
    private int totalDerrotas;
    private int golsPro;
    private int golsContra;
    private int saldoDegol;
    private int aproveitamento;

    public Time(int codigo, String pais) {
        this.codigo = codigo;
        this.pais = pais;

        totalPontos = 0;
        totalJogos = 0;
        totalVitorias = 0;
        totalEmpates = 0;
        totalDerrotas = 0;
        golsPro = 0;
        golsContra = 0;
        saldoDegol = 0;
        aproveitamento = 0;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getTotalPontos() {
        return totalPontos;
    }

    public void setTotalPontos(int totalPontos) {
        this.totalPontos = totalPontos;
    }

    public int getTotalJogos() {
        return totalJogos;
    }

    public void setTotalJogos(int totalJogos) {
        this.totalJogos = totalJogos;
    }

    public int getTotalVitorias() {
        return totalVitorias;
    }

    public void setTotalVitorias(int totalVitorias) {
        this.totalVitorias = totalVitorias;
    }

    public int getTotalEmpates() {
        return totalEmpates;
    }

    public void setTotalEmpates(int totalEmpates) {
        this.totalEmpates = totalEmpates;
    }

    public int getTotalDerrotas() {
        return totalDerrotas;
    }

    public void setTotalDerrotas(int totalDerrotas) {
        this.totalDerrotas = totalDerrotas;
    }

    public int getGolsPro() {
        return golsPro;
    }

    public void setGolsPro(int golsPro) {
        this.golsPro = golsPro;
    }

    public int getGolsContra() {
        return golsContra;
    }

    public void setGolsContra(int golsContra) {
        this.golsContra = golsContra;
    }

    public int getSaldoDegol() {
        return saldoDegol;
    }

    public void setSaldoDegol(int saldoDegol) {
        this.saldoDegol = saldoDegol;
    }

    public int getAproveitamento() {
        return aproveitamento;
    }

    public void setAproveitamento(int aproveitamento) {
        this.aproveitamento = aproveitamento;
    }
}