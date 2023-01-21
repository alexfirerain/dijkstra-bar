import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Абстрактная социальная сеть для чтения мемов за 55 минут
 * и их пересылания корешам ещё через 5 минут.
 */
public class MemWork {
    List<Dude> dudes = new ArrayList<>();

    void addFavorites(int senderIndex, int... recipientIndices) {
        Dude d = dudes.get(senderIndex);

        for (int r : recipientIndices)
            d.addFavorite(dudes.get(r));
    }

    Stream<Dude> dudes() {
        return dudes.stream();
    }

    int size() {
        return dudes.size();
    }

    List<Dude> favoritesOf(int dudeIndex) {
        return dudes.get(dudeIndex).getFavorites();
    }
}
