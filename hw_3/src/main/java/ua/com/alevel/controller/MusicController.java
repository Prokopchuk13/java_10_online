package ua.com.alevel.controller;
import ua.com.alevel.entitys.Music;
import ua.com.alevel.service.music.MusicServiceImplementation;


public class MusicController {
    private MusicServiceImplementation service;
    public MusicController(MusicServiceImplementation musicServiceImplementation) {
    service = musicServiceImplementation;

    }
    public Music create (Music music){
        return service.create(music);
    }
    public Music update (String id,Music music){
        return service.update(id, music);
    }
    public Music delete (String id){
        return service.delete(id);
    }
    public Music find (String id){
        return service.find(id);
    }
}