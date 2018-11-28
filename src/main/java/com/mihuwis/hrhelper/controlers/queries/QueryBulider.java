package com.mihuwis.hrhelper.controlers.queries;

public class QueryBulider {

    public String queryForAllUsersOfGivenType(String userType) {
        String query = "SELECT * FROM " + userType;
        return query;
    }
}
