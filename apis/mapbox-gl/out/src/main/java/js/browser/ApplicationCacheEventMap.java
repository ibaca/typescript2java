package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: ApplicationCacheEventMap
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 283667

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class ApplicationCacheEventMap
{

    /*
        Properties
    */

    public Event cached;

    public Event checking;

    public Event downloading;

    public Event error;

    public Event noupdate;

    public Event obsolete;

    public ProgressEvent progress;

    public Event updateready;

    /*
        Methods
    */
    @JsProperty(name = "cached")
    public native Event getCached();
    @JsProperty(name = "checking")
    public native Event getChecking();
    @JsProperty(name = "downloading")
    public native Event getDownloading();
    @JsProperty(name = "error")
    public native Event getError();
    @JsProperty(name = "noupdate")
    public native Event getNoupdate();
    @JsProperty(name = "obsolete")
    public native Event getObsolete();
    @JsProperty(name = "progress")
    public native ProgressEvent getProgress();
    @JsProperty(name = "updateready")
    public native Event getUpdateready();
    @JsProperty(name = "cached")
    public native void setCached(Event value);
    @JsProperty(name = "checking")
    public native void setChecking(Event value);
    @JsProperty(name = "downloading")
    public native void setDownloading(Event value);
    @JsProperty(name = "error")
    public native void setError(Event value);
    @JsProperty(name = "noupdate")
    public native void setNoupdate(Event value);
    @JsProperty(name = "obsolete")
    public native void setObsolete(Event value);
    @JsProperty(name = "progress")
    public native void setProgress(ProgressEvent value);
    @JsProperty(name = "updateready")
    public native void setUpdateready(Event value);
}
