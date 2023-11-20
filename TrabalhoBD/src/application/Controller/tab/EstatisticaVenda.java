package application.Controller.tab;

import javafx.geometry.Insets;
import javafx.scene.control.Tab;
import javafx.scene.control.TextArea;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.layout.GridPane;

public class EstatisticaVenda {
	
	private TextArea PVendidos = new TextArea();
	private TextArea PEstoque = new TextArea();
	private TextArea PVendidosP = new TextArea();
	private TextArea PEstoqueP = new TextArea();	
	
	public void addTabElements(Tab tab) {
		
		Label lblTitulo = new Label ("Estatistica de Vendas");
		lblTitulo.setStyle("-fx-font-size: 16px; -fx-font-weight: bold;");
		Label lblBanco = new Label ("Banco ou Instituição:");
		Label lblVendidos = new Label ("Quantidade Total de Produtos Vendidos");
		Label lblEstoque = new Label ("Quantidade Total de Produtos no Estoque");
		Label lblVendidosPerc = new Label ("Qtd Total Vendas");
		Label lblEstoquePerc = new Label ("Qtd Total Estoque");
		
	    		
		lblTitulo.setPrefWidth(250);
		lblBanco.setPrefWidth(160);
		lblVendidos.setPrefWidth(300);
		lblEstoque.setPrefWidth(300);
		lblVendidosPerc.setPrefWidth(200);
		lblEstoquePerc.setPrefWidth(200);
		
		TextField tfBanco = new TextField();
		tfBanco.setPrefWidth(200);
		tfBanco.setMaxWidth(300);
		
		TextField PVendidosP = new TextField();
		PVendidosP.setPrefWidth(200);
		PVendidosP.setMaxWidth(100);
		
		TextField PEstoqueP = new TextField();
	    PEstoqueP.setPrefWidth(200);
		PEstoqueP.setMaxWidth(100);
		
		PVendidos.setPrefWidth(20);
		PVendidos.setMaxWidth(200);
		PEstoque.setMaxWidth(200);
		PEstoque.setPrefWidth(100);
		
		
		Button voltar = new Button("Voltar");
		voltar.setPrefWidth(75);
		
		 GridPane gridPane = new GridPane();
	        gridPane.setHgap(15); 
	        gridPane.setVgap(15);

	        gridPane.addRow(0, voltar);
	        gridPane.addRow(1, lblTitulo);
	        gridPane.addRow(2, lblBanco, tfBanco);
	        gridPane.addRow(3, lblVendidos, lblEstoque);
	        gridPane.addRow(4, PVendidos, PEstoque);
	        gridPane.addRow(5, PVendidosP, PEstoqueP);
	        gridPane.addRow(6, lblVendidosPerc, lblEstoquePerc);

	        
		VBox vBox = new VBox(10);
		
	    Insets insets = new Insets(10);
	    vBox.setPadding(insets);
	    vBox.getChildren().addAll(gridPane);
	    tab.setContent(vBox);
		
	}
	    public void limpaTextArea() {
	    	PEstoque.setText("");
	    	PVendidos.setText("");
	    	PEstoqueP.setText("");
	    	PVendidosP.setText("");
	    	
	    	
	}

}

		
		
		
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	




