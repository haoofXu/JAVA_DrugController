import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.*;

class PoliceWin_1 extends JFrame{
	JLabel label;
	PoliceWin_1(){}
	PoliceWin_1(String s){
		setTitle(s);
		setSize(300,200);
		setLocation(500,240);
		
		label=new JLabel("用户名不能为空！");
		add(label);
		setLayout(new FlowLayout());
		
		setVisible(true);
		validate();
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
}

class PoliceWin_2 extends JFrame{
	JLabel label;
	PoliceWin_2(){}
	PoliceWin_2(String s){
		setTitle(s);
		setSize(300,200);
		setLocation(500,240);
		
		label=new JLabel("不好意思，您不是管理员！");
		add(label);
		setLayout(new FlowLayout());
		
		setVisible(true);
		validate();
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
}
