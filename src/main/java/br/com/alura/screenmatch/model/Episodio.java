package br.com.alura.screenmatch.model;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class Episodio {
    private Integer temporada;
    private String titulo;
    private Integer numeroEpisdoio;
    private double avaliacaoEpisodio;
    private LocalDate dataLancamento;

    public Episodio(Integer numeroTemporada, DadosEpisodio dadosEpisodio){
        this.temporada = numeroTemporada;
        this.titulo = dadosEpisodio.titulo();
        this.numeroEpisdoio = dadosEpisodio.episodio();
        try {
            this.avaliacaoEpisodio = Double.valueOf(dadosEpisodio.avaliacao());
        }
        catch (NumberFormatException ex){
            this.avaliacaoEpisodio = 0.0;
        }
        try {
            this.dataLancamento = LocalDate.parse(dadosEpisodio.dataLancamento());
        }
        catch (DateTimeParseException ex) {
            this.dataLancamento = null;
        }
    }

    public Integer getTemporada() {
        return temporada;
    }

    public void setTemporada(Integer temporada) {
        this.temporada = temporada;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getNumeroEpisdoio() {
        return numeroEpisdoio;
    }

    public void setNumeroEpisdoio(Integer numeroEpisdoio) {
        this.numeroEpisdoio = numeroEpisdoio;
    }

    public double getAvaliacaoEpisodio() {
        return avaliacaoEpisodio;
    }

    public void setAvaliacaoEpisodio(double avaliacaoEpisodio) {
        this.avaliacaoEpisodio = avaliacaoEpisodio;
    }

    public LocalDate getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(LocalDate dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    @Override
    public String toString() {
        return "temporada=" + temporada +
               ", titulo='" + titulo + '\'' +
               ", numeroEpisdoio=" + numeroEpisdoio +
               ", avaliacaoEpisodio=" + avaliacaoEpisodio +
               ", dataLancamento=" + dataLancamento;
    }
}