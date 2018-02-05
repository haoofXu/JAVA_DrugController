import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//新建JFrame子类，用于构建登录界面；
class WindowBuild extends JFrame {
	Box box,box1,boxbase,boxV1,boxV2;
	JComboBox list;
	JButton loginButton;
	JTextField text1,text2;
	Icon icon1=new ImageIcon("icon1.jpg");
	WindowBuild(){}
	WindowBuild(String str){
		setTitle(str);
		setSize(480,220);
		setLocation(500,244);
		//setBounds(120,125,200,200);
		
		//box=Box.createHorizontalBox();
		//box.add(new JLabel("药品管理系统"));
		//add(box,BorderLayout.NORTH);
		
		boxV1=Box.createVerticalBox();
		boxV1.add(Box.createVerticalStrut(20));
		boxV1.add(new JLabel("用户名："));
		boxV1.add(Box.createVerticalStrut(8));
		boxV1.add(new JLabel("密码："));
		boxV1.add(Box.createVerticalStrut(8));
		boxV1.add(new JLabel("用户角色："));
		
		boxV2=Box.createVerticalBox();
		list=new JComboBox();
		list.addItem("员工");
		list.addItem("管理员");
		boxV2.add(Box.createVerticalStrut(20));
		text1=new JTextField(16);
		boxV2.add(text1);
		boxV2.add(Box.createVerticalStrut(8));
		text2=new JPasswordField(16);
		boxV2.add(text2);
		boxV2.add(Box.createVerticalStrut(8));
		boxV2.add(list);
		
		boxbase=Box.createHorizontalBox();
		boxbase.add(boxV1);
		boxbase.add(Box.createHorizontalStrut(10));
		boxbase.add(boxV2);
		boxbase.add(Box.createHorizontalStrut(22));
		
		setLayout(new FlowLayout());
		add(boxbase);
		loginButton=new JButton("登录",icon1);
		box1=Box.createHorizontalBox();
		box1.add(loginButton);
		add(box1);
				
		setVisible(true);
		validate();
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
}
