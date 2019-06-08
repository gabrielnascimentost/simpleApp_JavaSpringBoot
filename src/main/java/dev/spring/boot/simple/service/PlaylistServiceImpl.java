package dev.spring.boot.simple.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.spring.boot.simple.domain.*;
import dev.spring.boot.simple.model.Playlist;


/**
 * PlaylistServiceImpl
 */
@Service
@Transactional
public class PlaylistServiceImpl implements PlaylistService {

    @Autowired
    private PlaylistDAO playlistRp;

    @Override
    public void salvar(Playlist playlist) {
        playlistRp.salvar(playlist);
    }

    @Override
    public List<Playlist> recuperar() {
        return playlistRp.recuperar();
    }

    @Override
    public Playlist recuperarPorId(long id) {
        return playlistRp.recuperarPorID(id);
    }

    @Override
    public void atualizar(Playlist playlist) {
        playlistRp.atualizar(playlist);
    }

    @Override
    public void excluir(long id) {
        playlistRp.excluir(id);
    }

    
}