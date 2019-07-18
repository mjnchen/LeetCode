package com.mjnchen.leetcode.algorithms;

/**
 * Word Ladder
 * Created by jchen on 2/26/15.
 */

import java.util.*;

public class LeetCodeOJ127 {
    public int ladderLength(String beginWord, String endWord, Set<String> wordList) {
        // BFS
        Deque<WordNode> q = new ArrayDeque<WordNode>();
        Set<String> visited = new HashSet<String>();

        wordList.add(endWord);
        q.add(new WordNode(beginWord, 1));
        visited.add(beginWord);

        while(!q.isEmpty()) {
            WordNode current = q.remove();
            String curStr = current.word;
            int curLen = current.numSteps;

            List<String> neighbors = findNextStr(curStr, wordList, visited);
            for (int i = 0; i < neighbors.size(); i++) {
                String temp = neighbors.get(i);
                if (temp.equals(endWord)) {
                    return curLen + 1;
                } else {
                    q.add(new WordNode(temp, curLen + 1));
                    visited.add(temp);
                }
            }
        }

        return 0;
    }

    public List<String> findNextStr(String temp, Set<String> wordList, Set<String> visited) {
        List<String> neighbors = new ArrayList<String>();
        int n = temp. length();
        for (int i = 0; i < n; i++) {
            for (char c = 'a'; c <= 'z'; c++) {
                char[] tempChars = temp.toCharArray();
                tempChars[i] = c;
                String tempStr = String.valueOf(tempChars);
                if(wordList.contains(tempStr) && (!visited.contains(tempStr))) {
                    neighbors.add(tempStr);
                    // visited.add(tempStr);
                } else {
                    continue;
                }
            }
        }
        return neighbors;
    }
    // Define a class
    class WordNode{
        String word;
        int numSteps;

        public WordNode(String word, int numSteps){
            this.word = word;
            this.numSteps = numSteps;
        }
    }
}
