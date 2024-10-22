package com.security.xvpn.z35kb.view;

import android.app.Application;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.StyleSpan;
import com.security.xvpn.z35kb.R;
import defpackage.bp;
import defpackage.pd0;
import defpackage.qb0;
import defpackage.s61;
import defpackage.v73;

/* loaded from: classes2.dex */
public final class b extends bp {
    public int e;
    public s61 f;
    public String g;

    public b(Application application) {
        super(application);
        this.e = 2;
        this.f = new qb0(14);
        this.g = "$71.99";
    }

    public static SpannableStringBuilder l() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) m(pd0.y(R.string.BenefitAdvancedFeatures), ""));
        spannableStringBuilder.append((CharSequence) "\n");
        spannableStringBuilder.append(pd0.y(R.string.BenefitNoAds), new StyleSpan() { // from class: com.security.xvpn.z35kb.view.GuideToSubscribeViewModel$1
            @Override // android.text.style.StyleSpan, android.text.style.CharacterStyle
            public final void updateDrawState(TextPaint textPaint) {
                super.updateDrawState(textPaint);
                textPaint.setColor(v73.y());
            }
        }, 33);
        spannableStringBuilder.append((CharSequence) "\n");
        spannableStringBuilder.append((CharSequence) m(pd0.y(R.string.BenefitMultiDevice), pd0.y(R.string.FiveDevices)));
        spannableStringBuilder.append((CharSequence) "\n");
        spannableStringBuilder.append((CharSequence) pd0.y(R.string.LiveChatSupport));
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder m(String str, String... strArr) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        for (String str2 : strArr) {
            int indexOf = str.indexOf(str2);
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new StyleSpan() { // from class: com.security.xvpn.z35kb.view.GuideToSubscribeViewModel$3
                    @Override // android.text.style.StyleSpan, android.text.style.CharacterStyle
                    public final void updateDrawState(TextPaint textPaint) {
                        super.updateDrawState(textPaint);
                        textPaint.setColor(v73.y());
                    }
                }, indexOf, str2.length() + indexOf, 33);
            }
        }
        return spannableStringBuilder;
    }
}
