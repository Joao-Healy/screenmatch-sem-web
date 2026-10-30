package br.com.alura.screenmatch.model;

public enum Categoria {
    ACAO("Action"),
    CRIME("Crime"),
    ROMANCE("Romance"),
    DRAMA("Drama"),
    AVENTURA("Adventure"),
    ANIMACAO("Animation"),
    COMEDIA("Comedy"),
    TERROR("Horror"),
    DOCUMENTARIO("Documentary");

    private String categoriaOMBD;

    Categoria(String categoriaOMBD){
        this.categoriaOMBD = categoriaOMBD;
    }
    public static Categoria fromString(String text) {
        for (Categoria categoria : Categoria.values()) {
            if (categoria.categoriaOMBD.equalsIgnoreCase(text)) {
                return categoria;
            }
        }
        throw new IllegalArgumentException("Nenhuma categoria encontrada para a string fornecida: " + text);
    }
}
