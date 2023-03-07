package com.example.superheroversion4.repositories;

import com.example.superheroversion4.model.Superhelt;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class SuperheltRepository {

    @Value("${spring.datasource.url}")
    private String db_url;

    @Value("${spring.datasource.username}")
    private String uid;

    @Value("${spring.datasource.password}")
    private String pwd;

    public List<Superhelt> getSuperhelt() {
        List<Superhelt> superheroes = new ArrayList<Superhelt>();
        try (Connection con = DriverManager.getConnection(db_url, uid, pwd)) {
            String SQL = "SELECT * FROM Superhero;";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(SQL);
            while (rs.next()) {
                int superheroID = rs.getInt("superheroID");
                String superheroName = rs.getString("superheroName");
                String realName = rs.getString("realName");
                int creationYear = rs.getInt("creationYear");
                String cityName = rs.getString("cityName");
                String superpower = rs.getString("superpower");
                boolean isHuman = rs.getBoolean("isHuman");
                superheroes.add(new Superhelt(superheroID, superheroName, realName, creationYear, cityName, superpower, isHuman));
            }
            return superheroes;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


}
