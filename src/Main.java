import java.util.ArrayDeque;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        MemWork memWork = new MemWork(7);
        memWork.addFavorites(0, 1, 3);
        memWork.addFavorites(1, 2, 3);
        System.out.println("Последним мем узрит юзер №" + virusizeMem(memWork, 0));
    }

    static int virusizeMem(MemWork net, int origin) {
        boolean[] seen = new boolean[net.size()];
        Queue<Dude> sentChain = new ArrayDeque<>();

        Dude lastViewer = net.getDude(origin);
        seen[origin] = true;
        sentChain.add(lastViewer);

        while (!sentChain.isEmpty()) {
            lastViewer = sentChain.remove();
            lastViewer.getFavorites().stream()
                    .filter(recipient -> !seen[recipient.getIndex()])
                    .forEach(recipient -> {
                        seen[recipient.getIndex()] = true;
                        sentChain.add(recipient);
                    });
        }
        return lastViewer.getIndex();
    }

}