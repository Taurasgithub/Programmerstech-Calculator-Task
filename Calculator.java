import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener{
    JFrame f;
    Container c;
    JPanel p1;
    JPanel p2;

    JLabel l1,l2,lbl;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0;
    JButton badd,bsub,bmult,bdiv,bmod,bcalc,bclr,bpts,bneg,bback;
    double xd;
    double num1,num2,check;

    Calculator(){
        f= new JFrame("Calculator");

        ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("icon/Calc.jpg"));
        Image img = icon.getImage();
        Image scaledImage = img.getScaledInstance(112,112,Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        f.setIconImage(scaledIcon.getImage());

        c = f.getContentPane();
        c.setLayout(new BorderLayout());

        p1 = new JPanel(null);
        p1.setPreferredSize(new Dimension(320,100));
        p1.setBackground(Color.LIGHT_GRAY);

        l2=new JLabel("");
        l2.setFont(new Font("serif", Font.PLAIN, 15));
        l2.setBounds(10,0,320,100);
        p1.add(l2);

        l1=new JLabel("");
        l1.setFont(new Font("serif", Font.PLAIN, 30));
        l1.setBounds(10,20,320,100);
        p1.add(l1);


        p2 = new JPanel(null);
        p2.setBackground(Color.BLACK);

        lbl = new JLabel("CASIO");
        lbl.setBounds(140,0,60,60);
        lbl.setForeground(Color.LIGHT_GRAY);
        p2.add(lbl);

        bclr=new JButton("C");
        bclr.setBackground(Color.GRAY);
        bclr.setForeground(Color.WHITE);
        bclr.setBounds(15,50,60,55);
        bclr.setFont(new Font("serif", Font.PLAIN, 18));

        bback=new JButton("CE");
        bback.setBackground(Color.GRAY);
        bback.setForeground(Color.WHITE);
        bback.setBounds(15,50,60,55);
        bback.setBounds(93,50,60,55);
        bback.setFont(new Font("serif", Font.PLAIN, 18));

        bmod=new JButton("%");
        bmod.setBackground(Color.GRAY);
        bmod.setForeground(Color.WHITE);
        bmod.setBounds(15,50,60,55);
        bmod.setBounds(171,50,60,55);
        bmod.setFont(new Font("serif", Font.PLAIN, 18));

        bdiv=new JButton("/");
        bdiv.setBackground(Color.GRAY);
        bdiv.setForeground(Color.WHITE);
        bdiv.setBounds(15,50,60,55);
        bdiv.setBounds(250,50,60,55);
        bdiv.setFont(new Font("serif", Font.PLAIN, 18));

        b7=new JButton("7");
        b7.setBackground(Color.GRAY);
        b7.setForeground(Color.WHITE);
        b7.setBounds(15,50,60,55);
        b7.setBounds(15,120,60,55);
        b7.setFont(new Font("serif", Font.PLAIN, 18));

        b8=new JButton("8");
        b8.setBackground(Color.GRAY);
        b8.setForeground(Color.WHITE);
        b8.setBounds(15,50,60,55);
        b8.setBounds(93,120,60,55);
        b8.setFont(new Font("serif", Font.PLAIN, 18));

        b9=new JButton("9");
        b9.setBackground(Color.GRAY);
        b9.setForeground(Color.WHITE);
        b9.setBounds(15,50,60,55);
        b9.setBounds(171,120,60,55);
        b9.setFont(new Font("serif", Font.PLAIN, 18));

        bmult=new JButton("*");
        bmult.setBackground(Color.GRAY);
        bmult.setForeground(Color.WHITE);
        bmult.setBounds(15,50,60,55);
        bmult.setBounds(250,120,60,55);
        bmult.setFont(new Font("serif", Font.PLAIN, 18));

        b4=new JButton("4");
        b4.setBackground(Color.GRAY);
        b4.setForeground(Color.WHITE);
        b4.setBounds(15,50,60,55);
        b4.setBounds(15,190,60,55);
        b4.setFont(new Font("serif", Font.PLAIN, 18));

        b5=new JButton("5");
        b5.setBackground(Color.GRAY);
        b5.setForeground(Color.WHITE);
        b5.setBounds(15,50,60,55);
        b5.setBounds(93,190,60,55);
        b5.setFont(new Font("serif", Font.PLAIN, 18));

        b6=new JButton("6");
        b6.setBackground(Color.GRAY);
        b6.setForeground(Color.WHITE);
        b6.setBounds(15,50,60,55);
        b6.setBounds(171,190,60,55);
        b6.setFont(new Font("serif", Font.PLAIN, 18));

        bsub=new JButton("-");
        bsub.setBackground(Color.GRAY);
        bsub.setForeground(Color.WHITE);
        bsub.setBounds(15,50,60,55);
        bsub.setBounds(250,190,60,55);
        bsub.setFont(new Font("serif", Font.PLAIN, 18));

        b1=new JButton("1");
        b1.setBackground(Color.GRAY);
        b1.setForeground(Color.WHITE);
        b1.setBounds(15,50,60,55);
        b1.setBounds(15,260,60,55);
        b1.setFont(new Font("serif", Font.PLAIN, 18));

        b2=new JButton("2");
        b2.setBackground(Color.GRAY);
        b2.setForeground(Color.WHITE);
        b2.setBounds(15,50,60,55);
        b2.setBounds(93,260,60,55);
        b2.setFont(new Font("serif", Font.PLAIN, 18));

        b3=new JButton("3");
        b3.setBackground(Color.GRAY);
        b3.setForeground(Color.WHITE);
        b3.setBounds(15,50,60,55);
        b3.setBounds(171,260,60,55);
        b3.setFont(new Font("serif", Font.PLAIN, 18));

        badd=new JButton("+");
        badd.setBackground(Color.GRAY);
        badd.setForeground(Color.WHITE);
        badd.setBounds(15,50,60,55);
        badd.setBounds(250,260,60,55);
        badd.setFont(new Font("serif", Font.PLAIN, 18));

        b0=new JButton("0");
        b0.setBackground(Color.GRAY);
        b0.setForeground(Color.WHITE);
        b0.setBounds(15,50,60,55);
        b0.setBounds(15,330,60,55);
        b0.setFont(new Font("serif", Font.PLAIN, 18));

        bpts=new JButton(".");
        bpts.setBackground(Color.GRAY);
        bpts.setForeground(Color.WHITE);
        bpts.setBounds(15,50,60,55);
        bpts.setBounds(93,330,60,55);
        bpts.setFont(new Font("serif", Font.PLAIN, 18));

        bneg=new JButton("+/-");
        bneg.setBackground(Color.GRAY);
        bneg.setForeground(Color.WHITE);
        bneg.setBounds(15,50,60,55);
        bneg.setBounds(171,330,60,55);
        bneg.setFont(new Font("serif", Font.PLAIN, 18));

        bcalc=new JButton("=");
        bcalc.setBackground(Color.GRAY);
        bcalc.setForeground(Color.WHITE);
        bcalc.setBounds(15,50,60,55);
        bcalc.setBounds(250,330,60,55);
        bcalc.setFont(new Font("serif", Font.PLAIN, 18));



        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);

        bpts.addActionListener(this);
        bneg.addActionListener(this);
        bback.addActionListener(this);

        badd.addActionListener(this);
        bsub.addActionListener(this);
        bmult.addActionListener(this);
        bdiv.addActionListener(this);
        bmod.addActionListener(this);
        bcalc.addActionListener(this);
        bclr.addActionListener(this);

        //Adding To p2 Panel

        p2.add(bclr);	p2.add(bback);	p2.add(bmod);	p2.add(bdiv);
        p2.add(b7);	p2.add(b8);	p2.add(b9);	p2.add(bmult);
        p2.add(b4);	p2.add(b5);	p2.add(b6);	p2.add(bsub);
        p2.add(b1);	p2.add(b2);	p2.add(b3);	p2.add(badd);
        p2.add(bneg);	p2.add(b0);	p2.add(bpts);	p2.add(bcalc);


        //Adding To Container
        c.add(p1, BorderLayout.NORTH);
        c.add(p2,BorderLayout.CENTER);

        f.setSize(335,538);
        f.setVisible(true);
        f.setLocation(490,90);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }


    public void actionPerformed(ActionEvent e){
        String z,zt;
        //NUMBER BUTTON
        if(e.getSource()==b1){
            zt=l1.getText();
            z=zt+"1";
            l1.setText(z);
        }

        if(e.getSource()==b2){
            zt=l1.getText();
            z=zt+"2";
            l1.setText(z);
        }

        if(e.getSource()==b3){
            zt=l1.getText();
            z=zt+"3";
            l1.setText(z);
        }

        if(e.getSource()==b4){
            zt=l1.getText();
            z=zt+"4";
            l1.setText(z);
        }

        if(e.getSource()==b5){
            zt=l1.getText();
            z=zt+"5";
            l1.setText(z);
        }

        if(e.getSource()==b6){
            zt=l1.getText();
            z=zt+"6";
            l1.setText(z);
        }

        if(e.getSource()==b7){
            zt=l1.getText();
            z=zt+"7";
            l1.setText(z);
        }

        if(e.getSource()==b8){
            zt=l1.getText();
            z=zt+"8";
            l1.setText(z);
        }

        if(e.getSource()==b9){
            zt=l1.getText();
            z=zt+"9";
            l1.setText(z);
        }

        if(e.getSource()==b0){
            zt=l1.getText();
            z=zt+"0";
            l1.setText(z);
        }

        if(e.getSource()==bpts){  //ADD DECIMAL PTS
            zt=l1.getText();
            z=zt+".";
            l1.setText(z);
        }

        if(e.getSource()==bneg){ //FOR NEGATIVE
            zt=l1.getText();
            z="-"+zt;
            l1.setText(z);
        }

        if(e.getSource()==bback){  // FOR  BACKSPACE
            zt=l1.getText();
            try{
                z=zt.substring(0, zt.length()-1);
            }

            catch(StringIndexOutOfBoundsException f){
                return;
            }

            l1.setText(z);
            l2.setText("");
        }


        //AIRTHMETIC BUTTON

        if(e.getSource()==badd){                     //FOR ADDITION
            try{
                num1=Double.parseDouble(l1.getText());
            }
            catch(NumberFormatException f){
                l1.setText("Invalid Format");
                return;
            }
            zt=l1.getText();
            z=zt+" +";
            l1.setText("");
            l2.setText(z);
            check=1;
        }

        if(e.getSource()==bsub){                    //FOR SUBTRACTION
            try{
                num1=Double.parseDouble(l1.getText());
            }
            catch(NumberFormatException f){
                l1.setText("Invalid Format");
                return;
            }
            zt=l1.getText();
            z=zt+" -";
            l1.setText("");
            l2.setText(z);
            check=2;
        }

        if(e.getSource()==bmult){                   //FOR MULTIPLICATION
            try{
                num1=Double.parseDouble(l1.getText());
            }
            catch(NumberFormatException f){
                l1.setText("Invalid Format");
                return;
            }
            zt=l1.getText();
            z=zt+" *";
            l1.setText("");
            l2.setText(z);
            check=3;
        }

        if(e.getSource()==bdiv){                   //FOR DIVISION
            try{
                num1=Double.parseDouble(l1.getText());
            }
            catch(NumberFormatException f){
                l1.setText("Invalid Format");
                return;
            }
            zt=l1.getText();
            z=zt+" /";
            l1.setText("");
            l2.setText(z);
            check=4;
        }
        if(e.getSource()==bmod){                  //FOR MOD/REMAINDER
            try{
                num1=Double.parseDouble(l1.getText());
            }
            catch(NumberFormatException f){
                l1.setText("Invalid Format");
                return;
            }
            zt=l1.getText();
            z=zt+" %";
            l1.setText("");
            l2.setText(z);
            check=5;
        }

                                    //RESULT BUTTON
        if(e.getSource()==bcalc){
            try{
                num2=Double.parseDouble(l1.getText());
            }
            catch(Exception f){
                l1.setText("ENTER NUMBER FIRST ");
                return;
            }

            if(check==1) {
                zt = l2.getText();
                z = zt ;
                zt = l1.getText();
                z = z+" "+zt+" =";
                l2.setText(z);
                xd = num1 + num2;
            }

            if(check==2) {
                zt = l2.getText();
                z = zt;
                zt = l1.getText();
                z = z+" "+zt+" =";
                l2.setText(z);
                xd = num1 - num2;
            }

            if(check==3) {
                zt = l2.getText();
                z = zt;
                zt = l1.getText();
                z = z+" "+zt+" =";
                l2.setText(z);
                xd = num1 * num2;
            }

            if(check==4) {
                zt = l2.getText();
                z = zt;
                zt = l1.getText();
                z = z+" "+zt+" =";
                l2.setText(z);
                xd = num1 / num2;
            }

            if(check==5) {
                zt = l2.getText();
                z = zt ;
                zt = l1.getText();
                z = z+" "+zt+" =";
                l2.setText(z);
                xd = num1 % num2;
            }
            l1.setText(String.valueOf(xd));

        }
        //FOR CLEARING THE LABEL and Memory
        if(e.getSource()==bclr){
            num1=0;
            num2=0;
            check=0;
            xd=0;
            z="";
            l1.setText(z);
            l2.setText(z);
        }

    }

    public static void main(String[] args) {
        new Calculator();
    }
}