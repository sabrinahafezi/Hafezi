package com.sabrina.module3.five;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class NodeTest {
    public static ArrayList<Node> graph;
    public static void main(String[] args) throws FileNotFoundException {
        setupTree();
        BFS();
    }

    private static void BFS() {
        Queue<Integer> nodesToTraverse = new LinkedList<Integer>();
        HashSet<Integer> inQueueNodes = new HashSet<Integer>();
        Node start = graph.get(0);
        if(start == null){
            System.out.println("Empty graph");
            return;
        }
        nodesToTraverse.add(start.getKey());
        inQueueNodes.add(start.getKey());
        while(!nodesToTraverse.isEmpty()){
            Integer exploringKey = nodesToTraverse.poll();
            Node exploringNode = graph.get(exploringKey-1);
            System.out.println("Exploring "+ exploringNode.toString());
            exploringNode.setVisited(true);
            List<Integer> potentialNodesToExplore = graph.get(exploringKey-1).getNodes();
            for(Integer key:potentialNodesToExplore){
                Node node = graph.get(key-1);
                if(node.isVisited() || inQueueNodes.contains(node.getKey())){
                    continue;
                }
                nodesToTraverse.add(key);
                inQueueNodes.add(key);
            }
        }
    }

    private static void setupTree() throws FileNotFoundException {
        graph = new ArrayList<>();
        Scanner scan = new Scanner(new File("/Users/sabrina/IdeaProjects/Module 3/src/com/sabrina/module3/five/tree"));
        while(scan.hasNext()){
            String line = scan.nextLine();
            parseLine(line);
        }
    }

    private static void parseLine(String line) {
        String[] keys = line.split(" ");
        int key = Integer.parseInt(keys[0]);
        ArrayList<Integer> points = new ArrayList<>();
        for(int i = 1; i < keys.length;i++){
            points.add(Integer.parseInt(keys[i]));
        }
        graph.add(new Node(key, points));
    }
}