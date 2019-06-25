package hansung.designpatterns.command.party;

public class LightDimDownCommand implements Command {

    Light light;

    int level;
    int powerdown;

    public LightDimDownCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        powerdown = light.getLevel();
        level = powerdown - 10;
        light.dim(level);
    }

    public void undo() {
        light.dim(powerdown);
    }
}
