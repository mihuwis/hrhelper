package com.mihuwis.hrhelper.UsersDAO;

import com.mihuwis.hrhelper.model.User;

import java.util.List;

public interface UsersDAO {

    List<User> createUserList(String query);
}
