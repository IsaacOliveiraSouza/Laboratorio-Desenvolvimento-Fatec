package org.example.Database;

import org.example.Robo;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class RoboDAO {
    private Connection conn;

    public RoboDAO() {
        try {
            this.conn = DatabaseConnection.getConnection();
        } catch (SQLException e) {
            e.printStackTrace(); // ou log de erro
        }
    }


    public void inserirRobo(Robo robo) {
        String sql = "INSERT INTO robo (nome, tipo, bateria) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, robo.getNome());
            stmt.setString(2, robo.getTipo());
            stmt.setInt(3, robo.getBateria());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Robo> listarRobos() {
        List<Robo> robos = new ArrayList<>();
        String sql = "SELECT * FROM robo";
        try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                robos.add(new Robo(
                        rs.getInt("id"),
                        rs.getString("nome"),
                        rs.getString("tipo"),
                        rs.getInt("bateria")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return robos;
    }

    public void atualizarRobo(Robo robo) {
        String sql = "UPDATE robo SET nome = ?, tipo = ?, bateria = ? WHERE id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, robo.getNome());
            stmt.setString(2, robo.getTipo());
            stmt.setInt(3, robo.getBateria());
            stmt.setInt(4, robo.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deletarRobo(int id) {
        String sql = "DELETE FROM robo WHERE id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
