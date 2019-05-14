import Components.Component;
import java.util.ArrayList;

public class Stereo {
    private String name;
    private ArrayList<Component> components;

    public Stereo(String name){
        this.name = name;
        this.components = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addComponent(Component component){
        components.add(component);
    }

    public int countComponents(){
        return components.size();
    }
}
