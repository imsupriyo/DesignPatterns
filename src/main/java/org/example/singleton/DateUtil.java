package org.example.singleton;

import java.io.Serial;
import java.io.Serializable;

public class DateUtil implements Serializable, Cloneable {
    private static volatile DateUtil instance; // initialize here or inside a static block for eager initialization

    private DateUtil() {
    }

    public static DateUtil getInstance() {
        if (instance == null) {
            synchronized (DateUtil.class) {
                if (instance == null) {
                    instance = new DateUtil();
                }
            }
        }
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    @Serial
    public Object readResolve() {
        return instance;
    }
}
