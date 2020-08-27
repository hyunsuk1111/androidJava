package 배열정리;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 영화앨범배열이용 {
	static int now = 2; // 현재 위치를 체크할 수 있는 변수

	public static void main(String[] args) {
		//영화제목목록, 이미지목록, 감독목록, 평점목록
		String[] titles = {"왕의 남자","메멘토","테넷","남매의 여름밤","500일의 썸머"};
		String[] images = {"manofking.png","memento.png","tenet.png","summernight.png","daysofsummer.png"};
		String[] directors = {"이준익","크리스토퍼 놀란","크리스토퍼 놀란","윤단비","마크 웹"};
		double[] rates = {9.03,9.06,8.68,9.26,9.14};
		
		JFrame f = new JFrame("나의 영화 앨범");
		f.getContentPane().setBackground(new Color(72, 209, 204));
		f.setSize(500,500);
		f.getContentPane().setLayout(null);
		
		//제목
		JLabel title = new JLabel(titles[2]);
		title.setForeground(new Color(123, 104, 238));
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setBackground(new Color(0, 0, 255));
		title.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		title.setBounds(104, 23, 250, 51);
		f.getContentPane().add(title);
		
		//이미지 셋팅
		JLabel img = new JLabel("New label");
		img.setIcon(new ImageIcon(images[2]));
		img.setBounds(27, 112, 193, 258);
		f.getContentPane().add(img);
		
		JLabel lblNewLabel_2 = new JLabel("감독");
		lblNewLabel_2.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		lblNewLabel_2.setBounds(265, 160, 72, 22);
		f.getContentPane().add(lblNewLabel_2);
		
		JLabel director = new JLabel(directors[2]);
		director.setForeground(new Color(30, 144, 255));
		director.setFont(new Font("맑은 고딕 Semilight", Font.BOLD, 15));
		director.setBounds(265, 192, 136, 28);
		f.getContentPane().add(director);
		
		JLabel lblNewLabel_2_1 = new JLabel("평점");
		lblNewLabel_2_1.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		lblNewLabel_2_1.setBounds(265, 240, 72, 22);
		f.getContentPane().add(lblNewLabel_2_1);
		
		//레이블은 스트링만들어가서 스트링으로 변환 > + " "
		JLabel rate = new JLabel(rates[2] + "");
		rate.setForeground(new Color(30, 144, 255));
		rate.setFont(new Font("맑은 고딕 Semilight", Font.BOLD, 15));
		rate.setBounds(267, 273, 136, 28);
		f.getContentPane().add(rate);
		
		JButton btnNewButton = new JButton("<<");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(now==0) {
					now=5;
				}
				
				now--; // 1
				title.setText(titles[now]);
				ImageIcon icon = new ImageIcon(images[now]);
				img.setIcon(icon);
				director.setText(directors[now]);
				rate.setText(rates[now]+" ");
				
				
			}
		});
		btnNewButton.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		btnNewButton.setBounds(79, 397, 141, 28);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton(">>");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(now==4) {
					now = -1;
				}
				now++;
				title.setText(titles[now]);
				ImageIcon icon = new ImageIcon(images[now]);
				img.setIcon(icon);
				director.setText(directors[now]);
				rate.setText(rates[now]+" ");
			}
		});
		btnNewButton_1.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		btnNewButton_1.setBounds(260, 400, 141, 28);
		f.getContentPane().add(btnNewButton_1);
		f.setVisible(true);

	}
}
