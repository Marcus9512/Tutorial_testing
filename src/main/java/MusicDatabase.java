import java.util.ArrayList;

/**
 * @project tutorial
 * @autor Marcus Jonnson Ewerbring and Diego Leon  on 2020-04-03.
 */
public class MusicDatabase {

    private ArrayList<String> data = new ArrayList<>();

    /**
     * A example function for a database adding files into it's storage
     * @param name
     */
    public void insert(String name) {
        //Insert into database
        data.add(name);
        System.out.println(name+ " was saved in the database");
    }
}

