package task2;

public class Circle extends Shape {
    private final float posX;
    private final float posY;
    private final float radius;

    public Circle(float posX, float posY, float radius, int color) {
        this.posX = posX;
        this.posY = posY;
        this.radius = radius;
        setColor(color);
    }

    @Override
    public void draw() {
        System.out.printf("Рисую круг с позицией %f, %f, радиусом %f, и цветом %d%n", posX, posY, radius, getColor());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Float.compare(circle.posX, posX) == 0 && Float.compare(circle.posY, posY) == 0 && Float.compare(circle.radius, radius) == 0;
    }
}
