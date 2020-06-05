import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Uri1141 {
    private static final String ROOT = "ROOT";

    private static final boolean IS_DEBUG_ENABLED = true;
    private static void debug(String value) {
        if (IS_DEBUG_ENABLED) {
            System.out.println("DEBUG: " + value);
        }
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        while (true) {
            int entries = scanner.nextInt();
            if (entries == 0) break;

            Node root = new Node(null, ROOT);
            while (entries-- > 0) {
                insertOnTree(root, root, scanner.next());
            }

            System.out.println(biggestHeight(root, 0));
        }
    }

    static class Node {
        private Node parent;
        private String value;
        private List<Node> childNodes;

        Node(Node parent, String value) {
            this.parent = parent;
            this.value = value;
            this.childNodes = new ArrayList<>();
        }

        public void removeChild(Node child) {
            debug(String.format("Disconnecting `%s` as a child of `%s`", child.getValue(), this.getValue()));
            this.childNodes.remove(child);
            child.setParent(null);
        }

        public void addChild(Node child) {
            debug(String.format("Adding `%s` as a child of `%s`", child.getValue(), this.getValue()));
            child.setParent(this);
            this.childNodes.add(child);
        }

        public Node getParent() {
            return parent;
        }

        public void setParent(Node parent) {
            final String parentName = Optional.ofNullable(parent).map(Node::getValue).orElse("null");
            debug(String.format("Setting `%s` as parent of `%s`", parentName, this.getValue()));
            this.parent = parent;
        }

        public List<Node> getChildNodes() {
            return childNodes;
        }

        public String getValue() {
            return value;
        }
    }

    private static int biggestHeight(Node node, int level) {
        final List<Node> childNodes = node.getChildNodes();
        if (childNodes.isEmpty()) {
            return level;
        }

        int maxHeight = Integer.MIN_VALUE;
        for(Node child : childNodes) {
            maxHeight = Math.max(maxHeight, biggestHeight(child, level + 1));
        }

        return maxHeight;
    }

    private static boolean insertOnTree(Node root, Node node, String value) {

        debug(String.format("Analyzing the insertion of `%s` on `%s`", value, node.getValue()));

        // Address root node
        if (node.getValue().equals(ROOT)) {
            if (node.getChildNodes().isEmpty()) {
                node.addChild(new Node(node, value));
                return true;
            }

            List<Node> childNodes = new ArrayList<>(node.getChildNodes());
            for (Node child : childNodes) {
                insertOnTree(root, child, value);
            }

            return false;
        }

        // Non-Root
        if (value.equals(node.getValue())) {
            debug(String.format("Ignoring `%s` because it is already inserted", value));
            return false;
        }

        // Tobe inserted as parent
        if (node.getValue().contains(value)) {
            Node parent = node.getParent();
            debug(String.format("Inserting `%s` as a parent of `%s` and a child of `%s`", value, node.getValue(), parent.getValue()));

            parent.removeChild(node);
            Node intermediate = new Node(parent, value);
            parent.addChild(intermediate);

            intermediate.addChild(node);

            return true;
        }

        // To be appended
        if (value.contains(node.getValue())) {
            if (!node.getChildNodes().isEmpty()) {
                return insertOnTree(root, node, value);
            }

            node.addChild(new Node(node, value));
        }

        debug(String.format("Inserting `%s` as a child of `%s`", value, root.getValue()));
        root.addChild(new Node(node, value));
        return true;
    }
}
