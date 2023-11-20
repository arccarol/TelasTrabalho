package application.Controller.tab;

import javafx.geometry.Insets;
import javafx.scene.control.Tab;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.layout.GridPane;

public class PesquisaProdutos {
	
public void addTabElements(Tab tab) {
		
		Label lblTitulo1 = new Label ("Marktplace Shoes");
		lblTitulo1.setStyle("-fx-font-size: 18px; -fx-font-weight: bold;");
		Label lblMarca1 = new Label ("Marca:");
		Label lblTamanho1 = new Label ("Tamanho:");
		Label lblPreco1 = new Label ("Preço: R$");
		
		Label lblMarca2 = new Label ("Marca:");
		Label lblTamanho2 = new Label ("Tamanho:");
		Label lblPreco2 = new Label ("Preço: R$");
		
		Label lblMarca3 = new Label ("Marca:");
		Label lblTamanho3 = new Label ("Tamanho:");
		Label lblPreco3 = new Label ("Preço: R$");
		
		Label lblMarca4 = new Label ("Marca:");
		Label lblTamanho4 = new Label ("Tamanho:");
		Label lblPreco4 = new Label ("Preço: R$");
		
		Label espaço = new Label ("  ");
		Label espaço2= new Label ("  ");
		Label espaço3 = new Label ("  ");
		Label espaço4 = new Label ("  ");
		Label espaço5= new Label ("  ");
		Label espaço6 = new Label ("  ");
		Label espaço7 = new Label ("  ");
		Label espaço8= new Label ("  ");
		Label espaço9 = new Label ("  ");
		Label espaço10 = new Label ("  ");
		Label espaço11= new Label ("  ");
		Label espaço12 = new Label ("  ");
		
		
		lblTitulo1.setPrefWidth(200);
		lblMarca1.setPrefWidth(50);
		lblTamanho1.setPrefWidth(150);
		lblPreco1.setPrefWidth(150);
		
		lblMarca2.setPrefWidth(150);
		lblTamanho2.setPrefWidth(150);
		lblPreco2.setPrefWidth(150);
		
		lblMarca3.setPrefWidth(150);
		lblTamanho3.setPrefWidth(150);
		lblPreco3.setPrefWidth(150);
		
		lblMarca4.setPrefWidth(150);
		lblTamanho4.setPrefWidth(150);
		lblPreco4.setPrefWidth(150);
		
		
		TextField Pesquisa = new TextField();
		Pesquisa.setPrefWidth(200);
		Pesquisa.setMaxWidth(300);
		
		TextField NomeP1 = new TextField();
		NomeP1.setPrefWidth(200);
		NomeP1.setMaxWidth(300);
		
		TextField Tamanho1= new TextField();
		Tamanho1.setPrefWidth(200);
		Tamanho1.setMaxWidth(300);
		
		TextField Marca1 = new TextField();
		Marca1.setPrefWidth(200);
		Marca1.setMaxWidth(300);
		
		TextField Preco1 = new TextField();
		Preco1.setPrefWidth(200);
		Preco1.setMaxWidth(300);
		
		
		TextField NomeP2 = new TextField();
		NomeP2.setPrefWidth(200);
		NomeP2.setMaxWidth(300);
		
		TextField Tamanho2= new TextField();
		Tamanho2.setPrefWidth(200);
		Tamanho2.setMaxWidth(300);
		
		TextField Marca2 = new TextField();
		Marca2.setPrefWidth(200);
		Marca2.setMaxWidth(300);
		
		TextField Preco2 = new TextField();
		Preco2.setPrefWidth(200);
		Preco2.setMaxWidth(300);
		
		
		TextField NomeP3 = new TextField();
		NomeP3.setPrefWidth(200);
		NomeP3.setMaxWidth(300);
		
		TextField Tamanho3= new TextField();
		Tamanho3.setPrefWidth(200);
		Tamanho3.setMaxWidth(300);
		
		TextField Marca3 = new TextField();
		Marca3.setPrefWidth(200);
		Marca3.setMaxWidth(300);
		
		TextField Preco3 = new TextField();
		Preco3.setPrefWidth(200);
		Preco3.setMaxWidth(300);
		
		
		TextField NomeP4 = new TextField();
		NomeP4.setPrefWidth(200);
		NomeP4.setMaxWidth(300);
		
		TextField Tamanho4= new TextField();
		Tamanho4.setPrefWidth(200);
		Tamanho4.setMaxWidth(300);
		
		TextField Marca4 = new TextField();
		Marca4.setPrefWidth(200);
		Marca4.setMaxWidth(300);
		
		TextField Preco4 = new TextField();
		Preco4.setPrefWidth(200);
		Preco4.setMaxWidth(300);
		
		Button Pesquisar = new Button("Pesquisar");
		Pesquisar.setPrefWidth(100);
		
		Button Adicionar1 = new Button("Adicionar");
		Adicionar1.setPrefWidth(75);
		
		Button Visualizar1 = new Button("Visualizar");
		Visualizar1.setPrefWidth(75);
		
		Button Adicionar2 = new Button("Adicionar");
		Adicionar2.setPrefWidth(75);
		
		Button Visualizar2 = new Button("Visualizar");
		Visualizar2.setPrefWidth(75);
		
		Button Adicionar3 = new Button("Adicionar");
		Adicionar3.setPrefWidth(75);
		
		Button Visualizar3 = new Button("Visualizar");
		Visualizar3.setPrefWidth(75);
				
		Button Adicionar4 = new Button("Adicionar");
		Adicionar4.setPrefWidth(75);
		
		Button Visualizar4 = new Button("Visualizar");
		Visualizar4.setPrefWidth(75);
		
		 GridPane gridPane2 = new GridPane();
	        gridPane2.setHgap(15); 
	        gridPane2.setVgap(15);

	        gridPane2.addRow(0, lblTitulo1, Pesquisa, Pesquisar);
	        gridPane2.addRow(3, NomeP1, espaço, espaço6,  NomeP2);
	        gridPane2.addRow(4, lblMarca1, Marca1, espaço2 , lblMarca2, Marca2);
	        gridPane2.addRow(5, lblTamanho1,Tamanho1, espaço3,lblTamanho2, Tamanho2);
	        gridPane2.addRow(6, lblPreco1, Preco1, espaço4, lblPreco2, Preco2);
	        gridPane2.addRow(7, Adicionar1, Visualizar1, espaço5 ,Adicionar2, Visualizar2);
	        
	 
	        gridPane2.addRow(11, NomeP3, espaço7 ,espaço8, NomeP4);
	        gridPane2.addRow(12, lblMarca3, Marca3,espaço9, lblMarca4, Marca4);
	        gridPane2.addRow(13, lblTamanho3, Tamanho3,espaço10, lblTamanho4, Tamanho4);
	        gridPane2.addRow(14, lblPreco3, Preco3, espaço11, lblPreco4, Preco4);
	        gridPane2.addRow(15, Adicionar3, Visualizar3, espaço12, Adicionar4, Visualizar4);
	    
	        
			VBox vBox = new VBox(30);
			
		    Insets insets = new Insets(30);
		    vBox.setPadding(insets);
		    vBox.getChildren().addAll(gridPane2);
		    tab.setContent(vBox);
			
		}
		
		
}
		
		
		
		
		
		


