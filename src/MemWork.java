import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Абстрактная социальная сеть для чтения мемов за 55 минут
 * и их пересылания корешам ещё через 5 минут.
 */
public class MemWork {
    List<Dude> dudes = new ArrayList<>();

    void addEmptyDude() {
        dudes.add(new Dude(dudes.size()));
    }

    public MemWork(int size) {
        IntStream.range(0, size)
                .forEach(i -> addEmptyDude());
    }

    void addFavorites(int senderIndex, int... recipientIndices) {
        Dude d = dudes.get(senderIndex);

        Arrays.stream(recipientIndices)
                .mapToObj(r -> dudes.get(r))
                .forEach(d::addFavorite);
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
