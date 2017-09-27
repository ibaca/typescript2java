package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: RegExpMatchArray
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:34603
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="RegExpMatchArray")
public class RegExpMatchArray extends Array<String>
{

    /*
        Constructors
    */
    public RegExpMatchArray(Number arrayLength){
        super();
    }

    /** skipped index of type {@link String} because already in type hierarchy */

    /*
        Properties
    */

    public Number index;

    @JsProperty( name = "index")
    public native Number getIndex();

    @JsProperty( name = "index")
    public native void setIndex( Number value );

    public String input;

    @JsProperty( name = "input")
    public native String getInput();

    @JsProperty( name = "input")
    public native void setInput( String value );
}
