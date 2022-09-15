package task2;

public class Rectangle extends Shape {
    private final float posX;
    private final float posY;
    private final float width;
    private final float height;

    public Rectangle(float posX, float posY, float width, float height, int color) {
        this.posX = posX;
        this.posY = posY;
        this.width = width;
        this.height = height;
        setColor(color);
    }

    @Override
    public void draw() {
        System.out.printf("Рисую прямоугольник с позицией %f, %f, высотой %f, шириной %f и цветом %d%n",
                posX, posY, height, width, getColor());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Float.compare(rectangle.posX, posX) == 0 && Float.compare(rectangle.posY, posY) == 0 && Float.compare(rectangle.width, width) == 0 && Float.compare(rectangle.height, height) == 0;
    }
}
