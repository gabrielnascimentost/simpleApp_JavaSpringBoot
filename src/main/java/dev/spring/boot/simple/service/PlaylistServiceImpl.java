package dev.spring.boot.simple.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.spring.boot.simple.model.Playlist;
import dev.spring.boot.simple.DAO.PlaylistDAO;


/**
 * PlaylistServiceImpl
 */
@Service
@Transactional
public class PlaylistServiceImpl implements PlaylistService {

    @Autowired
    private PlaylistDAO playlistDao;

    @Override
    public void salvar(Playlist playlist) {
        playlistDao.salvar(playlist);
    }

    @Override
    public List<Playlist> recuperar() {
        return playlistDao.recuperar();
    }

    @Override
    public Playlist recuperarPorId(long id) {
        return playlistDao.recuperarPorID(id);
    }

    @Override
    public void atualizar(Playlist playlist) {
        playlistDao.atualizar(playlist);
    }

    @Override
    public void excluir(long id) {
        playlistDao.excluir(id);
    }

    
}