package hansung.designpatterns.decorator.starbuzzalternative;

public class Beverage {
    String description;
    boolean milk;
    boolean soy;
    boolean mocha;
    boolean whip;

    public String getDescription() { return description; }
    public double cost() {
        double cost = 0.0;
        if (hasMilk())
            cost += .10;
        if (hasSoy())
            cost += .15;
        if (hasMocha())
            cost += .20;
        if (hasWhip())
            cost += .10;
        return cost;
    }

    public boolean hasMilk() { return milk; }
    public void setMilk(boolean decision) { this.milk = decision; }
    public boolean hasSoy() { return soy; }
    public void setSoy(boolean decision) { this.soy = decision; }
    public boolean hasMocha() { return mocha; }
    public void setMocha(boolean decision) { this.mocha = decision; }
    public boolean hasWhip() { return whip; }
    public void setWhip(boolean decision) { this.whip = decision; }

}
