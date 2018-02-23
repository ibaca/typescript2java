package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: MSInputMethodContextEventMap
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 507678

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class MSInputMethodContextEventMap
{

    /*
        Properties
    */

    public Event MSCandidateWindowHide;

    public Event MSCandidateWindowShow;

    public Event MSCandidateWindowUpdate;

    /*
        Methods
    */
    @JsProperty(name = "MSCandidateWindowHide")
    public native Event getMSCandidateWindowHide();
    @JsProperty(name = "MSCandidateWindowShow")
    public native Event getMSCandidateWindowShow();
    @JsProperty(name = "MSCandidateWindowUpdate")
    public native Event getMSCandidateWindowUpdate();
    @JsProperty(name = "MSCandidateWindowHide")
    public native void setMSCandidateWindowHide(Event value);
    @JsProperty(name = "MSCandidateWindowShow")
    public native void setMSCandidateWindowShow(Event value);
    @JsProperty(name = "MSCandidateWindowUpdate")
    public native void setMSCandidateWindowUpdate(Event value);
}
