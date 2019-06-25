package hansung.designpatterns.command.party;

public class LightDimUpCommand implements Command {

    Light light;

    int powerup;
    int level;

    public LightDimUpCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        powerup = light.getLevel();
        level = powerup + 10;

        if (level > 100){
            System.out.println(	"The maximum brightness has been exceeded.");
        }
        else {
            light.dim(level);
        }

    }

    public void undo() {
        light.dim(powerup);
    }
}