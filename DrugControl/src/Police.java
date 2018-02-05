
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.*;

//��������������󹤳�--��ÿ������������ʱ�������·������ݿ⣻
class Police_1_4 implements ActionListener,staticVar,LinkVar{//�鿴��¼��ť������
	public void actionPerformed(ActionEvent e){
		Connection connection;
		DBVar S=new DBVar();
		try{
			Class.forName(dirverName);
			connection=DriverManager.getConnection(dbURL,userName,userPwd);
			S.sql="select * from "+sqlstr_1;
			S.stmt=connection.prepareStatement(S.sql);
			S.rs=S.stmt.executeQuery();
			while(S.rs.next()){
				String a;
				int i;
				for(i=1;i<10;i++){
					a=S.rs.getString(i);
					System.out.print(a+"   ");
					//i++;
				}
				
				System.out.println();
				
			}
		}catch(Exception ee){
		ee.printStackTrace();
		}		
	}
}

class Police_1_1 implements ActionListener,staticVar,LinkVar{//���Ӽ�¼��ť������
	public void actionPerformed(ActionEvent e){
		Scanner reader=new Scanner(System.in);
		Connection connection;
		DBVar S=new DBVar();
		try{
			Class.forName(dirverName);
			connection=DriverManager.getConnection(dbURL,userName,userPwd);
			
			System.out.println("�������룺ҩƷ��š�ҩƷ���ơ��������ҡ��������ڡ�������(��)��ҩƷ��;���۸񡢿�����������λ��");
			System.out.println("ÿ����һ���ֶΰ�Enter��ȷ��");
			System.out.println("�����룺");
			
			String s[]=new String[20];
			s[0]=new String();
			s[0]="";
			for(int i=1;i<10;i++){
				s[i]=new String();
				s[i]=reader.next();
			}
			
			S.sql="insert into ҩƷ values (?,?,?,?,?,?,?,?,?)";
			S.stmt=connection.prepareStatement(S.sql);
			for(int i=1;i<10;i++){
				System.out.print(s[i].toString()+" ");
				S.stmt.setString(i,s[i].toString());
			}
			S.stmt.executeUpdate();
			System.out.println();
			//S.rs=S.stmt.executeQuery();
			
		}catch(Exception ee){
		ee.printStackTrace();
		}		
	}
}

class Police_1_2 implements ActionListener,staticVar,LinkVar{//ɾ����¼��ť������
	public void actionPerformed(ActionEvent e){
		Connection connection;
		DBVar S=new DBVar();
		Scanner reader=new Scanner(System.in);
		try{
			System.out.println("������Ҫɾ����ҩƷ��ҩƷ��ţ�");
			
			String s=new String();
			s=reader.next();
			
			Class.forName(dirverName);
			connection=DriverManager.getConnection(dbURL,userName,userPwd);
			
			S.sql="delete from ҩƷ  where ҩƷ���=?";
			
			S.stmt=connection.prepareStatement(S.sql);
			S.stmt.setString(1,s);
			S.stmt.executeUpdate();
			System.out.println();
			
		}catch(Exception ee){
		ee.printStackTrace();
		}		
	}
}

class Police_1_3 implements ActionListener,staticVar,LinkVar{//���¼�¼��ť������
	public void actionPerformed(ActionEvent e){
		Scanner reader=new Scanner(System.in);
		Connection connection;
		DBVar S=new DBVar();
		try{
			System.out.println("����������Ҫ�޸ĵ�ҩƷ��ż���ǰ���г��۸�");//֧��ҩƷ�۸���޸ģ���ҩƷ�������ڳ�������в������ʱ�ɺ�̨���ݿ�ͨ�����ô����������޸�
			String s[]=new String[5];
			s[0]="";
			for(int i=1;i<3;i++){
				s[i]=reader.next();
			}
			
			Class.forName(dirverName);
			connection=DriverManager.getConnection(dbURL,userName,userPwd);
			
			S.sql="update ҩƷ set �۸�=? where ҩƷ���=?";
			S.stmt=connection.prepareStatement(S.sql);
			for(int i=1;i<3;i++){
				//System.out.print(s[i].toString()+" ");
				S.stmt.setString(3-i,s[i].toString());
			}
			S.stmt.executeUpdate();
			System.out.println();
			
		}catch(Exception ee){
		ee.printStackTrace();
		}		
	}
}


class Police_2_1 implements ActionListener,staticVar,LinkVar{//���Ӽ�¼��ť������
	public void actionPerformed(ActionEvent e){
		Scanner reader=new Scanner(System.in);
		Connection connection;
		DBVar S=new DBVar();
		try{
			Class.forName(dirverName);
			connection=DriverManager.getConnection(dbURL,userName,userPwd);
			
			System.out.println("�������룺�ͻ���š���������ϵ��ʽ");
			System.out.println("ÿ����һ���ֶΰ�Enter��ȷ��");
			System.out.println("�����룺");
			
			String s[]=new String[10];
			s[0]=new String();
			s[0]="";
			for(int i=1;i<4;i++){
				s[i]=new String();
				s[i]=reader.next();
			}
			
			S.sql="insert into �ͻ� values (?,?,?)";
			S.stmt=connection.prepareStatement(S.sql);
			for(int i=1;i<4;i++){
				System.out.print(s[i].toString()+" ");
				S.stmt.setString(i,s[i].toString());
			}
			S.stmt.executeUpdate();
			System.out.println();
			//S.rs=S.stmt.executeQuery();
			
		}catch(Exception ee){
		ee.printStackTrace();
		}		
	}
}

class Police_2_2 implements ActionListener,staticVar,LinkVar{//ɾ����¼��ť������
	public void actionPerformed(ActionEvent e){
		Connection connection;
		DBVar S=new DBVar();
		Scanner reader=new Scanner(System.in);
		try{
			System.out.println("������Ҫɾ���Ŀͻ��Ŀͻ���ţ�");
			
			String s=new String();
			s=reader.next();
			
			Class.forName(dirverName);
			connection=DriverManager.getConnection(dbURL,userName,userPwd);
			
			S.sql="delete from �ͻ�  where �ͻ����=?";
			
			S.stmt=connection.prepareStatement(S.sql);
			S.stmt.setString(1,s);
			S.stmt.executeUpdate();
			System.out.println();
			
		}catch(Exception ee){
		ee.printStackTrace();
		}		
	}
}

class Police_2_3 implements ActionListener,staticVar,LinkVar{//���¼�¼��ť������
	public void actionPerformed(ActionEvent e){
		Scanner reader=new Scanner(System.in);
		Connection connection;
		DBVar S=new DBVar();
		try{
			System.out.println("����������Ҫ�޸ĵĿͻ���ż�ta����ϵ��ʽ��");//ͨ��ֻ�пͻ�����ϵ��ʽ��Ҫ�޸�
			String s[]=new String[5];
			s[0]="";
			for(int i=1;i<3;i++){
				s[i]=reader.next();
			}
			
			Class.forName(dirverName);
			connection=DriverManager.getConnection(dbURL,userName,userPwd);
			
			S.sql="update �ͻ� set ��ϵ��ʽ=? where �ͻ����=?";
			S.stmt=connection.prepareStatement(S.sql);
			for(int i=1;i<3;i++){
				//System.out.print(s[i].toString()+" ");
				S.stmt.setString(3-i,s[i].toString());
			}
			S.stmt.executeUpdate();
			System.out.println();
			
		}catch(Exception ee){
		ee.printStackTrace();
		}		
	}
}

class Police_2_4 implements ActionListener,staticVar,LinkVar{//�鿴��¼��ť������
	public void actionPerformed(ActionEvent e){
		Connection connection;
		DBVar S=new DBVar();
		try{
			Class.forName(dirverName);
			connection=DriverManager.getConnection(dbURL,userName,userPwd);
			S.sql="select * from "+sqlstr_2;
			S.stmt=connection.prepareStatement(S.sql);
			S.rs=S.stmt.executeQuery();
			while(S.rs.next()){
				String a;
				int i;
				for(i=1;i<4;i++){
					a=S.rs.getString(i);
					System.out.print(a+"   ");
					//i++;
				}
				
				System.out.println();
				
			}
		}catch(Exception ee){
		ee.printStackTrace();
		}		
	}
}

class Police_3_1 implements ActionListener,staticVar,LinkVar{//���Ӽ�¼��ť������
	public void actionPerformed(ActionEvent e){
		Scanner reader=new Scanner(System.in);
		Connection connection;
		DBVar S=new DBVar();
		try{
			Class.forName(dirverName);
			connection=DriverManager.getConnection(dbURL,userName,userPwd);
			
			System.out.println("�������룺����ʱ�䡢�ͻ���š�ҩƷ��š�ҩƷ���ơ�ҩƷ������������");
			System.out.println("ÿ����һ���ֶΰ�Enter��ȷ��");
			System.out.println("�����룺");
			
			String s[]=new String[20];
			s[0]=new String();
			s[0]="";
			for(int i=1;i<7;i++){
				s[i]=new String();
				s[i]=reader.next();
			}
			
			S.sql="insert into ���� values (?,?,?,?,?,?)";
			S.stmt=connection.prepareStatement(S.sql);
			for(int i=1;i<7;i++){
				System.out.print(s[i].toString()+" ");
				S.stmt.setString(i,s[i].toString());
			}
			S.stmt.executeUpdate();
			System.out.println();
			//S.rs=S.stmt.executeQuery();
			
		}catch(Exception ee){
		ee.printStackTrace();
		}		
	}
}

class Police_3_2 implements ActionListener,staticVar,LinkVar{//ɾ����¼��ť������
	public void actionPerformed(ActionEvent e){
		Connection connection;
		DBVar S=new DBVar();
		Scanner reader=new Scanner(System.in);
		try{
			System.out.println("��������Ҫɾ���Ĺ�����Ϣ����������ʱ�䡢�ͻ���š�ҩƷ���");
			System.out.println("ÿ����һ���ֶΰ�Enter��ȷ��");
			System.out.println("�����룺");
			
			
			String s[]=new String[10];
			s[0]="";
			for(int i=1;i<4;i++){
				s[i]=new String();
				s[i]=reader.next();
			}
			
			Class.forName(dirverName);
			connection=DriverManager.getConnection(dbURL,userName,userPwd);
			
			S.sql="delete from ����  where ����ʱ��=? and �ͻ����=? and ҩƷ���=?";
			
			S.stmt=connection.prepareStatement(S.sql);
			for(int i=1;i<4;i++){
				System.out.print(s[i].toString()+" ");
				S.stmt.setString(i,s[i].toString());
			}
			//S.stmt.setString(1,s);
			S.stmt.executeUpdate();
			System.out.println();
			
		}catch(Exception ee){
		ee.printStackTrace();
		}		
	}
}

class Police_3_3 implements ActionListener,staticVar,LinkVar{//���¼�¼��ť������
	public void actionPerformed(ActionEvent e){
		Scanner reader=new Scanner(System.in);
		Connection connection;
		DBVar S=new DBVar();
		try{
			System.out.println("����������Ҫ�޸ĵĹ����¼(����ʱ�䡢�ͻ���š�ҩƷ���)����ȷ��ҩƷ������");//ͨ������ʱҩƷ�������ܻᷢ���������
			String s[]=new String[10];
			s[0]="";
			for(int i=1;i<5;i++){
				s[i]=reader.next();
			}
			
			Class.forName(dirverName);
			connection=DriverManager.getConnection(dbURL,userName,userPwd);
			
			S.sql="update ���� set ҩƷ����=? where ����ʱ��=? and �ͻ����=? and ҩƷ���=?";
			S.stmt=connection.prepareStatement(S.sql);
			
			S.stmt.setString(2,s[1].toString());
			S.stmt.setString(3,s[2].toString());
			S.stmt.setString(4,s[3].toString());
			S.stmt.setString(1,s[4].toString());
			
			S.stmt.executeUpdate();
			System.out.println();
			
		}catch(Exception ee){
		ee.printStackTrace();
		}		
	}
}


class Police_3_4 implements ActionListener,staticVar,LinkVar{//�鿴��¼��ť������
	public void actionPerformed(ActionEvent e){
		Connection connection;
		DBVar S=new DBVar();
		try{
			Class.forName(dirverName);
			connection=DriverManager.getConnection(dbURL,userName,userPwd);
			S.sql="select * from "+sqlstr_3;
			S.stmt=connection.prepareStatement(S.sql);
			S.rs=S.stmt.executeQuery();
			while(S.rs.next()){
				String a;
				int i;
				for(i=1;i<7;i++){
					a=S.rs.getString(i);
					System.out.print(a+"   ");
					//i++;
				}
				
				System.out.println();
				System.out.println();
				
			}
		}catch(Exception ee){
		ee.printStackTrace();
		}		
	}
}



class Police_4_1 implements ActionListener,staticVar,LinkVar{//���Ӽ�¼��ť������
	public void actionPerformed(ActionEvent e){
		Scanner reader=new Scanner(System.in);
		Connection connection;
		DBVar S=new DBVar();
		try{
			Class.forName(dirverName);
			connection=DriverManager.getConnection(dbURL,userName,userPwd);
			
			System.out.println("�������룺������š�ҩƷ��š��������������������������");
			System.out.println("ÿ����һ���ֶΰ�Enter��ȷ��");
			System.out.println("�����룺");
			
			String s[]=new String[20];
			s[0]=new String();
			s[0]="";
			for(int i=1;i<6;i++){
				s[i]=new String();
				s[i]=reader.next();
			}
			
			S.sql="insert into ����� values (?,?,?,?,?)";
			S.stmt=connection.prepareStatement(S.sql);
			for(int i=1;i<6;i++){
				System.out.print(s[i].toString()+" ");
				S.stmt.setString(i,s[i].toString());
			}
			S.stmt.executeUpdate();
			System.out.println();
			//S.rs=S.stmt.executeQuery();
			
		}catch(Exception ee){
		ee.printStackTrace();
		}		
	}
}

class Police_4_2 implements ActionListener,staticVar,LinkVar{//ɾ����¼��ť������
	public void actionPerformed(ActionEvent e){
		Connection connection;
		DBVar S=new DBVar();
		Scanner reader=new Scanner(System.in);
		try{
			System.out.println("������Ҫɾ���ĳ�����¼��Ӧ�ĳ�����ţ�");
			
			String s=new String();
			s=reader.next();
			
			Class.forName(dirverName);
			connection=DriverManager.getConnection(dbURL,userName,userPwd);
			
			S.sql="delete from �����  where �������=?";
			
			S.stmt=connection.prepareStatement(S.sql);
			S.stmt.setString(1,s);
			S.stmt.executeUpdate();
			System.out.println();
			
		}catch(Exception ee){
		ee.printStackTrace();
		}		
	}
}

class Police_4_3 implements ActionListener,staticVar,LinkVar{//���¼�¼��ť������
	public void actionPerformed(ActionEvent e){
		Scanner reader=new Scanner(System.in);
		Connection connection;
		DBVar S=new DBVar();
		try{
			System.out.println("����������Ҫ�޸ĵĳ�����ż���������������");//��ΪҩƷ�ڱ��ͻ�����ʱ�����и����˳����������޸�ֻ���޸����ʱ��ҩƷ����
			String s[]=new String[5];
			s[0]="";
			for(int i=1;i<3;i++){
				s[i]=reader.next();
			}
			
			Class.forName(dirverName);
			connection=DriverManager.getConnection(dbURL,userName,userPwd);
			
			S.sql="update ����� set �������=? where �������=?";
			S.stmt=connection.prepareStatement(S.sql);
			for(int i=1;i<3;i++){
				//System.out.print(s[i].toString()+" ");
				S.stmt.setString(3-i,s[i].toString());
			}
			S.stmt.executeUpdate();
			System.out.println();
			
		}catch(Exception ee){
		ee.printStackTrace();
		}		
	}
}
class Police_4_4 implements ActionListener,staticVar,LinkVar{//�鿴��¼��ť������
	public void actionPerformed(ActionEvent e){
		Connection connection;
		DBVar S=new DBVar();
		try{
			Class.forName(dirverName);
			connection=DriverManager.getConnection(dbURL,userName,userPwd);
			S.sql="select * from "+sqlstr_4;
			S.stmt=connection.prepareStatement(S.sql);
			S.rs=S.stmt.executeQuery();
			while(S.rs.next()){
				String a;
				int i;
				for(i=1;i<6;i++){
					a=S.rs.getString(i);
					System.out.print(a+"   ");
					//i++;
				}
				
				System.out.println();
				
			}
		}catch(Exception ee){
		ee.printStackTrace();
		}		
	}
}



class Police_5_1 implements ActionListener,staticVar,LinkVar{//���Ӽ�¼��ť������
	public void actionPerformed(ActionEvent e){
		Scanner reader=new Scanner(System.in);
		Connection connection;
		DBVar S=new DBVar();
		try{
			Class.forName(dirverName);
			connection=DriverManager.getConnection(dbURL,userName,userPwd);
			
			System.out.println("�������룺Ա����š����������䡢ѧ����ְ���Ա�");
			System.out.println("ÿ����һ���ֶΰ�Enter��ȷ��");
			System.out.println("�����룺");
			
			String s[]=new String[20];
			s[0]=new String();
			s[0]="";
			for(int i=1;i<7;i++){
				s[i]=new String();
				s[i]=reader.next();
			}
			
			S.sql="insert into Ա�� values (?,?,?,?,?,?)";
			S.stmt=connection.prepareStatement(S.sql);
			for(int i=1;i<7;i++){
				System.out.print(s[i].toString()+" ");
				S.stmt.setString(i,s[i].toString());
			}
			S.stmt.executeUpdate();
			System.out.println();
			//S.rs=S.stmt.executeQuery();
			
		}catch(Exception ee){
		ee.printStackTrace();
		}		
	}
}

class Police_5_2 implements ActionListener,staticVar,LinkVar{//ɾ����¼��ť������
	public void actionPerformed(ActionEvent e){
		Connection connection;
		DBVar S=new DBVar();
		Scanner reader=new Scanner(System.in);
		try{
			System.out.println("�����Ա����Ҫɾ����Ա����Ա����ţ�");
			
			String s=new String();
			s=reader.next();
			
			Class.forName(dirverName);
			connection=DriverManager.getConnection(dbURL,userName,userPwd);
			
			S.sql="delete from Ա��  where Ա�����=?";
			
			S.stmt=connection.prepareStatement(S.sql);
			S.stmt.setString(1,s);
			S.stmt.executeUpdate();
			System.out.println();
			
		}catch(Exception ee){
		ee.printStackTrace();
		}		
	}
}

class Police_5_3 implements ActionListener,staticVar,LinkVar{//���¼�¼��ť������
	public void actionPerformed(ActionEvent e){
		Scanner reader=new Scanner(System.in);
		Connection connection;
		DBVar S=new DBVar();
		try{
			System.out.println("�����Ա����Ҫ�޸ĵ�Ա����ż�Ա�����䣺");//ͨ��Ա��������仯ʱԱ����Ϣ�б仯��Ƶ���ģ���Ĭ�ϸ���Ա������
			String s[]=new String[5];
			s[0]="";
			for(int i=1;i<3;i++){
				s[i]=reader.next();
			}
			
			Class.forName(dirverName);
			connection=DriverManager.getConnection(dbURL,userName,userPwd);
			
			S.sql="update Ա�� set ����=? where Ա�����=?";
			S.stmt=connection.prepareStatement(S.sql);
			for(int i=1;i<3;i++){
				//System.out.print(s[i].toString()+" ");
				S.stmt.setString(3-i,s[i].toString());
			}
			S.stmt.executeUpdate();
			System.out.println();
			
		}catch(Exception ee){
		ee.printStackTrace();
		}		
	}
}
class Police_5_4 implements ActionListener,staticVar,LinkVar{//�鿴��¼��ť������
	public void actionPerformed(ActionEvent e){
		Connection connection;
		DBVar S=new DBVar();
		try{
			Class.forName(dirverName);
			connection=DriverManager.getConnection(dbURL,userName,userPwd);
			S.sql="select * from "+sqlstr_5;
			S.stmt=connection.prepareStatement(S.sql);
			S.rs=S.stmt.executeQuery();
			while(S.rs.next()){
				String a;
				int i;
				for(i=1;i<7;i++){
					a=S.rs.getString(i);
					System.out.print(a+"   ");
					//i++;
				}
				
				System.out.println();
				
			}
		}catch(Exception ee){
		ee.printStackTrace();
		}		
	}
}
/*
class Police_logout implements ActionListener{//�鿴��¼��ť������
	public void actionPerformed(ActionEvent e){
		setvisible(true);
	}
}
*/