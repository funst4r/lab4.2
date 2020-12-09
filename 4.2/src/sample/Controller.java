package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private RadioButton f2;

    @FXML
    private TextField func;

    @FXML
    private RadioButton f1;

    @FXML
    private Button mc;

    @FXML
    private Button mPlus;

    @FXML
    private TextField x;

    @FXML
    private TextField y;

    @FXML
    private TextField z;

    @FXML
    private TextField m;

    @FXML
    void initialize() {
        x.textProperty().addListener((observable, oldValue, newValue) -> {
            if (!newValue.matches("[-+]{0,1}\\d{0,7}([.]\\d{0,4})?")) {
                x.setText(oldValue);
            }
        });
        y.textProperty().addListener((observable, oldValue, newValue) -> {
            if (!newValue.matches("[-+]{0,1}\\d{0,7}([.]\\d{0,4})?")) {
                y.setText(oldValue);
            }
        });
        z.textProperty().addListener((observable, oldValue, newValue) -> {
            if (!newValue.matches("[-+]{0,1}\\d{0,7}([.]\\d{0,4})?")) {
                z.setText(oldValue);
            }
        });
        m.setText("0");
        func.setText("0");
    }

    double mem;

    @FXML
    void mPlus() {
        mem+= Double.parseDouble(func.getText());
        m.setText(Double.toString(mem));
    }

    @FXML
    void mc() {
        mem=0;
        m.setText(Double.toString(mem));
    }

    private double toDouble(String s) {
        if (s.isEmpty() || s.charAt(s.length()-1) == '.' || s.charAt(s.length()-1) == '-' || s.charAt(s.length()-1) == '+') {
            return Double.parseDouble(s+"0");
        } else
            return Double.parseDouble(s);
    }

    @FXML
    void calc() {
        if (f1.isSelected())
            func.setText(
                    Double.toString(
                            Function.f1(
                                    toDouble(x.getText()),
                                    toDouble(y.getText()),
                                    toDouble(z.getText())
                            )
                    )
            );
        else
            func.setText(
                    Double.toString(
                            Function.f2(
                                    toDouble(x.getText()),
                                    toDouble(y.getText()),
                                    toDouble(z.getText())
                            )
                    )
            );
    }
}