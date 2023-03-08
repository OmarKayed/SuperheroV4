package com.example.superheroversion4.repositories;

import com.example.superheroversion4.dto.HeroPowerDTO;
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


    public List<Superhelt> getSuperhero() {
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

    public Superhelt getOneSuperhero(String superheroName) {

        try (Connection con = DriverManager.getConnection(db_url, uid, pwd)) {
            String SQL = "SELECT * FROM Superhero WHERE superheroName = ?;";
            PreparedStatement pstm = con.prepareStatement(SQL);
            pstm.setString(1, superheroName);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                int superheroID = rs.getInt("superheroID");
                String superheroname = rs.getString("superheroName");
                String realName = rs.getString("realName");
                int creationYear = rs.getInt("creationYear");
                String cityName = rs.getString("cityName");
                String superpower = rs.getString("superpower");
                boolean isHuman = rs.getBoolean("isHuman");
                return new Superhelt(superheroID, superheroname, realName, creationYear, cityName, superpower, isHuman);
            }
            return null;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<HeroPowerDTO> getAllPowers() {
        List<HeroPowerDTO> heroPowerDTOlist = new ArrayList<>();
        try (Connection con = DriverManager.getConnection(db_url, uid, pwd)) {
            String SQL = "SELECT superheroName, realName, superpower FROM Superhero WHERE superpower = ? ;";
            PreparedStatement pstmt = con.prepareStatement(SQL);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                String superheroName = rs.getString("superheroName");
                String realName = rs.getString("realName");
                String superpower = rs.getString("superpower");
                heroPowerDTOlist.add(new HeroPowerDTO(superheroName, realName, superpower));
            }
            return heroPowerDTOlist;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }



}
