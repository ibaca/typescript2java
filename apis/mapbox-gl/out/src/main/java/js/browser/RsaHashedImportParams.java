package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: RsaHashedImportParams
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 740444

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class RsaHashedImportParams
{

    /*
        Properties
    */

    public UnionOfAlgorithmAndString hash;

    /*
        Methods
    */
    @JsProperty(name = "hash")
    public native UnionOfAlgorithmAndString getHash();
    @JsProperty(name = "hash")
    public native void setHash(String value);
    @JsProperty(name = "hash")
    public native void setHash(Algorithm value);
    @JsProperty(name = "hash")
    public native void setHash(UnionOfAlgorithmAndString value);
}
