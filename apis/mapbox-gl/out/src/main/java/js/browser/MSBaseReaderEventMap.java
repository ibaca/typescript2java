package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: MSBaseReaderEventMap
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 731609

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class MSBaseReaderEventMap
{

    /*
        Properties
    */

    public Event abort;

    public ErrorEvent error;

    public Event load;

    public ProgressEvent loadend;

    public Event loadstart;

    public ProgressEvent progress;

    /*
        Methods
    */
    @JsProperty(name = "abort")
    public native Event getAbort();
    @JsProperty(name = "error")
    public native ErrorEvent getError();
    @JsProperty(name = "load")
    public native Event getLoad();
    @JsProperty(name = "loadend")
    public native ProgressEvent getLoadend();
    @JsProperty(name = "loadstart")
    public native Event getLoadstart();
    @JsProperty(name = "progress")
    public native ProgressEvent getProgress();
    @JsProperty(name = "abort")
    public native void setAbort(Event value);
    @JsProperty(name = "error")
    public native void setError(ErrorEvent value);
    @JsProperty(name = "load")
    public native void setLoad(Event value);
    @JsProperty(name = "loadend")
    public native void setLoadend(ProgressEvent value);
    @JsProperty(name = "loadstart")
    public native void setLoadstart(Event value);
    @JsProperty(name = "progress")
    public native void setProgress(ProgressEvent value);
}
