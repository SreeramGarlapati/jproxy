/*
 * Copyright (c) Microsoft. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */
package org.jutils.jproxy;

import org.jutils.jproxy.impl.SimpleProxy;

import java.io.IOException;
import java.util.function.Consumer;

public interface ProxyServer {

    static ProxyServer create(final String hostName, final int port) {
        return new SimpleProxy(hostName, port);
    }

    void start(final Consumer<Throwable> onError) throws IOException;

    void stop() throws IOException;
}