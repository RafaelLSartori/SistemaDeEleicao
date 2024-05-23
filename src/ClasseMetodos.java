import javax.swing.*;

public class ClasseMetodos {
    public Cadastro[] FCadastraEleitor(Cadastro[] cadastro){
        for (int i = 0; i < 10; i++){
            cadastro[i].numeroEleitor = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do eleitor: "));
            cadastro[i].nomeEleitor = JOptionPane.showInputDialog("Digite o nome do eleitor: ");
            cadastro[i].secao = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da seção (1, 3, 4, 5, 9, 10): "));
        }
        return cadastro;
    }

    public Eleicao[] FCadastroVotacao(Eleicao[] eleicao){
        for (int i = 0; i < 5; i++){
            eleicao[i].secao = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da seção: "));
            eleicao[i].codCandidato = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do candidato: "));
            eleicao[i].numEleitor = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do eleitor: "));
        }
        return eleicao;
    }

    public void FAgrupaApuracao(Eleicao[] eleicao1, Eleicao[] eleicao2){

    }
    public void PVencedor(){

    }
    public void PSegundoColocado(){

    }
    public void PQtdVotosBranco(){

    }
    public void PQtdVotosNulos(){

    }
    public void PMostraEleitores(){

    }
    public void PMostraApuracao(){

    }
}
