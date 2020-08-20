package 그래픽Swing;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.Color;

public class 나의그래픽2_계절 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		FlowLayout flow = new FlowLayout();
		JButton b1 = new JButton();
		b1.setForeground(Color.PINK);
		b1.setBackground(Color.YELLOW);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "선선해요");
			}
		});
		
		b1.setFont(new Font("굴림", Font.BOLD, 180));
		JButton b2 = new JButton();
		b2.setForeground(Color.MAGENTA);
		b2.setBackground(Color.CYAN);
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "더워요");
			}
		});
		b2.setFont(new Font("굴림", Font.BOLD, 200));
//		b1.setPreferredSize(new Dimension(300,250)); flow는 글씨에 따라 적용
//		b2.setPreferredSize(new Dimension(300,200));

		
		b1.setText("봄");
		b2.setText("여름");
		f.getContentPane().add(b1);
		f.getContentPane().add(b2);
		f.getContentPane().setLayout(flow);
		f.setSize(600,600);
		f.setVisible(true);
	}

}
