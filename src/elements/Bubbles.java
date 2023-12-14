package elements;

import java.util.ArrayList;
import java.util.List;

public class Bubbles {
    List<Bubble> bubblesList = new ArrayList<>();
    public Bubbles addBubble(Bubble buble){
        bubblesList.add(buble);
        return this;
    }
    public Bubbles addBubble(List<Bubble> bubles){
        bubblesList.addAll(bubles);
        return this;
    }

    public List<Bubble> getBubblesList() {
        return bubblesList;
    }
}
