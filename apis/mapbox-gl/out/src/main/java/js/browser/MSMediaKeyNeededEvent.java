package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: MSMediaKeyNeededEvent
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 511131
  * declared in: tsd/browser/lib.es6.d.ts at pos 511237
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MSMediaKeyNeededEvent")
public class MSMediaKeyNeededEvent extends Event 
{

    /*
        Constructors
    */
    public MSMediaKeyNeededEvent () {
        super((String) null, (EventInit) null); 
    } 

    /*
        Properties
    */

    public Uint8Array initData;

    /*
        Methods
    */
    @JsProperty(name = "initData")
    public native Uint8Array getInitData();
    @JsProperty(name = "initData")
    public native void setInitData(Uint8Array value);
}
