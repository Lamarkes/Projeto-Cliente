package Main;

import Model.*;

public class Main {
    public static void main(String[] args) {

        Endereco endereco = new Endereco("9821021",
                "sp",
                "Alagoinha",
                "Centro",
                "Sao Paulo",
                "Casa");

        Sexo sexo = new Sexo("098212321",
                "Masculino");

        Contato contato = new Contato("98212121",
                "lucianohulk@gmail.com");

        IndicadorInscricaoEstadual indicadorInscricaoEstadual = new IndicadorInscricaoEstadual("09213122",
                "8912321");


        ClienteJuridico clienteJuridico = new ClienteJuridico(contato,
                endereco,
                "12091232123",
                true,
                "98123212",
                "9081234212",
                "Coca Cola Indústrias Ltda",
                "Coca cola",
                indicadorInscricaoEstadual,
                "87218312",
                "76218321");


        CLienteFisico clienteFisico = new CLienteFisico(contato,
                endereco,
                "12/09/21",
                true,
                "Luciano Hulk",
                "7612192121",
                "871.1232-12",
                "Ssppb",
                sexo,
                "09/07/1981"
                );


        System.out.println(clienteFisico+"\n");
        System.out.println(clienteJuridico);
    }
}
