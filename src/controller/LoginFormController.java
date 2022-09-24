package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class LoginFormController {


    public TextField textUserName;
    public PasswordField textPassword;
    public AnchorPane loginAnchor;

    public void LoginbtnOnAction(ActionEvent actionEvent) throws IOException {
        String Name = textUserName.getText();
        String password = textPassword.getText();
        if (Name.equals("car") && password.equals("123")) {
//            URL resource = getClass().getResource("../src/view/Form.fxml");
//            Parent load = FXMLLoader.load(resource);
//            Stage window = (Stage) loginAnchor.getScene().getWindow();
//            window.setScene(new Scene(load));
            Parent load = FXMLLoader.load(getClass().getResource("../view/Form.fxml"));
            Scene scene = new Scene(load);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
        } else {


            new Alert(Alert.AlertType.WARNING, "No loging").show();
        }
    }

}