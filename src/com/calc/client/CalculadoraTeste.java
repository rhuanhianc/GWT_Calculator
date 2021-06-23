package com.calc.client;

import com.calc.shared.FieldVerifier;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.HasVerticalAlignment.VerticalAlignmentConstant;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class CalculadoraTeste implements EntryPoint {

	FlowPanel flPanel1 = new FlowPanel();
	FlowPanel flPanel2 = new FlowPanel();
	HorizontalPanel horizonPanel = new HorizontalPanel();
	Label lbN1 = new Label("Numero 1");
	TextBox txtN1 = new TextBox();
	Label lbN2 = new Label("Numero 2");
	TextBox txtN2 = new TextBox();
	Button somar = new Button("+");
	Button subtrair = new Button("-");
	Button dividir = new Button("/");
	Button multiplicar = new Button("*");
	Label lblResultado = new Label("Resultado"); 
	@Override
	public void onModuleLoad() {
		// TODO Auto-generated method stub
	
		
		somar.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				Double n1 = Double.parseDouble(txtN1.getText());
				Double n2 = Double.parseDouble(txtN2.getText());
				Double Soma = n1 + n2;
				lblResultado.setText(Double.toString(Soma));
			}
		});
		
		subtrair.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				Double n1 = Double.parseDouble(txtN1.getText());
				Double n2 = Double.parseDouble(txtN2.getText());
				Double Sub = n1 - n2;
				lblResultado.setText(Double.toString(Sub));
				
			}
		});
		
		dividir.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				Double n1 = Double.parseDouble(txtN1.getText());
				Double n2 = Double.parseDouble(txtN2.getText());
				Double Sub = n1 / n2;
				lblResultado.setText(Double.toString(Sub));
				
			}
		});
		
		multiplicar.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				Double n1 = Double.parseDouble(txtN1.getText());
				Double n2 = Double.parseDouble(txtN2.getText());
				Double Sub = n1 * n2;
				lblResultado.setText(Double.toString(Sub));
				
			}
		});
		
		
		flPanel2.setStyleName("icons-hori");
		//horizonPanel.setSpacing(1);
		//horizonPanel.setWidth("100%");
		//horizonPanel.setHeight("100%");
		//horizonPanel.setHorizontalAlignment(HasAlignment.ALIGN_CENTER);
		
		
		flPanel1.add(lbN1);
		flPanel1.add(txtN1);
		flPanel1.add(lbN2);
		flPanel1.add(txtN2);
		flPanel1.add(lblResultado);
		flPanel2.add(somar);
		flPanel2.add(subtrair);
		flPanel2.add(dividir);
		flPanel2.add(multiplicar);
		
		RootPanel.get().add(flPanel1);
		RootPanel.get().add(flPanel2);
	}
	
	
}
