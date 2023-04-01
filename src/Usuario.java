import java.util.ArrayList;

public class Usuario {
    private String nome;
    private String email;
    private String endereco;
    private ArrayList<Item> listaItems = new ArrayList<>();

    public Usuario(String nome, String email, String endereco) {
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
    }

    //Métodos

    public void emprestar(Item item){
        if(!(listaItems.contains(item)) && item.getDisponivel()){
            listaItems.add(item);
            item.setDisponivel(false);
            System.out.println("O item foi emprestado com sucesso!!");
        }else{
            System.out.println("Este item já foi emprestado!!");
        }
    }

    public void devolver(Item item){
            if(listaItems.contains(item) && !(item.getDisponivel())){
                listaItems.remove(item);
                item.setDisponivel(true);
                System.out.println("O item foi devolvido com sucesso!!");
            }else{
                System.out.println("Erro!! Este item não consta na sua lista de empréstimos :(");
            }
    }

    //Encapsulamento


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public ArrayList<Item> getListaItems() {
        return listaItems;
    }

    public void setListaItems(ArrayList<Item> listaItems) {
        this.listaItems = listaItems;
    }
}
