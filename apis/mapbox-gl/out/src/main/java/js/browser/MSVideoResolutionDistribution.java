package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: MSVideoResolutionDistribution
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 267519

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class MSVideoResolutionDistribution
{

    /*
        Properties
    */

    public Number cifQuality;

    public Number h1080Quality;

    public Number h1440Quality;

    public Number h2160Quality;

    public Number h720Quality;

    public Number vgaQuality;

    /*
        Methods
    */
    @JsProperty(name = "cifQuality")
    public native Number getCifQuality();
    @JsProperty(name = "h1080Quality")
    public native Number getH1080Quality();
    @JsProperty(name = "h1440Quality")
    public native Number getH1440Quality();
    @JsProperty(name = "h2160Quality")
    public native Number getH2160Quality();
    @JsProperty(name = "h720Quality")
    public native Number getH720Quality();
    @JsProperty(name = "vgaQuality")
    public native Number getVgaQuality();
    @JsProperty(name = "cifQuality")
    public native void setCifQuality(@DoNotAutobox Number value);
    @JsProperty(name = "h1080Quality")
    public native void setH1080Quality(@DoNotAutobox Number value);
    @JsProperty(name = "h1440Quality")
    public native void setH1440Quality(@DoNotAutobox Number value);
    @JsProperty(name = "h2160Quality")
    public native void setH2160Quality(@DoNotAutobox Number value);
    @JsProperty(name = "h720Quality")
    public native void setH720Quality(@DoNotAutobox Number value);
    @JsProperty(name = "vgaQuality")
    public native void setVgaQuality(@DoNotAutobox Number value);
}
