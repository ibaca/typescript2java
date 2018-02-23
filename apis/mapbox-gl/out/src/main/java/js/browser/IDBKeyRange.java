package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: IDBKeyRange
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 492711
  * declared in: tsd/browser/lib.es6.d.ts at pos 492867
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="IDBKeyRange")
public class IDBKeyRange
{

    /*
        Constructors
    */
    public IDBKeyRange () {
    } 

    /*
        Static properties
    */

    @JsProperty(namespace="IDBKeyRange", name="only")
    public static Function1<Object, IDBKeyRange> only;

    /*
        Static methods
    */

    /** 
      * source : tsd/browser/lib.es6.d.ts:492939
     */
    @JsMethod(namespace="IDBKeyRange", name = "bound")
    public static native IDBKeyRange bound(Object lower, Object upper, Boolean lowerOpen /* optional */, Boolean upperOpen /* optional */);

    /** 
      * source : tsd/browser/lib.es6.d.ts:493029
     */
    @JsMethod(namespace="IDBKeyRange", name = "lowerBound")
    public static native IDBKeyRange lowerBound(Object lower, Boolean open /* optional */);

    /** 
      * source : tsd/browser/lib.es6.d.ts:493121
     */
    @JsMethod(namespace="IDBKeyRange", name = "upperBound")
    public static native IDBKeyRange upperBound(Object upper, Boolean open /* optional */);

    @JsMethod(namespace="IDBKeyRange", name = "bound")
    public static native IDBKeyRange bound(Object lower, Object upper, Boolean lowerOpen /* optional */);

    @JsMethod(namespace="IDBKeyRange", name = "bound")
    public static native IDBKeyRange bound(Object lower, Object upper);

    @JsMethod(namespace="IDBKeyRange", name = "lowerBound")
    public static native IDBKeyRange lowerBound(Object lower);

    @JsMethod(namespace="IDBKeyRange", name = "upperBound")
    public static native IDBKeyRange upperBound(Object upper);

    /*
        Properties
    */

    public Object lower;

    public Boolean lowerOpen;

    public Object upper;

    public Boolean upperOpen;

    /*
        Methods
    */
    @JsProperty(name = "lower")
    public native Object getLower();
    @JsProperty(name = "lowerOpen")
    public native Boolean getLowerOpen();
    @JsProperty(name = "upper")
    public native Object getUpper();
    @JsProperty(name = "upperOpen")
    public native Boolean getUpperOpen();
    @JsProperty(name = "lower")
    public native void setLower(Object value);
    @JsProperty(name = "lowerOpen")
    public native void setLowerOpen(Boolean value);
    @JsProperty(name = "upper")
    public native void setUpper(Object value);
    @JsProperty(name = "upperOpen")
    public native void setUpperOpen(Boolean value);
}
