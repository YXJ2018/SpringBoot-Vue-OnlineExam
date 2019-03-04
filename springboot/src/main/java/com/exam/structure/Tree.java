package com.exam.structure;

import java.util.*;

public class Tree<E> {
    private int depth;
    public static class Node<T> {
        private T nodeEntity;
        private boolean leaf = true;
        private int level;
        private int depth;
        private List<Node<T>> children;

        public void setNodeEntity(T nodeEntity) {
            this.nodeEntity = nodeEntity;
        }

        public List<Node<T>> getChildren() {
            return children;
        }

        public void setChildren(List<Node<T>> children) {
            this.children = children;
        }

        public boolean isLeaf() {
            return leaf;
        }

        public void setLeaf(boolean leaf) {
            this.leaf = leaf;
        }

        public int getLevel() {
            return level;
        }

        public void setLevel(int level) {
            this.level = level;
        }

        public int getDepth() {
            return depth;
        }

        public void setDepth(int depth) {
            this.depth = depth;
        }

        public T getNodeEntity() {
            return nodeEntity;
        }

        public void appendChildNode(Node<T> node) {
            if (leaf || children == null) {
                children = new ArrayList<>();
            }
            node.level = level + 1;
            node.depth = depth + 1;
            children.add(node);
            leaf = false;
        }

        public void removeChildNode(Node<T> node) {
            if (leaf || children == null) {
                throw new NoSuchElementException("当前节点为叶子节点，无子节点。");
            }
            children.remove(node);

            if (children.isEmpty()) {
                leaf = true;
            }
        }

        @Override
        public String toString() {
            return "Node{" +
                    "children=" + children +
                    ", leaf=" + leaf +
                    ", level=" + level +
                    ", depth=" + depth +
                    ", nodeEntity=" + nodeEntity +
                    '}';
        }
    }

    public Node<E> createNode() {
        return new Node<>();
    }

    private Node<E> rootNode;

    public Tree() {
        rootNode = createNode();
    }

    public Tree(Node<E> rootNode) {
        this.rootNode = rootNode;
    }

    public Node<E> getRootNode() {
        return rootNode;
    }

    public boolean empty() {
        return rootNode.children.isEmpty();
    }


    public static void main(String[] args) {
        Tree<Map<String, String>> mapTree = new Tree<>();
        Node<Map<String, String>> rootNode = mapTree.getRootNode();
        Map<String, String> fLevel = new HashMap<>();
        fLevel.put("id", "1");
        Node<Map<String, String>> fNode = mapTree.createNode();
        fNode.setNodeEntity(fLevel);

        Map<String, String> sLevel = new HashMap<>();
        sLevel.put("id", "1-1");
        Node<Map<String, String>> sNode = mapTree.createNode();
        sNode.setNodeEntity(sLevel);
        Map<String, String> sLevel2 = new HashMap<>();
        sLevel2.put("id", "1-2");
        Node<Map<String, String>> sNode2 = mapTree.createNode();
        sNode2.setNodeEntity(sLevel2);

        rootNode.appendChildNode(fNode);
        fNode.appendChildNode(sNode);
        fNode.appendChildNode(sNode2);

        System.out.println(rootNode);
    }

}
