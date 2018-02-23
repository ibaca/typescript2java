package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: CacheQueryOptions
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 255916

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class CacheQueryOptions
{

    /*
        Properties
    */

    public String cacheName;

    public Boolean ignoreMethod;

    public Boolean ignoreSearch;

    public Boolean ignoreVary;

    /*
        Methods
    */
    @JsProperty(name = "cacheName")
    public native String getCacheName();
    @JsProperty(name = "ignoreMethod")
    public native Boolean getIgnoreMethod();
    @JsProperty(name = "ignoreSearch")
    public native Boolean getIgnoreSearch();
    @JsProperty(name = "ignoreVary")
    public native Boolean getIgnoreVary();
    @JsProperty(name = "cacheName")
    public native void setCacheName(String value);
    @JsProperty(name = "ignoreMethod")
    public native void setIgnoreMethod(Boolean value);
    @JsProperty(name = "ignoreSearch")
    public native void setIgnoreSearch(Boolean value);
    @JsProperty(name = "ignoreVary")
    public native void setIgnoreVary(Boolean value);
}
