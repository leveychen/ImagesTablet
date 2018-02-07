package cn.levey.myapplication.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;

import com.facebook.cache.disk.DiskCacheConfig;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.drawable.ScalingUtils;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.imagepipeline.backends.okhttp3.OkHttpImagePipelineConfigFactory;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.common.RotationOptions;
import com.facebook.imagepipeline.core.ImagePipelineConfig;
import com.facebook.imagepipeline.decoder.SimpleProgressiveJpegConfig;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;

/**
 * Created by Levey on 2018/2/7 13:55.
 * e-mail: m@levey.cn
 */
public class FrescoBase {

    private static final long GB = 1024L * 1024L * 1024L;

    public static ImagePipelineConfig getConfig(Context context) {
        DiskCacheConfig diskCacheConfig = DiskCacheConfig.newBuilder(context)
                .setBaseDirectoryPath(context.getExternalCacheDir())
                .setBaseDirectoryName("cache")
                .setMaxCacheSize(2 * GB)
                .setVersion(20180101)
                .build();
        return OkHttpImagePipelineConfigFactory.newBuilder(context, new okhttp3.OkHttpClient())
                .setProgressiveJpegConfig(new SimpleProgressiveJpegConfig())
                .setMainDiskCacheConfig(diskCacheConfig)
                .setBitmapsConfig(Bitmap.Config.ARGB_8888)
                .setDownsampleEnabled(true)
                .build();
    }

    public static DraweeController getController(String url, int w, int h) {
        ImageRequest request = ImageRequestBuilder.newBuilderWithSource(Uri.parse(url))
                .setResizeOptions(new ResizeOptions(w, h))
                .setRotationOptions(RotationOptions.autoRotateAtRenderTime())
                .build();
        return Fresco.newDraweeControllerBuilder()
                .setUri(Uri.parse(url))
                .setImageRequest(request)
                .setTapToRetryEnabled(true)
                .setAutoPlayAnimations(false)
                .build();
    }


    public static GenericDraweeHierarchy getHierarchy(Context context) {
        GenericDraweeHierarchyBuilder builder =
                new GenericDraweeHierarchyBuilder(context.getResources());
        return builder
                .setActualImageScaleType(ScalingUtils.ScaleType.CENTER_CROP)
                .build();
    }

    public static void pause() {
        Fresco.getImagePipeline().pause();
    }

    public static void resume() {
        Fresco.getImagePipeline().resume();
    }


}
