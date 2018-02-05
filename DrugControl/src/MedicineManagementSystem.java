
import java.sql.*;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MedicineManagementSystem extends JFrame implements staticVar,LinkVar{
	public static void main(String args[]){
		Connection conn;
		DBVar T=new DBVar();
		
		//����������ActionListener��Ϊÿ���˵���׼����������
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
			//�������ݿ�
			Class.forName(dirverName);
			conn=DriverManager.getConnection(dbURL,userName,userPwd);
			System.out.println("Connection Successful!");
			
			//����WindowBuild���췽�����½���¼���ڣ�����final��̬������������津�����е��ã�
			final WindowBuild window=new WindowBuild("ҩƷ������Ϣ����ϵͳ");
			window.loginButton.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					window.setVisible(false);//��¼������¼��������Ϊ���ɼ�״̬����װ���йر�-- 
					String str=(window.list.getSelectedItem()).toString();
					String str1=(window.text1.getText()).toString();
					if(str.equals("Ա��")){
						
						if(str1.equals("")){
							final PoliceWin_1 policewin=new PoliceWin_1("Warning");
						}
						else{
						
							final DBWin dbwin=new DBWin("ҩƷ������Ϣ����ϵͳ_Ա��");
						
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
						
							//���л��û�����ť��ʵ���ǽ���¼�������ÿɼ���ϵͳ�������ò��ɼ���==������ô�򵥣���
							dbwin.logout.addActionListener(new ActionListener(){
								public void actionPerformed(ActionEvent e){
									window.setVisible(true);
									dbwin.setVisible(false);
								}
							});
						
							//���˳�ϵͳ����ťԭ��ͬ�ϣ�
							dbwin.exit.addActionListener(new ActionListener(){
								public void actionPerformed(ActionEvent e){
									window.setVisible(false);
									dbwin.setVisible(false);
								}
							});
						}
						//4*4�˵���ֱ���Ӵ�������������ÿ��������ʵ�ָ��ԵĹ��ܡ�������4�ִ�����
					}else if(str.equals("����Ա")){
						
						if(str1.equals("A01")==false){
							final PoliceWin_2 policewin=new PoliceWin_2("Warning");
						}
						else{
						
							final DBWin dbwin=new DBWin("ҩƷ������Ϣ����ϵͳ_����Ա");
						
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
