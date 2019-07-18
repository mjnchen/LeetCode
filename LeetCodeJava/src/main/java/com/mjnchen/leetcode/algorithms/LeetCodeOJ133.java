package com.mjnchen.leetcode.algorithms;

/**
 * Created by jchen on 05/15/15.
 * Clone Graph
 */

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class LeetCodeOJ133 {
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        if (node == null) {
            return null;
        }

        Deque<UndirectedGraphNode> q = new ArrayDeque<UndirectedGraphNode>();
        Map<UndirectedGraphNode, UndirectedGraphNode> visited = new HashMap<UndirectedGraphNode, UndirectedGraphNode>();
        q.add(node);

        UndirectedGraphNode nodeCopy = new UndirectedGraphNode(node.label);
        visited.put(node, nodeCopy);

        while (!q.isEmpty()) {
            UndirectedGraphNode current = q.remove();
            List<UndirectedGraphNode> nbNodes = current.neighbors;

            for (UndirectedGraphNode tempNode: nbNodes) {
                if (!visited.containsKey(tempNode)) {
                    UndirectedGraphNode tempNodeCopy = new UndirectedGraphNode(tempNode.label);
                    visited.put(tempNode, tempNodeCopy);
                    visited.get(current).neighbors.add(tempNodeCopy);
                    q.add(tempNode); // BFS
                } else {
                    visited.get(current).neighbors.add(visited.get(tempNode));
                }
            }
        }
        return nodeCopy;
    }

    // Definition for undirected graph.
    class UndirectedGraphNode {
        int label;
        List<UndirectedGraphNode> neighbors;

        UndirectedGraphNode(int x) {
            label = x;
            neighbors = new ArrayList<UndirectedGraphNode>();
        }
    }
}
