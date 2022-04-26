import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        UserDaoInter userDao=new UserDaoImpl();
        //List<User> list=userDao.getAll();
        //userDao.removeUser(1);
        //List<User> list2=userDao.getAll();
        //System.out.println("list="+list);
        //System.out.println("list2="+list2);

        User u=userDao.getById(2);
        u.setId(2);
        u.setName("Kenan");
        userDao.updateUser(u);
    }

}
