package com.codecool.krk.doublylinkedlist;

public class DoublyLinkedList<T> {
    private DoublyNode<T> head;
    private DoublyNode<T> tail;
    private int length;

    public DoublyLinkedList() {
        this.length = 0;
    }

    public DoublyNode<T> getHead() {
        return head;
    }

    public void setHead(DoublyNode<T> head) {
        this.head = head;
    }

    public DoublyNode<T> getTail() {
        return tail;
    }

    public void setTail(DoublyNode<T> tail) {
        this.tail = tail;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    // Implement to keep naming similar to Collection interface implementations
    public int size() {
        return getLength();
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    public boolean contains(T data) {
        if (isEmpty()) {
            return false;
        }

        DoublyNode<T> current = this.head;

        while (current.getNextNode() != null) {
            if (current.getData().equals(data)) {
                return true;
            }
        }

        return false;
    }

    public DoublyNode<T> search(T data) {
        if (!contains(data)) {
            return null;
        }

        DoublyNode<T> searchedNode = this.head;

        while (!searchedNode.getData().equals(data)) {
            searchedNode = searchedNode.getNextNode();
        }
        return searchedNode;
    }

    @Override
    public String toString() {
        StringBuilder listString = new StringBuilder("");
        DoublyNode<T> temp = this.head;

        while (temp != null) {
            listString.append(" ");
            listString.append(temp.getData());
            temp = temp.getNextNode();
        }
        return listString.toString();
    }
}
