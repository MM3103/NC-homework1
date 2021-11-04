package homework.part2.ball;

import java.util.Objects;

public class Ball {

    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;

    public Ball(float x, float y, int radius, int speed, int direction) {
        if (direction >= -180 && direction <= 180) {
            this.x = x;
            this.y = y;
            this.radius = radius;
            this.xDelta = (float) (speed * Math.cos(direction));
            this.yDelta = (float) (-speed * Math.sin(direction));
        }
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public float getXDelta() {
        return xDelta;
    }

    public void setXDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public float getYDelta() {
        return yDelta;
    }

    public void setYDelta(float yDelta) {
        this.yDelta = yDelta;
    }

    public void move() {
        this.x += this.xDelta;
        this.y += this.yDelta;
    }

    public void reflectHorizontal() {
        this.xDelta *= -1;
    }

    public void reflectVertical() {
        this.yDelta *= -1;
    }

    @Override
    public String toString() {
        return "Ball[(" + x + "," + y + "),speed=(" + xDelta + "," + yDelta + ")]";
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;

        if (!(o instanceof Ball)) {
            return false;
        }

        Ball ball = (Ball) o;

        return Float.compare(ball.x, this.x) == 0 &&
                Float.compare(ball.y, this.y) == 0 &&
                this.radius == ball.radius &&
                Float.compare(ball.xDelta, this.xDelta) == 0 &&
                Float.compare(ball.yDelta, this.yDelta) == 0;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + (int)this.x;
        result = 31 * result + (int)this.y;
        result = 31 * result + this.radius;
        result = 31 * result + (int)this.xDelta;
        result = 31 * result + (int)this.yDelta;
        return result;
    }
}

