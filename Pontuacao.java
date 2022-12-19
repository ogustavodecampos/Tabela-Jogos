 /**
 * (2,0 pts) Pontuação: esta classe deve guardar a pontuação dos times. Prever
    operações que permitam a atualização dos pontos. Deve ser representada por
    uma matriz numérica, onde cada coluna corresponde a:
        ▪ Codigo do time,
        ▪ total de pontos (P),
        ▪ total de jogos (J),
        ▪ total de vitórias (V),
        ▪ total de empates (E),
        ▪ total de derrotas(D),
        ▪ gols pró (GP),
        ▪ gols contra (GC),
        ▪ saldo de gols (SG) e
        ▪ aproveitamento (%)
        
 // * @author (Gustavo Campos) 
 * @version (um número da versão ou uma data)
 */
public class Pontuacao {
    double [][] pontuacao;
    
    public Pontuacao(ListaDeTimes tabela, ListaDePartidas informacoes){
        pontuacao = new double [tabela.getIndex()][10];
        
        for(int i=0; i<tabela.getIndex(); i++){
           Time infoTime = tabela.getTime(i); 
           pontuacao[i][0] = infoTime.getCodigo();
           pontuacao[i][1] = infoTime.getTotalPontos();
           pontuacao[i][2] = infoTime.getTotalJogos();
           pontuacao[i][3] = infoTime.getTotalVitorias();
           pontuacao[i][4] = infoTime.getTotalEmpates();
           pontuacao[i][5] = infoTime.getTotalDerrotas();
           pontuacao[i][6] = infoTime.getGolsPro();
           pontuacao[i][7] = infoTime.getGolsContra();
           pontuacao[i][8] = infoTime.getSaldoDegol();
           pontuacao[i][9] = infoTime.getAproveitamento();
        }
        
        for(int i=0; i<informacoes.getIndex(); i++){
            Partida aux = informacoes.getPartida(i);
            for(int j=0; j<tabela.getIndex(); j++){
                if(pontuacao[j][0] == aux.getTime1().getCodigo())
                {
                    pontuacao[j][6] = pontuacao[j][6] + aux.getGolsTime1();
                    pontuacao[j][7] = pontuacao[j][7] + aux.getGolsTime2();
                    
                    if(aux.ganhador()==pontuacao[j][0]){
                        pontuacao[j][1]+=3;
                        pontuacao[j][3]++;
                    }
                    
                    else if(aux.ganhador()==-1){
                        pontuacao[j][1]++;
                        pontuacao[j][4]++;
                    }
                    
                    else pontuacao[j][5]++;
                    
                    pontuacao[j][2] = pontuacao[j][3] + pontuacao[j][4] + pontuacao[j][5];
                    pontuacao[j][8] = pontuacao[j][6] - pontuacao[j][7];
                    setAproveitamento(j);
                }
                
                 if(pontuacao[j][0] == aux.getTime2().getCodigo())
                {
                    pontuacao[j][6] = pontuacao[j][6] + aux.getGolsTime2();
                    pontuacao[j][7] = pontuacao[j][7] + aux.getGolsTime1();
                    
                    if(aux.ganhador()==pontuacao[j][0]){
                        pontuacao[j][1]+=3;
                        pontuacao[j][3]++;
                    }
                    
                    else if(aux.ganhador()==-1){
                        pontuacao[j][1]++;
                        pontuacao[j][4]++;
                    }
                    
                    else pontuacao[j][5]++;
                    
                    pontuacao[j][2] = pontuacao[j][3] + pontuacao[j][4] + pontuacao[j][5];
                    pontuacao[j][8] = pontuacao[j][6] - pontuacao[j][7];
                    setAproveitamento(j);
                }
            }
        }
    }
    
    public void setAproveitamento(int index){
        pontuacao[index][9] = pontuacao[index][1] / (pontuacao[index][2] * 3.0) * 100;
    }
    
    public String mostraTabela(){
        String resultadoFinal = "";
        for(int i = 0; i<pontuacao.length; i++){
               resultadoFinal = resultadoFinal + 
               "\n\nCódigo: " + pontuacao[i][0] + " | Total pontos: " + pontuacao[i][1] + 
               " | Total jogos: " + pontuacao[i][2] + " | Total Vitórias: " + pontuacao[i][3] + " | Total Empates: " + pontuacao[i][4] + 
               " | Total Derrotas: " + pontuacao[i][5] + " | Gols Pró: " + pontuacao[i][6] + " | Gols Sofridos: " + pontuacao[i][7] +
               " | Saldo Gols: " + pontuacao[i][8] + " | Aproveitamento: " + pontuacao[i][9] + "\n"; 
        }
        return resultadoFinal;
    }
}