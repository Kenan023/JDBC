import java.util.List;

public interface UserDaoInter {

    public List<User> getAll();

    public User getById(int userId);

    public boolean updateUser(User u);

    public boolean removeUser(int id);
}
