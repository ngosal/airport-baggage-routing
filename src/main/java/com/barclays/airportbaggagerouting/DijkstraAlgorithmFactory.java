package com.barclays.airportbaggagerouting;

public class DijkstraAlgorithmFactory {

    public static DijkstraAlgorithm createDijkstraAlgorithm(){
        return new DijkstraAlgorithmImpl();
    }
}
