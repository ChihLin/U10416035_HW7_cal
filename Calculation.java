//U10416035 Cheng Chih Lin

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.HBox;
import javafx.geometry.Pos;

public class Calculation extends Application {
	
	
	//String str1 , str2;
	boolean[] p = new boolean[4];
	double num1 , num2;

	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {	
		
		FlowPane pane = new FlowPane();
		FlowPane p1 = new FlowPane();
		GridPane p2 = new GridPane();
		
		p2.setVgap(2);
		p2.setHgap(2);
		
		//new button 
		TextField result = new TextField("");
		result.setEditable(false);
		result.setPrefWidth(260);

		Button btmc = new Button("MC");
		btmc.setPrefSize(50,50);
		Button btmr = new Button("MR");
		btmr.setPrefSize(50,50);
		Button btms = new Button("MS");
		btms.setPrefSize(50,50);
		Button btm1 = new Button("M+");
		btm1.setPrefSize(50,50);
		Button btm2 = new Button("M-");
		btm2.setPrefSize(50,50);

		Button btf = new Button("<--");
		btf.setPrefSize(50,50);
		Button btce = new Button("CE");
		btce.setPrefSize(50,50);
		Button btc = new Button("C");
		btc.setPrefSize(50,50);
		Button btg = new Button("+-");
		btg.setPrefSize(50,50);
		Button bth = new Button("根號");
		bth.setPrefSize(50,50);		
		
		Button btseven = new Button("7");
		btseven.setPrefSize(50,50);
		Button bteight = new Button("8");
		bteight.setPrefSize(50,50);
		Button btnine = new Button("9");
		btnine.setPrefSize(50,50);
		Button bta = new Button("/");
		bta.setPrefSize(50,50);
		Button bti = new Button("%");
		bti.setPrefSize(50,50);
		
		
		Button btfour = new Button("4");
		btfour.setPrefSize(50,50);
		Button btfive = new Button("5");
		btfive.setPrefSize(50,50);
		Button btsix = new Button("6");
		btsix.setPrefSize(50,50);
		Button btb = new Button("*");
		btb.setPrefSize(50,50);
		Button btj = new Button("1/x");
		btj.setPrefSize(50,50);

		
		Button btone = new Button("1");
		btone.setPrefSize(50,50);
		Button bttwo = new Button("2");
		bttwo.setPrefSize(50,50);
		Button btthree = new Button("3");
		btthree.setPrefSize(50,50);
		Button btccc = new Button("-");
		btccc.setPrefSize(50,50);
		
		Button btzero = new Button("0");
		btzero.setPrefSize(100,50);
		Button btpoint = new Button(".");
		btpoint.setPrefSize(50,50);
		Button btd = new Button("+");
		btd.setPrefSize(50,50);
		Button bte = new Button("=");
		bte.setPrefSize(50,100);

		//add the text board
		p1.getChildren().addAll(result);

		//decide the button 's seat
		p2.add(btmc , 0,0);
		p2.add(btmr , 1,0);
		p2.add(btms , 2,0);
		p2.add(btm1 , 3,0);
		p2.add(btm2 , 4,0);
		
		p2.add(btf , 0,1);
		p2.add(btce , 1,1);
		p2.add(btc , 2,1);
		p2.add(btg , 3,1);
		p2.add(bth , 4,1);
		
		p2.add(btseven , 0,2);
		p2.add(bteight , 1,2);
		p2.add(btnine , 2,2);
		p2.add(bta , 3,2);
		p2.add(bti , 4,2);
		
		p2.add(btfour , 0,3);
		p2.add(btfive, 1,3);
		p2.add(btsix , 2,3);
		p2.add(btb , 3,3);
		p2.add(btj , 4,3);

		p2.add(btone , 0,4);
		p2.add(bttwo, 1,4);
		p2.add(btthree , 2,4);
		p2.add(btccc , 3,4);
		
		p2.add(btzero , 0,5,2 ,1);
		p2.add(btpoint , 2,5);
		p2.add(btd ,3,5);
		p2.add(bte , 4 , 4 ,1 ,2);
		
		
		MenuBar mb = new MenuBar();
		
		Menu item1 = new Menu("檢視");
		MenuItem it1 = new MenuItem("i1");
		MenuItem it2 = new MenuItem("i2");
		
		item1.getItems().addAll(it1 , it2);
		
		Menu item2 = new Menu("編輯");
		MenuItem it3 = new MenuItem("i3");
		MenuItem it4 = new MenuItem("i4");
		item2.getItems().addAll(it3 , it4);
		
		Menu item3 = new Menu("說明");
		MenuItem it5 = new MenuItem("i5");
		MenuItem it6 = new MenuItem("i6");
		item3.getItems().addAll(it5 , it6);
		
		mb.getMenus().addAll(item1 , item2 , item3);
		pane.getChildren().addAll(mb);		
		pane.getChildren().addAll(p1 , p2);
		
		//print the number to the text
		btseven.setOnAction(e -> {
			result.setText(result.getText() + "7");
		});
		bteight.setOnAction(e ->{
			result.setText(result.getText() + "8");
		});
		btnine.setOnAction(e -> {
			result.setText(result.getText() + "9");
		});
		
		btfour.setOnAction(e -> {
			result.setText(result.getText() + "4");
		});
		btfive.setOnAction(e ->{
			result.setText(result.getText() + "5");
		});
		btsix.setOnAction(e -> {
			result.setText(result.getText() + "6");
		});
		
		btone.setOnAction(e -> {
			result.setText(result.getText() + "1");
		});
		bttwo.setOnAction(e ->{
			result.setText(result.getText() + "2");
		});
		btthree.setOnAction(e -> {
			result.setText(result.getText() + "3");
		});
		
		btzero.setOnAction(e -> {
			result.setText(result.getText() + "0");
		});
		
		//delete all the number 
		btc.setOnAction(e -> {
			result.clear();
		});
		
		//button delete 
		btf.setOnAction(e -> {
			String s;
			s = result.getText();
			String s2 = s.substring(0, (s.length()-1));
			result.setText(s2);
		});
		//button point(.)
		btpoint.setOnAction(e -> {
			
			result.setText(result.getText() + ".");
		});
		
		//plus
		btd.setOnAction(e -> {
			
			num1 = Double.parseDouble(result.getText());
			result.clear();
			
			p[0] =true;
			p[1] = false;
			p[2] = false;
			p[3] = false;
			
		});
		
		// "-" 
		btccc.setOnAction(e -> {
			
			num1 = Double.parseDouble(result.getText());
			result.clear();
			
			p[0] = false;
			p[1] = true;
			p[2] = false;
			p[3] = false;
			
		});
		
		// *
		btb.setOnAction(e -> {
			
			num1 = Double.parseDouble(result.getText());
			result.clear();
			
			p[0] = false;
			p[1] = false;
			p[2] = true;
			p[3] = false;
			
		});
		
		// "/"
		bta.setOnAction(e -> {
			
			num1 = Double.parseDouble(result.getText());
			result.clear();
			
			p[0] = false;
			p[1] = false;
			p[2] = false;
			p[3] = true;
			
		});
		
		//button " = "
		bte.setOnAction(e -> {
			
			num2 = Double.parseDouble(result.getText());
			
			if(p[0] == true){
				 num1 = num1 + num2;
				 result.setText(Double.toString(num1));
			}
			
			else if (p[1] == true){
				num1 = num1 - num2;
				result.setText(Double.toString(num1));
			}
			else if (p[2] == true){
				num1 = num1 * num2;
				result.setText(Double.toString(num1));
			}
			else if (p[3] == true){
				num1 = num1 / num2;
				result.setText(Double.toString(num1));
			}
			
		});
	
		
		// Create a scene and place it in the stage
		Scene scene = new Scene(pane, 260, 360);
		primaryStage.setTitle("Calculator"); // Set title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage

	}
  public static void main(String[] args) {
    launch(args);
  }

}

