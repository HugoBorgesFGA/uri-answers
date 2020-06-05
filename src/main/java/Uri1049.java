import java.util.*;

public class Uri1049 {

    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);

        // root
        final Node rootNode =
            // 1st level
            new Node("root").append(
                // 2nd level
                new Node("vertebrado").append(
                    // 3rd level
                    new Node("ave").append(
                        // 4th level
                        new Node("carnivoro").append(
                            new Node("aguia")
                        ),
                        new Node("onivoro").append(
                            new Node("pomba")
                        )
                    ),
                    new Node("mamifero").append(
                        new Node("onivoro").append(
                            new Node("homem")
                        ),
                        new Node("herbivoro").append(
                            new Node("vaca")
                        )
                    )
                ),
                new Node("invertebrado").append(
                    new Node("inseto").append(
                        new Node("hematofago").append(
                            new Node("pulga")
                        ),
                        new Node("herbivoro").append(
                            new Node("lagarta")
                        )
                    ),
                    new Node("anelideo").append(
                        new Node("hematofago").append(
                            new Node("sanguessuga")
                        ),
                        new Node("onivoro").append(
                            new Node("minhoca")
                        )
                    )
                )
        );

        Node node = rootNode;
        while (true) {
            int nodes = node.childNodes.size();
            if (!(nodes > 0)) break;

            if (nodes == 1) {
                node = node.childNodes.get(0);
                break;
            }

            String input = scanner.next();
            node = node.getChild(input).orElseThrow(() -> new RuntimeException("Could not find " + input));
        }

        System.out.println(node.value);
    }

    public static class Node {

        private String value;
        private List<Node> childNodes;

        public Node(String value) {
            this.value = value;
            this.childNodes = new ArrayList<>();
        }

        public Optional<Node> getChild(String value) {
            return this.childNodes.stream()
                                  .filter(child -> child.value.equals(value))
                                  .findFirst();
        }

        public Node append(Node... nodes) {
            this.childNodes.addAll(Arrays.asList(nodes));
            return this;
        }
    }
}
