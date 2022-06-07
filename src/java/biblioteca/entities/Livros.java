package biblioteca.entities;


public class Livros {
    private String titulo;
    private int paginas;
    private String nomeAutor, genero, editora;
    private int anoPublicacao;
    private boolean emprestado;

    public Livros(String titulo, int paginas, String nomeAutor, String genero, String editora, int anoPublicacao) {
        this.titulo = titulo;
        this.paginas = paginas;
        this.nomeAutor = nomeAutor;
        this.genero = genero;
        this.editora = editora;
        this.anoPublicacao = anoPublicacao;
        this.emprestado = false;
    }
    
    public void emprestar(){
        this.emprestado = true;
    }
    
    public void devolver(){
        this.emprestado = false;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
    
}
