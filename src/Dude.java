import java.util.ArrayList;
import java.util.List;

/**
 * Абстрактный пользователь {@link MemWork}, наслаждающийся мемами
 * и рассылающий их своим корешам через час после получения.
 */
public class Dude {
    int index;
    List<Dude> favorites = new ArrayList<>();

    public Dude(int index) {
        this.index = index;
    }

    void addFavorite(Dude recipient) {
        favorites.add(recipient);
    }

    List<Dude> getFavorites() {
        return favorites;
    }

    int getIndex() {
        return index;
    }

}
