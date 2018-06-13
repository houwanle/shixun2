package shixun2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ManagerFrane extends JFrame implements ActionListener {// 管理员界面

	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	JButton btns = new JButton("学生信息管理");
	JButton btnc = new JButton("课程信息管理");
	JButton btnsc = new JButton("选课信息管理");
	JButton btng = new JButton("成绩信息管理");
	JButton btnu = new JButton("用户信息管理");
	JButton btnClose = new JButton("退出管理系统");
	JLabel l = new JLabel("管理员");

	@SuppressWarnings("deprecation")
	ManagerFrane() {// 构造方法
		super("学生信息管理系统");
		setSize(350, 200);
		add("North", p1);
		add("Center", p2);
		p1.add(l);
		p2.add(btns);
		p2.add(btnc);
		p2.add(btnsc);
		p2.add(btng);
		p2.add(btnu);
		p2.add(btnClose);
		btns.addActionListener(this);
		btnc.addActionListener(this);
		btnsc.addActionListener(this);
		btng.addActionListener(this);
		btnu.addActionListener(this);
		btnClose.addActionListener(this);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		show();
		setLocationRelativeTo(null);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand() == "学生信息管理")
			new SM().display();
		if (e.getActionCommand() == "课程信息管理") {

			new CM("课程信息管理").display();
		}
		if (e.getActionCommand() == "选课信息管理") {

			new SCM("选课信息管理").display();
		}

		if (e.getActionCommand() == "成绩信息管理") {

			new GM("成绩信息管理").display();
		}

		if (e.getActionCommand() == "用户信息管理") {

			new PM("用户信息管理").display();
		}

		if (e.getActionCommand() == "退出管理系统") {
			System.exit(0);
		}
	}
}
