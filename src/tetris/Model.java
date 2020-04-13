package tetris;

import java.util.ArrayList;

public class Model {
    private Field[][] map;
    private int width;
    private int height;

    public Model(){
        this.width =12;
        this.height =24;

        map = new Field[width][height];
    }

    public Field[][] getMap() {
        return map;
    }

    public void setMap(Field[][] map) {
        this.map = map;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
