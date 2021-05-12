package IICTCafe;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Timer;



public class demo extends JFrame implements ActionListener  {
	private Container C;
	private JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15,btn16,btn17,
	                btn18,btn19,btn20,btn21,btn22,btn23,btn24,btn25,btn26;
	private ImageIcon icon,btnicon1,btnicon2,btnicon3,btnicon4,btnicon5,btnicon6,btnicon7,btnicon8,btnicon9,btnicon10,
	              btnicon11,btnicon12,btnicon13,btnicon14,btnicon15,btnicon16,btnicon17,btnicon18,btnicon19,btnicon20,btnicon21,btnicon22,btnicon23,btnicon24;
	private JLabel Label1,Label2,Label3,Label4, Label5,Label6,Label7,Label8,Label9,Label10,Label11,Label12,Label13,Label14,Label15,
	         Label16,Label17,Label18,Label19, Label20, Label21,Label22,Label23,Label24,Label25,Label26;
	private Font f,f1,f2;
	public int rowx= 300,rowy=150;
	public int cnt=0,cnt1,cnt2,cnt3,cnt4,cnt5,cnt6,cnt7,cnt8,cnt9,cnt10,cnt11,cnt12,cnt13,cnt14,cnt15,cnt16,cnt17,cnt18,cnt19,cnt20,cnt21,cnt22,cnt23,cnt24;
	 Date obd = new Date();
     Timer obt = new Timer();
	private JTextArea jarea;
	
        demo()
        {
        	initcompo();
        }
        public void initcompo()
        {
        	this.setBounds(0, 0, 1370,750);
        	this.setVisible(true);
        	this.setResizable(false);
        	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	this.setTitle("IICT Cafe");
        	
        	C= this.getContentPane();
        	C.setLayout(null);
        	
        	icon = new ImageIcon("src/images.jpg");
        	this.setIconImage(icon.getImage());
        	
        	f= new Font("Arial",Font.PLAIN,40);
        	f1= new Font("Arial",Font.PLAIN,14);
        	f2= new Font("Arial",Font.PLAIN,20);
        	
        	Label1= new JLabel("IICT Cafe Management System");
        	Label1.setBounds(400, 0, 700,120);
        	Label1.setFont(f);
        	C.add(Label1);
        	
        	Label2= new JLabel();
        	Label2.setBounds(350, 130, 700,10);
        	Label2.setBackground(Color.black);
        	C.add(Label2);
        	
        	btn1 =new JButton();
        	btn1.setBounds(rowx,rowy,100,80);
        	btnicon1 = new ImageIcon("src/Khicuri.jpg");
        	btn1.setIcon(btnicon1);
        	Label3= new JLabel("Khicuri");
        	Label3.setBounds(rowx,rowy+80,100,20);
        	C.add(Label3);
        	C.add(btn1);
        	
        	
        
        	
        	btn14 =new JButton();
        	btn14.setBounds(rowx+50+100,rowy,100,80);
        	btnicon14 = new ImageIcon("src/Rice.jpg");
        	btn14.setIcon(btnicon14);
        	Label4= new JLabel("Rice");
        	Label4.setBounds(rowx+50+100,rowy+80,100,20);
        	C.add(Label4);
        	C.add(btn14);
        	
        	
        	btn2 =new JButton();
        	btn2.setBounds(rowx+50*2+2*100,rowy,100,80);
        	btnicon2 = new ImageIcon("src/Chikenkhicuri.jpg");
        	btn2.setIcon(btnicon2);
        	Label5= new JLabel("Chiken Khicuri");
        	Label5.setBounds(rowx+50*2+2*100,rowy+80,100,20);
        	C.add(Label5);
        	C.add(btn2);
        	
        	btn3 =new JButton();
        	btn3.setBounds(rowx+50*3+3*100,rowy,100,80);
        	btnicon3 = new ImageIcon("src/Porota.jpg");
        	btn3.setIcon(btnicon3);
        	Label6= new JLabel("Porota");
        	Label6.setBounds(rowx+50*3+3*100,rowy+80,100,20);
        	C.add(Label6);
        	C.add(btn3);
        	
        	btn4 =new JButton();
        	btn4.setBounds(rowx+50*4+4*100,rowy,100,80);
        	btnicon4 = new ImageIcon("src/Jhalfry.jpg");
        	btn4.setIcon(btnicon4);
        	Label7= new JLabel("Jhalfry");
        	Label7.setBounds(rowx+50*4+4*100,rowy+80,100,20);
        	C.add(Label7);
        	C.add(btn4);
        	
        	btn5 =new JButton();
        	btn5.setBounds(rowx+50*5+5*100,rowy,100,80);
        	btnicon5 = new ImageIcon("src/Beef.jpg");
        	btn5.setIcon(btnicon5);
        	Label8= new JLabel("Beef");
        	Label8.setBounds(rowx+50*5+5*100,rowy+80,100,20);
        	C.add(Label8);
        	C.add(btn5);
        	
        	btn6 =new JButton();
        	btn6.setBounds(rowx+50*6+6*100,rowy,100,80);
        	btnicon6 = new ImageIcon("src/Matton.jpg");
        	btn6.setIcon(btnicon6);
        	Label9= new JLabel("Matton");
        	Label9.setBounds(rowx+50*6+6*100,rowy+80,100,20);
        	C.add(Label9);
        	C.add(btn6);
        	
        	btn7 =new JButton();
        	btn7.setBounds(rowx,rowy+150,100,80);
        	btnicon7 = new ImageIcon("src/Mashpoteto.jpg");
        	btn7.setIcon(btnicon7);
        	Label10= new JLabel("mashed Potato");
        	Label10.setBounds(rowx,rowy+150+80,100,20);
        	C.add(Label10);
        	C.add(btn7);
        	
        	btn8 =new JButton();
        	btn8.setBounds(rowx+50+100,rowy+150,100,80);
        	btnicon8 = new ImageIcon("src/Fish.jpg");
        	btn8.setIcon(btnicon8);
        	Label11= new JLabel("Fish");
        	Label11.setBounds(rowx+50+100,rowy+150+80,100,20);
        	C.add(Label11);
        	C.add(btn8);
        	
        	btn9 =new JButton();
        	btn9.setBounds(rowx+50*2+100*2,rowy+150,100,80);
        	btnicon9 = new ImageIcon("src/Eggfry.jpg");
        	btn9.setIcon(btnicon9);
        	Label12= new JLabel("Egg Fry");
        	Label12.setBounds(rowx+50*2+2*100,rowy+150+80,100,20);
        	C.add(Label12);
        	C.add(btn9);
        	
        	btn10 =new JButton();
        	btn10.setBounds(rowx+50*3+100*3,rowy+150,100,80);
        	btnicon10 = new ImageIcon("src/Eggmumlate.jpg");
        	btn10.setIcon(btnicon10);
        	Label13= new JLabel("Egg Omlette");
        	Label13.setBounds(rowx+50*3+100*3,rowy+150+80,100,20);
        	C.add(Label13);
        	C.add(btn10);
        	
        	btn11 =new JButton();
        	btn11.setBounds(rowx+50*4+100*4,rowy+150,100,80);
        	btnicon11 = new ImageIcon("src/Mugdal.jpg");
        	btn11.setIcon(btnicon11);
        	Label15= new JLabel("Mugdal");
        	Label15.setBounds(rowx+50*4+100*4,rowy+150+80,100,20);
        	C.add(Label15);
        	C.add(btn11);
        	
        	btn12 =new JButton();
        	btn12.setBounds(rowx+50*5+100*5,rowy+150,100,80);
        	btnicon12 = new ImageIcon("src/Vegetable.jpg");
        	btn12.setIcon(btnicon12);
        	Label16= new JLabel("Vegetable");
        	Label16.setBounds(rowx+50*5+100*5,rowy+150+80,100,20);
        	C.add(Label16);
        	C.add(btn12);
        	
        	btn13 =new JButton();
        	btn13.setBounds(rowx+50*6+100*6,rowy+150,100,80);
        	btnicon13 = new ImageIcon("src/Vorta.jpg");
        	btn13.setIcon(btnicon13);
        	Label17= new JLabel("Varieties ");
        	Label17.setBounds(rowx+50*6+100*6,rowy+150+80,100,20);
        	C.add(Label17);
        	C.add(btn13);
        	
        	btn15 =new JButton();
        	btn15.setBounds(rowx,rowy+2*150,100,80);
        	btnicon15 = new ImageIcon("src/Lalcha.jpg");
        	btn15.setIcon(btnicon15);
        	Label18= new JLabel(" Tea");
        	Label18.setBounds(rowx,rowy+2*150+80,100,20);
        	C.add(Label18);
        	C.add(btn15);
        	

        	btn24 =new JButton();
        	btn24.setBounds(rowx+50+100,rowy+2*150,100,80);
        	btnicon16 = new ImageIcon("src/Coffee.jpg");
        	btn24.setIcon(btnicon16);
        	Label19= new JLabel("coffee");
        	Label19.setBounds(rowx+50+100,rowy+2*150+80,100,20);
        	C.add(Label19);
        	C.add(btn24);
        	
        	btn16 =new JButton();
        	btn16.setBounds(rowx+50*2+100*2,rowy+2*150,100,80);
        	btnicon17 = new ImageIcon("src/Dudcha.jpg");
        	btn16.setIcon(btnicon17);
        	Label19= new JLabel("Milk Tea");
        	Label19.setBounds(rowx+50*2+100*2,rowy+2*150+80,100,20);
        	C.add(Label19);
        	C.add(btn16);
        	
        	btn17 =new JButton();
        	btn17.setBounds(rowx+50*3+100*3,rowy+2*150,100,80);
        	btnicon18 = new ImageIcon("src/Coce.jpg");
        	btn17.setIcon(btnicon18);
        	Label20= new JLabel("Coke");
        	Label20.setBounds(rowx+50*3+100*3,rowy+2*150+80,100,20);
        	C.add(Label20);
        	C.add(btn17);
        	
        	
        	btn18 =new JButton();
        	btn18.setBounds(rowx+50*4+100*4,rowy+2*150,100,80);
        	btnicon19 = new ImageIcon("src/Fanta.jpg");
        	btn18.setIcon(btnicon19);
        	Label21= new JLabel("Fanta");
        	Label21.setBounds(rowx+50*4+100*4,rowy+2*150+80,100,20);
        	C.add(Label21);
        	C.add(btn18);
        	
        	
        	btn19 =new JButton();
        	btn19.setBounds(rowx+50*5+100*5,rowy+2*150,100,80);
        	btnicon20 = new ImageIcon("src/Water.jpg");
        	btn19.setIcon(btnicon20);
        	Label22= new JLabel("Water");
        	Label22.setBounds(rowx+50*5+100*5,rowy+2*150+80,100,20);
        	C.add(Label22);
        	C.add(btn19);
        	
        	btn20 =new JButton();
        	btn20.setBounds(rowx+50*6+100*6,rowy+2*150,100,80);
        	btnicon21 = new ImageIcon("src/Pepsi.jpg");
        	btn20.setIcon(btnicon21);
        	Label23= new JLabel("Pepsi");
        	Label23.setBounds(rowx+50*6+100*6,rowy+2*150+80,100,20);
        	C.add(Label23);
        	C.add(btn20);
        	
        	btn21 =new JButton();
        	btn21.setBounds(rowx,rowy+3*150,100,80);
        	btnicon22 = new ImageIcon("src/Muglai.jpg");
        	btn21.setIcon(btnicon22);
        	Label24= new JLabel("Muglai Porota");
        	Label24.setBounds(rowx,rowy+3*150+80,100,20);
        	C.add(Label24);
        	C.add(btn21);
        	
        	btn22 =new JButton();
        	btn22.setBounds(rowx+50+100,rowy+3*150,100,80);
        	btnicon23 = new ImageIcon("src/Fry.jpg");
        	btn22.setIcon(btnicon23);
        	Label24= new JLabel("Friends Fry");
        	Label24.setBounds(rowx+50+100,rowy+3*150+80,100,20);
        	C.add(Label24);
        	C.add(btn22);
        	
        	btn23 =new JButton();
        	btn23.setBounds(rowx+50*2+100*2,rowy+3*150,100,80);
        	btnicon24 = new ImageIcon("src/Pudding.jpg");
        	btn23.setIcon(btnicon24);
        	Label25= new JLabel("Pudding");
        	Label25.setBounds(rowx+50*2+100*2,rowy+3*150+80,100,20);
        	C.add(Label25);
        	C.add(btn23);
        	
        	jarea = new JTextArea();
        	jarea.setBounds(20,190, 260, 410);
        	jarea.setFont(f1);
        	C.add(jarea); 
        	
        	Label26 =new JLabel("Money Receipt");
        	Label26.setBounds(90, 150, 200,30);
        	Label26.setFont(f2);
        	C.add(Label26);
        	
        	btn25 = new JButton ("Print");
        	btn25.setBounds(20, 620, 120, 50);
        	btn25.setFont(f2);
        	C.add(btn25);
        	
        	btn26 = new JButton ("Reset");
        	btn26.setBounds(160, 620, 120, 50);
        	btn26.setFont(f2);
        	C.add(btn26);
        	
        	btn1.addActionListener(this);
        	btn2.addActionListener(this);
        	btn3.addActionListener(this);
        	btn4.addActionListener(this);
        	btn5.addActionListener(this);
        	btn6.addActionListener(this);
        	btn7.addActionListener(this);
        	btn8.addActionListener(this);
        	btn9.addActionListener(this);
        	btn10.addActionListener(this);
        	btn11.addActionListener(this);
        	btn12.addActionListener(this);
        	btn13.addActionListener(this);
        	btn14.addActionListener(this);
        	btn15.addActionListener(this);
        	btn16.addActionListener(this);
        	btn17.addActionListener(this);
        	btn18.addActionListener(this);
        	btn19.addActionListener(this);
        	btn20.addActionListener(this);
        	btn21.addActionListener(this);
        	btn22.addActionListener(this);
        	btn23.addActionListener(this);
        	btn24.addActionListener(this);
        	btn25.addActionListener(this);
        	btn26.addActionListener(this);
        	
        	
        }
	public static void main(String[] args) {
		
		demo rest = new demo();
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
	
		jarea.setText("\n");
        jarea.setText(jarea.getText()+"*****************************************************\n");
       jarea.setText(jarea.getText()+"\tIICT Cafe\t\n");
        jarea.setText(jarea.getText()+"____________________________________________\n");
        jarea.setText(jarea.getText()+"Quantity\t  Item\t Price\n\n");
		
       
//        
//         String date = obd.toString();
//         String time = obt.toString();
//         
//         jarea.setText(jarea.getText()+date+"\t");
        
		if(btn1==e.getSource())
		{   
		   cnt1++;
		 if(cnt1==1)
		 
		    jarea.setText(jarea.getText()+"  "+cnt1+"                 Khicuri     \t"+25+"/=");
	
//	     else  
//	    	jarea.setText(jarea.getText()+"  "+cnt1+"                 Khicuri     \t"+25*cnt1+"/=");
		      	
		}
		 
		else if(btn2==e.getSource())
		{ 
		  cnt2++;
//	      if(cnt2==1)
//		    jarea.setText(jarea.getText()+"  "+cnt2+"                Chiken khicuri \t"+60+"/=\n");
//	     else
//	    	jarea.setText(jarea.getText()+"  "+cnt2+"               Chiken Khicuri \t"+60*cnt2+"/=\n");
			
		}
		else if(btn3==e.getSource())
		{
		
			cnt3++;
//		    if(cnt3==1)
//			    jarea.setText(jarea.getText()+"  "+cnt3+"                 porota       \t"+05+"/=\n");
//		    else
//		    	jarea.setText(jarea.getText()+"  "+cnt3+"                 porota      \t"+05*cnt3+"/=\n");
		}
		else if(btn4==e.getSource())
		{
			cnt4++;
//		    if(cnt4==1)
//			    jarea.setText(jarea.getText()+"  "+cnt4+"                 Jhal Fry     \t"+40+"/=\n");
//		    else
//		    	jarea.setText(jarea.getText()+"  "+cnt4+"                 Jhal Fry      \t"+40*cnt4+"/=\n");
		}
		else if(btn5==e.getSource())
		{
			cnt5++;
//		    IF(CNT5==1)
//			    Jarea.setText(jarea.getText()+"  "+cnt5+"                 Beef        \t"+100+"/=\n");
//		    else
//		    	jarea.setText(jarea.getText()+"  "+cnt5+"                 Beef        \t"+100*cnt5+"/=\n");
			
		}
		else if(btn6==e.getSource())
		{
			cnt6++;
//		    if(cnt6==1)
//			    jarea.setText(jarea.getText()+"  "+cnt6+"                 Matton       \t"+110+"/=\n");
//		    else
//		    	jarea.setText(jarea.getText()+"  "+cnt6+"                 Matton       \t"+110*cnt6+"/=\n");
		}
		else if(btn7==e.getSource())
		{
			cnt7++;
//		    if(cnt7==1)
//			    jarea.setText(jarea.getText()+"  "+cnt7+"              Mashed Potato      \t"+10+"/=\n");
//		    else
//		    	jarea.setText(jarea.getText()+"  "+cnt7+"              Mashed Potato      \t"+10*cnt7+"/=\n");
		}
		else if(btn8==e.getSource())
		{
			cnt8++;
//		    IF(CNT8==1)
//			    Jarea.setText(jarea.getText()+"  "+cnt8+"                 Fish         \t"+55+"/=\n");
//		    else
//		    	jarea.setText(jarea.getText()+"  "+cnt8+"                 Fish         \t"+55*cnt8+"/=\n");
		}
		else if(btn9==e.getSource())
		{
			cnt9++;
//		    if(cnt9==1)
//			    jarea.setText(jarea.getText()+"  "+cnt9+"                 Egg Fry      \t"+15+"/=\n");
//		    else
//		    	jarea.setText(jarea.getText()+"  "+cnt9+"                 Egg Fry      \t"+15*cnt9+"/=\n");
		}
		else if(btn10==e.getSource())
		{
			cnt10++;
//		    if(cnt10==1)
//			    jarea.setText(jarea.getText()+"  "+cnt10+"               Egg Omlate      \t"+15+"/=\n");
//		    else
//		    	jarea.setText(jarea.getText()+"  "+cnt10+"               Egg Omlate      \t"+15*cnt10+"/=\n");
		}
		else if(btn11==e.getSource())
		{
			cnt11++;
//		    if(cnt11==1)
//			    jarea.setText(jarea.getText()+"  "+cnt11+"                 Mugdal      \t"+15+"/=\n");
//		    else
//		    	jarea.setText(jarea.getText()+"  "+cnt11+"                 Mugdal      \t"+15*cnt11+"/=\n");
		}
		else if(btn12==e.getSource())
		{
			cnt12++;
//		    if(cnt12==1)
//			    jarea.setText(jarea.getText()+"  "+cnt12+"                Vegetable      \t"+15+"/=\n");
//		    else
//		    	jarea.setText(jarea.getText()+"  "+cnt12+"                Vegetable      \t"+15*cnt12+"/=\n");
		}
		else if(btn13==e.getSource())
		{
			cnt13++;
//		    if(cnt13==1)
//			    jarea.setText(jarea.getText()+"  "+cnt13+"                Varieties      \t"+35+"/=\n");
//		    else
//		    	jarea.setText(jarea.getText()+"  "+cnt13+"                Varieties      \t"+35*cnt13+"/=\n");
		}
		else if(btn14==e.getSource())
		{
			cnt14++;
//		    if(cnt14==1)
//			    jarea.setText(jarea.getText()+"  "+cnt14+"                 Rice         \t"+20+"/=\n");
//		    else
//		    	jarea.setText(jarea.getText()+"  "+cnt14+"                 Rice         \t"+20*cnt14+"/=\n");
		}
		else if(btn15==e.getSource())
		{
			cnt15++;
//		    if(cnt15==1)
//			    jarea.setText(jarea.getText()+"  "+cnt15+"                 Tea            \t"+05+"/=\n");
//		    else
//		    	jarea.setText(jarea.getText()+"  "+cnt15+"                 Tea            \t"+05*cnt15+"/=\n");
		}
		else if(btn16==e.getSource())
		{
			cnt16++;
//		    if(cnt16==1)
//			    jarea.setText(jarea.getText()+"  "+cnt16+"                Milk Tea       \t"+10+"/=\n");
//		    else
//		    	jarea.setText(jarea.getText()+"  "+cnt16+"                Milk Tea       \t"+10*cnt16+"/=\n");
		}
		else if(btn17==e.getSource())
		{
			cnt17++;
//		    if(cnt17==1)
//			    jarea.setText(jarea.getText()+"  "+cnt17+"                 Coffee        \t"+15+"/=\n");
//		    else
//		    	jarea.setText(jarea.getText()+"  "+cnt17+"                 Coffee        \t"+15*cnt17+"/=\n");
		}
		else if(btn18==e.getSource())
		{
			cnt18++;
//		    if(cnt18==1)
//			    jarea.setText(jarea.getText()+"  "+cnt18+"                  Coke        \t"+20+"/=\n");
//		    else
//		    	jarea.setText(jarea.getText()+"  "+cnt18+"                  Coke        \t"+20*cnt18+"/=\n");
		}
		else if(btn19==e.getSource())
		{
			cnt19++;
//		    if(cnt19==1)
//			    jarea.setText(jarea.getText()+"  "+cnt19+"                 Fanta        \t"+20+"/=\n");
//		    else
//		    	jarea.setText(jarea.getText()+"  "+cnt19+"                 Fanta        \t"+20*cnt19+"/=\n");
		}
		else if(btn20==e.getSource())
		{
			cnt20++;
//		    if(cnt20==1)
//			    jarea.setText(jarea.getText()+"  "+cnt20+"                 Water        \t"+15+"/=\n");
//		    else
//		    	jarea.setText(jarea.getText()+"  "+cnt20+"                 Water        \t"+15*cnt20+"/=\n");
		}
		else if(btn21==e.getSource())
		{
			cnt21++;
//		    if(cnt21==1)
//			    jarea.setText(jarea.getText()+"  "+cnt21+"                 Pepsi       \t"+20+"/=\n");
//		    else
//		    	jarea.setText(jarea.getText()+"  "+cnt21+"                 Pepsi       \t"+20*cnt21+"/=\n");
		}
		else if(btn22==e.getSource())
		{
			cnt22++;
//		    if(cnt22==1)
//			    jarea.setText(jarea.getText()+"  "+cnt22+"                 Muglai       \t"+40+"/=\n");
//		    else
//		    	jarea.setText(jarea.getText()+"  "+cnt22+"                 Muglai       \t"+40*cnt22+"/=\n");
		}
		else if(btn23==e.getSource())
		{
			cnt23++;
//		    if(cnt23==1)
//			    jarea.setText(jarea.getText()+"  "+cnt23+"              Friends Fry       \t"+20+"/=\n");
//		    else
//		    	jarea.setText(jarea.getText()+"  "+cnt23+"              Friends Fry       \t"+20*cnt23+"/=\n");
		}
		else if(btn24==e.getSource())
		{
			cnt24++;
//		    if(cnt24==1)
//			    jarea.setText(jarea.getText()+"  "+cnt24+"                Pudding       \t"+05+"/=\n");
//		    else
//		    	jarea.setText(jarea.getText()+"  "+cnt24+"                Pudding       \t"+05*cnt24+"/=\n");
		}
		else if(btn25==e.getSource())
		{
//			jarea.print();
			
		}
		
		
		if(cnt1>1)jarea.setText(jarea.getText()+"  "+cnt1+"                 Khicuri     \t"+25*cnt1+"/=\n");
		if(cnt1==1)jarea.setText(jarea.getText()+"  "+cnt1+"                 Khicuri     \t"+25+"/=\n");
		if(cnt2>0)jarea.setText(jarea.getText()+"  "+cnt2+"              Chiken Khicuri \t"+60*cnt2+"/=\n");
		if(cnt3>0)jarea.setText(jarea.getText()+"  "+cnt3+"                 porota      \t"+05*cnt3+"/=\n");
		if(cnt4>0)jarea.setText(jarea.getText()+"  "+cnt4+"               Jhal Fry      \t"+40*cnt4+"/=\n");
		if(cnt5>0)jarea.setText(jarea.getText()+"  "+cnt5+"                 Beef        \t"+100*cnt5+"/=\n");
		if(cnt6>0)jarea.setText(jarea.getText()+"  "+cnt6+"                Matton       \t"+110*cnt6+"/=\n");
		if(cnt7>0)jarea.setText(jarea.getText()+"  "+cnt7+"           Mashed Potato    \t"+10*cnt7+"/=\n");
		if(cnt8>0)jarea.setText(jarea.getText()+"  "+cnt8+"                 Fish        \t"+55*cnt8+"/=\n");
		if(cnt9>0)jarea.setText(jarea.getText()+"  "+cnt9+"                Egg Fry      \t"+15*cnt9+"/=\n");
		if(cnt10>0)jarea.setText(jarea.getText()+"  "+cnt10+"               Egg Omlate      \t"+15*cnt10+"/=\n");
		
		if(cnt11>0)jarea.setText(jarea.getText()+"  "+cnt11+"                 Mugdal      \t"+15*cnt11+"/=\n");
		if(cnt12>0)jarea.setText(jarea.getText()+"  "+cnt12+"               Vegetable      \t"+15*cnt12+"/=\n");
		if(cnt13>0)jarea.setText(jarea.getText()+"  "+cnt13+"               Varieties      \t"+35*cnt13+"/=\n");
		if(cnt14>0)jarea.setText(jarea.getText()+"  "+cnt14+"                 Rice         \t"+20*cnt14+"/=\n");
		if(cnt15>0)jarea.setText(jarea.getText()+"  "+cnt15+"                 Tea            \t"+05*cnt15+"/=\n");
		if(cnt16>0)jarea.setText(jarea.getText()+"  "+cnt16+"               Milk Tea       \t"+10*cnt16+"/=\n");
		if(cnt17>0)jarea.setText(jarea.getText()+"  "+cnt17+"                Coffee        \t"+15*cnt17+"/=\n");
		if(cnt18>0)jarea.setText(jarea.getText()+"  "+cnt18+"                  Coke        \t"+20*cnt18+"/=\n");
		if(cnt19>0)jarea.setText(jarea.getText()+"  "+cnt19+"                 Fanta        \t"+20*cnt19+"/=\n");
		if(cnt20>0)jarea.setText(jarea.getText()+"  "+cnt20+"                 Water        \t"+15*cnt20+"/=\n");
		
		if(cnt21>0)jarea.setText(jarea.getText()+"  "+cnt21+"                 Pepsi       \t"+20*cnt21+"/=\n");
		if(cnt22>0)jarea.setText(jarea.getText()+"  "+cnt22+"                 Muglai       \t"+40*cnt22+"/=\n");
		if(cnt23>0)jarea.setText(jarea.getText()+"  "+cnt23+"              Friends Fry      \t"+20*cnt23+"/=\n");
		if(cnt24>0)jarea.setText(jarea.getText()+"  "+cnt24+"                Pudding       \t"+05*cnt24+"/=\n");
		
		
		
		
		
		
		
		
		 if(btn26==e.getSource())
			{
				jarea.getText();
				jarea.setText(" ");
				
			}
			
	}

}
