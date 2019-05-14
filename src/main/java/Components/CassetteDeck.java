package Components;

import java.util.ArrayList;

public class CassetteDeck extends Component implements IAddMedia{
    private ArrayList<String> tapeHole;

    public CassetteDeck(String make, String model){
        super(make, model);
        this.tapeHole = new ArrayList<>();
    }

    public void addMedia(String media) {
        tapeHole.add(media);
    }

    public String checkTape(){
        return tapeHole.get(0);
    }
}
