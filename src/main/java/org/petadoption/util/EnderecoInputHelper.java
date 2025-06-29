package org.petadoption.util;

import org.petadoption.model.Endereco;

import java.util.Scanner;

public class EnderecoInputHelper {
    public static Endereco getAdressByInputs(){
        Scanner scanner = new Scanner(System.in);
        Endereco endereco = new Endereco();
        System.out.println("Informe seu logradouro: ");
        endereco.setLogradouro(scanner.nextLine());
        System.out.println("Informe o número da sua residência: ");
        endereco.setNumero(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Informe sua cidade");
        endereco.setCidade(scanner.nextLine());
        return endereco;
    }
}
