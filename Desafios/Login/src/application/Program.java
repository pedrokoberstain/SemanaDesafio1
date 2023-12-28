package application;

import entities.Usuarios;
import times.Horarios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Map<String, Usuarios> usuarios = new HashMap<>();
        usuarios.put("pedro", new Usuarios("senha123"));
        usuarios.put("henrique", new Usuarios("senha456"));
        usuarios.put("kober", new Usuarios("senha789"));

        System.out.println("Usuário: ");
        String usuariodig = sc.nextLine();
        System.out.println("Senha: ");
        String senhadig = sc.nextLine();

        Usuarios usuario = usuarios.get(usuariodig);
        if (usuario != null && usuario.getSenha().equals(senhadig)) {
            System.out.println(Horarios.saudacoes());
        } else {
            System.out.println("Usuário e/ou senha incorretos.");
        }
        sc.close();
    }
}