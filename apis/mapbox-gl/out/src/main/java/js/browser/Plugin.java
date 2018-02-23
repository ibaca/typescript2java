package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * source type: Plugin
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 549226
  * declared in: tsd/browser/lib.es6.d.ts at pos 549517
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Plugin")
public class Plugin
{

    /*
        Constructors
    */
    public Plugin () {
    } 

    @JsOverlay
    public final void setByIndex(int index, MimeType value) {
        Js.asArrayLike(this).setAt(index, value);
    }

    @JsOverlay
    public final MimeType getByIndex(int index) {
        return (MimeType) Js.asArrayLike(this).getAt(index);
    }

    /*
        Properties
    */

    public String description;

    public String filename;

    public int length;

    public String name;

    public String version;

    /*
        Methods
    */
    @JsProperty(name = "description")
    public native String getDescription();
    @JsProperty(name = "filename")
    public native String getFilename();
    @JsProperty(name = "length")
    public native Number getLength();
    @JsProperty(name = "name")
    public native String getName();
    @JsProperty(name = "version")
    public native String getVersion();
    /** 
      * tsd/browser/lib.es6.d.ts@549402
     */
    public native MimeType item(@DoNotAutobox Number index);
    /** 
      * tsd/browser/lib.es6.d.ts@549437
     */
    public native MimeType namedItem(String type);
    @JsProperty(name = "description")
    public native void setDescription(String value);
    @JsProperty(name = "filename")
    public native void setFilename(String value);
    @JsProperty(name = "length")
    public native void setLength(@DoNotAutobox Number value);
    @JsProperty(name = "name")
    public native void setName(String value);
    @JsProperty(name = "version")
    public native void setVersion(String value);
}
