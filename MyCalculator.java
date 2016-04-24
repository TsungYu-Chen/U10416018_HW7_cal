//U10416018 陳宗佑

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.scene.Group;
import javafx.scene.control.*;
import javafx.scene.layout.FlowPane;
import javafx.geometry.Insets;

public class MyCalculator extends Application{
	
	@Override
	
	public void start(Stage myStage){
		FlowPane pane = new FlowPane();
		Scene scene = new Scene(pane);
		pane.setPadding(new Insets(25,25,25,25));
		//調整間距
		pane.setHgap(10);
		pane.setVgap(10);
	
		//創造按鈕
		Button MC = new Button("MC");
		MC.setPrefSize(60,40);
		
		Button MR = new Button("MR");
		MR.setPrefSize(60,40);
		
		Button MS = new Button("MS");
		MS.setPrefSize(60,40);
		
		Button Madd = new Button("M+");
		Madd.setPrefSize(60,40);
		
		Button Msub = new Button("M-");
		Msub.setPrefSize(60,40);
		
		Button Back = new Button("back");
		Back.setPrefSize(60,40);
		
		Button CE = new Button("CE");
		CE.setPrefSize(60,40);
		
		Button C = new Button("C");
		C.setPrefSize(60,40);
		
		Button OR = new Button("+/-");
		OR.setPrefSize(60,40);
		
		Button Sqrt = new Button("sqrt");
		Sqrt.setPrefSize(60,40);
		
		Button B7 = new Button("7");
		B7.setPrefSize(60,40);
		
		Button B8 = new Button("8");
		B8.setPrefSize(60,40);
		
		Button B9 = new Button("9");
		B9.setPrefSize(60,40);
		
		Button Div = new Button("/");
		Div.setPrefSize(60,40);
		
		Button Per = new Button("%");
		Per.setPrefSize(60,40);
		
		Button B4 = new Button("4");
		B4.setPrefSize(60,40);
		
		Button B5 = new Button("5");
		B5.setPrefSize(60,40);
		
		Button B6 = new Button("6");
		B6.setPrefSize(60,40);
		
		Button Mul = new Button("*");
		Mul.setPrefSize(60,40);
		
		Button Rec = new Button("1/x");
		Rec.setPrefSize(60,40);
		
		Button B1 = new Button("1");
		B1.setPrefSize(60,40);
		
		Button B2 = new Button("2");
		B2.setPrefSize(60,40);
		
		Button B3 = new Button("3");
		B3.setPrefSize(60,40);
		
		Button Sub = new Button("-");
		Sub.setPrefSize(60,40);
		
		Button Equ = new Button("=");
		Equ.setPrefSize(60,90);
		Equ.setLayoutX(330);
		Equ.setLayoutY(300);
		
		
		
		Button B0 = new Button("0");
		B0.setPrefSize(130,40);
		
		Button Dot = new Button(".");
		Dot.setPrefSize(60,40);
		
		Button Plu = new Button("+");
		Plu.setPrefSize(60,40);
		
		
		//創造顯示區, 調整大小, 並使其無法輸入
		TextField space = new TextField();
		space.setPrefSize(340,40);
		space.setEditable(false);
		pane.getChildren().add(space);
		
		//加入所有按鈕
		pane.getChildren().addAll(MC,    MR,    MS,    Madd,  Msub,
								  Back,  CE,    C,     OR,    Sqrt,
								  B7,    B8,    B9,    Div,   Per,
								  B4,    B5,    B6,    Mul,   Rec,
								  B1,    B2,    B3,    Sub,   
								  B0,    Dot,   Plu);
		
		
		//視窗設定
		myStage.setTitle("計算機");
		myStage.setWidth(400);
		myStage.setHeight(400);
		myStage.setScene(scene);
		myStage.setResizable(false);
		myStage.show();
		
	}
		
	
}
