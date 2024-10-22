package com.vungle.ads.internal.task;

import defpackage.m20;

/* loaded from: classes2.dex */
public abstract class PriorityRunnable implements Comparable<Object>, Runnable {
    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        if (obj instanceof PriorityRunnable) {
            return m20.W(((PriorityRunnable) obj).getPriority(), getPriority());
        }
        return -1;
    }

    public abstract int getPriority();
}
