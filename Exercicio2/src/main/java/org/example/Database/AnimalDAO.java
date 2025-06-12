package org.example.Database;

import org.example.Animal;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AnimalDAO {

    public void CriarAnimal(Animal animal){
        String sql = "INSERT INTO animal(nome, especie, idade) VALUES (?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, animal.getNome());
            stmt.setString(2, animal.getEspecie());
            stmt.setInt(3, animal.getIdade());
            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Animal> listar() {
        List<Animal> animais = new ArrayList<>();
        String sql = "SELECT * FROM animal";

        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Animal animal = new Animal(rs.getString("nome"),rs.getInt("idade"),rs.getString("especie") );
                animal.setId(rs.getInt("id"));
                animais.add(animal);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return animais;
    }

    public void deletar(int id) {
        String sql = "DELETE FROM animal WHERE id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void atualizar(Animal animal) {
        String sql = "UPDATE animal SET nome = ?, especie = ?, idade = ? WHERE id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, animal.getNome());
            stmt.setString(2, animal.getEspecie());
            stmt.setInt(3, animal.getIdade());
            stmt.setInt(4, animal.getId());
            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
