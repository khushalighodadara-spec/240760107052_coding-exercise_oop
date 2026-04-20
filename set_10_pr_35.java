import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class GradeDistributionChart extends Application {

    private static final double CHART_HEIGHT = 200; // Max height for a 100% bar
    private static final double BAR_WIDTH = 80;
    private static final double SPACING = 20;

    @Override
    public void start(Stage primaryStage) {
        // Data for the grade categories
        String[] categories = {"Projects", "Quizzes", "Midterm Exams", "Final Exam"};
        int[] percentages = {20, 10, 30, 40};
        Color[] colors = {Color.RED, Color.BLUE, Color.GREEN, Color.ORANGE};

        HBox chartContainer = new HBox(SPACING); // Use HBox for horizontal arrangement
        chartContainer.setPadding(new Insets(20));
        chartContainer.setAlignment(Pos.BOTTOM_CENTER); // Align bars to the bottom

        for (int i = 0; i < categories.length; i++) {
            double barHeight = (percentages[i] / 100.0) * CHART_HEIGHT;
            Rectangle bar = new Rectangle(BAR_WIDTH, barHeight);
            bar.setFill(colors[i]);
            bar.setStroke(Color.BLACK); 
            Text label = new Text(categories[i] + " - " + percentages[i] + "%");
            label.setFont(new Font("Arial", 12));
            VBox barAndLabel = new VBox(5); 
            barAndLabel.setAlignment(Pos.BOTTOM_CENTER); 
            barAndLabel.getChildren().addAll(bar, label);

            chartContainer.getChildren().add(barAndLabel);
        }

        Scene scene = new Scene(chartContainer, 500, CHART_HEIGHT + 100); // Add extra height for labels and padding
        primaryStage.setTitle("Grade Distribution Bar Chart");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
