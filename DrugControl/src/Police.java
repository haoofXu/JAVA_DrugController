
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.*;

//触发器集。大大大大工程--。每个触发器调用时都会重新访问数据库；
class Police_1_4 implements ActionListener,staticVar,LinkVar{//查看记录按钮触发器
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

class Police_1_1 implements ActionListener,staticVar,LinkVar{//增加记录按钮触发器
	public void actionPerformed(ActionEvent e){
		Scanner reader=new Scanner(System.in);
		Connection connection;
		DBVar S=new DBVar();
		try{
			Class.forName(dirverName);
			connection=DriverManager.getConnection(dbURL,userName,userPwd);
			
			System.out.println("依次输入：药品编号、药品名称、生产厂家、生产日期、保质期(天)、药品用途、价格、库存数量、存放位置");
			System.out.println("每输入一个字段按Enter键确认");
			System.out.println("请输入：");
			
			String s[]=new String[20];
			s[0]=new String();
			s[0]="";
			for(int i=1;i<10;i++){
				s[i]=new String();
				s[i]=reader.next();
			}
			
			S.sql="insert into 药品 values (?,?,?,?,?,?,?,?,?)";
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

class Police_1_2 implements ActionListener,staticVar,LinkVar{//删除记录按钮触发器
	public void actionPerformed(ActionEvent e){
		Connection connection;
		DBVar S=new DBVar();
		Scanner reader=new Scanner(System.in);
		try{
			System.out.println("请输入要删除的药品的药品编号：");
			
			String s=new String();
			s=reader.next();
			
			Class.forName(dirverName);
			connection=DriverManager.getConnection(dbURL,userName,userPwd);
			
			S.sql="delete from 药品  where 药品编号=?";
			
			S.stmt=connection.prepareStatement(S.sql);
			S.stmt.setString(1,s);
			S.stmt.executeUpdate();
			System.out.println();
			
		}catch(Exception ee){
		ee.printStackTrace();
		}		
	}
}

class Police_1_3 implements ActionListener,staticVar,LinkVar{//更新记录按钮触发器
	public void actionPerformed(ActionEvent e){
		Scanner reader=new Scanner(System.in);
		Connection connection;
		DBVar S=new DBVar();
		try{
			System.out.println("请依次输入要修改的药品编号及当前的市场价格：");//支持药品价格的修改，而药品的数量在出入库表进行插入更新时由后台数据库通过调用触发器自行修改
			String s[]=new String[5];
			s[0]="";
			for(int i=1;i<3;i++){
				s[i]=reader.next();
			}
			
			Class.forName(dirverName);
			connection=DriverManager.getConnection(dbURL,userName,userPwd);
			
			S.sql="update 药品 set 价格=? where 药品编号=?";
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


class Police_2_1 implements ActionListener,staticVar,LinkVar{//增加记录按钮触发器
	public void actionPerformed(ActionEvent e){
		Scanner reader=new Scanner(System.in);
		Connection connection;
		DBVar S=new DBVar();
		try{
			Class.forName(dirverName);
			connection=DriverManager.getConnection(dbURL,userName,userPwd);
			
			System.out.println("依次输入：客户编号、姓名、联系方式");
			System.out.println("每输入一个字段按Enter键确认");
			System.out.println("请输入：");
			
			String s[]=new String[10];
			s[0]=new String();
			s[0]="";
			for(int i=1;i<4;i++){
				s[i]=new String();
				s[i]=reader.next();
			}
			
			S.sql="insert into 客户 values (?,?,?)";
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

class Police_2_2 implements ActionListener,staticVar,LinkVar{//删除记录按钮触发器
	public void actionPerformed(ActionEvent e){
		Connection connection;
		DBVar S=new DBVar();
		Scanner reader=new Scanner(System.in);
		try{
			System.out.println("请输入要删除的客户的客户编号：");
			
			String s=new String();
			s=reader.next();
			
			Class.forName(dirverName);
			connection=DriverManager.getConnection(dbURL,userName,userPwd);
			
			S.sql="delete from 客户  where 客户编号=?";
			
			S.stmt=connection.prepareStatement(S.sql);
			S.stmt.setString(1,s);
			S.stmt.executeUpdate();
			System.out.println();
			
		}catch(Exception ee){
		ee.printStackTrace();
		}		
	}
}

class Police_2_3 implements ActionListener,staticVar,LinkVar{//更新记录按钮触发器
	public void actionPerformed(ActionEvent e){
		Scanner reader=new Scanner(System.in);
		Connection connection;
		DBVar S=new DBVar();
		try{
			System.out.println("请依次输入要修改的客户编号及ta的联系方式：");//通常只有客户的联系方式需要修改
			String s[]=new String[5];
			s[0]="";
			for(int i=1;i<3;i++){
				s[i]=reader.next();
			}
			
			Class.forName(dirverName);
			connection=DriverManager.getConnection(dbURL,userName,userPwd);
			
			S.sql="update 客户 set 联系方式=? where 客户编号=?";
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

class Police_2_4 implements ActionListener,staticVar,LinkVar{//查看记录按钮触发器
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

class Police_3_1 implements ActionListener,staticVar,LinkVar{//增加记录按钮触发器
	public void actionPerformed(ActionEvent e){
		Scanner reader=new Scanner(System.in);
		Connection connection;
		DBVar S=new DBVar();
		try{
			Class.forName(dirverName);
			connection=DriverManager.getConnection(dbURL,userName,userPwd);
			
			System.out.println("依次输入：购买时间、客户编号、药品编号、药品名称、药品数量、经手人");
			System.out.println("每输入一个字段按Enter键确认");
			System.out.println("请输入：");
			
			String s[]=new String[20];
			s[0]=new String();
			s[0]="";
			for(int i=1;i<7;i++){
				s[i]=new String();
				s[i]=reader.next();
			}
			
			S.sql="insert into 购买 values (?,?,?,?,?,?)";
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

class Police_3_2 implements ActionListener,staticVar,LinkVar{//删除记录按钮触发器
	public void actionPerformed(ActionEvent e){
		Connection connection;
		DBVar S=new DBVar();
		Scanner reader=new Scanner(System.in);
		try{
			System.out.println("请输入需要删除的购买信息条件：购买时间、客户编号、药品编号");
			System.out.println("每输入一个字段按Enter键确认");
			System.out.println("请输入：");
			
			
			String s[]=new String[10];
			s[0]="";
			for(int i=1;i<4;i++){
				s[i]=new String();
				s[i]=reader.next();
			}
			
			Class.forName(dirverName);
			connection=DriverManager.getConnection(dbURL,userName,userPwd);
			
			S.sql="delete from 购买  where 购买时间=? and 客户编号=? and 药品编号=?";
			
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

class Police_3_3 implements ActionListener,staticVar,LinkVar{//更新记录按钮触发器
	public void actionPerformed(ActionEvent e){
		Scanner reader=new Scanner(System.in);
		Connection connection;
		DBVar S=new DBVar();
		try{
			System.out.println("请依次输入要修改的购买记录(购买时间、客户编号、药品编号)及正确的药品数量：");//通常购买时药品数量可能会发生输入错误
			String s[]=new String[10];
			s[0]="";
			for(int i=1;i<5;i++){
				s[i]=reader.next();
			}
			
			Class.forName(dirverName);
			connection=DriverManager.getConnection(dbURL,userName,userPwd);
			
			S.sql="update 购买 set 药品数量=? where 购买时间=? and 客户编号=? and 药品编号=?";
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


class Police_3_4 implements ActionListener,staticVar,LinkVar{//查看记录按钮触发器
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



class Police_4_1 implements ActionListener,staticVar,LinkVar{//增加记录按钮触发器
	public void actionPerformed(ActionEvent e){
		Scanner reader=new Scanner(System.in);
		Connection connection;
		DBVar S=new DBVar();
		try{
			Class.forName(dirverName);
			connection=DriverManager.getConnection(dbURL,userName,userPwd);
			
			System.out.println("依次输入：出入库编号、药品编号、入库数量、出库数量、经手人");
			System.out.println("每输入一个字段按Enter键确认");
			System.out.println("请输入：");
			
			String s[]=new String[20];
			s[0]=new String();
			s[0]="";
			for(int i=1;i<6;i++){
				s[i]=new String();
				s[i]=reader.next();
			}
			
			S.sql="insert into 出入库 values (?,?,?,?,?)";
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

class Police_4_2 implements ActionListener,staticVar,LinkVar{//删除记录按钮触发器
	public void actionPerformed(ActionEvent e){
		Connection connection;
		DBVar S=new DBVar();
		Scanner reader=new Scanner(System.in);
		try{
			System.out.println("请输入要删除的出入库记录相应的出入库编号：");
			
			String s=new String();
			s=reader.next();
			
			Class.forName(dirverName);
			connection=DriverManager.getConnection(dbURL,userName,userPwd);
			
			S.sql="delete from 出入库  where 出入库编号=?";
			
			S.stmt=connection.prepareStatement(S.sql);
			S.stmt.setString(1,s);
			S.stmt.executeUpdate();
			System.out.println();
			
		}catch(Exception ee){
		ee.printStackTrace();
		}		
	}
}

class Police_4_3 implements ActionListener,staticVar,LinkVar{//更新记录按钮触发器
	public void actionPerformed(ActionEvent e){
		Scanner reader=new Scanner(System.in);
		Connection connection;
		DBVar S=new DBVar();
		try{
			System.out.println("请依次输入要修改的出入库编号及真正入库的数量：");//因为药品在被客户购买时已自行更新了出库表格，所以修改只能修改入库时的药品数量
			String s[]=new String[5];
			s[0]="";
			for(int i=1;i<3;i++){
				s[i]=reader.next();
			}
			
			Class.forName(dirverName);
			connection=DriverManager.getConnection(dbURL,userName,userPwd);
			
			S.sql="update 出入库 set 入库数量=? where 出入库编号=?";
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
class Police_4_4 implements ActionListener,staticVar,LinkVar{//查看记录按钮触发器
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



class Police_5_1 implements ActionListener,staticVar,LinkVar{//增加记录按钮触发器
	public void actionPerformed(ActionEvent e){
		Scanner reader=new Scanner(System.in);
		Connection connection;
		DBVar S=new DBVar();
		try{
			Class.forName(dirverName);
			connection=DriverManager.getConnection(dbURL,userName,userPwd);
			
			System.out.println("依次输入：员工编号、姓名、年龄、学历、职务、性别");
			System.out.println("每输入一个字段按Enter键确认");
			System.out.println("请输入：");
			
			String s[]=new String[20];
			s[0]=new String();
			s[0]="";
			for(int i=1;i<7;i++){
				s[i]=new String();
				s[i]=reader.next();
			}
			
			S.sql="insert into 员工 values (?,?,?,?,?,?)";
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

class Police_5_2 implements ActionListener,staticVar,LinkVar{//删除记录按钮触发器
	public void actionPerformed(ActionEvent e){
		Connection connection;
		DBVar S=new DBVar();
		Scanner reader=new Scanner(System.in);
		try{
			System.out.println("请管理员输入要删除的员工的员工编号：");
			
			String s=new String();
			s=reader.next();
			
			Class.forName(dirverName);
			connection=DriverManager.getConnection(dbURL,userName,userPwd);
			
			S.sql="delete from 员工  where 员工编号=?";
			
			S.stmt=connection.prepareStatement(S.sql);
			S.stmt.setString(1,s);
			S.stmt.executeUpdate();
			System.out.println();
			
		}catch(Exception ee){
		ee.printStackTrace();
		}		
	}
}

class Police_5_3 implements ActionListener,staticVar,LinkVar{//更新记录按钮触发器
	public void actionPerformed(ActionEvent e){
		Scanner reader=new Scanner(System.in);
		Connection connection;
		DBVar S=new DBVar();
		try{
			System.out.println("请管理员输入要修改的员工编号及员工年龄：");//通常员工的年龄变化时员工信息中变化最频繁的，故默认更新员工年龄
			String s[]=new String[5];
			s[0]="";
			for(int i=1;i<3;i++){
				s[i]=reader.next();
			}
			
			Class.forName(dirverName);
			connection=DriverManager.getConnection(dbURL,userName,userPwd);
			
			S.sql="update 员工 set 年龄=? where 员工编号=?";
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
class Police_5_4 implements ActionListener,staticVar,LinkVar{//查看记录按钮触发器
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
class Police_logout implements ActionListener{//查看记录按钮触发器
	public void actionPerformed(ActionEvent e){
		setvisible(true);
	}
}
*/