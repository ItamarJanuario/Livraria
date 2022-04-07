public class CadastroDeLivros {

    public static void main (String[] args){

        Autor autor = new Autor();
        autor.setNome("Rodrigo Turini");
        autor.setEmail("rodrigo.turini@caelun.com.br");
        autor.setCpf("122.541.458.80");

        Livro livro = new LivroFisico(autor);
        livro.setNome("Java 8 Pratico");
        livro.setDescricao("Novos recursos da linguagem");
        livro.setValor(59.90);
        livro.setIsbn("978-85-66250-46-6");


        livro.mostrarDetalhes();

        Autor outroAutor = new Autor();
        outroAutor.setNome("Itamar Januario Lemos Junior");
        outroAutor.setEmail("itamar.lemos@gmail.com");
        outroAutor.setCpf( "122.454.444.10");

        Livro outroLivro = new LivroFisico(outroAutor);
        outroLivro.setNome("Lógica de programação");
        outroLivro.setDescricao("Cire seus primeiros programas");
        outroLivro.setValor(59.90);
        outroLivro.setIsbn("978-85-66250-22-0");

        outroLivro.mostrarDetalhes();



    }
}
