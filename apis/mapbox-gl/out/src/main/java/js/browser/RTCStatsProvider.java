package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * source type: RTCStatsProvider
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 565847
  * declared in: tsd/browser/lib.es6.d.ts at pos 565996
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="RTCStatsProvider")
public class RTCStatsProvider extends EventTarget 
{

    /*
        Constructors
    */
    public RTCStatsProvider () {
    } 

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@565902
     */
    public native Promise<RTCStatsReport> getStats();
    /** 
      * tsd/browser/lib.es6.d.ts@565943
     */
    public native Promise<RTCStatsReport> msGetStats();
}
