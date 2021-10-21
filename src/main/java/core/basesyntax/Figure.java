package core.basesyntax;

public abstract class Figure implements Drawable, AreaCalculator {
    private Color color;

    public Figure(Color color) {
        this.color = color;
    }

    public abstract void draw();

    public abstract double getArea();

    public Color getColor() {
        return color;
    }
}
