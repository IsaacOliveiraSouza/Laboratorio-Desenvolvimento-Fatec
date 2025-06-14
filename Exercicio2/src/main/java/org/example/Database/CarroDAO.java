package org.example.Database;

import org.example.Carro;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CarroDAO {

    public List<Carro> listarTodos() {
        List<Carro> carros = new ArrayList<>();
        String sql = "SELECT * FROM carro";

        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                carros.add(new Carro(
                        rs.getInt("id"),
                        rs.getString("marca"),
                        rs.getString("modelo"),
                        rs.getString("ano_fabricacao")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return carros;
    }

    public boolean inserir(Carro carro) {
        String sql = "INSERT INTO carro (marca, modelo, ano_fabricacao) VALUES (?, ?, ?)";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, carro.getMarca());
            stmt.setString(2, carro.getModelo());
            stmt.setString(3, carro.getAnoFabricacao());

            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean atualizar(Carro carro) {
        String sql = "UPDATE carro SET marca = ?, modelo = ?, ano_fabricacao = ? WHERE id = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, carro.getMarca());
            stmt.setString(2, carro.getModelo());
            stmt.setString(3, carro.getAnoFabricacao());
            stmt.setInt(4, carro.getId());

            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean excluir(int id) {
        String sql = "DELETE FROM carro WHERE id = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
