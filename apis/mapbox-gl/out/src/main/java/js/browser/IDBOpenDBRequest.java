package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: IDBOpenDBRequest
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 494168
  * declared in: tsd/browser/lib.es6.d.ts at pos 494659
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="IDBOpenDBRequest")
public class IDBOpenDBRequest extends IDBRequest 
{

    /*
        Constructors
    */
    public IDBOpenDBRequest () {
    } 

    /*
        Properties
    */

    public Function1<Event, Object> onblocked;

    public Function1<IDBVersionChangeEvent, Object> onupgradeneeded;

    /*
        Methods
    */
    @JsProperty(name = "onblocked")
    public native Function1<Event, Object> getOnblocked();
    @JsProperty(name = "onupgradeneeded")
    public native Function1<IDBVersionChangeEvent, Object> getOnupgradeneeded();
    @JsProperty(name = "onblocked")
    public native void setOnblocked(Function1<Event, Object> value);
    @JsProperty(name = "onupgradeneeded")
    public native void setOnupgradeneeded(Function1<IDBVersionChangeEvent, Object> value);
}
