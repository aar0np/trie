package com.example.trie;

import java.util.Scanner;

/**
 * Command-line interface for the Trie.
 *
 * Commands:
 *   add <word>    – insert a word into the trie
 *   search <word> – check whether a word exists in the trie
 *   exit          – quit the program
 */
public class Main {

    // G.I. Joe characters
    private static String[] inputStrings = {"Flash", "Scarlett", "Duke", "Breaker", "Clutch", "Torpedo", "Snow Job", "Wild Bill", "Dusty"};

    public static void main(String[] args) {
        Trie trie = new Trie();

        // Add strings to trie

        for (String name : inputStrings) {
            trie.insert(name);
            System.out.println("Added: " + name);
        }

        System.out.println();

        // search for strings in trie
        String word1 = "Clutch";
        boolean found1 = trie.search(word1);
        System.out.println(found1 ? "Found: " + word1 : "Not found: " + word1);

        String word2 = "Duck";
        boolean found2 = trie.search(word2);
        System.out.println(found2 ? "Found: " + word2 : "Not found: " + word2);

        String word3 = "Dusty";
        boolean found3 = trie.search(word3);
        System.out.println(found3 ? "Found: " + word3 : "Not found: " + word3);

    }
}
