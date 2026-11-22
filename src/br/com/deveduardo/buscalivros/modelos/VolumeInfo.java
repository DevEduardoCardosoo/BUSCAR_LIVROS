package br.com.deveduardo.buscalivros.modelos;

import java.util.List;

public record VolumeInfo(
        String title,
        List<String> authors,
        String publisher,
        String publishedDate,
        String description,
        int pageCount,
        List<String> categories
) {}
