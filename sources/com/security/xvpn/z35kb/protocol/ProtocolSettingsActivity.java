package com.security.xvpn.z35kb.protocol;

import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.StateSet;
import android.widget.EditText;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.widget.Toolbar;
import defpackage.az;
import defpackage.bx3;
import defpackage.er;
import defpackage.ew3;
import defpackage.fl;
import defpackage.kj1;
import defpackage.m20;
import defpackage.o6;
import defpackage.pd0;
import defpackage.tc0;
import defpackage.tf3;
import defpackage.u01;
import defpackage.ui1;
import defpackage.v73;
import defpackage.ww2;
import defpackage.zo;

/* loaded from: classes2.dex */
public final class ProtocolSettingsActivity extends zo {
    public static final /* synthetic */ int p = 0;
    public boolean m;
    public boolean n;
    public final ui1 l = m20.D0(kj1.f2953a, new tc0(this, 9));
    public String o = ew3.a0();

    @Override // defpackage.lt3
    public final String M() {
        return "ProtocolSettingsPage";
    }

    @Override // defpackage.lt3
    public final void R() {
        o6 Z = Z();
        int i = 1;
        Z.e.setShowBackBtn(true);
        String y = pd0.y(R.string.ProtocolSettings);
        Toolbar toolbar = Z.e;
        toolbar.setTitle(y);
        addThemeInvalidateListener(toolbar);
        fl.n(this, Z.j, 1000038);
        fl.n(this, Z.k, 1000038);
        fl.n(this, Z.f, 1000134);
        fl.n(this, Z.h, 1000038);
        fl.n(this, Z.g, 1000134);
        fl.n(this, Z.c, 1000038);
        p(false);
        o6 Z2 = Z();
        Z2.j.getPaint().setUnderlineText(true);
        SpannableString valueOf = SpannableString.valueOf(pd0.y(R.string.TLS2ObfuscateSettingDesc));
        bx3.i(valueOf, pd0.y(R.string.TLS2ObfuscateSettingDescHighLight), new ForegroundColorSpan(-12662328));
        Z2.f.setText(valueOf);
        Z2.j.setText(ew3.H());
        Z2.k.setText(pd0.y(R.string.TLS2ObfuscateSetting));
        Z2.d.setOnClickListener(new az(i, ew3.E(), Z2, this));
        o6 Z3 = Z();
        Z3.c.setText(this.o);
        Z3.h.setText(pd0.y(R.string.ProtocolDomainSetting));
        SpannableString valueOf2 = SpannableString.valueOf(pd0.y(R.string.ProtocolDomainSettingDesc));
        bx3.i(valueOf2, pd0.y(R.string.ProtocolDomainSettingDescHighLight), new ForegroundColorSpan(-12662328));
        Z3.g.setText(valueOf2);
        u01 u01Var = new u01(this, 3);
        EditText editText = Z3.c;
        editText.addTextChangedListener(u01Var);
        editText.setOnEditorActionListener(new er(Z3, i));
        Z3.f3609b.setOnClickListener(new ww2(11, this, Z3));
        b0();
    }

    @Override // defpackage.dn
    public final int Y() {
        return 1000004;
    }

    public final void b0() {
        if (this.m) {
            if (this.n) {
                this.o = ew3.a0();
                Z().c.setText(this.o);
                Z().i.setText(pd0.y(R.string.ApplySuccess));
                Z().i.setTextColor(-15223267);
                Z().i.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_protocal_domain_apply_success, 0, 0, 0);
                return;
            }
            Z().i.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            Z().i.setText(pd0.y(R.string.ProtocolDomainInvalid));
            Z().i.setTextColor(-52378);
        }
    }

    @Override // defpackage.zo
    /* renamed from: c0, reason: merged with bridge method [inline-methods] */
    public final o6 Z() {
        return (o6) this.l.getValue();
    }

    @Override // defpackage.dn, defpackage.w73
    public final void p(boolean z) {
        int i;
        int i2;
        super.p(z);
        if (z) {
            return;
        }
        o6 Z = Z();
        Z.m.setBackground(v73.o());
        Z.l.setBackground(v73.o());
        Z.d.getDrawable().setTintList(new ColorStateList(new int[][]{new int[]{android.R.attr.state_pressed}, StateSet.WILD_CARD}, new int[]{-12662328, -6710887}));
        GradientDrawable gradientDrawable = new GradientDrawable();
        int i3 = -14803426;
        if (v73.l()) {
            i = -14803426;
        } else {
            i = -1;
        }
        gradientDrawable.setColor(i);
        float f = 6;
        gradientDrawable.setCornerRadius(tf3.F * f);
        Z.n.setBackground(gradientDrawable);
        StateListDrawable stateListDrawable = new StateListDrawable();
        int[] iArr = ew3.q;
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        if (v73.l()) {
            i2 = -14803426;
        } else {
            i2 = -1;
        }
        gradientDrawable2.setColor(i2);
        gradientDrawable2.setCornerRadius(tf3.F * f);
        gradientDrawable2.setStroke(tf3.K(1), -12662328);
        stateListDrawable.addState(iArr, gradientDrawable2);
        int[] iArr2 = StateSet.WILD_CARD;
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        if (!v73.l()) {
            i3 = -1;
        }
        gradientDrawable3.setColor(i3);
        gradientDrawable3.setCornerRadius(f * tf3.F);
        stateListDrawable.addState(iArr2, gradientDrawable3);
        Z.c.setBackground(stateListDrawable);
    }
}
