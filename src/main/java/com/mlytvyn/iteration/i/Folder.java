package com.mlytvyn.iteration.i;

import java.util.Queue;

public interface Folder<T, U> {
    U fold(U u, Queue<T> list, Function2<T, U, U> function);
}
