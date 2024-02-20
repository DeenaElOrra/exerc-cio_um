package org.example;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Restaurante> restaurantes = new ArrayList<>();

        while (true) {
            System.out.println("Menu Principal:");
            System.out.println("1. Cadastrar restaurante");
            System.out.println("2. Listar restaurantes");
            System.out.println("3. Cadastrar item no menu de um restaurante");
            System.out.println("4. Sair");
            System.out.println("Escolha uma opção:");

            String opcao = scanner.nextLine();

            if (opcao.equals("1")) {
                System.out.println("Digite o nome do restaurante:");
                String nomeRestaurante = scanner.nextLine();

                System.out.println("Digite a avaliacao do restaurante:");
                String avaliacao1 = scanner.nextLine();
                Double avaliacao = Double.parseDouble(avaliacao1);


                Restaurante restaurante = new Restaurante();
                restaurante.nome = nomeRestaurante;
                restaurante.avaliacao = avaliacao;
                restaurantes.add(restaurante);
                System.out.println("Restaurante " + nomeRestaurante + " cadastrado com sucesso!");


            } else if (opcao.equals("2")) {
                System.out.println("Restaurantes cadastrados:");
                for (Integer i = 0; i < restaurantes.size() ; i++) {
                Restaurante restaurante = restaurantes.get(i);
                System.out.println(i + " : " + restaurante.nome);
                restaurante.imprimirMenu();
                }
            } else if (opcao.equals("3")) {
                System.out.println("Escolha o número do restaurante para adicionar um item ao menu: ");
                String escolha = scanner.nextLine();
                Integer escolha1 = Integer.parseInt(escolha);
                Restaurante restauranteEscolhido = restaurantes.get(escolha1);
                System.out.println("Digite o nome do item:");
                String nomeItem = scanner.nextLine();
                System.out.println("Digite o preço do item:");
                String preco = scanner.nextLine();
                Double precoItem = Double.parseDouble(preco);

                Item item = new Item();
                item.nome = nomeItem;
                item.preco = precoItem;
                restauranteEscolhido.adicionarItem(item);
                System.out.println("Item " + nomeItem + " adicionado ao menu do " + restauranteEscolhido.nome + "!"  );


            } else if (opcao.equals("4")) {
                System.out.println("Obrigado por utilizar o sistema de cadastro de restaurantes!");
            break;

            } else {
                System.out.println("Opção inválida. Por favor, escolha uma opção válida.!");
            }

    }
}}



// scanner classe que precisamos utlizar para pedir ao usuario utiliza-la
// array eu uso length, arraylist eh um objeto ent eu uso size