package br.com.deveduardo.buscalivros.modelos;

import java.time.LocalDate;
import java.util.List;

public class Capa {

    private String titulo;
    private List<String> autores;
    private String editora;
    private String data;
    private String descricao;
    private List<String> categorias;
    private int qntPaginas;

    public Capa(VolumeInfo volumeInfo) {
        this.titulo = volumeInfo.title();
        this.autores = volumeInfo.authors();
        this.editora = volumeInfo.publisher();
        this.data = volumeInfo.publishedDate();
        this.descricao = volumeInfo.description();
        this.categorias = volumeInfo.categories();
        this.qntPaginas = volumeInfo.pageCount();
    }

    public String getTitulo() {
        return titulo;
    }

    public List<String> getAutores() {
        return autores;
    }

    public String getEditora() {
        return editora;
    }

    public String getData() {
        return data;
    }

    public String getDescricao() {
        return descricao;
    }

    public List<String> getCategorias() {
        return categorias;
    }

    public int getQntPaginas() {
        return qntPaginas;
    }


    @Override
    public String toString() {
        return """
            Título: %s
            Autor(es): %s
            Editora: %s
            Data de publicação: %s
            Descrição: %s
            Categorias: %s
            Quantidade de páginas: %d
            """.formatted(
                titulo,
                autores == null ? "Não informado" : String.join(", ", autores),
                editora,
                data,
                descricao,
                categorias == null ? "Não informado" : String.join(", ", categorias),
                qntPaginas
        );
    }

}
