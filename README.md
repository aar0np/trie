# Trie

A simple Trie (prefix tree) implementation in Java. It takes a list of members of the G.I. Joe team, inserts their names into a Trie, and attempts 3 search retrievals.

## Structure

- [`TrieNode`](src/main/java/com/example/trie/TrieNode.java) — a single node holding a `HashMap<Character, TrieNode>` of children and an `isEndOfWord` flag.
- [`Trie`](src/main/java/com/example/trie/Trie.java) — the tree itself, exposing `insert` and `search` operations.
- [`Main`](src/main/java/com/example/trie/Main.java) — a driver that inserts a set of words and demonstrates search results.

## Requirements

- Java 25+
- Maven 3.6+

## Build

```bash
mvn package
```

This produces `target/trie.jar`.

## Run

```bash
java -jar target/trie.jar
```

Expected output:

```
Added: Flash
Added: Scarlett
Added: Duke
Added: Breaker
Added: Clutch
Added: Torpedo
Added: Snow Job
Added: Wild Bill
Added: Dusty

Found: Clutch
Not found: Duck
Found: Dusty
```

## API

### `Trie`

| Method | Description |
|---|---|
| `void insert(String word)` | Inserts a word into the trie. |
| `boolean search(String word)` | Returns `true` if the exact word exists in the trie. |

## How it works

Each character of an inserted word is stored as an edge in the tree. Nodes share prefixes, so words like `Duke` and `Dusty` share the `D` → `u` path. A boolean flag on the terminal node marks where a complete word ends, allowing exact-match searches to be distinguished from prefix matches.
