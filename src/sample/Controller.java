package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class Controller {
    @FXML
    public TextField message;
    @FXML
    public TextArea chatWindow;

    public void clikcSend(ActionEvent actionEvent) {
        send();
    }

    public void sendMiessage(KeyEvent keyEvent) {
        if (keyEvent.getCode() == KeyCode.ENTER){
            send();
        }
    }

    private void send() {
        chatWindow.setText(chatWindow.getText()+ message.getText()+System.getProperty("line.separator"));
        message.clear();
        message.requestFocus();
    }
}
