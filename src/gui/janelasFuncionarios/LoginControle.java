package gui.janelasFuncionarios;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginControle implements Initializable{
    @FXML
    private Button loginButton;
    @FXML
    private TextField loginText;
    @FXML
    private PasswordField senhaText;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    public void entrarAction(){
        System.out.println(loginText.getText());
        System.out.println(senhaText.getText());
    }


}
