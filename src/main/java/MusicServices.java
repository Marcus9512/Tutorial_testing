import java.util.ArrayList;

/**
 * @project tutorial
 * @autor Marcus Jonnson Ewerbring and Diego Leon  on 2020-04-03.
 */
public class MusicServices {

    private MusicDatabase musicDatabase = new MusicDatabase();
    private ArrayList<String> savedMusic = new ArrayList<>();

    /**
     * Example save method that uses the example API musicdatabase to save names of songs
     * @param name
     * @return
     */
    public boolean save(String name) {
        musicDatabase.insert(name);
        savedMusic.add(name);
        System.out.println(name + " is now saved");
        return savedMusic.contains(name);
    }
}




