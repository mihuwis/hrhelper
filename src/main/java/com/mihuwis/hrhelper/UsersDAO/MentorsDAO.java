package com.mihuwis.hrhelper.UsersDAO;

import com.mihuwis.hrhelper.dbconection.DBconector;
import com.mihuwis.hrhelper.model.Mentor;
import com.mihuwis.hrhelper.model.User;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MentorsDAO implements UsersDAO{
    DBconector dBconector;

    public MentorsDAO(){
        this.dBconector = new DBconector();
    }

    public List<User> createUserList(String query) {
        Connection connection = dBconector.getConection();
        Statement statement;
        ResultSet resultOfQuery;
        List<User> mentorsList = new ArrayList<User>();

        try{
            statement = dBconector.getStatement(connection);
            resultOfQuery = statement.executeQuery(query);
            populateMentorsList(resultOfQuery, mentorsList);

        } catch (SQLException e) {
            System.err.println("Connection exception. Check MentorsDAO");
            e.getSQLState();
            e.printStackTrace();
        }

        return mentorsList;
    }

    private void populateMentorsList(ResultSet resultOfQuery, List<User> mentorList) throws SQLException{
        while(resultOfQuery.next()){
            User mentor = new Mentor(
                    resultOfQuery.getInt(1),
                    resultOfQuery.getString(2),
                    resultOfQuery.getString(3),
                    resultOfQuery.getString(4),
                    resultOfQuery.getString(5),
                    resultOfQuery.getString(6),
                    resultOfQuery.getString(7),
                    resultOfQuery.getInt(8));
            mentorList.add(mentor);
        }
    }
}
