public class Eleicao {
    int secao;
    int codCandidato;
    int numEleitor;

    Eleicao(){
        this(0,0,0);
    }
    Eleicao(int numSecao, int codDoCandidato, int numDoEleitor){
        secao = numSecao;
        codCandidato = codDoCandidato;
        numEleitor = numDoEleitor;
    }
}