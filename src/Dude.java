import java.util.ArrayList;
import java.util.List;

/**
 * Абстрактный пользователь {@link MemWork}, наслаждающийся мемами
 * и рассылающий их своим корешам через час после получения.
 */
public class Dude {
    List<Dude> favorites = new ArrayList<>();

    void addFavorite(Dude recipient) {
        favorites.add(recipient);
    }

    List<Dude> getFavorites() {
        return favorites;
    }

}
