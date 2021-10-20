package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements Drowable {
    private int height;
    private int upperSide;
    private int lowerSide;

    public IsoscelesTrapezoid(Color color, int height, int upperSide, int lowerSide) {
        super(color);
        this.height = height;
        this.upperSide = upperSide;
        this.lowerSide = lowerSide;
    }

    @Override
    public void drow() {
        System.out.println("Name: " + getClass().getSimpleName()
                + " Color: " + this.getColor()
                + " Height: " + height + " units."
                + " UpperSide: " + upperSide + " units."
                + " LowerSide: " + lowerSide + " units."
                + " Area: " + getArea() + " sq.units.");
    }

    @Override
    public double getArea() {
        return (double) (upperSide + lowerSide) / 2 * height;
    }
}
