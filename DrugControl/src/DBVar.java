import java.sql.*;

public class DBVar {
	ResultSet rs=null;//声明数据库结果集，即查询到的结果集，通过getString(?)获得结果；
	PreparedStatement stmt=null;//数据库指令操作实体语句；
	String sql=null;//String变量用于记录前端输入的语句；
}
