package defpackage;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class rq0 extends c02 {
    public final TextView d;
    public final lq0 e;
    public boolean f;

    public rq0(TextView textView) {
        super(8);
        this.d = textView;
        this.f = true;
        this.e = new lq0(textView);
    }

    @Override // defpackage.c02
    public final InputFilter[] h(InputFilter[] inputFilterArr) {
        if (!this.f) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof lq0) {
                    sparseArray.put(i, inputFilter);
                }
            }
            if (sparseArray.size() != 0) {
                int length = inputFilterArr.length;
                InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
                int i2 = 0;
                for (int i3 = 0; i3 < length; i3++) {
                    if (sparseArray.indexOfKey(i3) < 0) {
                        inputFilterArr2[i2] = inputFilterArr[i3];
                        i2++;
                    }
                }
                return inputFilterArr2;
            }
            return inputFilterArr;
        }
        int length2 = inputFilterArr.length;
        int i4 = 0;
        while (true) {
            lq0 lq0Var = this.e;
            if (i4 < length2) {
                if (inputFilterArr[i4] != lq0Var) {
                    i4++;
                } else {
                    return inputFilterArr;
                }
            } else {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = lq0Var;
                return inputFilterArr3;
            }
        }
    }

    @Override // defpackage.c02
    public final boolean j() {
        return this.f;
    }

    @Override // defpackage.c02
    public final void m(boolean z) {
        if (z) {
            TextView textView = this.d;
            textView.setTransformationMethod(o(textView.getTransformationMethod()));
        }
    }

    @Override // defpackage.c02
    public final void n(boolean z) {
        this.f = z;
        TextView textView = this.d;
        textView.setTransformationMethod(o(textView.getTransformationMethod()));
        textView.setFilters(h(textView.getFilters()));
    }

    @Override // defpackage.c02
    public final TransformationMethod o(TransformationMethod transformationMethod) {
        if (this.f) {
            if (!(transformationMethod instanceof vq0) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                return new vq0(transformationMethod);
            }
            return transformationMethod;
        }
        if (transformationMethod instanceof vq0) {
            return ((vq0) transformationMethod).f4876a;
        }
        return transformationMethod;
    }
}
