package com.netcracker.fourth;

import java.lang.reflect.Array;
import java.util.Iterator;


public class MyLinkedList<E> implements ILinkedList<E> {

    private int size;
    private Node<E> firstNode;
    private Node<E> lastNode;

    public MyLinkedList() {
        this.size = 0;
        this.firstNode = null;
        this.lastNode = null;
    }

    public int size() {
        return size;
    }

    @Override
    public void add(E element) {
        if(size == 0) {

            Node<E> currentNode = new Node<>(element, null);
            firstNode = currentNode;
            lastNode = currentNode;
            size++;
        }

        else {
            Node<E> temp = lastNode;
            Node<E> currentNode = new Node(element, null);
            lastNode = currentNode;
            temp.setNext(currentNode);
            size++;
        }
    }

    @Override
    public void add(int index, E element) {
        Node<E> currentNode = firstNode;
        for(int i = 0; i <= this.size - 1; i++) {
            if(i == index - 1) {
                Node<E> newNode = new Node(element, currentNode.getNext());
                currentNode.setNext(newNode);
                size++;
                break;
            }

            if(i != index) {
                currentNode = currentNode.getNext();
            }
        }
    }

    @Override
    public void clear() {
        Node<E> currentNode = firstNode;
        for(int i = 0; i <= size - 1; i++) {

            Node<E> nextElement = currentNode.getNext();
            currentNode.setElement(null);
            currentNode.setNext(null);
            currentNode = nextElement;
        }
        firstNode = null;
        lastNode = null;
        size = 0;
    }


    @Override
    public E get(int index) {
        E result = null;

        if(index > size) {
            return null;
        }

        Node<E> currentNode = firstNode;
        for(int i = 0; i <= size - 1; i++) {
            if(i == index) {
                result = currentNode.getElement();
                break;
            }

            else {
                currentNode = currentNode.getNext();
            }
        }
        return result;
    }

    @Override
    public int indexOf(E element) {
        int result = -1;
        Node<E> currentNode = firstNode;
        for(int i = 0; i <= size - 1; i++) {
            if(currentNode.getElement().equals(element)) {
                result = i;
                break;
            }
            else {
                currentNode = currentNode.getNext();
            }
        }
        return result;
    }

    @Override
    public E remove(int index) {
        if(index > size) {
            return null;
        }

        Node<E> currentNode = firstNode;
        Node<E> removingNode = null;
        E result = null;
        for(int i = 0; i <= this.size - 1; i++) {
            if(i == index - 1) {
                removingNode = currentNode.getNext();
                currentNode.setNext(removingNode.getNext());
                result = currentNode.getElement();
                size--;
                break;
            }

            if(i != index) {
                currentNode = currentNode.getNext();
            }
        }
        return result;
    }

    @Override
    public E set(int index, E element) {
        if(index > size) {
            return null;
        }

        Node<E> currentNode = firstNode;
        E result = null;
        for(int i = 0; i <= size - 1; i++) {
            if(i == index) {
                result =currentNode.getElement();
                currentNode.setElement(element);
                break;
            }
            else {
                currentNode = currentNode.getNext();
            }
        }
        return result;
    }

    @Override
    public Object[] toArray() {

        Object[] result = new Object[size];
        Node<E> currentNode = firstNode;
        for(int i = 0; i <= size - 1; i++) {
            result[i] = currentNode.getElement();
            currentNode = currentNode.getNext();
        }

        return result;

    }


    @Override
    public String toString() {
        String result = new String();
        Node<E> currentNode = firstNode;
        for(int i = 0; i <= size - 1; i++) {
            result = result + currentNode.getElement().toString() + "\n";
            currentNode = currentNode.getNext();
        }
        return result;
    }



    @Override
    public Iterator<E> iterator() {
        Iterator<E> iter = new Iterator<>() {
            private Node<E> currentNode = firstNode;
            private Node<E> temp = null;
            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                if(currentNode == null) {
                    return false;
                }
                if(currentIndex <= size-1) {
                    return true;
                }
                else {
                    return false;
                }
            }

            @Override
            public E next() {

                temp = currentNode;
                currentNode = currentNode.getNext();
                currentIndex++;
                return temp.getElement();
            }
        };
        return iter;
    }


}
