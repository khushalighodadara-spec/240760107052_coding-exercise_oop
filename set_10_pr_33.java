import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Random;

public class RandomTextDisplay extends Application {

    @Override
    public void start(Stage primaryStage) {
        VBox vbox = new VBox(15); // spacing between texts
        vbox.setAlignment(Pos.CENTER);

        Random random = new Random();

        for (int i = 1; i <= 5; i++) {
            Text text = new Text("Text " + i);
            text.setFont(Font.font(
                    "Times New Roman",
                    FontWeight.BOLD,
                    FontPosture.ITALIC,
                    22
            ));
            Color randomColor = Color.color(
                    random.nextDouble(),
                    random.nextDouble(),
                    random.nextDouble()
            );
            double opacity = 0.3 + (0.7 * random.nextDouble());

            text.setFill(randomColor);
            text.setOpacity(opacity);

            vbox.getChildren().add(text);
        }

        Scene scene = new Scene(vbox, 400, 300);

        primaryStage.setTitle("Random Colored Texts");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

/*
Sample Result:
The window displays:

Text 1   -> Random color and opacity
Text 2   -> Random color and opacity
Text 3   -> Random color and opacity
Text 4   -> Random color and opacity
Text 5   -> Random color and opacity

All texts are:
- Vertically arranged
- Center aligned
- Times New Roman, Bold Italic, 22 px
- Different colors and opacity values
*/
