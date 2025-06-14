package org.example.Database;

import org.example.Computador;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ComputadorDAO {

    public void criarComputador(Computador computador) {
        String sql = "INSERT INTO computador(marca, modelo, ram) VALUES (?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, computador.getMarca());
            stmt.setString(2, computador.getModelo());
            stmt.setInt(3, computador.getRam());
            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Computador> listar() {
        List<Computador> computadores = new ArrayList<>();
        String sql = "SELECT * FROM computador";

        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Computador comp = new Computador(rs.getString("marca"), rs.getString("modelo"), rs.getInt("ram"));
                comp.setId(rs.getInt("id"));
                computadores.add(comp);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return computadores;
    }

    public void atualizar(Computador comp) {
        String sql = "UPDATE computador SET marca = ?, modelo = ?, ram = ? WHERE id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, comp.getMarca());
            stmt.setString(2, comp.getModelo());
            stmt.setInt(3, comp.getRam());
            stmt.setInt(4, comp.getId());
            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deletar(int id) {
        String sql = "DELETE FROM computador WHERE id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
