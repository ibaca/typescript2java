package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: SpeechSynthesisUtteranceEventMap
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 646517

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class SpeechSynthesisUtteranceEventMap
{

    /*
        Properties
    */

    public Event boundary;

    public Event end;

    public Event error;

    public Event mark;

    public Event pause;

    public Event resume;

    public Event start;

    /*
        Methods
    */
    @JsProperty(name = "boundary")
    public native Event getBoundary();
    @JsProperty(name = "end")
    public native Event getEnd();
    @JsProperty(name = "error")
    public native Event getError();
    @JsProperty(name = "mark")
    public native Event getMark();
    @JsProperty(name = "pause")
    public native Event getPause();
    @JsProperty(name = "resume")
    public native Event getResume();
    @JsProperty(name = "start")
    public native Event getStart();
    @JsProperty(name = "boundary")
    public native void setBoundary(Event value);
    @JsProperty(name = "end")
    public native void setEnd(Event value);
    @JsProperty(name = "error")
    public native void setError(Event value);
    @JsProperty(name = "mark")
    public native void setMark(Event value);
    @JsProperty(name = "pause")
    public native void setPause(Event value);
    @JsProperty(name = "resume")
    public native void setResume(Event value);
    @JsProperty(name = "start")
    public native void setStart(Event value);
}
