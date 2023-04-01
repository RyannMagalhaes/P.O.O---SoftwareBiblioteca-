public class Main {
    public static void main(String[] args) {
        Usuario u1 = new Usuario("João Pedro","joaop@gmail.com","Rua das flores 121");
        Usuario u2 = new Usuario("Mariana Silva","mariSilva21@hotmail.com","Rua das árvores 240");
        Usuario u3 = new Usuario("Felipe Pereira","felipepe@yahoo.com","Rua da grama 280");

        Livro l1 = new Livro("Almanaque dos carros","Mark Ronson",2005,155);
        Livro l2 = new Livro("Antes da Tempestade","Christie Golden",2011,319);
        Livro l3 = new Livro("O herói Perdido","Rick Riordan",2011,359);

        Revista r1 = new Revista("Turma da monica Jovem","Mauricio de Souza","Panini",50);
        Revista r2 = new Revista("Menino Maluquinho","Ziraldo","Melhoramentos",16);
        Revista r3 = new Revista("Recreio","Mauricio de Souza","Caras",114);

        Dvd d1 = new Dvd("Harry Potter e o cálice de fogo","J.K Rolling","Aventura/Fantasia",2.15);
        Dvd d2 = new Dvd("Kill Bill vol 1","Quentin Tarantino","Ação",2.30);
        Dvd d3 = new Dvd("Kill Bill vol 2","Quentin Tarantino","Ação",2.19);


        //Empréstimos
        u1.emprestar(l1);
        u1.emprestar(r1);
        u1.emprestar(d1);

        u2.emprestar(l2);
        u2.emprestar(r2);
        u2.emprestar(d2);

        //Tentativa de empréstimo de Item já emprestado:
        u3.emprestar(l1);
        //----------//

        u3.emprestar(r3);
        u3.emprestar(d3);

        //Devoluções
        u1.devolver(l1);
        //Tentativa de devolução de Item já emprestado:
        u1.devolver(l1);
        //----------//

        u1.devolver(d1);

        u2.devolver(l2);
        u2.devolver(d2);
        u3.devolver(r3);
        u3.devolver(d3);

    }
}