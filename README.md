## jproxy
HTTP proxy server, in java, for java developers...

**main goals** of this project is to provide a high-performant, simple-to-spin-up HTTP proxy server for java developers - where they can spin off a proxy-server - with an API as-simple-as:

```java
ProxyServer proxyServer = ProxyServer.create("localhost", 8899);
proxyServer.start(ex -> {});
// boom!
```

which can be used to - but, not limited to - perform various operations like, 
* host a custom proxy server - u a java dev - read the code, understand it & host it! who would want to **buy** a sniffer on their traffic! with **jproxy** - you can read, understand & only then, run!
* run tests / simulations for proxy related logic in codebases etc.
