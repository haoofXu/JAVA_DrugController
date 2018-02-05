//系统调用SQL Server数据库用到的变量，设置为接口，方便包内其他类调用；
public interface LinkVar {
	String dirverName="net.sourceforge.jtds.jdbc.Driver"; //加载JDBC驱动
	String dbURL="jdbc:jtds:sqlserver://localhost:1433;DatabaseName=药品管理系统"; //连接服务器和数据库
	String userName="root";
	String userPwd="Bloodyxu113";
}

