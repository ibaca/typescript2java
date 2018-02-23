package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: ApplicationCache
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 283900
  * declared in: tsd/browser/lib.es6.d.ts at pos 285020
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="ApplicationCache")
public class ApplicationCache extends EventTarget 
{

    /*
        Constructors
    */
    public ApplicationCache () {
    } 

    /*
        Static properties
    */

    @JsProperty(namespace="ApplicationCache", name="CHECKING")
    public static Number CHECKING;

    @JsProperty(namespace="ApplicationCache", name="DOWNLOADING")
    public static Number DOWNLOADING;

    @JsProperty(namespace="ApplicationCache", name="IDLE")
    public static Number IDLE;

    @JsProperty(namespace="ApplicationCache", name="OBSOLETE")
    public static Number OBSOLETE;

    @JsProperty(namespace="ApplicationCache", name="UNCACHED")
    public static Number UNCACHED;

    @JsProperty(namespace="ApplicationCache", name="UPDATEREADY")
    public static Number UPDATEREADY;

    /*
        Properties
    */

    public Function1<Event, Object> oncached;

    public Function1<Event, Object> onchecking;

    public Function1<Event, Object> ondownloading;

    public Function1<Event, Object> onerror;

    public Function1<Event, Object> onnoupdate;

    public Function1<Event, Object> onobsolete;

    public Function1<ProgressEvent, Object> onprogress;

    public Function1<Event, Object> onupdateready;

    public Number status;

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@284473
     */
    public native void abort();
    @JsProperty(name = "CHECKING")
    public native Number getCHECKING();
    @JsProperty(name = "DOWNLOADING")
    public native Number getDOWNLOADING();
    @JsProperty(name = "IDLE")
    public native Number getIDLE();
    @JsProperty(name = "OBSOLETE")
    public native Number getOBSOLETE();
    @JsProperty(name = "oncached")
    public native Function1<Event, Object> getOncached();
    @JsProperty(name = "onchecking")
    public native Function1<Event, Object> getOnchecking();
    @JsProperty(name = "ondownloading")
    public native Function1<Event, Object> getOndownloading();
    @JsProperty(name = "onerror")
    public native Function1<Event, Object> getOnerror();
    @JsProperty(name = "onnoupdate")
    public native Function1<Event, Object> getOnnoupdate();
    @JsProperty(name = "onobsolete")
    public native Function1<Event, Object> getOnobsolete();
    @JsProperty(name = "onprogress")
    public native Function1<ProgressEvent, Object> getOnprogress();
    @JsProperty(name = "onupdateready")
    public native Function1<Event, Object> getOnupdateready();
    @JsProperty(name = "status")
    public native Number getStatus();
    @JsProperty(name = "UNCACHED")
    public native Number getUNCACHED();
    @JsProperty(name = "UPDATEREADY")
    public native Number getUPDATEREADY();
    @JsProperty(name = "CHECKING")
    public native void setCHECKING(@DoNotAutobox Number value);
    @JsProperty(name = "DOWNLOADING")
    public native void setDOWNLOADING(@DoNotAutobox Number value);
    @JsProperty(name = "IDLE")
    public native void setIDLE(@DoNotAutobox Number value);
    @JsProperty(name = "OBSOLETE")
    public native void setOBSOLETE(@DoNotAutobox Number value);
    @JsProperty(name = "oncached")
    public native void setOncached(Function1<Event, Object> value);
    @JsProperty(name = "onchecking")
    public native void setOnchecking(Function1<Event, Object> value);
    @JsProperty(name = "ondownloading")
    public native void setOndownloading(Function1<Event, Object> value);
    @JsProperty(name = "onerror")
    public native void setOnerror(Function1<Event, Object> value);
    @JsProperty(name = "onnoupdate")
    public native void setOnnoupdate(Function1<Event, Object> value);
    @JsProperty(name = "onobsolete")
    public native void setOnobsolete(Function1<Event, Object> value);
    @JsProperty(name = "onprogress")
    public native void setOnprogress(Function1<ProgressEvent, Object> value);
    @JsProperty(name = "onupdateready")
    public native void setOnupdateready(Function1<Event, Object> value);
    @JsProperty(name = "status")
    public native void setStatus(@DoNotAutobox Number value);
    @JsProperty(name = "UNCACHED")
    public native void setUNCACHED(@DoNotAutobox Number value);
    @JsProperty(name = "UPDATEREADY")
    public native void setUPDATEREADY(@DoNotAutobox Number value);
    /** 
      * tsd/browser/lib.es6.d.ts@284492
     */
    public native void swapCache();
    /** 
      * tsd/browser/lib.es6.d.ts@284515
     */
    public native void update();
}
