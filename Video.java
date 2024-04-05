public class Video{

    private int numero;
    private String titulo;
    private int id_video;
    private int dt_publicacao;
    private String administrador;
    private float quantidade_curtidas;
    private float quantidade_comentarios;
    private float visualizacoes;
    private Comentario comentario;

    public Video(int numero, String titulo, int id_video, int dt_publicacao, String administrador,
            float quantidade_curtidas, float quantidade_comentarios, float visualizacoes, Comentario comentario) {

        this.numero = numero;
        this.titulo = titulo;
        this.id_video = id_video;
        this.dt_publicacao = dt_publicacao;
        this.administrador = administrador;
        this.quantidade_curtidas = quantidade_curtidas;
        this.quantidade_comentarios = quantidade_comentarios;
        this.visualizacoes = visualizacoes;
        this.Comentario = comentario;

    }

    public imprime_tudo(){

        System.out.println("Título do vídeo: " + titulo);
        System.out.println("Identificador do vídeo: " + id_video);
        System.out.println("Data da publicação: " + dt_publicacao);
        System.out.println("Administrador: " + administrador);
        System.out.println("Quantidade de curtidas: " + quantidade_curtidas);
        System.out.println("Quantidade de comentários: " + quantidade_comentarios);
        System.out.println("Quantidade de visualizações: " + visualizacoes);
        comentario.imprime_conteudo();

    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setId_video(int id_video) {
        this.id_video = id_video;
    }

    public void setDt_publicacao(int dt_publicacao) {
        this.dt_publicacao = dt_publicacao;
    }

    public void setAdministrador(String administrador) {
        this.administrador = administrador;
    }

    public void setQuantidade_curtidas(float quantidade_curtidas) {
        this.quantidade_curtidas = quantidade_curtidas;
    }

    public void setQuantidade_comentarios(float quantidade_comentarios) {
        this.quantidade_comentarios = quantidade_comentarios;
    }

    public void setVisualizacoes(float visualizacoes) {
        this.visualizacoes = visualizacoes;
    }

    public int getNumero() {
        return numero;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getId_video() {
        return id_video;
    }

    public int getDt_publicacao() {
        return dt_publicacao;
    }

    public String getAdministrador() {
        return administrador;
    }

    public float getQuantidade_curtidas() {
        return quantidade_curtidas;
    }

    public float getQuantidade_comentarios() {
        return quantidade_comentarios;
    }

    public float getVisualizacoes() {
        return visualizacoes;
    }

}