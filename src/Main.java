import javax.swing.JOptionPane;


public class Main {
    public static void main(String[] args){
        ClasseMetodos m = new ClasseMetodos();
        Eleicao eleicao1[] = new Eleicao[5];
        Eleicao eleicao2[] = new Eleicao[5];
        Cadastro cadastro[] = new Cadastro [10];

        for (int i = 0; i < 5; i++){
            eleicao1[i] = new Eleicao();
            eleicao2[i] = new Eleicao();
        }
        for (int i = 0; i < 10; i++){
            cadastro[i] = new Cadastro();
        }

        int opc = 0;
        int opc2 = 0;
        int opc4 = 0;
        while (opc != 9){
            opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Cadastra Eleitor \n 2 - Cadastra Votação 1 e 2 \n 3 - Agrupa Apuração \n 4 - Menu Estatística \n 9 - FIM"));
            switch (opc){
                case 1: cadastro = m.FCadastraEleitor(cadastro);
                    break;
                case 2: while (opc2 != 9){
                    opc2 = Integer.parseInt(JOptionPane.showInputDialog("1 - Cadastro Votação 1 \n 2 - Cadastro Votação 2 \n 9 - FIM"));
                    switch (opc2){
                        case 1: eleicao1 = m.FCadastroVotacao(eleicao1);
                            break;
                        case 2: eleicao2 = m.FCadastroVotacao(eleicao2);
                            break;
                        case 9: JOptionPane.showMessageDialog(null,"Programa finalizado");
                            break;
                        default: JOptionPane.showMessageDialog(null,"Opção Inválida");
                    }
                }
                    break;
                case 3: m.FAgrupaApuracao(eleicao1, eleicao2);
                    break;
                case 4: while (opc4 != 9){
                    opc4 = Integer.parseInt(JOptionPane.showInputDialog("1 - Vencedor \n2 - Segundo colocado\n3 - Quantidade de votos em branco\n4 - Quantidad de votos nulo\n5 - Mostra eleições\n6 - Mostra apuração\n9 - FIM"));
                    switch(opc){
                        case 1: m.PVencedor();
                            break;
                        case 2: m.PSegundoColocado();
                            break;
                        case 3: m.PQtdVotosBranco();
                            break;
                        case 4: m.PQtdVotosNulos();
                            break;
                        case 5: m.PMostraEleitores();
                            break;
                        case 6: m.PMostraApuracao();
                            break;
                        case 9: JOptionPane.showMessageDialog(null,"Programa finalizado");
                    }
                }
                    break;
                case 9: JOptionPane.showMessageDialog(null,"Programa finalizado");
                    break;
                default: JOptionPane.showMessageDialog(null,"Opção Inválida");
            }
        }
    }
}