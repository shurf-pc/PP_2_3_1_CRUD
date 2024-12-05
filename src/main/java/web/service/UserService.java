package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    public Long addUser(String name, String email);
    public boolean deleteUser(Long id);
    public boolean updateUser(User user);
    public User getUser(Long id);
    public List<User> getAllUsers();
}
