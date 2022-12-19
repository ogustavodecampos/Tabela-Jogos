/**
 * (2,5 pts) Interface: esta classe deve ser a da aplicação. É nessa classe que devem
    estar as interações com o usuário. Deve prever um menu com as operações
    mencionadas. A cada manipulação de uma partida no sistema, a tabela de
    pontuação deve ser atualizada.
 * 
 * @author (Gustavo Campos) 
 * @version (um número da versão ou uma data)
 */
import java.util.Scanner;
public class Menu 
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nomeT;
        int codTime = 1;
        int codPartida = 0;
        int qtdTimes = 0;
        int qtdPartidas = 0;
        int codExclusaoTime;
        int codExclusaoPartida;
        int opcao = -1; 
        
        System.out.println("***Copa PUCRS***");
        
        Scanner entrada = new Scanner(System.in);
       
        System.out.println("Quantos times irão participar? ");
        qtdTimes = in.nextInt();
        ListaDeTimes objListaTimes = new ListaDeTimes(qtdTimes);
        
        while(opcao != 0){
            System.out.println("Opções: ");
                System.out.println("[1] Criar time.");
                System.out.println("[2] Consultar times.");
                System.out.println("[3] Excluir time.");
                System.out.println("[0] Sair.");
                
                System.out.print("Digite a opcao desejada: ");
                opcao = in.nextInt();
            switch(opcao){
                case 1:
                if(objListaTimes.listaCheia() == true){
                    System.out.println("Lista cheia, apague um time ou tente novamente ano que vem.");
                    break;
                }
                System.out.println("Digite o nome do Time: ");
                nomeT = in.next();
                Time novoTime = new Time(codTime, nomeT);
                codTime++;
                objListaTimes.incluirTime(novoTime);
                break;
            
                case 2: 
                if(objListaTimes.listaVazia() == true){
                    System.out.println("Sem times cadastrados!");
                    break;
                }
                System.out.println("" + objListaTimes.ListaInscritos());
                break;
            
                case 3: 
                System.out.println("Digite o código do time que você deseja excluir: ");
                codExclusaoTime = in.nextInt();
                if(objListaTimes.consultarTime(codExclusaoTime) == true){
                objListaTimes.excluirTime(codExclusaoTime);
                }
                    else System.out.println("Código não encontrado para exclusão!");
                break;
                
                case 0: 
                if(objListaTimes.listaCheia() == true){
                System.out.println("Fase de times fechada!\n");
                }
                    else{
                        System.out.println("\nAinda há vagas disponíveis, insira mais times\n");
                        opcao = -1;
                    }
                break;
                
                default:
                System.out.println("Opcao invalida! Digite novamente: ");
            }
        }
        
        System.out.println("Quantas partidas terão? ");
        qtdPartidas = in.nextInt();
        ListaDePartidas objListaPartidas = new ListaDePartidas(qtdPartidas);
        
         do{
            System.out.println("Opções: ");
            System.out.println("[1] Iniciar Partida.");
            System.out.println("[2] Ver partidas.");
            System.out.println("[3] Excluir  Partida.");
            System.out.println("[0] Sair.");
             
            System.out.print("Digite a opcao desejada: ");
            opcao = in.nextInt();
            switch(opcao){
                case 1:
                    if(objListaPartidas.listaCheia()==true){
                        System.out.println("Lista cheia, apague uma partida ou tente novamente ano que vem.");
                        break;
                    }
                    System.out.println("Digite o dia: ");
                    int diaJogo = in.nextInt();
                    while(diaJogo<1||diaJogo>31){
                        System.out.println("erro");
                        System.out.println("Digite o dia: ");
                        diaJogo = in.nextInt();
                    }
                    System.out.println("Digite o mês - em numero: ");
                    int mesJogo = in.nextInt();
                    while(mesJogo<1||mesJogo>12){
                        System.out.println("erro");
                        System.out.println("Digite o mes: ");
                        mesJogo = in.nextInt();
                    }
                    System.out.println("Digite o ano: ");
                    int anoJogo = in.nextInt();
                    while(anoJogo<1900||anoJogo>9999){
                        System.out.println("erro");
                        System.out.println("Digite o ano: ");
                        anoJogo = in.nextInt();
                    }
                   
                    System.out.println("Digite o código do time 1: ");
                    int codTime1 = in.nextInt();
                    Time armazenaTime1 = null;
                    if(objListaTimes.consultarTime(codTime1) == true){
                        armazenaTime1 = objListaTimes.pegaObjTime(codTime1);
                    }
                    else{
                        while(objListaTimes.consultarTime(codTime1) == false){
                            System.out.println("erro");
                            System.out.println("Digite o código do time 1: ");
                            codTime1 = in.nextInt();
                            if(objListaTimes.consultarTime(codTime1) == true){
                                armazenaTime1 = objListaTimes.pegaObjTime(codTime1);
                            }
                        }
                    }
                    System.out.println("Digite o código do time 2: ");
                    int codTime2 = in.nextInt();
                    Time armazenaTime2 = null;
                    if(objListaTimes.consultarTime(codTime2) == true){
                        armazenaTime2 = objListaTimes.pegaObjTime(codTime2);
                    }
                    else{
                        while(objListaTimes.consultarTime(codTime2) == false){
                            System.out.println("erro");
                            System.out.println("Digite o código do time 1: ");
                            codTime2 = in.nextInt();
                            if(objListaTimes.consultarTime(codTime2) == true){
                                armazenaTime2 = objListaTimes.pegaObjTime(codTime2);
                            }
                        }
                    }
                    
                    
                    System.out.println("Digite a quantidade gols do time 1: ");
                    int qtdGolsTime1 = in.nextInt();
                    while(qtdGolsTime1<0){
                        System.out.println("erro");
                        System.out.println("Digite a quantidade gols do time 1: ");
                        qtdGolsTime1 = in.nextInt();
                    }
                    System.out.println("Digite a quantidade gols do time 2: ");
                    int qtdGolsTime2 = in.nextInt();
                    while(qtdGolsTime2<0){
                        System.out.println("erro");
                        System.out.println("Digite a quantidade gols do time 2: ");
                        qtdGolsTime2 = in.nextInt();
                    }
                    Partida novaPartida = new Partida(armazenaTime1, armazenaTime2, diaJogo, mesJogo, anoJogo, qtdGolsTime1, qtdGolsTime2,
                    codPartida);
                    codPartida++;
                    objListaPartidas.incluirPartida(novaPartida);
                    break;
                
                case 2: 
                    if(objListaPartidas.listaVazia() == true){
                        System.out.println("Sem partidas cadastradas!");
                        break;
                    }
                    System.out.println("" + objListaPartidas.ListaPartidas());              
                    break;
                
                case 3:
                    System.out.println("Digite o código da partida que você deseja excluir: ");
                    codExclusaoPartida = in.nextInt();
                    if(objListaPartidas.consultarPartida(codExclusaoPartida) == true){
                        objListaPartidas.excluirPartida(codExclusaoPartida);
                    }
                        else System.out.println("Código não encontrado para exclusão!");
                    break;
                
                case 0:
                    if(objListaPartidas.listaCheia() == true){
                        System.out.println("Fase de partidas fechada!\n");
                    }
                    else{
                        System.out.println("Ainda há partidas disponíveis, insira mais partidas");
                        opcao=-1;
                    }
                    break;
                
                default: 
                System.out.println("Opcao invalida! Digite novamente: ");
            }
        }while(opcao != 0);
        
        Pontuacao resultadoCopa = new Pontuacao(objListaTimes, objListaPartidas);
        System.out.println("\n***Resultado COPA***" + resultadoCopa.mostraTabela() + "\n");
    }
}