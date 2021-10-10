package behavioral3.iterator.example1.iterators;

import behavioral3.iterator.example1.profile.Profile;

public interface ProfileIterator {
    boolean hasNext();

    Profile getNext();

    void reset();
}