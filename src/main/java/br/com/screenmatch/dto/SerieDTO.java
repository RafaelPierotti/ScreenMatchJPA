package br.com.screenmatch.dto;

import br.com.screenmatch.model.Categoria;
import br.com.screenmatch.model.Episodio;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

public record SerieDTO(Long id,
                       String titulo,
                       Integer totalTemporadas,
                       Double avaliacao,
                       Categoria genero,
                       String atores,
                       String poster,
                       String sinopse){
}
