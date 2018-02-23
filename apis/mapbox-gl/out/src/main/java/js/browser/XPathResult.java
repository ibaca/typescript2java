package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: XPathResult
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 720255
  * declared in: tsd/browser/lib.es6.d.ts at pos 721039
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="XPathResult")
public class XPathResult
{

    /*
        Constructors
    */
    public XPathResult () {
    } 

    /*
        Static properties
    */

    @JsProperty(namespace="XPathResult", name="ANY_TYPE")
    public static Number ANY_TYPE;

    @JsProperty(namespace="XPathResult", name="ANY_UNORDERED_NODE_TYPE")
    public static Number ANY_UNORDERED_NODE_TYPE;

    @JsProperty(namespace="XPathResult", name="BOOLEAN_TYPE")
    public static Number BOOLEAN_TYPE;

    @JsProperty(namespace="XPathResult", name="FIRST_ORDERED_NODE_TYPE")
    public static Number FIRST_ORDERED_NODE_TYPE;

    @JsProperty(namespace="XPathResult", name="NUMBER_TYPE")
    public static Number NUMBER_TYPE;

    @JsProperty(namespace="XPathResult", name="ORDERED_NODE_ITERATOR_TYPE")
    public static Number ORDERED_NODE_ITERATOR_TYPE;

    @JsProperty(namespace="XPathResult", name="ORDERED_NODE_SNAPSHOT_TYPE")
    public static Number ORDERED_NODE_SNAPSHOT_TYPE;

    @JsProperty(namespace="XPathResult", name="STRING_TYPE")
    public static Number STRING_TYPE;

    @JsProperty(namespace="XPathResult", name="UNORDERED_NODE_ITERATOR_TYPE")
    public static Number UNORDERED_NODE_ITERATOR_TYPE;

    @JsProperty(namespace="XPathResult", name="UNORDERED_NODE_SNAPSHOT_TYPE")
    public static Number UNORDERED_NODE_SNAPSHOT_TYPE;

    /*
        Properties
    */

    public Boolean booleanValue;

    public Boolean invalidIteratorState;

    public Number numberValue;

    public Number resultType;

    public Node singleNodeValue;

    public Number snapshotLength;

    public String stringValue;

    /*
        Methods
    */
    @JsProperty(name = "ANY_TYPE")
    public native Number getANY_TYPE();
    @JsProperty(name = "ANY_UNORDERED_NODE_TYPE")
    public native Number getANY_UNORDERED_NODE_TYPE();
    @JsProperty(name = "BOOLEAN_TYPE")
    public native Number getBOOLEAN_TYPE();
    @JsProperty(name = "booleanValue")
    public native Boolean getBooleanValue();
    @JsProperty(name = "FIRST_ORDERED_NODE_TYPE")
    public native Number getFIRST_ORDERED_NODE_TYPE();
    @JsProperty(name = "invalidIteratorState")
    public native Boolean getInvalidIteratorState();
    @JsProperty(name = "NUMBER_TYPE")
    public native Number getNUMBER_TYPE();
    @JsProperty(name = "numberValue")
    public native Number getNumberValue();
    @JsProperty(name = "ORDERED_NODE_ITERATOR_TYPE")
    public native Number getORDERED_NODE_ITERATOR_TYPE();
    @JsProperty(name = "ORDERED_NODE_SNAPSHOT_TYPE")
    public native Number getORDERED_NODE_SNAPSHOT_TYPE();
    @JsProperty(name = "resultType")
    public native Number getResultType();
    @JsProperty(name = "STRING_TYPE")
    public native Number getSTRING_TYPE();
    @JsProperty(name = "singleNodeValue")
    public native Node getSingleNodeValue();
    @JsProperty(name = "snapshotLength")
    public native Number getSnapshotLength();
    @JsProperty(name = "stringValue")
    public native String getStringValue();
    @JsProperty(name = "UNORDERED_NODE_ITERATOR_TYPE")
    public native Number getUNORDERED_NODE_ITERATOR_TYPE();
    @JsProperty(name = "UNORDERED_NODE_SNAPSHOT_TYPE")
    public native Number getUNORDERED_NODE_SNAPSHOT_TYPE();
    /** 
      * tsd/browser/lib.es6.d.ts@720539
     */
    public native Node iterateNext();
    @JsProperty(name = "ANY_TYPE")
    public native void setANY_TYPE(@DoNotAutobox Number value);
    @JsProperty(name = "ANY_UNORDERED_NODE_TYPE")
    public native void setANY_UNORDERED_NODE_TYPE(@DoNotAutobox Number value);
    @JsProperty(name = "BOOLEAN_TYPE")
    public native void setBOOLEAN_TYPE(@DoNotAutobox Number value);
    @JsProperty(name = "booleanValue")
    public native void setBooleanValue(Boolean value);
    @JsProperty(name = "FIRST_ORDERED_NODE_TYPE")
    public native void setFIRST_ORDERED_NODE_TYPE(@DoNotAutobox Number value);
    @JsProperty(name = "invalidIteratorState")
    public native void setInvalidIteratorState(Boolean value);
    @JsProperty(name = "NUMBER_TYPE")
    public native void setNUMBER_TYPE(@DoNotAutobox Number value);
    @JsProperty(name = "numberValue")
    public native void setNumberValue(@DoNotAutobox Number value);
    @JsProperty(name = "ORDERED_NODE_ITERATOR_TYPE")
    public native void setORDERED_NODE_ITERATOR_TYPE(@DoNotAutobox Number value);
    @JsProperty(name = "ORDERED_NODE_SNAPSHOT_TYPE")
    public native void setORDERED_NODE_SNAPSHOT_TYPE(@DoNotAutobox Number value);
    @JsProperty(name = "resultType")
    public native void setResultType(@DoNotAutobox Number value);
    @JsProperty(name = "STRING_TYPE")
    public native void setSTRING_TYPE(@DoNotAutobox Number value);
    @JsProperty(name = "singleNodeValue")
    public native void setSingleNodeValue(Node value);
    @JsProperty(name = "snapshotLength")
    public native void setSnapshotLength(@DoNotAutobox Number value);
    @JsProperty(name = "stringValue")
    public native void setStringValue(String value);
    @JsProperty(name = "UNORDERED_NODE_ITERATOR_TYPE")
    public native void setUNORDERED_NODE_ITERATOR_TYPE(@DoNotAutobox Number value);
    @JsProperty(name = "UNORDERED_NODE_SNAPSHOT_TYPE")
    public native void setUNORDERED_NODE_SNAPSHOT_TYPE(@DoNotAutobox Number value);
    /** 
      * tsd/browser/lib.es6.d.ts@720564
     */
    public native Node snapshotItem(@DoNotAutobox Number index);
}
