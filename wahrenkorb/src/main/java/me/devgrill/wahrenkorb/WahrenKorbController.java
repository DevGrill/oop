package me.devgrill.wahrenkorb;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.util.LinkedList;

public class WahrenKorbController {

    int amount = 0;

    @FXML
    private Button hinzufügen;

    @FXML
    private TextField Produkt;

    @FXML
    private Text anzahl;

    @FXML
    private TextField quantity;

    @FXML
    private Hyperlink wahrenkorb;

    LinkedList<OrderItem> orderedItems = new LinkedList<OrderItem>();

    @FXML
    void onAdd(ActionEvent event) {
        try {
            OrderItem item = new OrderItem(Produkt.getText(), Integer.parseInt(quantity.getText()));
            orderedItems.add(item);
            amount++;
            anzahl.setText("(" + Integer.toString(amount) + ")");
            for (int i=0; i<orderedItems.size(); i++)
            {
                System.out.println(orderedItems.get(i));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
