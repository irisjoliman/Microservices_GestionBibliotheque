import java.awt.Button;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ApiGateway.f = new JFrame(); 
		 ApiGateway.f.setSize(500,500);
		 ApiGateway.f.setTitle("Acceuil");
		 ApiGateway.f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 ApiGateway.f.add(new ApiGateway()); 
		 ApiGateway.f.setVisible(true);
	     
		
	}

}
