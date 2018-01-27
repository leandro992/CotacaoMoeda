package com.victor.cotacaomoeda.service;

import java.util.HashMap;
import java.util.Map;
/**
 * Created by victor on 27/01/18.
 */



public class DetalheMoedaService {

    private String descricaoDolar = "O dólar americano surgiu pela necessidade de financiar a Guerra da Independência dos Estados Unidos em 1776. Dez anos depois, ele foi aprovado nas 13 colônias independentes como moeda nacional.  Até a metade do século XIX, os Estados Unidos eram vistos com pouca credibilidade no cenário internacional e, ao contrário dos países europeus, não havia nenhuma lei em sua Constituição que desse ao Estado o controle da emissão da moeda. Por isso, passou a existir diversas formas de pagamento, perdendo o controle, levando-os a uma situação caótica. Em resumo, qualquer pessoa poderia abrir um banco ou emitir cédulas";
    private String descricaoEuro = "Uma conturbada sessão noturna em Bruxelas decidiu, no dia 2 de maio de 1998, que a União Europeia teria uma moeda comum – o euro. A história do euro iniciou-se em 1957, com a assinatura do Tratado de Roma e a criação da Comunidade Econômica Europeia (CEE), entre Alemanha, França, Itália, Bélgica, Luxemburgo e Holanda";
    private String descricaoLibra = "O Rei Athelstan, primeiro Rei da Inglaterra, foi quem instituiu a libra como moeda oficial do país e passou a produzi-la com verba da coroa. A libra, que se chama British Pound (símbolo: £) é a moeda mais antiga do mundo em circulação.";
    private String descricaoBitcoin = "O criador da Bitcoin, principal – e mais polêmica – moeda virtual em circulação, é um senhor de 64 anos, nascido no Japão e naturalizado norte-americano, com um gosto peculiar que o faz colecionar trenzinhos e um temperamento à la Steve Jobs. Não só isso, Satoshi Nakamoto é dono de uma fortuna em Bitcoins avaliada em cerca de US$ 400 milhões, mas vive numa casa humilde com a mãe em Temple City, na Califórnia.";
    private String descricaoPeso = "Em 1813, a Argentina começou a emitir sua própria moeda, denominada Real Argentino, constituída somente por moedas metálicas. Em 1820, foram introduzidas as cédulas. Em 1881, o Real Argentino foi substituído pelo Peso. Na ocasião, cada peso valia 2 reais argentinos. O peso foi a moeda corrente da Argentina no período de 1881 até 1985 e era conversível com \"selos de ouro\" (1 peso equivalia ao valor de 100 gramas de ouro). Em 1969, o Banco Central argentino (BCRA) decidiu emitir novas cédulas, com um visual mais moderno e seguro, e reformou a simbologia da moeda";


    public String getDescricaoMoeda(String nomeMoeda) {
        if (nomeMoeda == "Dolar") {
            return descricaoDolar;
        } else if (nomeMoeda == "Euro") {
            return descricaoEuro;
        } else if (nomeMoeda == "Libra") {
            return  descricaoLibra;
        } else if (nomeMoeda == "Bitcoin") {
            return descricaoBitcoin;
        } else {
            return descricaoPeso;
        }
    }
}
