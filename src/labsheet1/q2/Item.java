package labsheet1.q2;

import java.util.Random;

public class Item {
    private String title;
    private int itemId;

    Random random = new Random();
    public Item(String title) {
        this.title = title;
        this.itemId = random.nextInt();
    }
    public String getTitle() {
        return title;
    }

    public int getItemId() {
        return itemId;
    }
}
