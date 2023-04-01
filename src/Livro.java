public class Livro extends Item{
    private int anoPublicacao;
    private int nrPaginas;
    private String editora;



    public Livro(String titulo, String autor,int anoPublicacao, int nrPaginas) {
        super(titulo, autor);
        this.anoPublicacao = anoPublicacao;
        this.nrPaginas = nrPaginas;
    }

    //Encapsulamento

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public int getNrPaginas() {
        return nrPaginas;
    }

    public void setNrPaginas(int nrPaginas) {
        this.nrPaginas = nrPaginas;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }
}
