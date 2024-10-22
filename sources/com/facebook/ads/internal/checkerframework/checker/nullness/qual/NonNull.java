package com.facebook.ads.internal.checkerframework.checker.nullness.qual;

import com.facebook.ads.internal.checkerframework.framework.qual.DefaultFor;
import com.facebook.ads.internal.checkerframework.framework.qual.DefaultInUncheckedCodeFor;
import com.facebook.ads.internal.checkerframework.framework.qual.DefaultQualifierInHierarchy;
import com.facebook.ads.internal.checkerframework.framework.qual.QualifierForLiterals;
import com.facebook.ads.internal.checkerframework.framework.qual.SubtypeOf;
import com.facebook.ads.internal.checkerframework.framework.qual.UpperBoundFor;
import com.facebook.ads.redexgen.X.AnonymousClass77;
import com.facebook.ads.redexgen.X.C7L;
import com.facebook.ads.redexgen.X.C7M;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@SubtypeOf({MonotonicNonNull.class})
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@UpperBoundFor(typeKinds = {C7L.A0I, C7L.A0C, C7L.A04, C7L.A06, C7L.A08, C7L.A0B, C7L.A0E, C7L.A0J, C7L.A05})
@Retention(RetentionPolicy.RUNTIME)
@QualifierForLiterals({AnonymousClass77.A0B})
@DefaultFor({C7M.A05})
@DefaultQualifierInHierarchy
@DefaultInUncheckedCodeFor({C7M.A0E, C7M.A0C})
@Documented
/* loaded from: assets/audience_network.dex */
public @interface NonNull {
}
