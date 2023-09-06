package com.PRACTICE;

class LinkedList {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");

        System.out.println("Linked List: " + linkedList);

        linkedList.addFirst("Grape");
        linkedList.addLast("Lemon");

        System.out.println("Updated Linked List: " + linkedList);

        linkedList.remove(2);

        System.out.println("Linked List after removing at index 2: " + linkedList);

        System.out.println("First element: " + linkedList.getFirst());
        System.out.println("Last element: " + linkedList.getLast());
    }
}

