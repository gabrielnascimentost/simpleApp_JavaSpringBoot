package dev.spring.boot.simple.domain;

import java.util.List;

import dev.spring.boot.simple.model.Musica;

/**
 * MusicaDAO
 */
public interface MusicaDAO {
    
    void salvar(Musica musica);
    List<Musica> recuperarPorPlaylist(long playlistId);
    Musica recuperarPorPlaylistIdEMusicaId(long playlistId, long musicaId);
    void atualizar(Musica musica);
    void excluir(long musicaId);
    
}