package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: PerfWidgetExternal
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 543163
  * declared in: tsd/browser/lib.es6.d.ts at pos 544200
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="PerfWidgetExternal")
public class PerfWidgetExternal
{

    /*
        Constructors
    */
    public PerfWidgetExternal () {
    } 

    /*
        Properties
    */

    public Number activeNetworkRequestCount;

    public Number averageFrameTime;

    public Number averagePaintTime;

    public Boolean extraInformationEnabled;

    public Boolean independentRenderingEnabled;

    public String irDisablingContentString;

    public Boolean irStatusAvailable;

    public Number maxCpuSpeed;

    public Number paintRequestsPerSecond;

    public Number performanceCounter;

    public Number performanceCounterFrequency;

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@543682
     */
    public native void addEventListener(String eventType, Function callback);
    @JsProperty(name = "activeNetworkRequestCount")
    public native Number getActiveNetworkRequestCount();
    @JsProperty(name = "averageFrameTime")
    public native Number getAverageFrameTime();
    @JsProperty(name = "averagePaintTime")
    public native Number getAveragePaintTime();
    @JsProperty(name = "extraInformationEnabled")
    public native Boolean getExtraInformationEnabled();
    @JsProperty(name = "independentRenderingEnabled")
    public native Boolean getIndependentRenderingEnabled();
    @JsProperty(name = "irDisablingContentString")
    public native String getIrDisablingContentString();
    @JsProperty(name = "irStatusAvailable")
    public native Boolean getIrStatusAvailable();
    @JsProperty(name = "maxCpuSpeed")
    public native Number getMaxCpuSpeed();
    /** 
      * tsd/browser/lib.es6.d.ts@543749
     */
    public native Number getMemoryUsage();
    @JsProperty(name = "paintRequestsPerSecond")
    public native Number getPaintRequestsPerSecond();
    @JsProperty(name = "performanceCounter")
    public native Number getPerformanceCounter();
    @JsProperty(name = "performanceCounterFrequency")
    public native Number getPerformanceCounterFrequency();
    /** 
      * tsd/browser/lib.es6.d.ts@543779
     */
    public native Number getProcessCpuUsage();
    /** 
      * tsd/browser/lib.es6.d.ts@543813
     */
    public native Object getRecentCpuUsage(@DoNotAutobox Number last);
    /** 
      * tsd/browser/lib.es6.d.ts@543862
     */
    public native Object getRecentFrames(@DoNotAutobox Number last);
    /** 
      * tsd/browser/lib.es6.d.ts@543909
     */
    public native Object getRecentMemoryUsage(@DoNotAutobox Number last);
    /** 
      * tsd/browser/lib.es6.d.ts@543961
     */
    public native Object getRecentPaintRequests(@DoNotAutobox Number last);
    /** 
      * tsd/browser/lib.es6.d.ts@544015
     */
    public native void removeEventListener(String eventType, Function callback);
    /** 
      * tsd/browser/lib.es6.d.ts@544085
     */
    public native void repositionWindow(@DoNotAutobox Number x, @DoNotAutobox Number y);
    /** 
      * tsd/browser/lib.es6.d.ts@544135
     */
    public native void resizeWindow(@DoNotAutobox Number width, @DoNotAutobox Number height);
    @JsProperty(name = "activeNetworkRequestCount")
    public native void setActiveNetworkRequestCount(@DoNotAutobox Number value);
    @JsProperty(name = "averageFrameTime")
    public native void setAverageFrameTime(@DoNotAutobox Number value);
    @JsProperty(name = "averagePaintTime")
    public native void setAveragePaintTime(@DoNotAutobox Number value);
    @JsProperty(name = "extraInformationEnabled")
    public native void setExtraInformationEnabled(Boolean value);
    @JsProperty(name = "independentRenderingEnabled")
    public native void setIndependentRenderingEnabled(Boolean value);
    @JsProperty(name = "irDisablingContentString")
    public native void setIrDisablingContentString(String value);
    @JsProperty(name = "irStatusAvailable")
    public native void setIrStatusAvailable(Boolean value);
    @JsProperty(name = "maxCpuSpeed")
    public native void setMaxCpuSpeed(@DoNotAutobox Number value);
    @JsProperty(name = "paintRequestsPerSecond")
    public native void setPaintRequestsPerSecond(@DoNotAutobox Number value);
    @JsProperty(name = "performanceCounter")
    public native void setPerformanceCounter(@DoNotAutobox Number value);
    @JsProperty(name = "performanceCounterFrequency")
    public native void setPerformanceCounterFrequency(@DoNotAutobox Number value);
}
