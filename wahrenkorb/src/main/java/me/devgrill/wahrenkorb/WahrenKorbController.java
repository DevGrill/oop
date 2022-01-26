package me.devgrill.wahrenkorb;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class WahrenKorbController {

    int allquantity = 0;

    @FXML
    private Button Hinzufügen;

    @FXML
    private TextField Produkt;

    @FXML
    private Text anzahl;

    @FXML
    private TextField quanitiy;

    @FXML
    private Hyperlink wahrenkorb;

    @FXML
    void onAdd(ActionEvent event) {
        try {
            WahrenKorb w = new WahrenKorb(Produkt.getText(), Integer.parseInt(quanitiy.getText()), allquantity);
            w.newProduct();
            allquantity = Integer.parseInt(w.refreshQuantity());
            anzahl.setText(w.refreshQuantity());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
