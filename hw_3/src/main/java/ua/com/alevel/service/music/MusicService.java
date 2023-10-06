package ua.com.alevel.service.music;


import ua.com.alevel.entitys.Music;



public interface MusicService {

    public Music create(Music music);
    public Music update(String id,Music music);
    public Music delete(String id);
    public Music find(String id);

}

