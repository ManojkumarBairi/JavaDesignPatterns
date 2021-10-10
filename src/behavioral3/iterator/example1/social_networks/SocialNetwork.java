package behavioral3.iterator.example1.social_networks;

import behavioral3.iterator.example1.iterators.ProfileIterator;

public interface SocialNetwork {
    ProfileIterator createFriendsIterator(String profileEmail);

    ProfileIterator createCoworkersIterator(String profileEmail);
}