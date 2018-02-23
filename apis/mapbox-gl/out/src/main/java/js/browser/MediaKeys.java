package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * source type: MediaKeys
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 519592
  * declared in: tsd/browser/lib.es6.d.ts at pos 519753
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MediaKeys")
public class MediaKeys
{

    /*
        Constructors
    */
    public MediaKeys () {
    } 

    /*
        Methods
    */
    public native MediaKeySession createSession();
    /** 
      * tsd/browser/lib.es6.d.ts@519620
     */
    public native MediaKeySession createSession(String sessionType /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@519678
     */
    public native Promise<Void> setServerCertificate(Object serverCertificate);
}
