public class Revista extends Item{
    private int nrEdicao;
    private String editora;

    public Revista(String titulo, String autor,String editora,int nrEdicao) {
        super(titulo, autor);
        this.editora = editora;
        this.nrEdicao = nrEdicao;
    }

    //Encapsulamento

    public int getNrEdicao() {
        return nrEdicao;
    }

    public void setNrEdicao(int nrEdicao) {
        this.nrEdicao = nrEdicao;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }
}
