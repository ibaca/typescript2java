package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: ProgressEvent
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 552167
  * declared in: tsd/browser/lib.es6.d.ts at pos 552480
  * 2 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="ProgressEvent")
public class ProgressEvent extends Event 
{

    /*
        Constructors
    */
    public ProgressEvent (String type, ProgressEventInit eventInitDict /* optional */) {
        super((String) null, (EventInit) null); 
    } 
    public ProgressEvent (String type) {
        super((String) null, (EventInit) null); 
    } 

    /*
        Properties
    */

    public Boolean lengthComputable;

    public Number loaded;

    public Number total;

    /*
        Methods
    */
    @JsProperty(name = "lengthComputable")
    public native Boolean getLengthComputable();
    @JsProperty(name = "loaded")
    public native Number getLoaded();
    @JsProperty(name = "total")
    public native Number getTotal();
    /** 
      * tsd/browser/lib.es6.d.ts@552310
     */
    public native void initProgressEvent(String typeArg, Boolean canBubbleArg, Boolean cancelableArg, Boolean lengthComputableArg, @DoNotAutobox Number loadedArg, @DoNotAutobox Number totalArg);
    @JsProperty(name = "lengthComputable")
    public native void setLengthComputable(Boolean value);
    @JsProperty(name = "loaded")
    public native void setLoaded(@DoNotAutobox Number value);
    @JsProperty(name = "total")
    public native void setTotal(@DoNotAutobox Number value);
}
