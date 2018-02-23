package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: IDBVersionChangeEvent
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 496547
  * declared in: tsd/browser/lib.es6.d.ts at pos 496684
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="IDBVersionChangeEvent")
public class IDBVersionChangeEvent extends Event 
{

    /*
        Constructors
    */
    public IDBVersionChangeEvent () {
        super((String) null, (EventInit) null); 
    } 

    /*
        Properties
    */

    public Number newVersion;

    public Number oldVersion;

    /*
        Methods
    */
    @JsProperty(name = "newVersion")
    public native Number getNewVersion();
    @JsProperty(name = "oldVersion")
    public native Number getOldVersion();
    @JsProperty(name = "newVersion")
    public native void setNewVersion(@DoNotAutobox Number value);
    @JsProperty(name = "oldVersion")
    public native void setOldVersion(@DoNotAutobox Number value);
}
