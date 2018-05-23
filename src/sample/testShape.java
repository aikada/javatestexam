package sample;

import java.util.Map;

//JavaFx part
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class testShape extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Eksamiks kordamine");
        primaryStage.setScene(new Scene(root, 550, 550));
        primaryStage.show();
    }

    public static void main(String[] args) {
        Shape kujund = new Shape("kolmnurk", 2, 3);
        Shape sittKujund = new Shape();


        SQLDao dao = new SQLDao();
        Map<String, Shape> data = dao.selectAll();
        Shape Silinder = data.get("Silinder");
        Silinder.give_info();
        System.out.println(Silinder.height);

        launch(args);

    }
}
