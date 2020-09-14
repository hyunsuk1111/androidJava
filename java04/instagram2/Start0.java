package instagram2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Start0 extends JFrame{
	public static void main(String[] args) { // main()은 시작페이지에만 있음!
		new Start0(); // 생성자 호출
	}
	
	public Start0() {
		JPanel startPage = new JPanel(); // 현재 프레임에 올릴 시작페이지 패널 생성
		startPage.setSize(540, 960); // 패널 사이즈
		JFrame f = new JFrame();
		ImageIcon img = new ImageIcon("InsLogo.png");
		
		JLabel lb1 = new JLabel(img);
		lb1.setIcon(img);
		lb1.setBounds(74, 127, 363, 111);
		f.getContentPane().add(lb1);
		
		JButton btnRegister = new JButton("회원가입"); // 패널 위에 올릴 버튼
		btnRegister.addActionListener(new ActionListener() { // 버튼 처리 리스너
			@Override
			public void actionPerformed(ActionEvent e) {
				Register0 register = new Register0(); // 가져올 회원가입 패널 객체 생성
				
				startPage.setVisible(false); // 현재 시작페이지 패널 안 보이게
				add(register); // 프레임 위에 회원가입 패널 추가
//				setContentPane(register); // 음 일단 막아둠. 생략하기
			}
		});
	
		startPage.add(btnRegister); // 시작페이지 패널에 버튼 추가
		
		add(startPage); // 프레임에 시작페이지 패널 추가
		setSize(540, 960); // 프레임 사이즈
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 창이 꺼질때 프로그램도 아예 꺼지도록(콘솔에서 버튼 확인) 
		setLocationRelativeTo(null); // 창이 화면 가운데 뜨도록 처
		setVisible(true); // 프레임 보이게
	}
}
