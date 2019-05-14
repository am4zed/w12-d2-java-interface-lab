package Components;

public class Radio extends Component{

    public Radio(String make, String model){
        super(make, model);
    }

    public String tune(String station){
        return "You are listening to " + station;
    }
}
