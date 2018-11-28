package com.mihuwis.hrhelper.UsersDAO;

import com.mihuwis.hrhelper.dbconection.DBconector;
import com.mihuwis.hrhelper.model.Applicant;
import com.mihuwis.hrhelper.model.User;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ApplicantsDAO implements UsersDAO {

    DBconector dBconector;

    public ApplicantsDAO(){
        this.dBconector = new DBconector();
    }



    public List<User> createUserList(String query) {
        Connection connection = dBconector.getConection();
        Statement statement;
        ResultSet resultOfQuery;
        List<User> applicantsList = new ArrayList<User>();

        try{
            statement = dBconector.getStatement(connection);
            resultOfQuery = statement.executeQuery(query);
            populateApplicantsList(resultOfQuery, applicantsList);

        } catch (SQLException e) {
            System.err.println("Connection exception. Check ApplicantsDAO");
            e.getSQLState();
            e.printStackTrace();
        }
        return applicantsList;
    }

    private void populateApplicantsList(ResultSet resultOfQuery, List<User> applicantsList) throws SQLException{
        while(resultOfQuery.next()) {
            User applicant = new Applicant(
                    resultOfQuery.getInt(1),
                    resultOfQuery.getString(2),
                    resultOfQuery.getString(3),
                    resultOfQuery.getString(4),
                    resultOfQuery.getString(5),
                    resultOfQuery.getInt(6));
            applicantsList.add(applicant);
        }
    }
}
