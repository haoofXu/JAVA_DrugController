
import java.sql.*;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MedicineManagementSystem extends JFrame implements staticVar,LinkVar{
	public static void main(String args[]){
		Connection conn;
		DBVar T=new DBVar();
		
		//声明触发器ActionListener，为每个菜单栏准备触发器；
		final Police_1_4 police_1_4=new Police_1_4();
		final Police_1_1 police_1_1=new Police_1_1();
		final Police_1_2 police_1_2=new Police_1_2();
		final Police_1_3 police_1_3=new Police_1_3();
		
		final Police_2_1 police_2_1=new Police_2_1();
		final Police_2_2 police_2_2=new Police_2_2();
		final Police_2_3 police_2_3=new Police_2_3();
		final Police_2_4 police_2_4=new Police_2_4();
		
		final Police_3_1 police_3_1=new Police_3_1();
		final Police_3_2 police_3_2=new Police_3_2();
		final Police_3_3 police_3_3=new Police_3_3();
		final Police_3_4 police_3_4=new Police_3_4();
		
		final Police_4_1 police_4_1=new Police_4_1();
		final Police_4_2 police_4_2=new Police_4_2();
		final Police_4_3 police_4_3=new Police_4_3();
		final Police_4_4 police_4_4=new Police_4_4();
		
		final Police_5_1 police_5_1=new Police_5_1();
		final Police_5_2 police_5_2=new Police_5_2();
		final Police_5_3 police_5_3=new Police_5_3();
		final Police_5_4 police_5_4=new Police_5_4();
		
		//final Police_logout police_logout=new Police_logout();
		
		try{		
			//连接数据库
			Class.forName(dirverName);
			conn=DriverManager.getConnection(dbURL,userName,userPwd);
			System.out.println("Connection Successful!");
			
			//调用WindowBuild构造方法，新建登录窗口，定义final终态变量，方便后面触发器中调用；
			final WindowBuild window=new WindowBuild("药品存销信息管理系统");
			window.loginButton.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					window.setVisible(false);//登录即将登录窗口设置为不可见状态，假装自行关闭-- 
					String str=(window.list.getSelectedItem()).toString();
					String str1=(window.text1.getText()).toString();
					if(str.equals("员工")){
						
						if(str1.equals("")){
							final PoliceWin_1 policewin=new PoliceWin_1("Warning");
						}
						else{
						
							final DBWin dbwin=new DBWin("药品存销信息管理系统_员工");
						
							//System.out.println(str1);
							dbwin.item1.addActionListener(police_1_1);
							dbwin.item2.addActionListener(police_1_2);
							dbwin.item3.addActionListener(police_1_3);
							dbwin.item4.addActionListener(police_1_4);
						
							dbwin.item2_1.addActionListener(police_2_1);
							dbwin.item2_2.addActionListener(police_2_2);
							dbwin.item2_3.addActionListener(police_2_3);
							dbwin.item2_4.addActionListener(police_2_4);
						
							dbwin.item3_1.addActionListener(police_3_1);
							dbwin.item3_2.addActionListener(police_3_2);
							dbwin.item3_3.addActionListener(police_3_3);
							dbwin.item3_4.addActionListener(police_3_4);
						
							dbwin.item4_1.addActionListener(police_4_1);
							dbwin.item4_2.addActionListener(police_4_2);
							dbwin.item4_3.addActionListener(police_4_3);
							dbwin.item4_4.addActionListener(police_4_4);
						
							//“切换用户”按钮其实就是将登录窗口设置可见，系统窗口设置不可见。==就是这么简单；；
							dbwin.logout.addActionListener(new ActionListener(){
								public void actionPerformed(ActionEvent e){
									window.setVisible(true);
									dbwin.setVisible(false);
								}
							});
						
							//“退出系统”按钮原理同上；
							dbwin.exit.addActionListener(new ActionListener(){
								public void actionPerformed(ActionEvent e){
									window.setVisible(false);
									dbwin.setVisible(false);
								}
							});
						}
						//4*4菜单项分别添加触发器————每个触发器实现各自的功能————4种触发器
					}else if(str.equals("管理员")){
						
						if(str1.equals("A01")==false){
							final PoliceWin_2 policewin=new PoliceWin_2("Warning");
						}
						else{
						
							final DBWin dbwin=new DBWin("药品存销信息管理系统_管理员");
						
							dbwin.item1.addActionListener(police_1_1);
							dbwin.item2.addActionListener(police_1_2);
							dbwin.item3.addActionListener(police_1_3);
							dbwin.item4.addActionListener(police_1_4);
						
							dbwin.item2_1.addActionListener(police_2_1);
							dbwin.item2_2.addActionListener(police_2_2);
							dbwin.item2_3.addActionListener(police_2_3);
							dbwin.item2_4.addActionListener(police_2_4);
						
							dbwin.item3_1.addActionListener(police_3_1);
							dbwin.item3_2.addActionListener(police_3_2);
							dbwin.item3_3.addActionListener(police_3_3);
							dbwin.item3_4.addActionListener(police_3_4);
						
							dbwin.item4_1.addActionListener(police_4_1);
							dbwin.item4_2.addActionListener(police_4_2);
							dbwin.item4_3.addActionListener(police_4_3);
							dbwin.item4_4.addActionListener(police_4_4);
						
							dbwin.item5_1.addActionListener(police_5_1);
							dbwin.item5_2.addActionListener(police_5_2);
							dbwin.item5_3.addActionListener(police_5_3);
							dbwin.item5_4.addActionListener(police_5_4);
						
							dbwin.logout.addActionListener(new ActionListener(){
								public void actionPerformed(ActionEvent e){
									window.setVisible(true);
									dbwin.setVisible(false);
								}
							});
						
							dbwin.exit.addActionListener(new ActionListener(){
								public void actionPerformed(ActionEvent e){
									window.setVisible(false);
									dbwin.setVisible(false);
								}
							});
						}
					}
				}
			});
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
