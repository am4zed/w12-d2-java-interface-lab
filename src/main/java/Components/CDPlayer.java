package Components;

import java.util.ArrayList;

public class CDPlayer extends Component implements IAddMedia{
    private ArrayList<String> cdTray;

    public CDPlayer (String make, String model){
        super(make, model);
        this.cdTray = new ArrayList<>();
    }

    public void addMedia(String media) {
        cdTray.add(media);
    }

    public String checkCD(){
        return cdTray.get(0);
    }
}
