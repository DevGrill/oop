package xyz.devgrill.mond;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class MondController {

    String active = "Day";

    @FXML
    private TextField Ausgabe;

    @FXML
    private Button Zeichnen;

    @FXML
    private RadioButton days;

    @FXML
    private RadioButton hours;

    @FXML
    private TextField txt1;

    @FXML
    void DayKlick(ActionEvent event) {
        hours.setSelected(false);
        days.setSelected(true);
        String active = "Day";
    }

    @FXML
    void HoursKlick(ActionEvent event) {
        days.setSelected(false);
        hours.setSelected(true);
        String active = "Hour";
    }

    @FXML
    void onBerechnen(ActionEvent event) {
        try {
            int kmh = Integer.parseInt(txt1.getText());

            switch (active){
                case "Day":
                    int totalDay = 384400 * 24 / kmh;
                    Ausgabe.setText(Integer.toString(totalDay));
                    break;

                case "Hour":
                    int totalHour = 384400 / kmh;
                    Ausgabe.setText(Integer.toString(totalHour));
                    break;
            }

        }catch (Exception e){
            System.out.println("Error");
        }

    }

}
