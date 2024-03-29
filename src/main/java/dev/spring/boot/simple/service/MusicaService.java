package dev.spring.boot.simple.service;

import java.util.List;

import dev.spring.boot.simple.model.Musica;

/**
 * MusicaService
 */
public interface MusicaService {

    void salvar(Musica musica, long playlistId);
    List<Musica> recuperarPorPlaylist(long playlistId);
    Musica recuperarPorPlaylistIdEMusicaId
     (long playlistId, long musicaId);
    void atualizar(Musica musica, long playlistId);
    void excluir(long playlistId, long musicaId);
    
}