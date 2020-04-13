package tetris;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.GridPane;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    private Model m;

    @FXML
    private GridPane map;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        setup();
    }

    private void setup() {
        m = new Model();
        initFields();
    }

    /**
     * Initializes the playing field, by adding empty Fields into the GridPane and into the Models Map,
     * using the models width and height properties
     */
    private void initFields() {
        Field[][] map = new Field[this.m.getWidth()][this.m.getHeight()];
        Field temp;
        for (int x = 0; x < this.m.getWidth(); x++){
            for (int y = 0; y < this.m.getHeight(); y++){
                temp = new Field(x,y);
                this.map.add(temp,x,y);
                map[x][y] = temp;
                this.m.setMap(map);
            }
        }
    }

}
