package 그래픽Swing;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.Color;
import javax.swing.JDesktopPane;

public class 나의그래픽3_계산기 {

	public static void main(String[] args) {
		//프레임1
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(152, 251, 152));
		//이미지
		ImageIcon img = new ImageIcon("cal.png");
		//라벨3
		JLabel l1 = new JLabel();
		JLabel l2 = new JLabel();
		l2.setFont(new Font("Dialog", Font.PLAIN, 50));
		JLabel l3 = new JLabel();
		JLabel result = new JLabel();
		result.setFont(new Font("굴림", Font.BOLD, 60));
		result.setForeground(new Color(0, 191, 255));
		l3.setFont(new Font("Dialog", Font.PLAIN, 50));
		//텍스트입력2
		JTextField t1 = new JTextField(10);
		t1.setForeground(Color.PINK);
		t1.setBackground(Color.ORANGE);
		t1.setFont(new Font("Dialog", Font.PLAIN, 60));
		JTextField t2 = new JTextField(10);
		t2.setForeground(Color.PINK);
		t2.setBackground(Color.ORANGE);
		t2.setFont(new Font("Dialog", Font.PLAIN, 60));
		//버튼
		JButton plus = new JButton();
		//plus 버튼 클릭 시 
		//t1,t2에 입력한 값을 가지고 와야함, 가지고 온값은 무조건 String
		plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = t1.getText();
				String s2 = t2.getText();
//				System.out.println("t1 값 : " + s1);
//				System.out.println("t2 값 : " + s2);
				//산술연산을 하려면 숫자로 변환
				int i1 = Integer.parseInt(s1);
				int i2 = Integer.parseInt(s2);
				//숫자로 변환 된 값들을 더하자.
				int sum = i1 + i2;
				
				//처리한 결과를 사용자에게 보여줌(출력)
				//result.setText(sum + ""); 편법
				String num2 = String.valueOf(sum);
				result.setText(num2);
			}
		});
		plus.setForeground(Color.RED);
		plus.setFont(new Font("Dialog", Font.PLAIN, 60));
		//레이아웃(flow)
		FlowLayout flow = new FlowLayout();
		f.setSize(500, 700);
		f.getContentPane().setLayout(flow);
		l1.setIcon(img);
		l2.setText("숫자1");
		l3.setText("숫자2");
		plus.setText("+");
		f.getContentPane().add(l1);
		f.getContentPane().add(l2);
		f.getContentPane().add(t1);
		f.getContentPane().add(l3);
		f.getContentPane().add(t2);
		f.getContentPane().add(plus);
		
		//마이너스 버튼
		JButton minus = new JButton();
		minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = t1.getText();
				String s2 = t2.getText();
				int i1 = Integer.parseInt(s1);
				int i2 = Integer.parseInt(s2);
				int sum = i1 - i2;
				String num2 = String.valueOf(sum);
				result.setText(num2);
			}
		});
		minus.setText("-");
		minus.setForeground(Color.RED);
		minus.setFont(new Font("Dialog", Font.PLAIN, 60));
		f.getContentPane().add(minus);
		
		JDesktopPane desktopPane = new JDesktopPane();
		f.getContentPane().add(desktopPane);
		
		JButton mul = new JButton();
		mul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = t1.getText();
				String s2 = t2.getText();
				int i1 = Integer.parseInt(s1);
				int i2 = Integer.parseInt(s2);
				int sum = i1 * i2;
				String num2 = String.valueOf(sum);
				result.setText(num2);
			}
		});
		mul.setText("*");
		mul.setForeground(Color.RED);
		mul.setFont(new Font("Dialog", Font.PLAIN, 60));
		f.getContentPane().add(mul);
		
		JButton div = new JButton();
		div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = t1.getText();
				String s2 = t2.getText();
				double i1 = Integer.parseInt(s1);
				int i2 = Integer.parseInt(s2);
				double sum = i1 / i2;
				String num2 = String.valueOf(sum);
				result.setText(num2);
			}
			
		});
		div.setText("/");
		div.setForeground(Color.RED);
		div.setFont(new Font("Dialog", Font.PLAIN, 60));
		f.getContentPane().add(div);
		f.getContentPane().add(result);
		
		f.setVisible(true);
		
		
		
	}

}
