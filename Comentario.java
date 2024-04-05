public class Comentario{

    private int numero_linha;
    private String id_video;
    private String comentario;
    private float curtidas;
    private float relatividade;
    
    public Comentario(int numero_linha, String id_video, String comentario, float curtidas, float relatividade) {
        this.numero_linha = numero_linha;
        this.id_video = id_video;
        this.comentario = comentario;
        this.curtidas = curtidas;
        this.relatividade = relatividade;
    }

    public void imprime_conteudo(){

        System.out.println("Comentário(s): " + comentario);
        System.out.println("Curtidas: " + curtidas);
        System.out.println("Relatividade: " + relatividade);

    }

    public void setNumero_linha(int numero_linha) {
        this.numero_linha = numero_linha;
    }

    public void setId_video(String id_video) {
        this.id_video = id_video;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public void setCurtidas(float curtidas) {
        this.curtidas = curtidas;
    }

    public void setRelatividade(float relatividade) {
        this.relatividade = relatividade;
    }

    public int getNumero_linha() {
        return numero_linha;
    }

    public String getId_video() {
        return id_video;
    }

    public String getComentario() {
        return comentario;
    }

    public float getCurtidas() {
        return curtidas;
    }

    public float getRelatividade() {
        return relatividade;
    }


}