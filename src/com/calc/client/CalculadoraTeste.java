package com.calc.client;




import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.RootPanel;


/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class CalculadoraTeste extends botoesNumericos implements EntryPoint  {
	//Table usada para montar a calculadora
	FlexTable flTable = new FlexTable();
	
	//Funçoes da calculadora
	Button somar = new Button("+");
	Button subtrair = new Button("-");
	Button dividir = new Button("/");
	Button multiplicar = new Button("*");
	Button apagarTudo = new Button("C");
	Button igual = new Button("=");
	Button ponto = new Button(".");
	Button apagarUm = new Button("<=");
	
	
	
	
	Double numero1;
	Double numero2;
	
	String sinal;
	
	
	
	
	@Override
	public void onModuleLoad() {
		// TODO Auto-generated method stub
		
		
		flTable.setWidget(0, 0, apagarTudo);
		flTable.setWidget(0, 3, dividir);
		flTable.setWidget(1, 0, sete);
		flTable.setWidget(1, 1, oito);
		flTable.setWidget(1, 2, nove);
		flTable.setWidget(1, 3, multiplicar);
		flTable.setWidget(2, 0, quatro);
		flTable.setWidget(2, 1, cinco);
		flTable.setWidget(2, 2, seis);
		flTable.setWidget(2, 3, subtrair);
		flTable.setWidget(3, 0, um);
		flTable.setWidget(3, 1, dois);
		flTable.setWidget(3, 2, tres);
		flTable.setWidget(3, 3, somar);
		flTable.setWidget(4, 0, zero);
		flTable.setWidget(4, 1, ponto);
		//flTable.setWidget(4, 2, apagarUm);
		flTable.setWidget(4, 3, igual);
		flTable.setCellPadding(5);
		
		// Clique de Botoes Numericos
		zero.addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				txtN1.setText(txtN1.getText() + "0");

			}
		});
		um.addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				txtN1.setText(txtN1.getText() + "1");

			}
		});
		dois.addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				txtN1.setText(txtN1.getText() + "2");

			}
		});
		tres.addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				txtN1.setText(txtN1.getText() + "3");

			}
		});
		quatro.addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				txtN1.setText(txtN1.getText() + "4");

			}
		});
		cinco.addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				txtN1.setText(txtN1.getText() + "5");

			}
		});
		seis.addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				txtN1.setText(txtN1.getText() + "6");

			}
		});
		sete.addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				txtN1.setText(txtN1.getText() + "7");

			}
		});
		oito.addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				txtN1.setText(txtN1.getText() + "8");

			}
		});
		nove.addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				txtN1.setText(txtN1.getText() + "9");

			}
		});
		
		
		
		
		
		//Botao de apagar 
		apagarTudo.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				txtN1.setText("");
				
			}
		});

		
		
		//funcoes
		ponto.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				txtN1.setText(txtN1.getText() + ".");
				
			}
		});
		somar.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
			
				numero1 = Double.parseDouble(txtN1.getText());
				txtN1.setText("");
				sinal = "soma";
			}
		});
		subtrair.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				numero1 = Double.parseDouble(txtN1.getText());
				txtN1.setText("");
				sinal = "subtrair";
				
			}
		});
		dividir.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				numero1 = Double.parseDouble(txtN1.getText());
				txtN1.setText("");
				sinal = "dividir";
				
			}
		});
		multiplicar.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				numero1 = Double.parseDouble(txtN1.getText());
				txtN1.setText("");
				sinal = "multiplicar";
				
			}
		});
		
		//calcula o resultado
		igual.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				numero2 = Double.parseDouble(txtN1.getText());
				if (sinal.equals("soma")) {
					txtN1.setText(Double.toString(numero1 + numero2));
				}
				if (sinal.equals("subtrair")) {
					txtN1.setText(Double.toString(numero1 - numero2));
				}
				if (sinal.equals("dividir")) {
					txtN1.setText(Double.toString(numero1 / numero2));
				}
				if (sinal.equals("multiplicar")) {
					txtN1.setText(Double.toString(numero1 * numero2));
				}
			}
		});
		
	
		
		FlowPanel flowPanel = new FlowPanel();
		flowPanel.add(txtN1);
		flowPanel.add(flTable);
		flowPanel.setStyleName("flowpainel");
		
	
		RootPanel.get("centro").add(flowPanel);
		
	
	}
	
	
}
