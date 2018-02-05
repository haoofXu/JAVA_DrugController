import javax.swing.*;
import java.awt.*;

//登录进去后的系统界面
class DBWin extends JFrame{
	JMenuBar menubar=new JMenuBar();
	JMenu menu1,menu2,menu3,menu4,menu5;
	JMenuItem item1,item2,item3,item4;
	JMenuItem item2_1,item2_2,item2_3,item2_4;
	JMenuItem item3_1,item3_2,item3_3,item3_4;
	JMenuItem item4_1,item4_2,item4_3,item4_4;
	JMenuItem item5_1,item5_2,item5_3,item5_4;
	
	JButton logout;
	JButton exit;
	//JMenuItem item1,item2,item3,item4;  //不能通过声明变量然后想每个菜单中添加相同的菜单项——因为相同的菜单项只能当一个组件来添加
	//重复添加前面的便作废
	
	DBWin(){}
	
	DBWin(String str){
		setTitle(str);
		setSize(500,300);
		setLocation(500,224);
		setVisible(true);
		
		menu1=new JMenu("药品信息");
		menu2=new JMenu("客户信息");
		menu3=new JMenu("购买信息");
		menu4=new JMenu("出入库信息");
		menu5=new JMenu("员工信息");
		
		item1=new JMenuItem("增加记录");
		item2=new JMenuItem("删除记录");
		item3=new JMenuItem("修改记录");
		item4=new JMenuItem("查看记录");
		
		item2_1=new JMenuItem("增加记录");
		item2_2=new JMenuItem("删除记录");
		item2_3=new JMenuItem("修改记录");
		item2_4=new JMenuItem("查看记录");
		
		item3_1=new JMenuItem("增加记录");
		item3_2=new JMenuItem("删除记录");
		item3_3=new JMenuItem("修改记录");
		item3_4=new JMenuItem("查看记录");
		
		item4_1=new JMenuItem("增加记录");
		item4_2=new JMenuItem("删除记录");
		item4_3=new JMenuItem("修改记录");
		item4_4=new JMenuItem("查看记录");
		
		item5_1=new JMenuItem("增加记录");
		item5_2=new JMenuItem("删除记录");
		item5_3=new JMenuItem("修改记录");
		item5_4=new JMenuItem("查看记录");
		
		menu1.add(item1);
		menu1.addSeparator();
		menu1.add(item2);
		menu1.addSeparator();
		menu1.add(item3);
		menu1.addSeparator();
		menu1.add(item4);
		
		menu2.add(item2_1);
		menu2.addSeparator();
		menu2.add(item2_2);
		menu2.addSeparator();
		menu2.add(item2_3);
		menu2.addSeparator();
		menu2.add(item2_4);
		
		menu3.add(item3_1);
		menu3.addSeparator();
		menu3.add(item3_2);
		menu3.addSeparator();
		menu3.add(item3_3);
		menu3.addSeparator();
		menu3.add(item3_4);
		
		menu4.add(item4_1);
		menu4.addSeparator();
		menu4.add(item4_2);
		menu4.addSeparator();
		menu4.add(item4_3);
		menu4.addSeparator();
		menu4.add(item4_4);
		
		menu5.add(item5_1);
		menu5.addSeparator();
		menu5.add(item5_2);
		menu5.addSeparator();
		menu5.add(item5_3);
		menu5.addSeparator();
		menu5.add(item5_4);
		
		logout=new JButton("切换用户");
		exit=new JButton("退出系统");
		
		if(str=="药品存销信息管理系统_员工"){
			menubar.add(menu1);
			menubar.add(menu2);
			menubar.add(menu3);
			menubar.add(menu4);
			menubar.add(logout);
			menubar.add(exit);
			setJMenuBar(menubar);
			
		}else if(str=="药品存销信息管理系统_管理员"){
			menubar.add(menu1);
			menubar.add(menu2);
			menubar.add(menu3);
			menubar.add(menu4);
			menubar.add(menu5);
			menubar.add(logout);
			menubar.add(exit);
			setJMenuBar(menubar);
			
		}
		
		validate();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
/*
class A{
	JMenuItem item1=new JMenuItem("增加记录");
	JMenuItem item2=new JMenuItem("删除记录");
	JMenuItem item3=new JMenuItem("插入记录");
	JMenuItem item4=new JMenuItem("查看记录");
}
*/
