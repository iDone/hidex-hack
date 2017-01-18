package cc.gnaixx.hidex_libs.tools;

import android.content.res.AssetManager;

/**
 * 名称: NativeHelper
 * 描述:
 *
 * @author xiangqing.xue
 * @date 2016/12/15
 */

public class NativeHelper {
    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }

    public static native int redex(AssetManager asset, String filename, String path);
}
