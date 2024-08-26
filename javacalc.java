import java.awt.*;  
import java.awt.event.*;

public class javacalc implements ActionListener {

    Label screen; 
    double num1 = 0, num2 = 0, result = 0;
    int check;

    public javacalc() {  
	    
        Font myFont = new Font("Arial", Font.BOLD, 17);
        Font myFont2 = new Font("Arial", Font.BOLD, 25);
        Frame f = new Frame();  
         
		//Setting all the buttons
        Button btn1 = new Button("+");  
        btn1.setBounds(400, 150, 100, 50);  
        f.add(btn1);  
        btn1.setFont(myFont);		

        Button btn2 = new Button("-");  
        btn2.setBounds(400, 200, 100, 50);  
        f.add(btn2);  
        btn2.setFont(myFont);		

        Button btn3 = new Button("x");  
        btn3.setBounds(400, 250, 100, 50);  
        f.add(btn3); 
        btn3.setFont(myFont);        

        Button btn4 = new Button("÷");  
        btn4.setBounds(400, 300, 100, 50);  
        f.add(btn4);      
        btn4.setFont(myFont);	
		
        Button btn5 = new Button("%");  
        btn5.setBounds(300, 300, 100, 50);  
        f.add(btn5);      
        btn5.setFont(myFont);

        Button digit1 = new Button("1");  
        digit1.setBounds(100, 250, 100, 50);  
        f.add(digit1);      
        digit1.setFont(myFont);
		
        Button digit2 = new Button("2");  
        digit2.setBounds(200, 250, 100, 50);  
        f.add(digit2);      
        digit2.setFont(myFont);
		
        Button digit3 = new Button("3");  
        digit3.setBounds(300, 250, 100, 50);  
        f.add(digit3);      
        digit3.setFont(myFont);
		
        Button digit4 = new Button("4");  
        digit4.setBounds(100, 200, 100, 50);  
        f.add(digit4);     
        digit4.setFont(myFont);
		
        Button digit5 = new Button("5");  
        digit5.setBounds(200, 200, 100, 50);  
        f.add(digit5);      
        digit5.setFont(myFont);
		
        Button digit6 = new Button("6");  
        digit6.setBounds(300, 200, 100, 50);  
        f.add(digit6);      
        digit6.setFont(myFont);
		
        Button digit7 = new Button("7");  
        digit7.setBounds(100, 150, 100, 50);  
        f.add(digit7);      
        digit7.setFont(myFont);
		
        Button digit8 = new Button("8");  
        digit8.setBounds(200, 150, 100, 50);  
        f.add(digit8);      
        digit8.setFont(myFont);
		
        Button digit9 = new Button("9");  
        digit9.setBounds(300, 150, 100, 50);  
        f.add(digit9);      
        digit9.setFont(myFont);
		
        Button digit0 = new Button("0");  
        digit0.setBounds(200, 300, 100, 50);  
        f.add(digit0);      
        digit0.setFont(myFont);
		
        Button dot = new Button(".");  
        dot.setBounds(100, 300, 100, 50);  
        f.add(dot);      
        dot.setFont(myFont);
		
        Button clear = new Button("CLEAR");  
        clear.setBounds(100, 350, 300, 50);  
        f.add(clear);      
        clear.setFont(myFont);
		
        Button calc = new Button("=");  
        calc.setBounds(400, 350, 100, 50);  
        f.add(calc);      
        calc.setFont(myFont);
		
        f.setSize(600, 500); 
        f.setTitle("Calculator");  
        f.setBackground(Color.YELLOW);
        f.setLayout(null);    
        f.setVisible(true);           
 
        //Label for the Result
        screen = new Label();
        screen.setBounds(100, 98, 400, 50);
        f.add(screen);
        screen.setFont(myFont2);
		screen.setBackground(Color.LIGHT_GRAY);
		
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                f.dispose(); 
            }
        });

        // Adding action listeners for all buttons
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        digit1.addActionListener(this);
        digit2.addActionListener(this);
        digit3.addActionListener(this);
        digit4.addActionListener(this);
        digit5.addActionListener(this);
        digit6.addActionListener(this);
        digit7.addActionListener(this);
        digit8.addActionListener(this);
        digit9.addActionListener(this);
        digit0.addActionListener(this);
        dot.addActionListener(this);
        clear.addActionListener(this);
        calc.addActionListener(this);
    }

    // Single actionPerformed method to handle all actions instead of multiple addActionListener methods
    public void actionPerformed(ActionEvent e) { 
        String command = e.getActionCommand();
        String zt = screen.getText();

        switch (command) {
            case "1": case "2": case "3": case "4": case "5":
            case "6": case "7": case "8": case "9": case "0":
            case ".":
                screen.setText(zt + command);
                break;
            case "CLEAR":
                screen.setText("");
                break;
            case "+":                                           //For Addition
                try {
                    num1 = Double.parseDouble(zt);
                } catch (NumberFormatException f) {
                    screen.setText("Invalid Format");
                    return;
                }
                screen.setText("");
                check = 1;
                break;
            case "-":                                           //For Subtraction
                try {
                    num1 = Double.parseDouble(zt);
                } catch (NumberFormatException f) {
                    screen.setText("Invalid Format");
                    return;
                }
                screen.setText("");
                check = 2;
                break;
            case "x":                                          //For Multiplication
                try {
                    num1 = Double.parseDouble(zt);
                } catch (NumberFormatException f) {
                    screen.setText("Invalid Format");
                    return;
                }
                screen.setText("");
                check = 3;
                break;
            case "÷":                                         //For Division
                try {
                    num1 = Double.parseDouble(zt);
                } catch (NumberFormatException f) {
                    screen.setText("Invalid Format");
                    return;
                }
                screen.setText("");
                check = 4;
                break;
            case "%":                                          //For Percentage
                try {
                    num1 = Double.parseDouble(zt);
                } catch (NumberFormatException f) {
                    screen.setText("Invalid Format");
                    return;
                }
                screen.setText("");
                check = 5;
                break; 
            case "=":                                          //To Calculate Result
                try {
                    num2 = Double.parseDouble(zt);
                } catch (NumberFormatException f) {
                    screen.setText("Enter Number first");
                    return;
                }
                switch (check) {
                    case 1:
                        result = num1 + num2;
                        break;
                    case 2:
                        result = num1 - num2;
                        break;
                    case 3:
                        result = num1 * num2;
                        break;
                    case 4:
                        if (num2 != 0) {
                            result = num1 / num2;
                        } else {
                            screen.setText("Cannot divide by 0");
                            return;
                        }
                        break;
                    case 5:
                        result = (num1 / num2) * 100;
                        break;
                }
                screen.setText(String.valueOf(result));
                break;
        }
    }

    public static void main(String[] args) {                       //Main Function
        javacalc awt = new javacalc();   
    }  
}
