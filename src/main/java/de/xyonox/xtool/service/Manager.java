package de.xyonox.xtool.service;

public interface Manager<T extends Loader> {
    void handle(T loader);
}
