package com.vk_post_reader.sedi.viktor.myselve.vkpostreader.views.activities;

import android.app.Activity;

import com.vk.sdk.VKSdk;
import com.vk.sdk.util.VKUtil;

public class MainActivity extends Activity {

    String[] fingerprints = VKUtil.getCertificateFingerprint(this, this.getPackageName());

    @Override
    protected void onStart() {
        super.onStart();
    }
}
