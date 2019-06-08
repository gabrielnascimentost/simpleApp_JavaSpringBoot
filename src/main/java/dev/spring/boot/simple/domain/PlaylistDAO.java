package dev.spring.boot.simple.domain;

import java.util.List;

import dev.spring.boot.simple.model.Playlist;

/**
 * PlaylistDAO
 */
public interface PlaylistDAO {

   void salvar(Playlist playlist);
   List<Playlist> recuperar();
   Playlist recuperarPorID(long id);
   void atualizar(Playlist playlist);
   void excluir(long id);
}