package com.uninsubria.serverCV;

import com.uninsubria.clientCV.centrivaccinali.entity.CentroVaccinale;
import com.uninsubria.clientCV.condivisa.entity.UtenteRegistrato;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

public interface IComandiClient {

    CentroVaccinale pickCentro(String query) throws IOException;
    ArrayList<String> getSintomi(String query) throws IOException, SQLException;
    ArrayList<String> getCentri(String query) throws IOException, SQLException;
    UtenteRegistrato login(String query, String user) throws IOException;
    void insertDb(String query) throws IOException, SQLException;
    void populateCentriVaccinali(String query, String nomeTabella) throws IOException, SQLException;
    ArrayList<CentroVaccinale> filter(String query) throws IOException, SQLException;
    void close() throws IOException;
}
