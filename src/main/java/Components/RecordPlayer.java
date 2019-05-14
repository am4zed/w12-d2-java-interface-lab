package Components;

import java.util.ArrayList;

public class RecordPlayer extends Component implements IAddMedia {
    private ArrayList<String> turntable;

    public RecordPlayer(String make, String model){
        super(make, model);
        this.turntable = new ArrayList<>();
    }

    public void addMedia(String media) {
        turntable.add(media);
    }

    public String checkRecord(){
        return turntable.get(0);
    }
}
