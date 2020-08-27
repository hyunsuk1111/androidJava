package 배열정리;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 음식gui {
	private static JTextField tfCount;
	static int count = 0; //개수입력증가을위한 변수
	static int result1 = 0; // 결제금액 위한 변수
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] images = {"짬뽕.png","우동.png","짜장.png"};
		JFrame f = new JFrame();
		f.setTitle("음식POS");
		f.getContentPane().setBackground(new Color(135, 206, 250));
		f.setSize(600,500);
		f.getContentPane().setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel("개수입력");
		lblNewLabel.setBounds(325, 59, 57, 15);
		f.getContentPane().add(lblNewLabel);
		
		tfCount = new JTextField();
		tfCount.setHorizontalAlignment(SwingConstants.CENTER);
		tfCount.setBounds(388, 45, 130, 39);
		f.getContentPane().add(tfCount);
		tfCount.setColumns(10);
		
		JLabel imges = new JLabel("New label");
		imges.setIcon(new ImageIcon(images[0]));
		imges.setBounds(76, 112, 404, 265);
		f.getContentPane().add(imges);
		
		JLabel lblNewLabel_2 = new JLabel("지불할 총 금액");
		lblNewLabel_2.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(86, 396, 130, 39);
		f.getContentPane().add(lblNewLabel_2);
		
		JLabel result = new JLabel("New label");
		result.setHorizontalAlignment(SwingConstants.CENTER);
		result.setBounds(240, 401, 188, 27);
		
		JButton btnjjam = new JButton("짬뽕");
		btnjjam.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++; //버튼 클릭 시 textfield 에 값 증가
				tfCount.setText(count+" "); // count 값 표현
				ImageIcon icon = new ImageIcon(images[0]); // 버튼 클릭시 해당사진(짬뽕) 저장
				imges.setIcon(icon);//사진 출력
				result1 += 4000; //카운트 증가시 결제금액 + 4000;
				result.setText(result1+" "); 
				
			}
		});
		btnjjam.setBounds(37, 45, 78, 42);
		f.getContentPane().add(btnjjam);
		
		JButton btnU = new JButton("우동");
		btnU.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++; //버튼 클릭 시 textfield 에 값 증가
				tfCount.setText(count+" "); // count 값 표현
				ImageIcon icon = new ImageIcon(images[1]); // 버튼 클릭시 해당사진(우동) 저장
				imges.setIcon(icon);//사진 출력
				result1 += 4500;	// 카운트 증가시 결제금액+4500
				result.setText(result1+" "); 
				
			}
	});
		btnU.setBounds(131, 45, 78, 42);
		f.getContentPane().add(btnU);
		
		JButton btnjja = new JButton("짜장");
		btnjja.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++; //버튼 클릭 시 textfield 에 값 증가
				tfCount.setText(count+" "); // count 값 표현
				ImageIcon icon = new ImageIcon(images[2]); // 버튼 클릭시 해당사진(짜장) 저장
				imges.setIcon(icon);//사진 출력
				result1 += 5000;	//카운트 증가시 결제금액+5000
				result.setText(result1+" "); 
				
			}
		});
		btnjja.setBounds(221, 45, 78, 42);
		f.getContentPane().add(btnjja);
		f.getContentPane().add(result);
		f.setVisible(true);

	}
}
