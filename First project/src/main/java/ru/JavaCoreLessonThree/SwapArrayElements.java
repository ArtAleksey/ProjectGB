package ru.JavaCoreLessonThree;

public class SwapArrayElements<T> {
    public void swap(T[] array,int first, int second) {
        T storage = array[first-1];
        array[first-1] = array[second-1];
        array[second-1] = storage;
    }
}
