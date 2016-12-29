package com.jereksel.omslib;

import android.content.om.IOverlayManager;
import android.os.IBinder;

import java.lang.reflect.Method;

public class OMSLib {

    public static IOverlayManager getOMS() {
        try {
            Class<?> clz = Class.forName("android.os.ServiceManager");
            Method method = clz.getDeclaredMethod("getService", String.class);
            return IOverlayManager.Stub.asInterface((IBinder) method.invoke(null, "overlay"));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
