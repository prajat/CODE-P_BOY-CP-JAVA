import javax.swing.tree.TreeNode;

class TrieNode {
    char val;
    boolean isWord;
    TrieNode[] children = new TrieNode[26];

    public TrieNode() {
        
    }
    public TrieNode(char val) {
        this.val = val;
    }
}



public class Trie {
    private TrieNode root;

    public Trie() {
        this.root = new TrieNode();
        this.root.val = " ";

    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode node = root;
        for (int i = 0; i < word.length; i++) {
            if (node.children[word.charAt(i) - 'a'] == null) {
                node.children[word.charAt(i) - 'a'] = new TrieNode(word.charAt(i));
            }
            node = node.children[word.charAt(i) - 'a'];
        }
        node.isWord = true;


    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode node = root;
        for (int i = 0; i < word.length(); i++) {
            if (node.children[word.charAt(i) - 'a'] == null) {
                return false;
            }
            node = node.children[word.charAt(i) - 'a'];
        }
        return node.isWord;

    }

    /**
     * Returns if there is any word in the trie that starts with the given prefix.
     */
    public boolean startsWith(String prefix) {
        TrieNode node = root;
        for (int i = 0; i < prefix.length(); i++) {
            if (node.children[prefix.charAt(i) - 'a'] == null) {
                return false;
            }
            node = node.children[prefix.charAt(i) - 'a'];
        }
        return true;

    }
}

