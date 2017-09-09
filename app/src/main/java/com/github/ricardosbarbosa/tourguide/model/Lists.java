package com.github.ricardosbarbosa.tourguide.model;

import java.util.ArrayList;
import java.util.List;

public class Lists {

    public static final List<Location> MUSEUS = new ArrayList<Location>();
    public static final List<Location> PARQUES = new ArrayList<Location>();
    public static final List<Location> CHURCHES = new ArrayList<Location>();
    public static final List<Location> HISTORICALS = new ArrayList<Location>();


    static {
        addMuseusLocations();
        addParquesLocations();
        addChurchesLocations();
        addHistoricalLocations();
    }

    private static void addMuseusLocations() {
        MUSEUS.add(new Location("Memorial João Pessoa - Jardins do Palácio da Redenção", null));
        MUSEUS.add(new Location("Arquivo dos Governadores", null));
        MUSEUS.add(new Location("Museu Cultural do Centro de São Francisco", null));
        MUSEUS.add(new Location("Museu Fotográfico Walfrêdo Rodrigues", null));
        MUSEUS.add(new Location("Museu José Lins do Rego", null));
        MUSEUS.add(new Location("Casa do Artista Popular", null));
        MUSEUS.add(new Location("Espaço Energisa", null));
        MUSEUS.add(new Location("Museu Da Terra e do Homem - UNIPÊ", null));
        MUSEUS.add(new Location("Memorial Augusto dos Anjos", null));
        MUSEUS.add(new Location("Museu e Cripta do Presidente Epitácio Pessoa - Subsolo do Palácio da Justiça", null));
        MUSEUS.add(new Location("Pinacoteca da UFPB", null));
        MUSEUS.add(new Location("Museu da Estação Ciência", null));
        MUSEUS.add(new Location("Arquivo Histórico do Estado da Paraíba", null));
        MUSEUS.add(new Location("Museu Casa José Américo de Almeida", null));
    }

    private static void addParquesLocations() {
        PARQUES.add(new Location("Parque Sólon de Lucena (Lagoa)", null));
        PARQUES.add(new Location("Parque Arruda Câmara (Parque Zoobotânico e Orquidário)", null));
        PARQUES.add(new Location("Jardim Botânico Benjamim Maranhão", null));
        PARQUES.add(new Location("Parque Parahyba", null));
        PARQUES.add(new Location("Complexo Natural da Ilha da Restinga", null));
    }

    private static void addChurchesLocations() {
        CHURCHES.add(new Location("Igreja da Ordem Terceira de São Francisco (tombada pelo IPHAN)", "igreja"));
        CHURCHES.add(new Location("Igreja de Santo Antônio", null));
        CHURCHES.add(new Location("Igreja São Frei Pedro Gonçalves", null));
        CHURCHES.add(new Location("Igreja do Carmo (tombada pelo IPHAN)", null));
        CHURCHES.add(new Location("Igreja da Misericórdia (tombada pelo IPHAN)", null));
        CHURCHES.add(new Location("Catedral Basílica de Nossa Senhora das Neves (tombada pelo IPHAN)", null));
        CHURCHES.add(new Location("Igreja de São Bento (Tombada pelo IPHAN)", null));
        CHURCHES.add(new Location("Igreja Santa Tereza de Jesus (Tombada pelo IPHAN)", null));
        CHURCHES.add(new Location("Capela do Engenho da Graça (Tombada pelo IPHAN)", null));
        CHURCHES.add(new Location("Igreja de Nossa Senhora de Lourdes", null));
        CHURCHES.add(new Location("Igreja Nossa Senhora do Rosário", null));
    }

    private static void addHistoricalLocations() {
        HISTORICALS.add(new Location("Casa da Pólvora", null));
        HISTORICALS.add(new Location("Casarão 34", null));
        HISTORICALS.add(new Location("Casarão dos Azulejos", null));
        HISTORICALS.add(new Location("Fonte do Tambiá (localizada no Parque Arruda Câmara)", null));
        HISTORICALS.add(new Location("Fonte de Santo Antônio (localizada no Conjunto São Francisco)", null));
        HISTORICALS.add(new Location("Fábrica de Vinho de Caju Tito Silva & Cia (tombada pelo Iphan)", null));
        HISTORICALS.add(new Location("Hotel Globo (Centro Histórico)", null));
        HISTORICALS.add(new Location("Palácio da Redenção", null));
        HISTORICALS.add(new Location("Porto do Capim", null));
        HISTORICALS.add(new Location("Palácio Episcopal (Arquidiocese da Paraíba)", null));
        HISTORICALS.add(new Location("Imóveis da Praça São Pedro Gonçalves", null));
        HISTORICALS.add(new Location("Coreto da Praça Venâncio Neiva", null));
        HISTORICALS.add(new Location("Coreto da Praça da Independência", null));
        HISTORICALS.add(new Location("Balaustrada da Praça Aristides Lobo", null));
        HISTORICALS.add(new Location("Balaustrada da Avenida João da Mata", null));
    }
}
