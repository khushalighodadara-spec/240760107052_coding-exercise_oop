import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class RegistrationForm extends Application {

    @Override
    public void start(Stage primaryStage) {
        Label lblRollNo = new Label("Roll No:");
        Label lblName = new Label("Name:");
        Label lblAge = new Label("Age:");
        Label lblEmail = new Label("Email:");

        TextField txtRollNo = new TextField();
        TextField txtName = new TextField();
        TextField txtAge = new TextField();
        TextField txtEmail = new TextField();

        Button btnSubmit = new Button("Submit");
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(20));
        grid.setHgap(10);
        grid.setVgap(10);

        grid.add(lblRollNo, 0, 0);
        grid.add(txtRollNo, 1, 0);

        grid.add(lblName, 0, 1);
        grid.add(txtName, 1, 1);

        grid.add(lblAge, 0, 2);
        grid.add(txtAge, 1, 2);

        grid.add(lblEmail, 0, 3);
        grid.add(txtEmail, 1, 3);

        grid.add(btnSubmit, 1, 4);
        btnSubmit.setOnAction(e -> {
            String rollNoText = txtRollNo.getText().trim();
            String name = txtName.getText().trim();
            String ageText = txtAge.getText().trim();
            String email = txtEmail.getText().trim();
            int rollNo, age;

            try {
                rollNo = Integer.parseInt(rollNoText);
            } catch (NumberFormatException ex) {
                showError("Roll No must be an integer.");
                return;
            }

            try {
                age = Integer.parseInt(ageText);
            } catch (NumberFormatException ex) {
                showError("Age must be an integer.");
                return;
            }

            if (!email.contains("@") || !email.contains(".")) {
                showError("Invalid email address.");
                return;
            }
            FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle("Save Registration Data");
            fileChooser.setInitialFileName("registration.txt");

            File file = fileChooser.showSaveDialog(primaryStage);

            if (file != null) {
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                    writer.write("Roll No: " + rollNo);
                    writer.newLine();
                    writer.write("Name: " + name);
                    writer.newLine();
                    writer.write("Age: " + age);
                    writer.newLine();
                    writer.write("Email: " + email);

                } catch (IOException ex) {
                    showError("Error saving file: " + ex.getMessage());
                    return;
                }
            }
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Registration Successful");
            alert.setHeaderText("Student Registered Successfully");
            alert.setContentText(
                    "Roll No: " + rollNo + "\n" +
                    "Name: " + name + "\n" +
                    "Age: " + age + "\n" +
                    "Email: " + email
            );
            alert.showAndWait();
        });

        Scene scene = new Scene(grid, 400, 250);

        primaryStage.setTitle("Registration Form");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    private void showError(String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Validation Error");
        alert.setHeaderText("Invalid Input");
        alert.setContentText(message);
        alert.showAndWait();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
