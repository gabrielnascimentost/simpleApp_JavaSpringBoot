package dev.spring.boot.simple.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.spring.boot.simple.domain.MusicaDAO;
import dev.spring.boot.simple.model.Musica;

/**
 * MusicaServiceImpl
 */
@Service
@Transactional
public class MusicaServiceImpl implements MusicaService {

    @Autowired
    private MusicaDAO musicaDao;

    @Autowired
    private PlaylistService playlistService;


    @Override
    public void salvar(Musica musica, long playlistId) {
        musica.setPlaylist(playlistService.recuperarPorId(playlistId));
        musicaDao.salvar(musica);
    }

    @Override
    public List<Musica> recuperarPorPlaylist(long playlistId) {
        return musicaDao.recuperarPorPlaylist(playlistId);
    }

    @Override
    public Musica recuperarPorPlaylistIdEMusicaId(long playlistId, long musicaId) {
        return musicaDao.recuperarPorPlaylistIdEMusicaId(playlistId, musicaId);
    }

    @Override
    public void atualizar(Musica musica, long playlistId) {
        musica.setPlaylist(playlistService.recuperarPorId(playlistId));
        musicaDao.atualizar(musica);
    }

    @Override
    public void excluir(long playlistId, long musicaId) {
        musicaDao.excluir(recuperarPorPlaylistIdEMusicaId(playlistId, musicaId).getId());
    }

    
}