package br.com.deveduardo.buscalivros.modelos;

import java.util.List;

public record RespostaAPI(
        int totalItems,
        List<ItemAPI> items
) {}
