import javax.swing.*;
import java.awt.*;

//��¼��ȥ���ϵͳ����
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
	//JMenuItem item1,item2,item3,item4;  //����ͨ����������Ȼ����ÿ���˵��������ͬ�Ĳ˵������Ϊ��ͬ�Ĳ˵���ֻ�ܵ�һ����������
	//�ظ����ǰ��ı�����
	
	DBWin(){}
	
	DBWin(String str){
		setTitle(str);
		setSize(500,300);
		setLocation(500,224);
		setVisible(true);
		
		menu1=new JMenu("ҩƷ��Ϣ");
		menu2=new JMenu("�ͻ���Ϣ");
		menu3=new JMenu("������Ϣ");
		menu4=new JMenu("�������Ϣ");
		menu5=new JMenu("Ա����Ϣ");
		
		item1=new JMenuItem("���Ӽ�¼");
		item2=new JMenuItem("ɾ����¼");
		item3=new JMenuItem("�޸ļ�¼");
		item4=new JMenuItem("�鿴��¼");
		
		item2_1=new JMenuItem("���Ӽ�¼");
		item2_2=new JMenuItem("ɾ����¼");
		item2_3=new JMenuItem("�޸ļ�¼");
		item2_4=new JMenuItem("�鿴��¼");
		
		item3_1=new JMenuItem("���Ӽ�¼");
		item3_2=new JMenuItem("ɾ����¼");
		item3_3=new JMenuItem("�޸ļ�¼");
		item3_4=new JMenuItem("�鿴��¼");
		
		item4_1=new JMenuItem("���Ӽ�¼");
		item4_2=new JMenuItem("ɾ����¼");
		item4_3=new JMenuItem("�޸ļ�¼");
		item4_4=new JMenuItem("�鿴��¼");
		
		item5_1=new JMenuItem("���Ӽ�¼");
		item5_2=new JMenuItem("ɾ����¼");
		item5_3=new JMenuItem("�޸ļ�¼");
		item5_4=new JMenuItem("�鿴��¼");
		
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
		
		logout=new JButton("�л��û�");
		exit=new JButton("�˳�ϵͳ");
		
		if(str=="ҩƷ������Ϣ����ϵͳ_Ա��"){
			menubar.add(menu1);
			menubar.add(menu2);
			menubar.add(menu3);
			menubar.add(menu4);
			menubar.add(logout);
			menubar.add(exit);
			setJMenuBar(menubar);
			
		}else if(str=="ҩƷ������Ϣ����ϵͳ_����Ա"){
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
	JMenuItem item1=new JMenuItem("���Ӽ�¼");
	JMenuItem item2=new JMenuItem("ɾ����¼");
	JMenuItem item3=new JMenuItem("�����¼");
	JMenuItem item4=new JMenuItem("�鿴��¼");
}
*/
