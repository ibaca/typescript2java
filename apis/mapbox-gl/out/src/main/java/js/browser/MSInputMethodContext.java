package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: MSInputMethodContext
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 507832
  * declared in: tsd/browser/lib.es6.d.ts at pos 508713
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MSInputMethodContext")
public class MSInputMethodContext extends EventTarget 
{

    /*
        Constructors
    */
    public MSInputMethodContext () {
    } 

    /*
        Properties
    */

    public Number compositionEndOffset;

    public Number compositionStartOffset;

    public Function1<Event, Object> oncandidatewindowhide;

    public Function1<Event, Object> oncandidatewindowshow;

    public Function1<Event, Object> oncandidatewindowupdate;

    public HTMLElement target;

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@508240
     */
    public native ClientRect getCandidateWindowClientRect();
    /** 
      * tsd/browser/lib.es6.d.ts@508288
     */
    public native Array<String> getCompositionAlternatives();
    @JsProperty(name = "compositionEndOffset")
    public native Number getCompositionEndOffset();
    @JsProperty(name = "compositionStartOffset")
    public native Number getCompositionStartOffset();
    @JsProperty(name = "oncandidatewindowhide")
    public native Function1<Event, Object> getOncandidatewindowhide();
    @JsProperty(name = "oncandidatewindowshow")
    public native Function1<Event, Object> getOncandidatewindowshow();
    @JsProperty(name = "oncandidatewindowupdate")
    public native Function1<Event, Object> getOncandidatewindowupdate();
    @JsProperty(name = "target")
    public native HTMLElement getTarget();
    /** 
      * tsd/browser/lib.es6.d.ts@508332
     */
    public native Boolean hasComposition();
    /** 
      * tsd/browser/lib.es6.d.ts@508363
     */
    public native Boolean isCandidateWindowVisible();
    @JsProperty(name = "compositionEndOffset")
    public native void setCompositionEndOffset(@DoNotAutobox Number value);
    @JsProperty(name = "compositionStartOffset")
    public native void setCompositionStartOffset(@DoNotAutobox Number value);
    @JsProperty(name = "oncandidatewindowhide")
    public native void setOncandidatewindowhide(Function1<Event, Object> value);
    @JsProperty(name = "oncandidatewindowshow")
    public native void setOncandidatewindowshow(Function1<Event, Object> value);
    @JsProperty(name = "oncandidatewindowupdate")
    public native void setOncandidatewindowupdate(Function1<Event, Object> value);
    @JsProperty(name = "target")
    public native void setTarget(HTMLElement value);
}
