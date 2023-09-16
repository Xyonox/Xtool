package de.xyonox.xtool.service;

import java.util.List;

public interface Loader<T> {
    void onLoad(T item);
    void onDisable(T item);
    List<T> currentLoaded();

    void call(T item);
}
