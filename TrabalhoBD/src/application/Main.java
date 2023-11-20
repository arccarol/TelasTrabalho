package application;
	
import application.Controller.tab.EstatisticaVenda;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.*;
import javafx.scene.control.Tab;
import javafx.scene.layout.VBox;
import javafx.scene.control.TabPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			
			TabPane tabPane = new TabPane();
			
			
			Tab tabEstatistica = new Tab("Estatisticas de Venda", new Label(""));
			
			tabPane.getTabs().add(tabEstatistica);
			VBox vBox = new VBox (tabPane);
			
			BorderPane root = new BorderPane();
			Scene scene = new Scene(vBox,700,500);
			
			EstatisticaVenda Estatistica = new EstatisticaVenda ();
			Estatistica.addTabElements(tabEstatistica);
			
			primaryStage.setScene(scene);
			primaryStage.setTitle("Estatisticas de Venda");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
