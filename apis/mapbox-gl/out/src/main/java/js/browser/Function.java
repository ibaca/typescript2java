package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: Function
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 8924
  * declared in: tsd/browser/lib.es6.d.ts at pos 10635
  * declared in: tsd/browser/lib.es6.d.ts at pos 198514
  * declared in: tsd/browser/lib.es6.d.ts at pos 247972
  * 2 constructors
  * Creates a new function.
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Function")
public class Function
{

    /*
        Constructors
    */
    public Function (String...  args) {
    } 
    public Function () {
    } 

    /*
        Properties
    */

    public Object arguments;

    public Function caller;

    public int length;

    /** 
      * Returns the name of the function. Function names are read-only and can not be changed.
     */
    public String name;

    public Object prototype;

    /*
        Methods
    */
    // skipped method ___at_hasInstance
    public native Object apply();
    /** 
      * thisArg is java.lang.Object
      * tsd/browser/lib.es6.d.ts@9300
      * Calls the function, substituting the specified object for the this value of the function, and the specified array for the arguments of the function.
     */
    public native Object apply(Object argArray /* optional */);
    public native Object bind();
    /** 
      * thisArg is java.lang.Object
      * tsd/browser/lib.es6.d.ts@10097
      * For a given function, creates a bound function that has the same body as the original function.
      * The this object of the bound function is associated with the specified object, and has the specified initial parameters.
     */
    public native Object bind(Object...  argArray);
    public native Object call();
    /** 
      * thisArg is java.lang.Object
      * tsd/browser/lib.es6.d.ts@9609
      * Calls a method of an object, substituting another object for the current object.
     */
    public native Object call(Object...  argArray);
    @JsProperty(name = "arguments")
    public native Object getArguments();
    @JsProperty(name = "caller")
    public native Function getCaller();
    @JsProperty(name = "length")
    public native Number getLength();
    @JsProperty(name = "name")
    public native String getName();
    @JsProperty(name = "prototype")
    public native Object getPrototype();
    @JsProperty(name = "arguments")
    public native void setArguments(Object value);
    @JsProperty(name = "caller")
    public native void setCaller(Function value);
    @JsProperty(name = "length")
    public native void setLength(@DoNotAutobox Number value);
    @JsProperty(name = "name")
    public native void setName(String value);
    @JsProperty(name = "prototype")
    public native void setPrototype(Object value);
}
