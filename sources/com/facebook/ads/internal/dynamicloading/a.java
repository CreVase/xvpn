package com.facebook.ads.internal.dynamicloading;

import com.facebook.ads.Ad;
import com.facebook.ads.AdListener;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class a implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f1361a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map f1362b;
    public final /* synthetic */ List c;
    public final /* synthetic */ List d;
    public final /* synthetic */ Map e;
    public final /* synthetic */ List f;
    public final /* synthetic */ List g;
    public final /* synthetic */ Method h;
    public final /* synthetic */ Method i;

    public a(ArrayList arrayList, HashMap hashMap, ArrayList arrayList2, ArrayList arrayList3, HashMap hashMap2, ArrayList arrayList4, ArrayList arrayList5, Method method, Method method2) {
        this.f1361a = arrayList;
        this.f1362b = hashMap;
        this.c = arrayList2;
        this.d = arrayList3;
        this.e = hashMap2;
        this.f = arrayList4;
        this.g = arrayList5;
        this.h = method;
        this.i = method2;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        Object newProxyInstance;
        Map map;
        boolean equalsMethods;
        boolean equalsMethods2;
        boolean equalsMethods3;
        boolean equalsMethods4;
        boolean equalsMethods5;
        WeakHashMap weakHashMap;
        boolean equalsMethods6;
        boolean reportError;
        boolean equalsMethods7;
        boolean reportError2;
        boolean isPrimitive = method.getReturnType().isPrimitive();
        Map map2 = this.f1362b;
        if (isPrimitive) {
            if (method.getReturnType().equals(Void.TYPE)) {
                Iterator it = this.f1361a.iterator();
                while (it.hasNext()) {
                    equalsMethods7 = DynamicLoaderFallback.equalsMethods(method, (Method) it.next());
                    if (equalsMethods7) {
                        reportError2 = DynamicLoaderFallback.reportError(obj, map2);
                        if (reportError2) {
                            break;
                        }
                    }
                }
                Iterator it2 = this.c.iterator();
                while (it2.hasNext()) {
                    equalsMethods6 = DynamicLoaderFallback.equalsMethods(method, (Method) it2.next());
                    if (equalsMethods6) {
                        reportError = DynamicLoaderFallback.reportError(obj, map2);
                        if (reportError) {
                            return null;
                        }
                    }
                }
                return null;
            }
            return Array.get(Array.newInstance(method.getReturnType(), 1), 0);
        }
        if (method.getReturnType().equals(String.class)) {
            return "";
        }
        if (method.getReturnType().equals(obj.getClass().getInterfaces()[0])) {
            newProxyInstance = obj;
        } else {
            newProxyInstance = Proxy.newProxyInstance(DynamicLoaderFallback.class.getClassLoader(), new Class[]{method.getReturnType()}, this);
        }
        Iterator it3 = this.d.iterator();
        while (true) {
            boolean hasNext = it3.hasNext();
            map = this.e;
            if (!hasNext) {
                break;
            }
            equalsMethods5 = DynamicLoaderFallback.equalsMethods(method, (Method) it3.next());
            if (equalsMethods5) {
                weakHashMap = DynamicLoaderFallback.sApiProxyToAdListenersMap;
                weakHashMap.put(map.get(obj), (AdListener) objArr[0]);
                break;
            }
        }
        Iterator it4 = this.f.iterator();
        while (it4.hasNext()) {
            equalsMethods4 = DynamicLoaderFallback.equalsMethods(method, (Method) it4.next());
            if (equalsMethods4) {
                map.put(newProxyInstance, obj);
            }
        }
        Iterator it5 = this.g.iterator();
        while (it5.hasNext()) {
            equalsMethods3 = DynamicLoaderFallback.equalsMethods(method, (Method) it5.next());
            if (equalsMethods3) {
                for (Object obj2 : objArr) {
                    if (obj2 instanceof Ad) {
                        map2.put(newProxyInstance, (Ad) obj2);
                    }
                }
            }
        }
        equalsMethods = DynamicLoaderFallback.equalsMethods(method, this.h);
        if (equalsMethods) {
            map2.put(objArr[1], (Ad) objArr[0]);
        }
        equalsMethods2 = DynamicLoaderFallback.equalsMethods(method, this.i);
        if (equalsMethods2) {
            map2.put(objArr[1], (Ad) objArr[0]);
        }
        return newProxyInstance;
    }
}
