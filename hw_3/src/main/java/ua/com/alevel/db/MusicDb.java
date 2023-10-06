package ua.com.alevel.db;
import ua.com.alevel.Utils.Utils;
import ua.com.alevel.entitys.Music;
import java.util.Arrays;


public class MusicDb {

    private Music[] musicAlb = new Music[10];
    private int lastIndex = 0;

    public Music create(Music music) {

        if (lastIndex == musicAlb.length) {
            musicAlb = Arrays.copyOf(musicAlb, ((music.length * 3) / 2) + 1);
        }
        add(music);
    return music;
    }

    private void add(Music music) {
        music.setId(Utils.generateId());
        musicAlb[lastIndex] = music;
        lastIndex++;
    }


    public Music find(String id) {
        Music target = null;
        for(Music element: musicAlb){
            if (element != null) {
                if(element.getId().equals(id)){
                    target = element;
                    break;
                }
            }
        }
        return target;
    }

    public void update(String  id, Music music) {
        for (int i = 0; i < musicAlb.length; i++) {
            if (musicAlb[i] != null){
                if (musicAlb[i].getId().equals(id)) {
                    musicAlb[i] = music;
                    break;
                }
            }
        }
    }
    public void delete(String id) {
        int deleteIndex = 0;
        Music[] updatedMusicArray = new Music [musicAlb.length - 1];
        for(int i = 0; i < musicAlb.length; i++){
            if(musicAlb[i].getId().equals(id)){
                musicAlb[i] = null;
                deleteIndex = i;
                break;
            }
        }
        for(int i = 0; i < deleteIndex; i++){
            updatedMusicArray[i] = musicAlb[i];
        }
        for(int i = deleteIndex; i < updatedMusicArray.length; i++){
            updatedMusicArray[i] = musicAlb[i + 1];
        }
        musicAlb = updatedMusicArray;
    }
}
