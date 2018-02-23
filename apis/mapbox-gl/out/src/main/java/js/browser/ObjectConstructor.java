package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: ObjectConstructor
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 4175
  * declared in: tsd/browser/lib.es6.d.ts at pos 204886

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class ObjectConstructor
{
    /** SKIPPED CALL SIGNATURE ! */
    /** SKIPPED CALL SIGNATURE ! */

    /*
        Properties
    */

    /** 
      * A reference to the prototype for a class of objects. 
     */
    public Object prototype;

    /*
        Methods
    */
    public native Object assign(Object target);
    /** 
      * tsd/browser/lib.es6.d.ts@206548
      * Copy the values of all of the enumerable own properties from one or more source objects to a
      * target object. Returns the target object.
      * Copy the values of all of the enumerable own properties from one or more source objects to a
      * target object. Returns the target object.
      * Copy the values of all of the enumerable own properties from one or more source objects to a
      * target object. Returns the target object.
      * Copy the values of all of the enumerable own properties from one or more source objects to a
      * target object. Returns the target object.
      * VERSION 3
     */
    public native Object assign(Object target, Object...  sources);
    /** 
      * tsd/browser/lib.es6.d.ts@5464
      * Creates an object that has the specified prototype or that has null prototype.
      * Creates an object that has the specified prototype, and that optionally contains specified properties.
     */
    public native Object create(Object o);
    /** 
      * tsd/browser/lib.es6.d.ts@5779
      * Creates an object that has the specified prototype or that has null prototype.
      * Creates an object that has the specified prototype, and that optionally contains specified properties.
      * VERSION 1
     */
    public native Object create(Object o, PropertyDescriptorMap properties);
    /** 
      * tsd/browser/lib.es6.d.ts@6754
      * Adds one or more properties to an object, and/or modifies attributes of existing properties.
     */
    public native Object defineProperties(Object o, PropertyDescriptorMap properties);
    /** 
      * tsd/browser/lib.es6.d.ts@6273
      * Adds a property to an object, or modifies attributes of an existing property.
      * Adds a property to an object, or modifies attributes of an existing property.
     */
    public native Object defineProperty(Object o, String p, PropertyDescriptor attributes);
    public native Object defineProperty(Object o, @DoNotAutobox Number propertyKey, PropertyDescriptor attributes);
    /** 
      * tsd/browser/lib.es6.d.ts@208127
      * Adds a property to an object, or modifies attributes of an existing property.
      * Adds a property to an object, or modifies attributes of an existing property.
      * VERSION 1
     */
    public native Object defineProperty(Object o, PropertyKey_UnionOfFakeEsSymbolAndNumberAndString propertyKey, PropertyDescriptor attributes);
    /** 
      * tsd/browser/lib.es6.d.ts@7475
      * Prevents the modification of existing property attributes and values, and prevents the addition of new properties.
      * Prevents the modification of existing property attributes and values, and prevents the addition of new properties.
      * Prevents the modification of existing property attributes and values, and prevents the addition of new properties.
      * VERSION 1
     */
    public native <T> T freeze(@DoNotAutobox T f);
    /** 
      * tsd/browser/lib.es6.d.ts@7236
      * Prevents the modification of existing property attributes and values, and prevents the addition of new properties.
      * Prevents the modification of existing property attributes and values, and prevents the addition of new properties.
      * Prevents the modification of existing property attributes and values, and prevents the addition of new properties.
     */
    public native <T> ReadonlyArray<T> freeze(Array<T> a);
    /** 
      * tsd/browser/lib.es6.d.ts@4833
      * Gets the own property descriptor of the specified object.
      * An own property descriptor is one that is defined directly on the object and is not inherited from the object's prototype.
      * Gets the own property descriptor of the specified object.
      * An own property descriptor is one that is defined directly on the object and is not
      * inherited from the object's prototype.
     */
    public native PropertyDescriptor getOwnPropertyDescriptor(Object o, String p);
    public native PropertyDescriptor getOwnPropertyDescriptor(Object o, @DoNotAutobox Number propertyKey);
    /** 
      * tsd/browser/lib.es6.d.ts@207602
      * Gets the own property descriptor of the specified object.
      * An own property descriptor is one that is defined directly on the object and is not inherited from the object's prototype.
      * Gets the own property descriptor of the specified object.
      * An own property descriptor is one that is defined directly on the object and is not
      * inherited from the object's prototype.
      * VERSION 1
     */
    public native PropertyDescriptor getOwnPropertyDescriptor(Object o, PropertyKey_UnionOfFakeEsSymbolAndNumberAndString propertyKey);
    /** 
      * tsd/browser/lib.es6.d.ts@5256
      * Returns the names of the own properties of an object. The own properties of an object are those that are defined directly
      * on that object, and are not inherited from the object's prototype. The properties of an object include both fields (objects) and functions.
     */
    public native Array<String> getOwnPropertyNames(Object o);
    /** 
      * tsd/browser/lib.es6.d.ts@206747
      * Returns an array of all symbol properties found directly on object o.
     */
    public native Array getOwnPropertySymbols(Object o);
    @JsProperty(name = "prototype")
    public native Object getPrototype();
    /** 
      * tsd/browser/lib.es6.d.ts@4496
      * Returns the prototype of an object.
     */
    public native Object getPrototypeOf(Object o);
    /** 
      * tsd/browser/lib.es6.d.ts@206961
      * Returns true if the values are the same value, false otherwise.
     */
    public native Boolean is(Object value1, Object value2);
    /** 
      * tsd/browser/lib.es6.d.ts@8497
      * Returns a value that indicates whether new properties can be added to an object.
     */
    public native Boolean isExtensible(Object o);
    /** 
      * tsd/browser/lib.es6.d.ts@8326
      * Returns true if existing property attributes and values cannot be modified in an object, and new properties cannot be added to the object.
     */
    public native Boolean isFrozen(Object o);
    /** 
      * tsd/browser/lib.es6.d.ts@8097
      * Returns true if existing property attributes cannot be modified in an object and new properties cannot be added to the object.
     */
    public native Boolean isSealed(Object o);
    /** 
      * tsd/browser/lib.es6.d.ts@8787
      * Returns the names of the enumerable properties and methods of an object.
     */
    public native Array<String> keys(Object o);
    /** 
      * tsd/browser/lib.es6.d.ts@7876
      * Prevents the addition of new properties to an object.
     */
    public native <T> T preventExtensions(@DoNotAutobox T o);
    /** 
      * tsd/browser/lib.es6.d.ts@7016
      * Prevents the modification of attributes of existing properties, and prevents the addition of new properties.
     */
    public native <T> T seal(@DoNotAutobox T o);
    @JsProperty(name = "prototype")
    public native void setPrototype(Object value);
    /** 
      * tsd/browser/lib.es6.d.ts@207235
      * Sets the prototype of a specified object o to  object proto or null. Returns the object o.
     */
    public native Object setPrototypeOf(Object o, Object proto);
}
