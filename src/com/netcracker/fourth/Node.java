package com.netcracker.fourth;

public class Node<E> {
    private E element;
    private Node nextNode;

    public Node(E element, Node nextNode) {
        this.element = element;
        this.nextNode = nextNode;
    }

    public void setNext(Node node) {
        this.nextNode = node;
    }

    public Node<E> getNext() {
        return nextNode;
    }

    public E getElement() {
        return this.element;
    }

    public void setElement(E element) {
        this.element = element;
    }
}
