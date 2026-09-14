package adopet.api.model;

public enum StatusAdocao {
    AGUARDANDO_AVALIACAO,
    APROVADO,
    REPROVADO;

    public static StatusAdocao AGUARDANDO_AVALIACAO() {
        return AGUARDANDO_AVALIACAO;
    }
}
