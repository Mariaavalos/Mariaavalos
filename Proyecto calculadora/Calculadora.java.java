//Hola bienevenido/s a mi humilde pero honesto codigo la
//                    CALCULADORA :)

//Empeze importando las librerias que utilizare.


import javax.swing.*;
import java.awt.event.*;  // estas librerias contiene clases con los elementos para mi interfaz
import java.awt.*;         //botones , etiquetas y demás.

public class Calculadora extends JFrame implements ActionListener{  //Creo mi clase y con "ActionListener"indico que el programa debe estar 
                                                                  //atento a los botones
//Creo mis variables , botones, y el operador que va en el switch.

private JTextField lugar;                                       
  public double primernúmero, segundonúmero; 
  public String operador;
  private JLabel etima ;                                   
  private JButton boton0, boton1, boton2, boton3, boton4, botonbo, botonmul, botonxd ,botonigu,
                  botonraiz,boton5, boton6, boton7, boton8, boton9, boton00, botonmas, botonme, botondiv;

//A continuación cree mi constructor donde puedo
//crear, modificar y editar los elementos que iran 
//en la interfaz grafica

 public Calculadora(){
  setLayout(null);//aqui indico que la ubicación de mi interfaz y botones sera atraves de coordenadas 
  setDefaultCloseOperation(EXIT_ON_CLOSE);              //el null indica que el programa debe esperar a mis ordenes. (la ubicación que ponga)

  setTitle("Calculadora de Maria");                         //con este set le agrego un titulo a mi programa
  getContentPane().setBackground(new Color(255,204,203));  //y aqui el color de fondo 
  setIconImage(new ImageIcon(getClass().getResource("/imagenes/cl.jpg")).getImage());  //por ultimo cambio el logo de java por una imagen que me gustó


  ImageIcon imagen=new ImageIcon("/imagenes/flor.jpg");
  etima =new JLabel(imagen);
  etima.setBounds(40,145,50,50);
  add(etima);


//edito y ubico el espacio donde podremos ver los números

  lugar = new JTextField();
  lugar.setBounds(10,30,250,80);
  lugar.setBackground(new Color(248, 221, 196));
  add(lugar);

//EDICIÓN DE BOTONES

  botonbo = new JButton("C");                   //Se coloca su nombre o como queremos que aparezca en la interfaz
  botonbo.setBounds(200,145,50,50);            //se da las coordenas para ubicar el boton
  botonbo.setBackground(new Color(251, 206, 222));//se eligue el color , yo hize una mezcla de rgb(red green y blue)
  add(botonbo);                                    //aqui se indica que todo lo anterior se debe aplicar a el boton 
  botonbo.addActionListener(this);                 //por ultimo indico que se tiene ques estar atento a el click del usuario
  
  boton0 = new JButton("0");
  boton0.setBounds(20,350,50,70);
  boton0.setBackground(new Color(245, 183, 200));
  add(boton0);
  boton0.addActionListener(this);

  boton00 = new JButton("00");
  boton00.setBounds(80,350,50,70);
  boton00.setBackground(new Color(245, 183, 200));
  add(boton00);
  boton00.addActionListener(this);

  botonigu = new JButton("=");
  botonigu.setBounds(200,350,50,70);
  botonigu.setBackground(new Color(234, 101, 101));
  add(botonigu);
  botonigu.addActionListener(this);

  boton1 = new JButton("1");
  boton1.setBounds(20,300,50,30);
  boton1.setBackground(new Color(251, 206, 222 ));
  add(boton1);
  boton1.addActionListener(this);

  boton4 = new JButton("4");
  boton4.setBounds(20,250,50,30);
  boton4.setBackground(new Color(251, 206, 222 ));
  add(boton4);
  boton4.addActionListener(this);

  boton7 = new JButton("7");
  boton7.setBounds(20,200,50,30);
  boton7.setBackground(new Color(251, 206, 222 ));
  add(boton7);
  boton7.addActionListener(this);

  boton2 = new JButton("2");
  boton2.setBounds(80,300,50,30);
  boton2.setBackground(new Color(251, 206, 222 ));
  add(boton2);
  boton2.addActionListener(this);

  boton5 = new JButton("5");
  boton5.setBounds(80,250,50,30);
  boton5.setBackground(new Color(251, 206, 222 ));
  add(boton5);
  boton5.addActionListener(this);

  boton8 = new JButton("8");
  boton8.setBounds(80,200,50,30);
  boton8.setBackground(new Color(251, 206, 222 ));
  add(boton8);
  boton8.addActionListener(this);

  boton3 = new JButton("3");
  boton3.setBounds(140,300,50,30);
  boton3.setBackground(new Color(251, 206, 222 ));
  add(boton3);
  boton3.addActionListener(this);

  boton6 = new JButton("6");
  boton6.setBounds(140,250,50,30);
  boton6.setBackground(new Color(251, 206, 222 ));
  add(boton6);
  boton6.addActionListener(this);

  boton9 = new JButton("9");
  boton9.setBounds(140,200,50,30);
  boton9.setBackground(new Color(251, 206, 222 ));
  add(boton9);
  boton9.addActionListener(this);

  botonmas = new JButton("+");
  botonmas.setBounds(140,350,50,70);
  botonmas.setBackground(new Color(245, 183, 200));
  add(botonmas);
  botonmas.addActionListener(this);

  botonme= new JButton("-");
  botonme.setBounds(200,280,50,50);
  botonme.setBackground(new Color(245, 183, 200));
  add(botonme); 
  botonme.addActionListener(this);

  botonmul= new JButton("x");
  botonmul.setBounds(200,280,50,50);
  botonmul.setBackground(new Color(212, 183, 200));
  add(botonmul); 
  botonmul.addActionListener(this);


  botondiv= new JButton("/");
  botondiv.setBounds(200,220,50,50 );
  botondiv.setBackground(new Color(245, 183, 200));
  add(botondiv); 
  botondiv.addActionListener(this);

  botonraiz= new JButton("\u221A ");
  botonraiz.setBounds(140,145,50,50 );
  botonraiz.setBackground(new Color(245, 183, 200));
  add(botonraiz); 
  botonraiz.addActionListener(this);

  botonxd=new JButton("x^2");
  botonxd.setBounds(80,145,50,50);
  botonxd.setBackground(new Color(245, 183, 200));
  add(botonxd); 
  botonxd.addActionListener(this);

 }
 
 public void actionPerformed(ActionEvent m){
  if(m.getSource() == boton0){
    lugar.setText(lugar.getText()+"0");
  }
   if(m.getSource() == boton00){
     lugar.setText(lugar.getText()+"00");
  }
   if(m.getSource() == botonmas){
   primernúmero=Double.parseDouble(lugar.getText());
   operador="+";
   lugar.setText("");
  }
   if(m.getSource() == botonme){
   primernúmero=Double.parseDouble(lugar.getText());
   operador="-";
   lugar.setText("");
  }
   if(m.getSource() == botonmul){
   primernúmero=Double.parseDouble(lugar.getText());
   lugar.setText("");
   operador="x";
  }
   if(m.getSource() == botondiv){
   primernúmero=Double.parseDouble(lugar.getText());
   lugar.setText("");
   operador="/";
  }
  if(m.getSource() == boton1){
    lugar.setText(lugar.getText() + "1");
  }
  if(m.getSource() == boton2){
     lugar.setText(lugar.getText() + "2");
  }
  if(m.getSource() == boton3){
    lugar.setText(lugar.getText() + "3");
  }
  if(m.getSource() == boton4){
    lugar.setText(lugar.getText() + "4");
  }
  if(m.getSource() == boton5){
     lugar.setText(lugar.getText() + "5");
  }
  if(m.getSource() == boton6){
     lugar.setText(lugar.getText() + "6");
  }
  if(m.getSource() == boton7){
     lugar.setText(lugar.getText() + "7");
  }
  if(m.getSource() == boton8){
     lugar.setText(lugar.getText() + "8");
  }
  if(m.getSource() == boton9){
     lugar.setText(lugar.getText() + "9");
  }
  if(m.getSource() == botonbo){
     lugar.setText("");
  }
   if(m.getSource() == botonraiz){
      primernúmero=Double.parseDouble(lugar.getText());
  
      if(primernúmero>=0){
         double sqrt= Math.sqrt(primernúmero);
         lugar.setText(String.valueOf(sqrt));
      }else{
        lugar.setText("error: numero invalido");
      }
   }
   if(m.getSource() == botonxd){
     primernúmero=Double.parseDouble(lugar.getText());
     double square = Math.pow(primernúmero,2);
     lugar.setText(String.valueOf(square));
  }
  
   if(m.getSource() == botonigu){
   segundonúmero=Double.parseDouble(lugar.getText());
  
    switch(operador){
      case"+": lugar.setText(String.valueOf(primernúmero + segundonúmero ));
      break;
      
      case"-": lugar.setText(String.valueOf(primernúmero - segundonúmero ));
      break;
     
      case"x": lugar.setText(String.valueOf(primernúmero * segundonúmero ));
      break;
      
      case"/": if(segundonúmero==0){lugar.setText("ERROR: no es posible dividir por 0");
      }else{
      lugar.setText(String.valueOf(primernúmero / segundonúmero ));
      } 
      break;  
    }
   }
  }


 public static void main(String args []){
  Calculadora calculadora = new Calculadora();
  calculadora.setBounds(0,0,300,500);
  calculadora.setVisible(true);
  calculadora.setResizable(false);
  calculadora.setLocationRelativeTo(null);
 }
}
