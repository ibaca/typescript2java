package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * source type: EventListenerObject
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 739419

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class EventListenerObject
{

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@739457
     */
    public native void handleEvent(Event evt);
}
