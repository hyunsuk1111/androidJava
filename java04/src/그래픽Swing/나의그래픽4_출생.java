package 그래픽Swing;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.Color;
import javax.swing.JDesktopPane;

public class 나의그래픽4_출생 {

	public static void main(String[] args) {
		//현재 년도
		Calendar cal = Calendar.getInstance();
		//프레임
		JFrame f = new JFrame();
		//레이블2개
		JLabel l1 = new JLabel();
		l1.setFont(new Font("굴림", Font.BOLD, 50));
		l1.setText("이름");
		JLabel l2 = new JLabel();
		l2.setFont(new Font("굴림", Font.BOLD, 50));
		l2.setText("출생년도");
		JLabel l3 = new JLabel();
		//텍스트필드2개
		JTextField t1 = new JTextField(10);
		t1.setFont(new Font("굴림", Font.BOLD, 50));
		JTextField t2 = new JTextField(10);
		t2.setFont(new Font("굴림", Font.BOLD, 50));
		FlowLayout flow = new FlowLayout();//*
		JButton b1 = new JButton();
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//데이터 가져오기
				String s1 = t1.getText();
				String s2 = t2.getText();
				//성인or미성년 변수
				String result2 = "";
				//출생년도 string > int 변환
				int n1 = Integer.parseInt(s2);
				//현재년도 확인
				int year = cal.get(Calendar.YEAR);
				//나이 연산(현재년도-출생년도)
				int result = year - n1 +1;
				
				//18이상이면 미만이면 연산
				if(result >= 18) {
					result2 = "성인";
				}else {
					result2= "미성년";
				}
				//출력
				l3.setText(s1+" 은 "+result+" 살 이고, "+result2+" 입니다.");
				
			}
		});
		b1.setFont(new Font("굴림", Font.BOLD, 20));
		b1.setText("결과");
		
		f.getContentPane().add(l1);
		f.getContentPane().add(t1);
		f.getContentPane().add(l2);
		f.getContentPane().add(t2);
		f.getContentPane().add(b1);
		f.getContentPane().add(l3);
		f.getContentPane().setLayout(flow);//*
		f.setSize(500, 500);
		f.setVisible(true);//*
		
		
		
	}

}
