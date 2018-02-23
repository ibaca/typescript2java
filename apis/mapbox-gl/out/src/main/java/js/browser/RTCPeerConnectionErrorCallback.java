package js.browser;

import jsinterop.annotations.JsFunction;

/** 
  * source type: RTCPeerConnectionErrorCallback
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 745678

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsFunction
public interface RTCPeerConnectionErrorCallback{
    /** 
      * tsd/browser/lib.es6.d.ts@745726
     */
    void call(DOMError error);
}
