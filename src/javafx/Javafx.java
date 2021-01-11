package javafx;
//program is a bit simple this week but i was playing around with javafx and tried to get sound working again which i failed to do even with the code you provided to help me previously
import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.util.Random;

public class Javafx extends Application {

    Random random = new Random();
    String[] names = new String[]{"Boris Johnson", "Barry Scott", "Minecraft Steve", "The Ender Dragon", "Eminem", "King Henry VIII", "The Prime Minister of Australia", "Paul McCartney"};
    Item table = new Item("a table", "wood", names[random.nextInt(7)]);
    Item tree = new Item("a tree", "wood", names[random.nextInt(7)]);
    Item sword = new Item("a sword", "metal", names[random.nextInt(7)]);
    Item egg = new Item("an egg", "egg", names[random.nextInt(7)]);
    Item finn = new Item("Finn Jacob Leon Van Montfort", "person", names[random.nextInt(7)]);
    Item finland = new Item("Finland", "Finland", names[random.nextInt(7)]);
    Item guitar = new Item("a guitar", "wood probably", names[random.nextInt(7)]);
    Item pillow = new Item("a pillow", "birds", names[random.nextInt(7)]);
    Item wax_sculpture_of_Boris_Johnson = new Item("a wax sculpture of Boris Johnson", "wax", names[random.nextInt(7)]);
    Item anthony_the_rock = new Item("a rock finn found a few years ago called anthony", "rock", names[random.nextInt(7)]);
    Item the_Wiggle_house = new Item("the Wiggle house", "bricks presumably", names[random.nextInt(7)]);
    Item iron_Ingot = new Item("an iron ingot", "iron", names[random.nextInt(7)]);
    Item mp7blackice = new Item("the black ice skin for the mp7", "ice", names[random.nextInt(7)]);

    public Item[] getItems() {
        Item[] items = new Item[13];
        items[0] = table;
        items[1] = tree;
        items[2] = sword;
        items[3] = egg;
        items[4] = finn;
        items[5] = finland;
        items[6] = guitar;
        items[7] = pillow;
        items[8] = wax_sculpture_of_Boris_Johnson;
        items[9] = anthony_the_rock;
        items[10] = the_Wiggle_house;
        items[11] = iron_Ingot;
        items[12] = mp7blackice;
        return items;
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));

        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        

        launch(args);
    }

}
