package slangWord;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.*;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class slangMenu extends JFrame implements ActionListener {
	JButton btn1, btn2, btn3, btn4, btnCancel;
	readFile slangWord;

	slangMenu() {
		slangWord = readFile.getInstance();
		// A Label
		JLabel label = new JLabel("Từ Điển");
		label.setForeground(Color.blue);
		label.setFont(new Font("Arial", Font.PLAIN, 36));
		label.setAlignmentX(CENTER_ALIGNMENT);
                
        JLabel author = new JLabel("Ngô Thị Mĩ Loan - 20424049");
		author.setForeground(Color.gray);
		author.setFont(new Font("Georgia Bold", Font.PLAIN, 12));
		author.setAlignmentX(CENTER_ALIGNMENT);
		
		btn1 = new JButton("Danh Sách");
		btn1.addActionListener(this);
                btn1.addMouseListener(new MouseAdapter() {
                    Color color = btn1.getForeground();
                    public void mouseEntered(MouseEvent me) {
                       color = btn1.getForeground();
                       btn1.setForeground(Color.pink);
                    }
                    public void mouseExited(MouseEvent me) {
                       btn1.setForeground(color);
                    }
                 });
		btn1.setFont(new Font("Arial", Font.PLAIN, 16));
		btn1.setFocusable(false);

		btn2 = new JButton("Tìm Kiếm");
		btn2.addActionListener(this);
                btn2.addMouseListener(new MouseAdapter() {
                    Color color = btn2.getForeground();
                    public void mouseEntered(MouseEvent me) {
                       color = btn2.getForeground();
                       btn2.setForeground(Color.pink);
                    }
                    public void mouseExited(MouseEvent me) {
                       btn2.setForeground(color);
                    }
                 });
		btn2.setFont(new Font("Arial", Font.PLAIN, 16));
		btn2.setFocusable(false);

		btn3 = new JButton("Thêm slang word");
		btn3.addActionListener(this);
                btn3.addMouseListener(new MouseAdapter() {
                    Color color = btn3.getForeground();
                    public void mouseEntered(MouseEvent me) {
                       color = btn3.getForeground();
                       btn3.setForeground(Color.pink);
                    }
                    public void mouseExited(MouseEvent me) {
                       btn3.setForeground(color);
                    }
                 });
		btn3.setFont(new Font("Arial", Font.PLAIN, 16));
		btn3.setFocusable(false);
                
                btn4 = new JButton("Chỉnh sửa slang word");
		btn4.addActionListener(this);
                btn4.addMouseListener(new MouseAdapter() {
                    Color color = btn4.getForeground();
                    public void mouseEntered(MouseEvent me) {
                       color = btn4.getForeground();
                       btn4.setForeground(Color.pink);
                    }
                    public void mouseExited(MouseEvent me) {
                       btn4.setForeground(color);
                    }
                 });
		btn4.setFont(new Font("Arial", Font.PLAIN, 16));
		btn4.setFocusable(false);

		btnCancel = new JButton("Đóng");
		btnCancel.addActionListener(this);
		btnCancel.addMouseListener(new MouseAdapter() {
                    Color color = btnCancel.getForeground();
                    public void mouseEntered(MouseEvent me) {
                       color = btnCancel.getForeground();
                       btnCancel.setForeground(Color.pink);
                    }
                    public void mouseExited(MouseEvent me) {
                    	btnCancel.setForeground(color);
                    }
                 });
		btnCancel.setFont(new Font("Arial", Font.PLAIN, 16));
		btnCancel.setFocusable(false);

		JPanel panelCenter = new JPanel();
		panelCenter.setLayout(new GridLayout(10, 1));
		panelCenter.add(btn1);
		panelCenter.add(btn2);
		panelCenter.add(btn3);
		panelCenter.add(btn4);
        panelCenter.add(btnCancel);

		Dimension size2 = new Dimension(400, 350);
		panelCenter.setMaximumSize(size2);
		panelCenter.setPreferredSize(size2);
		panelCenter.setMinimumSize(size2);
		Container con = this.getContentPane();
		con.setLayout(new BoxLayout(con, BoxLayout.Y_AXIS));
		con.add(Box.createRigidArea(new Dimension(0, 15)));
		con.add(label);
                con.add(author);
		con.add(Box.createRigidArea(new Dimension(0, 40)));
		con.add(panelCenter);

		// Setting Frame
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Menu");
		this.setVisible(true);
		this.setSize(500, 500);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn1) {
			this.dispose();
			try {
				new listFrame();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		} else if (e.getSource() == btn2) {
			this.dispose();
			new slangMenu();

		} else if (e.getSource() == btn3) {
			this.dispose();
			new slangMenu();

		} else if (e.getSource() == btn4) {
            this.dispose();
			new slangMenu();
		} else if (e.getSource() == btnCancel) {
			System.exit(0);
		}
	}

}
