## jproxy
HTTP proxy server, in java, for java developers...

**main goals** of this project is to provide a high-performant, simple-to-spin-up HTTP proxy server for java developers - where they can spin off a proxy-server - with an API as-simple-as:

```java
ProxyServer proxyServer = ProxyServer.create("localhost", 8899);
proxyServer.start(ex -> {});
// boom!
```

# Here's the pom coordinates for the latest release:

```  
  <repositories>
    <repository>
      <id>POC SNAPSHOT repository for EventHubs client SDK to connect using websockets over proxies</id>
      <url>http://raw.github.com/SreeramGarlapati/jproxy/master/releases</url>
    </repository>
  </repositories>
```

```
  <dependency>
    <groupId>org.jutils.jproxy</groupId>
    <artifactId>jproxy</artifactId>
    <version>0.0.1</version>
  </dependency>
```

