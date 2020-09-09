package ru.v_makletsov.additionalTasks;


import java.util.Iterator;

public class SomeClass implements Iterable<String> {
    protected String[] words = ("And that is how " + "we know the Earth to be banana-shaped.").split(" ");

    @Override
    public Iterator<String> iterator() {
        return new Iterator<>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < words.length;
            }

            @Override
            public String next() {
                return words[index++];
            }

            @Override
            public void remove() { // Not implemented
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {
        for (String s : new SomeClass())
            System.out.print(s + " ");
    }
}
