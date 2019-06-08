package dev.spring.boot.simple.service;

import java.util.List;

import dev.spring.boot.simple.model.Playlist;

/**
 * PlaylistService
 */
public interface PlaylistService {

   void salvar(Playlist playlist);
   List<Playlist> recuperar();
   Playlist recuperarPorId(long id);
   void atualizar(Playlist playlist);
   void excluir(long id);
    
}