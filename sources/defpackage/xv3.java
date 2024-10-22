package defpackage;

import android.R;
import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

/* loaded from: classes2.dex */
public final class xv3 extends FrameLayout implements wv3 {
    public static final /* synthetic */ int c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final TextView f5233a;

    /* renamed from: b, reason: collision with root package name */
    public final ScrollView f5234b;

    public xv3(Context context) {
        super(context);
        setPadding(0, bx3.A(context), 0, 120);
        setBackgroundColor(yv3.e);
        ScrollView scrollView = new ScrollView(context);
        this.f5234b = scrollView;
        TextView textView = new TextView(context);
        this.f5233a = textView;
        textView.setTextColor(yv3.f);
        scrollView.addView(textView, -1, -1);
        addView(scrollView, -1, -1);
        View imageView = new ImageView(context);
        imageView.setBackgroundResource(R.drawable.ic_menu_close_clear_cancel);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 53;
        imageView.setOnClickListener(new cr1(this, 4));
        addView(imageView, layoutParams);
        Button button = new Button(context);
        button.setText("Copy");
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = imageView.getMeasuredHeight();
        layoutParams2.gravity = 85;
        button.setOnClickListener(new ww2(1, this, context));
        addView(button, layoutParams2);
    }
}
