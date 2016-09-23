package org.foo.server.impl;

import org.foo.server.Ping;

/**
 * Created by Deepak Nadig Anantha <deepnadig@gmail.com> on 9/21/16.
 */
public class PingImpl implements Ping {
    private final String text;

    public PingImpl(String text) {
        this.text = text;
    }

    public void sayHello() {
        System.out.println("Ping says Hello!");
    }
}
