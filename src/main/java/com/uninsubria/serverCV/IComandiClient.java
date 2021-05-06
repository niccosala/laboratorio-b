package com.uninsubria.serverCV;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

public interface IComandiClient {

    String[] searchUser(String query) throws IOException;
    ArrayList<String> getSintomi(String query) throws IOException, SQLException;
    Boolean login(String query, String user) throws IOException;
    void insertDb(String query) throws IOException, SQLException;
    void populateCentriVaccinali(String query, String nomeTabella) throws IOException, SQLException;
    void filter(String query) throws IOException, SQLException;
    void close() throws IOException;
}