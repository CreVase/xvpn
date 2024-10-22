package okhttp3.internal.connection;

import defpackage.c20;
import defpackage.cr0;
import defpackage.m20;
import defpackage.ng0;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.HttpUrl;
import okhttp3.Route;
import okhttp3.internal.Util;

/* loaded from: classes2.dex */
public final class RouteSelector {
    public static final Companion Companion = new Companion(null);
    private final Address address;
    private final Call call;
    private final EventListener eventListener;
    private List<? extends InetSocketAddress> inetSocketAddresses;
    private int nextProxyIndex;
    private final List<Route> postponedRoutes;
    private List<? extends Proxy> proxies;
    private final RouteDatabase routeDatabase;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(ng0 ng0Var) {
            this();
        }

        public final String getSocketHost(InetSocketAddress inetSocketAddress) {
            InetAddress address = inetSocketAddress.getAddress();
            if (address == null) {
                return inetSocketAddress.getHostName();
            }
            return address.getHostAddress();
        }
    }

    /* loaded from: classes2.dex */
    public static final class Selection {
        private int nextRouteIndex;
        private final List<Route> routes;

        public Selection(List<Route> list) {
            this.routes = list;
        }

        public final List<Route> getRoutes() {
            return this.routes;
        }

        public final boolean hasNext() {
            if (this.nextRouteIndex < this.routes.size()) {
                return true;
            }
            return false;
        }

        public final Route next() {
            if (hasNext()) {
                List<Route> list = this.routes;
                int i = this.nextRouteIndex;
                this.nextRouteIndex = i + 1;
                return list.get(i);
            }
            throw new NoSuchElementException();
        }
    }

    public RouteSelector(Address address, RouteDatabase routeDatabase, Call call, EventListener eventListener) {
        this.address = address;
        this.routeDatabase = routeDatabase;
        this.call = call;
        this.eventListener = eventListener;
        cr0 cr0Var = cr0.f1659a;
        this.proxies = cr0Var;
        this.inetSocketAddresses = cr0Var;
        this.postponedRoutes = new ArrayList();
        resetNextProxy(address.url(), address.proxy());
    }

    private final boolean hasNextProxy() {
        if (this.nextProxyIndex < this.proxies.size()) {
            return true;
        }
        return false;
    }

    private final Proxy nextProxy() throws IOException {
        if (hasNextProxy()) {
            List<? extends Proxy> list = this.proxies;
            int i = this.nextProxyIndex;
            this.nextProxyIndex = i + 1;
            Proxy proxy = list.get(i);
            resetNextInetSocketAddress(proxy);
            return proxy;
        }
        throw new SocketException("No route to " + this.address.url().host() + "; exhausted proxy configurations: " + this.proxies);
    }

    private final void resetNextInetSocketAddress(Proxy proxy) throws IOException {
        String host;
        int port;
        ArrayList arrayList = new ArrayList();
        this.inetSocketAddresses = arrayList;
        if (proxy.type() != Proxy.Type.DIRECT && proxy.type() != Proxy.Type.SOCKS) {
            SocketAddress address = proxy.address();
            if (address instanceof InetSocketAddress) {
                InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                host = Companion.getSocketHost(inetSocketAddress);
                port = inetSocketAddress.getPort();
            } else {
                throw new IllegalArgumentException(m20.d1(address.getClass(), "Proxy.address() is not an InetSocketAddress: ").toString());
            }
        } else {
            host = this.address.url().host();
            port = this.address.url().port();
        }
        boolean z = false;
        if (1 <= port && port < 65536) {
            z = true;
        }
        if (z) {
            if (proxy.type() == Proxy.Type.SOCKS) {
                arrayList.add(InetSocketAddress.createUnresolved(host, port));
                return;
            }
            this.eventListener.dnsStart(this.call, host);
            List<InetAddress> lookup = this.address.dns().lookup(host);
            if (!lookup.isEmpty()) {
                this.eventListener.dnsEnd(this.call, host, lookup);
                Iterator<InetAddress> it = lookup.iterator();
                while (it.hasNext()) {
                    arrayList.add(new InetSocketAddress(it.next(), port));
                }
                return;
            }
            throw new UnknownHostException(this.address.dns() + " returned no addresses for " + host);
        }
        throw new SocketException("No route to " + host + ':' + port + "; port is out of range");
    }

    private final void resetNextProxy(HttpUrl httpUrl, Proxy proxy) {
        this.eventListener.proxySelectStart(this.call, httpUrl);
        List<Proxy> resetNextProxy$selectProxies = resetNextProxy$selectProxies(proxy, httpUrl, this);
        this.proxies = resetNextProxy$selectProxies;
        this.nextProxyIndex = 0;
        this.eventListener.proxySelectEnd(this.call, httpUrl, resetNextProxy$selectProxies);
    }

    private static final List<Proxy> resetNextProxy$selectProxies(Proxy proxy, HttpUrl httpUrl, RouteSelector routeSelector) {
        boolean z;
        if (proxy != null) {
            return Collections.singletonList(proxy);
        }
        URI uri = httpUrl.uri();
        if (uri.getHost() == null) {
            return Util.immutableListOf(Proxy.NO_PROXY);
        }
        List<Proxy> select = routeSelector.address.proxySelector().select(uri);
        List<Proxy> list = select;
        if (list != null && !list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return Util.immutableListOf(Proxy.NO_PROXY);
        }
        return Util.toImmutableList(select);
    }

    public final boolean hasNext() {
        if (hasNextProxy() || (!this.postponedRoutes.isEmpty())) {
            return true;
        }
        return false;
    }

    public final Selection next() throws IOException {
        if (hasNext()) {
            ArrayList arrayList = new ArrayList();
            while (hasNextProxy()) {
                Proxy nextProxy = nextProxy();
                Iterator<? extends InetSocketAddress> it = this.inetSocketAddresses.iterator();
                while (it.hasNext()) {
                    Route route = new Route(this.address, nextProxy, it.next());
                    if (this.routeDatabase.shouldPostpone(route)) {
                        this.postponedRoutes.add(route);
                    } else {
                        arrayList.add(route);
                    }
                }
                if (!arrayList.isEmpty()) {
                    break;
                }
            }
            if (arrayList.isEmpty()) {
                c20.D0(this.postponedRoutes, arrayList);
                this.postponedRoutes.clear();
            }
            return new Selection(arrayList);
        }
        throw new NoSuchElementException();
    }
}
