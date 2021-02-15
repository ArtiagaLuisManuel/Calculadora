import javax.swing.*;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class CalculadoraInter_LuisManuelArtiaga extends JFrame implements ActionListener{

	public JPanel panel;
	public JTextField texto;
	public JButton boton0, boton1, boton2, boton3, boton4, boton5, boton6, boton7, boton8, boton9, botonAns, botonPunto, botonI, botonX, botonDiv, botonMen, botonMas;
	public float numero1=0, numero2=0, resultado=0;
   public String texto_1, texto_total, tipo, texto_2="0", texto_2v="0", resultadoR;
   
   public CalculadoraInter_LuisManuelArtiaga(){
      this.setSize (275,300);
      setLocationRelativeTo(null);
      setTitle("Calculadora_LuisManuelArtiaga");
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      pantalla(); //Mostrar calculadora
   }//ventana
        
   public void pantalla(){
      panel = new JPanel();
		panel.setLayout(null);
 		this.getContentPane().add(panel);
      
      texto = new JTextField(50);
      texto.setBounds (10, 10, 225, 70);
      texto.setText(" ");
      panel.add(texto);
      
      boton1 = new JButton("1");
      boton1.setBounds (10, 150, 50, 25);
      panel.add(boton1);
      boton1.addActionListener(this);
      
      boton2 = new JButton("2");
      boton2.setBounds (60, 150, 50, 25);
      panel.add(boton2);
      boton2.addActionListener(this);

      boton3 = new JButton("3");
      boton3.setBounds (110, 150, 50, 25);
      panel.add(boton3);      
      boton3.addActionListener(this);

      boton4 = new JButton("4");
      boton4.setBounds (10, 175, 50, 25);
      panel.add(boton4);
      boton4.addActionListener(this);

      boton5 = new JButton("5");
      boton5.setBounds (60, 175, 50, 25);
      panel.add(boton5);
      boton5.addActionListener(this);

      boton6 = new JButton("6");
      boton6.setBounds (110, 175, 50, 25);
      panel.add(boton6);
      boton6.addActionListener(this);

      boton7 = new JButton("7");
      boton7.setBounds (10, 200, 50, 25);
      panel.add(boton7);
      boton7.addActionListener(this);

      boton8 = new JButton("8");
      boton8.setBounds (60, 200, 50, 25);
      panel.add(boton8);
      boton8.addActionListener(this);

      boton9 = new JButton("9");
      boton9.setBounds (110, 200, 50, 25);
      panel.add(boton9);
      boton9.addActionListener(this);

      botonPunto = new JButton(".");
      botonPunto.setBounds (10, 225, 50, 25);
      panel.add(botonPunto);
      botonPunto.addActionListener(this);

      boton0 = new JButton("0");
      boton0.setBounds (60, 225, 50, 25);
      panel.add(boton0);
      boton0.addActionListener(this);

      botonAns = new JButton("R");
      botonAns.setBounds (110, 225, 50, 25);
      panel.add(botonAns);
      botonAns.addActionListener(this);

      botonX = new JButton("x");
      botonX.setBounds (10, 125, 50, 25);
      panel.add(botonX);
      botonX.addActionListener(this);

      botonDiv = new JButton("/");
      botonDiv.setBounds (60, 125, 50, 25);
      panel.add(botonDiv);
      botonDiv.addActionListener(this);

      botonMen = new JButton("-");
      botonMen.setBounds (110, 125, 50, 25);
      panel.add(botonMen);
      botonMen.addActionListener(this);

      botonMas = new JButton("+");
      botonMas.setBounds (170, 125, 50, 25);
      panel.add(botonMas);
      botonMas.addActionListener(this);

      botonI = new JButton("=");
      botonI.setBounds (170, 150, 50, 100);
      panel.add(botonI);
      botonI.addActionListener(this);

            
   }//pantalla
   
   
    //Acciones
  public void actionPerformed(ActionEvent evento){
      if(evento.getSource() == boton1){
         texto_1=texto.getText();
         texto_total=texto_1 + "1";
         texto.setText(texto_total);
         if (tipo=="mu" || tipo=="ma" || tipo=="me" || tipo=="di"){
            texto_2v= texto_2;
            texto_2= texto_2v + "1";
         }
      }
      if(evento.getSource() == boton2){
         texto_1=texto.getText();
         texto_total=texto_1 + "2";
         texto.setText(texto_total);
         if (tipo=="mu" || tipo=="ma" || tipo=="me" || tipo=="di"){
            texto_2v= texto_2;
            texto_2= texto_2v + "2";
         }
      }
      if(evento.getSource() == boton3){
         texto_1=texto.getText();
         texto_total=texto_1 + "3";
         texto.setText(texto_total);
         if (tipo=="mu" || tipo=="ma" || tipo=="me" || tipo=="di"){
            texto_2v= texto_2;
            texto_2= texto_2v + "3";
         }
      }
      if(evento.getSource() == boton4){
         texto_1=texto.getText();
         texto_total=texto_1 + "4";
         texto.setText(texto_total);
         if (tipo=="mu" || tipo=="ma" || tipo=="me" || tipo=="di"){
            texto_2v= texto_2;
            texto_2= texto_2v + "4";
         }
      }
      if(evento.getSource() == boton5){
         texto_1=texto.getText();
         texto_total= texto_1 + "5";
         texto.setText(texto_total);
         if (tipo=="mu" || tipo=="ma" || tipo=="me" || tipo=="di"){
            texto_2v= texto_2;
            texto_2= texto_2v + "5";
         }
      }
      if(evento.getSource() == boton6){
         texto_1=texto.getText();
         texto_total=texto_1 + "6";
         texto.setText(texto_total);
         if (tipo=="mu" || tipo=="ma" || tipo=="me" || tipo=="di"){
            texto_2v= texto_2;
            texto_2= texto_2v + "6";
         }
      }
      if(evento.getSource() == boton7){
         texto_1=texto.getText();
         texto_total=texto_1 + "7";
         texto.setText(texto_total);
         if (tipo=="mu" || tipo=="ma" || tipo=="me" || tipo=="di"){
            texto_2v= texto_2;
            texto_2= texto_2v + "7";
         }
      }
      if(evento.getSource() == boton8){
         texto_1=texto.getText();
         texto_total=texto_1 + "8";
         texto.setText(texto_total);
         if (tipo=="mu" || tipo=="ma" || tipo=="me" || tipo=="di"){
            texto_2v= texto_2;
            texto_2= texto_2v + "8";
         }
      }
      if(evento.getSource() == boton9){
         texto_1=texto.getText();
         texto_total=texto_1 + "9";
         texto.setText(texto_total);
         if (tipo=="mu" || tipo=="ma" || tipo=="me" || tipo=="di"){
            texto_2v= texto_2;
            texto_2= texto_2v + "9";
         }
      }
      if(evento.getSource() == boton0){
         texto_1=texto.getText();
         texto_total=texto_1 + "0";
         texto.setText(texto_total);
         if (tipo=="mu" || tipo=="ma" || tipo=="me" || tipo=="di"){
            texto_2v= texto_2;
            texto_2= texto_2v + "0";
         }
      }
      if(evento.getSource() == botonPunto){
         texto_1=texto.getText();
         texto_total=texto_1 + ".";
         texto.setText(texto_total);
         if (tipo=="mu" || tipo=="ma" || tipo=="me" || tipo=="di"){
            texto_2v= texto_2;
            texto_2= texto_2v + ".";
         }
      }
      if (evento.getSource() == botonAns){
         texto.setText("");
      }
      if(evento.getSource() == botonX){
         texto_1=texto.getText();
         texto_total=texto_1 + "x";
         texto.setText(texto_total);
         numero1= Float.parseFloat(texto_1);
         tipo="mu";
      }
      if(evento.getSource() == botonDiv){
         texto_1=texto.getText();
         texto_total=texto_1 + "/";
         texto.setText(texto_total);
         if (numero1==0){
            numero1= Float.parseFloat(texto_1);
         }else{
            
         }
         tipo="di";
      }
      if(evento.getSource() == botonMas){
         texto_1=texto.getText();
         texto_total=texto_1 + "+";
         texto.setText(texto_total);
         numero1= Float.parseFloat(texto_1);
         tipo="ma";
      }
      if(evento.getSource() == botonMen){
         texto_1=texto.getText();
         texto_total=texto_1 + "-";
         texto.setText(texto_total);
         numero1= Float.parseFloat(texto_1);
         tipo="me";
      }
      if(evento.getSource() == botonI){
         texto_1=texto.getText();
         texto_total=texto_1 + "";
         texto.setText(texto_total);
         numero2= Float.parseFloat(texto_2);
         if (tipo=="mu"){
            resultado=numero1*numero2;
            resultadoR= Float.toString(resultado);
            texto_total=texto_1 + "= " + resultadoR;
            texto.setText(texto_total);
         }
         if (tipo=="ma"){
            resultado=numero1+numero2;
            resultadoR= Float.toString(resultado);
            texto_total=texto_1 + "= " + resultadoR;
            texto.setText(texto_total);
         }
         if (tipo=="me"){
            resultado=numero1-numero2;
            resultadoR= Float.toString(resultado);
            texto_total=texto_1 + "= " + resultadoR;
            texto.setText(texto_total);
         }
         if (tipo=="di"){
            resultado=numero1/numero2;
            resultadoR= Float.toString(resultado);
            texto_total=texto_1 + "= " + resultadoR;
            texto.setText(texto_total);
         }

      }//=

   }//eVENTO    
   
   
}//class


