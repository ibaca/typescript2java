package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: PerformanceResourceTiming
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 547122
  * declared in: tsd/browser/lib.es6.d.ts at pos 547591
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="PerformanceResourceTiming")
public class PerformanceResourceTiming extends PerformanceEntry 
{

    /*
        Constructors
    */
    public PerformanceResourceTiming () {
    } 

    /*
        Properties
    */

    public Number connectEnd;

    public Number connectStart;

    public Number domainLookupEnd;

    public Number domainLookupStart;

    public Number fetchStart;

    public String initiatorType;

    public Number redirectEnd;

    public Number redirectStart;

    public Number requestStart;

    public Number responseEnd;

    public Number responseStart;

    /*
        Methods
    */
    @JsProperty(name = "connectEnd")
    public native Number getConnectEnd();
    @JsProperty(name = "connectStart")
    public native Number getConnectStart();
    @JsProperty(name = "domainLookupEnd")
    public native Number getDomainLookupEnd();
    @JsProperty(name = "domainLookupStart")
    public native Number getDomainLookupStart();
    @JsProperty(name = "fetchStart")
    public native Number getFetchStart();
    @JsProperty(name = "initiatorType")
    public native String getInitiatorType();
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
    @JsProperty(name = "connectEnd")
    public native void setConnectEnd(@DoNotAutobox Number value);
    @JsProperty(name = "connectStart")
    public native void setConnectStart(@DoNotAutobox Number value);
    @JsProperty(name = "domainLookupEnd")
    public native void setDomainLookupEnd(@DoNotAutobox Number value);
    @JsProperty(name = "domainLookupStart")
    public native void setDomainLookupStart(@DoNotAutobox Number value);
    @JsProperty(name = "fetchStart")
    public native void setFetchStart(@DoNotAutobox Number value);
    @JsProperty(name = "initiatorType")
    public native void setInitiatorType(String value);
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
}
