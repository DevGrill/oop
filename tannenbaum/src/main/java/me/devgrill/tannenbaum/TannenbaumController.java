package me.devgrill.tannenbaum;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class TannenbaumController {

    @FXML
    private Button Zeichnen;

    @FXML
    private TextField txt1;

    @FXML
    private TextField txt2;

    @FXML
    private TextField txt3;

    @FXML
    private TextArea Draw;

    @FXML
    void onDraw(ActionEvent event) {
        try {
            String Tree = "";
            int heightOfTrunk = Integer.parseInt(txt1.getText());
            int widthOfTrunk = Integer.parseInt(txt2.getText());
            int heightOfTree = Integer.parseInt(txt3.getText());

            for (int r = 1; r <= heightOfTree; r++) {
                for (int c = heightOfTree - r; c > 0; c--)
                    Tree += (" ");
                for (int d = 1; d <= r; d++)
                Tree += "* ";
                Tree += "\n";
            }

            for (int r = heightOfTree - heightOfTrunk; r <= heightOfTree - 1; r++) {
                Tree += (" ");
                for (int c = heightOfTree - 3; c > widthOfTrunk - 2; c--)
                Tree += " ";
                for (int d = widthOfTrunk; d > 0; d--)
                Tree += "* ";
                Tree += "\n";
            }
            Draw.setText(Tree);
        } catch (Exception e) {
            System.out.println("Bitte versuchen sie es erneut");
        }
    }
}