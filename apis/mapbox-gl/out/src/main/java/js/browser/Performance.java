package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: Performance
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 544290
  * declared in: tsd/browser/lib.es6.d.ts at pos 544966
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Performance")
public class Performance
{

    /*
        Constructors
    */
    public Performance () {
    } 

    /*
        Properties
    */

    public PerformanceNavigation navigation;

    public PerformanceTiming timing;

    /*
        Methods
    */
    public native void clearMarks();
    /** 
      * tsd/browser/lib.es6.d.ts@544408
     */
    public native void clearMarks(String markName /* optional */);
    public native void clearMeasures();
    /** 
      * tsd/browser/lib.es6.d.ts@544449
     */
    public native void clearMeasures(String measureName /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@544496
     */
    public native void clearResourceTimings();
    /** 
      * tsd/browser/lib.es6.d.ts@544530
     */
    public native Object getEntries();
    public native Object getEntriesByName(String name);
    /** 
      * tsd/browser/lib.es6.d.ts@544553
     */
    public native Object getEntriesByName(String name, String entryType /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@544614
     */
    public native Object getEntriesByType(String entryType);
    public native Object getMarks();
    /** 
      * tsd/browser/lib.es6.d.ts@544660
     */
    public native Object getMarks(String markName /* optional */);
    public native Object getMeasures();
    /** 
      * tsd/browser/lib.es6.d.ts@544698
     */
    public native Object getMeasures(String measureName /* optional */);
    @JsProperty(name = "navigation")
    public native PerformanceNavigation getNavigation();
    @JsProperty(name = "timing")
    public native PerformanceTiming getTiming();
    /** 
      * tsd/browser/lib.es6.d.ts@544742
     */
    public native void mark(String markName);
    public native void measure(String measureName);
    public native void measure(String measureName, String startMarkName /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@544776
     */
    public native void measure(String measureName, String startMarkName /* optional */, String endMarkName /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@544862
     */
    public native Number now();
    @JsProperty(name = "navigation")
    public native void setNavigation(PerformanceNavigation value);
    /** 
      * tsd/browser/lib.es6.d.ts@544881
     */
    public native void setResourceTimingBufferSize(@DoNotAutobox Number maxSize);
    @JsProperty(name = "timing")
    public native void setTiming(PerformanceTiming value);
    /** 
      * tsd/browser/lib.es6.d.ts@544937
     */
    public native Object toJSON();
}
