package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: IntersectionObserver
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 497326
  * declared in: tsd/browser/lib.es6.d.ts at pos 497624
  * 2 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="IntersectionObserver")
public class IntersectionObserver
{

    /*
        Constructors
    */
    public IntersectionObserver (IntersectionObserverCallback callback, IntersectionObserverInit options /* optional */) {
    } 
    public IntersectionObserver (IntersectionObserverCallback callback) {
    } 

    /*
        Properties
    */

    public Element root;

    public String rootMargin;

    public Array<Number> thresholds;

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@497468
     */
    public native void disconnect();
    @JsProperty(name = "root")
    public native Element getRoot();
    @JsProperty(name = "rootMargin")
    public native String getRootMargin();
    @JsProperty(name = "thresholds")
    public native Array<Number> getThresholds();
    /** 
      * tsd/browser/lib.es6.d.ts@497492
     */
    public native void observe(Element target);
    @JsProperty(name = "root")
    public native void setRoot(Element value);
    @JsProperty(name = "rootMargin")
    public native void setRootMargin(String value);
    @JsProperty(name = "thresholds")
    public native void setThresholds(Array<Number> value);
    /** 
      * tsd/browser/lib.es6.d.ts@497528
     */
    public native Array<IntersectionObserverEntry> takeRecords();
    /** 
      * tsd/browser/lib.es6.d.ts@497576
     */
    public native void unobserve(Element target);
}
