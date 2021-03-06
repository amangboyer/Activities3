package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Queue;


public class Main extends Application implements EventHandler <ActionEvent> {
    Stage window;
    RadioButton yes, no;
    Button submit;
    ToggleGroup answer;
    VBox mainLayout;
    HBox activities;





    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Activites");

        //Vbox
        mainLayout = new VBox();
        mainLayout.setPrefHeight(300);
        mainLayout.setSpacing(20);
        mainLayout.setPadding(new Insets(15, 15, 15, 15));

        // Hbox
        activities = new HBox();
        activities.setPrefWidth(300);
        activities.setSpacing(20);
        activities.setPadding(new Insets(15, 15, 15, 15));
        // questions
        Label question = new Label("");

        answer = new ToggleGroup();
        yes = new RadioButton("yes");
        yes.setToggleGroup(answer);
        no = new RadioButton("No");
        no.setToggleGroup(answer);

        //submit
        submit = new Button("Submit");
        submit.setOnAction(this);

        // Gui elements
        activities.getChildren().addAll(yes, no);
        mainLayout.getChildren().addAll(question);
        mainLayout.getChildren().addAll(activities, submit);
        activities.setAlignment(Pos.CENTER);
        mainLayout.setAlignment(Pos.CENTER);

        // Show
        Scene main = new Scene(mainLayout, 995, 558, Color.BLUE);
        window.setScene(main);
        window.show();
        window = primaryStage;
        window.setTitle("Activites");


        //Vbox
        mainLayout = new VBox();
        mainLayout.setPrefHeight(600);
        mainLayout.setSpacing(50);
        mainLayout.setPadding(new Insets(30, 30, 30, 30));

        // Hbox
        activities = new HBox();
        activities.setPrefWidth(600);
        activities.setSpacing(50);
        activities.setPadding(new Insets(30, 30, 30, 30));
        // questions
        Label question2 = new Label("How is the weather outside?");

        answer = new ToggleGroup();
        yes = new RadioButton("It is raining outside");
        yes.setToggleGroup(answer);
        no = new RadioButton("It is sunny outside");
        no.setToggleGroup(answer);

        //submit
        submit = new Button("Enter");
        submit.setOnAction(this);

        // Gui elements
        activities.getChildren().addAll(yes, no);
        mainLayout.getChildren().addAll(question2);
        mainLayout.getChildren().addAll(activities, submit);
        activities.setAlignment(Pos.CENTER);
        mainLayout.setAlignment(Pos.CENTER);
        // Money


        // Show
        Scene main2 = new Scene(mainLayout, 995, 558, Color.BEIGE);
        window.setScene(main2);
        window.show();


    }


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void handle(ActionEvent event) {
        String newline = System.lineSeparator();
        Hashtable<Integer, String> ht1 = new Hashtable<>();


        Hashtable<Integer, String> ht2
                = new Hashtable<Integer, String>();


        ht1.put(165, "");





        Queue<String> str_queue = new LinkedList<>();
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("go on a hike");
        ll.add("go to the beach");
        ll.addLast("go to the park.");
        ll.addFirst("Go to the mall");


        LinkedList<String> list = new LinkedList<String>();
        list.add("play videos games at home");
        list.add(" cooking ");
        list.addLast(" Board games with friends ");
        list.addFirst(" Study/read through your notes ");


        str_queue.add("Fun");
        str_queue.add("Indoor");
        str_queue.add("Outdoor");
        str_queue.add("Activities");

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        if (yes.isSelected()) {
            str_queue.remove("Outdoor");
            alert.setTitle("It's raining so try some"+str_queue);
            alert.setContentText("Some indoor activities you can do today:" +  list);
            alert.showAndWait();
        } else {
            str_queue.remove("Indoor");
            alert.setTitle("It's not raining so go do some" +str_queue);
            alert.setContentText("Here are outdoor activities you can do today: " + ll + newline + "Estimated amount of money spent:" +ht1  );

            alert.showAndWait();
        }
    }
}