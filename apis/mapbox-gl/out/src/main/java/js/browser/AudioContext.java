package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * source type: AudioContext
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 288949
  * declared in: tsd/browser/lib.es6.d.ts at pos 289045
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="AudioContext")
public class AudioContext extends AudioContextBase 
{

    /*
        Constructors
    */
    public AudioContext () {
    } 

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@289005
     */
    public native Promise<Void> suspend();
}
