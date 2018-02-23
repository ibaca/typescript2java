package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: PerformanceNavigationTiming
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 546121
  * declared in: tsd/browser/lib.es6.d.ts at pos 547005
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="PerformanceNavigationTiming")
public class PerformanceNavigationTiming extends PerformanceEntry 
{

    /*
        Constructors
    */
    public PerformanceNavigationTiming () {
    } 

    /*
        Properties
    */

    public Number connectEnd;

    public Number connectStart;

    public Number domComplete;

    public Number domContentLoadedEventEnd;

    public Number domContentLoadedEventStart;

    public Number domInteractive;

    public Number domLoading;

    public Number domainLookupEnd;

    public Number domainLookupStart;

    public Number fetchStart;

    public Number loadEventEnd;

    public Number loadEventStart;

    public Number navigationStart;

    public Number redirectCount;

    public Number redirectEnd;

    public Number redirectStart;

    public Number requestStart;

    public Number responseEnd;

    public Number responseStart;

    public String type;

    public Number unloadEventEnd;

    public Number unloadEventStart;

    /*
        Methods
    */
    @JsProperty(name = "connectEnd")
    public native Number getConnectEnd();
    @JsProperty(name = "connectStart")
    public native Number getConnectStart();
    @JsProperty(name = "domComplete")
    public native Number getDomComplete();
    @JsProperty(name = "domContentLoadedEventEnd")
    public native Number getDomContentLoadedEventEnd();
    @JsProperty(name = "domContentLoadedEventStart")
    public native Number getDomContentLoadedEventStart();
    @JsProperty(name = "domInteractive")
    public native Number getDomInteractive();
    @JsProperty(name = "domLoading")
    public native Number getDomLoading();
    @JsProperty(name = "domainLookupEnd")
    public native Number getDomainLookupEnd();
    @JsProperty(name = "domainLookupStart")
    public native Number getDomainLookupStart();
    @JsProperty(name = "fetchStart")
    public native Number getFetchStart();
    @JsProperty(name = "loadEventEnd")
    public native Number getLoadEventEnd();
    @JsProperty(name = "loadEventStart")
    public native Number getLoadEventStart();
    @JsProperty(name = "navigationStart")
    public native Number getNavigationStart();
    @JsProperty(name = "redirectCount")
    public native Number getRedirectCount();
    @JsProperty(name = "redirectEnd")
    public native Number getRedirectEnd();
    @JsProperty(name = "redirectStart")
    public native Number getRedirectStart();
    @JsProperty(name = "requestStart")
    public native Number getRequestStart();
    @JsProperty(name = "responseEnd")
    public native Number getResponseEnd();
    @JsProperty(name = "responseStart")
    public native Number getResponseStart();
    @JsProperty(name = "type")
    public native String getType();
    @JsProperty(name = "unloadEventEnd")
    public native Number getUnloadEventEnd();
    @JsProperty(name = "unloadEventStart")
    public native Number getUnloadEventStart();
    @JsProperty(name = "connectEnd")
    public native void setConnectEnd(@DoNotAutobox Number value);
    @JsProperty(name = "connectStart")
    public native void setConnectStart(@DoNotAutobox Number value);
    @JsProperty(name = "domComplete")
    public native void setDomComplete(@DoNotAutobox Number value);
    @JsProperty(name = "domContentLoadedEventEnd")
    public native void setDomContentLoadedEventEnd(@DoNotAutobox Number value);
    @JsProperty(name = "domContentLoadedEventStart")
    public native void setDomContentLoadedEventStart(@DoNotAutobox Number value);
    @JsProperty(name = "domInteractive")
    public native void setDomInteractive(@DoNotAutobox Number value);
    @JsProperty(name = "domLoading")
    public native void setDomLoading(@DoNotAutobox Number value);
    @JsProperty(name = "domainLookupEnd")
    public native void setDomainLookupEnd(@DoNotAutobox Number value);
    @JsProperty(name = "domainLookupStart")
    public native void setDomainLookupStart(@DoNotAutobox Number value);
    @JsProperty(name = "fetchStart")
    public native void setFetchStart(@DoNotAutobox Number value);
    @JsProperty(name = "loadEventEnd")
    public native void setLoadEventEnd(@DoNotAutobox Number value);
    @JsProperty(name = "loadEventStart")
    public native void setLoadEventStart(@DoNotAutobox Number value);
    @JsProperty(name = "navigationStart")
    public native void setNavigationStart(@DoNotAutobox Number value);
    @JsProperty(name = "redirectCount")
    public native void setRedirectCount(@DoNotAutobox Number value);
    @JsProperty(name = "redirectEnd")
    public native void setRedirectEnd(@DoNotAutobox Number value);
    @JsProperty(name = "redirectStart")
    public native void setRedirectStart(@DoNotAutobox Number value);
    @JsProperty(name = "requestStart")
    public native void setRequestStart(@DoNotAutobox Number value);
    @JsProperty(name = "responseEnd")
    public native void setResponseEnd(@DoNotAutobox Number value);
    @JsProperty(name = "responseStart")
    public native void setResponseStart(@DoNotAutobox Number value);
    @JsProperty(name = "type")
    public native void setType(String value);
    @JsProperty(name = "unloadEventEnd")
    public native void setUnloadEventEnd(@DoNotAutobox Number value);
    @JsProperty(name = "unloadEventStart")
    public native void setUnloadEventStart(@DoNotAutobox Number value);
}
