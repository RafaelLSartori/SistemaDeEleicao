public class Cadastro {
    int numeroEleitor;
    String nomeEleitor;
    int secao;

    Cadastro(){
        this(0,"",0);
    }

    Cadastro(int numeroDoEleitor, String nomeDoEleitor, int numSecao){
        numeroEleitor = numeroDoEleitor;
        nomeEleitor = nomeDoEleitor;
        secao = numSecao;
    }
}
