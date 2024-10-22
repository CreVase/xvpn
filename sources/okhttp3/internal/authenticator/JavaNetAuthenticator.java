package okhttp3.internal.authenticator;

import defpackage.i23;
import defpackage.ng0;
import java.io.IOException;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.SocketAddress;
import java.util.List;
import java.util.NoSuchElementException;
import okhttp3.Address;
import okhttp3.Authenticator;
import okhttp3.Challenge;
import okhttp3.Credentials;
import okhttp3.Dns;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;

/* loaded from: classes2.dex */
public final class JavaNetAuthenticator implements Authenticator {
    private final Dns defaultDns;

    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public JavaNetAuthenticator() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final InetAddress connectToInetAddress(Proxy proxy, HttpUrl httpUrl, Dns dns) throws IOException {
        int i;
        Proxy.Type type = proxy.type();
        if (type == null) {
            i = -1;
        } else {
            i = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        }
        if (i == 1) {
            List<InetAddress> lookup = dns.lookup(httpUrl.host());
            if (!lookup.isEmpty()) {
                return lookup.get(0);
            }
            throw new NoSuchElementException("List is empty.");
        }
        SocketAddress address = proxy.address();
        if (address != null) {
            return ((InetSocketAddress) address).getAddress();
        }
        throw new NullPointerException("null cannot be cast to non-null type java.net.InetSocketAddress");
    }

    @Override // okhttp3.Authenticator
    public Request authenticate(Route route, Response response) throws IOException {
        boolean z;
        Proxy proxy;
        Dns dns;
        PasswordAuthentication requestPasswordAuthentication;
        String str;
        Address address;
        List<Challenge> challenges = response.challenges();
        Request request = response.request();
        HttpUrl url = request.url();
        if (response.code() == 407) {
            z = true;
        } else {
            z = false;
        }
        if (route == null) {
            proxy = null;
        } else {
            proxy = route.proxy();
        }
        if (proxy == null) {
            proxy = Proxy.NO_PROXY;
        }
        for (Challenge challenge : challenges) {
            if (i23.U0("Basic", challenge.scheme())) {
                if (route == null || (address = route.address()) == null) {
                    dns = null;
                } else {
                    dns = address.dns();
                }
                if (dns == null) {
                    dns = this.defaultDns;
                }
                if (z) {
                    SocketAddress address2 = proxy.address();
                    if (address2 != null) {
                        InetSocketAddress inetSocketAddress = (InetSocketAddress) address2;
                        requestPasswordAuthentication = java.net.Authenticator.requestPasswordAuthentication(inetSocketAddress.getHostName(), connectToInetAddress(proxy, url, dns), inetSocketAddress.getPort(), url.scheme(), challenge.realm(), challenge.scheme(), url.url(), Authenticator.RequestorType.PROXY);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type java.net.InetSocketAddress");
                    }
                } else {
                    requestPasswordAuthentication = java.net.Authenticator.requestPasswordAuthentication(url.host(), connectToInetAddress(proxy, url, dns), url.port(), url.scheme(), challenge.realm(), challenge.scheme(), url.url(), Authenticator.RequestorType.SERVER);
                }
                if (requestPasswordAuthentication != null) {
                    if (z) {
                        str = "Proxy-Authorization";
                    } else {
                        str = "Authorization";
                    }
                    return request.newBuilder().header(str, Credentials.basic(requestPasswordAuthentication.getUserName(), new String(requestPasswordAuthentication.getPassword()), challenge.charset())).build();
                }
            }
        }
        return null;
    }

    public JavaNetAuthenticator(Dns dns) {
        this.defaultDns = dns;
    }

    public /* synthetic */ JavaNetAuthenticator(Dns dns, int i, ng0 ng0Var) {
        this((i & 1) != 0 ? Dns.SYSTEM : dns);
    }
}
