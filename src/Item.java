
public class Item {
    protected String titulo;
    protected String autor;
    protected Boolean disponivel = true;

    public Item(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;

    }

    //Encapsulamento

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Boolean getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(Boolean disponivel) {
        this.disponivel = disponivel;
    }
}
