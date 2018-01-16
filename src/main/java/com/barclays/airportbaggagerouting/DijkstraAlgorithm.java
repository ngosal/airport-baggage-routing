package com.barclays.airportbaggagerouting;

import com.barclays.airportbaggagerouting.model.DirectedEdge;

import java.util.List;


public interface DijkstraAlgorithm {
    public String findShortestPath(String entry,String dest, List<DirectedEdge> graphEdges);
}
