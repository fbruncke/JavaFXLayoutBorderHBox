import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class TestLayout extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        BorderPane bp = new BorderPane();
        bp.setStyle("-fx-background-color: #552633;");
        HBox hbox = new HBox();
        bp.setTop(hbox);

        Scene scene = new Scene(bp,800,500);

        ImageView iv =  new ImageView("dilbert sales.PNG");
        iv.setFitWidth(700);
        bp.setCenter(iv);

        hbox.setSpacing(50);
        hbox.setStyle("-fx-background-color: #ff2633;");

        hbox.setPadding(new Insets(10,10,10,10));
        hbox.getChildren().add(new Label("Label1"));
        hbox.getChildren().add(new Label("Label2"));
        hbox.getChildren().add(new Label("Label3"));


        primaryStage.setTitle("Layouts");
        primaryStage.setScene(scene);
        primaryStage.show();


    }
}
