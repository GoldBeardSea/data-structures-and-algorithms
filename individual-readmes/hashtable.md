# Hashtables
A hashtable is an example of a hash that handles KVPs this particular implementation will have a hashing implementation. 

## Challenge
Create and handle collisions and hashes. 

## Approach & Efficiency
My approach was to for now, implement a non generic hash table and turn it into a generic later on. 

## API
public hash(String key) returns a hash of the key using a private hasher method. 

public add(String key, String value) returns a string of whether it is a new add or collision.

public get(String key) returns a String of the last added value of the key or null if there is no key value pair. 

public contains(String key) returns a boolean if the key. 