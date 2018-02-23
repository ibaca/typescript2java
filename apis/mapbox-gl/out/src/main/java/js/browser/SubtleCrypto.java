package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * source type: SubtleCrypto
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 649864
  * declared in: tsd/browser/lib.es6.d.ts at pos 652893
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SubtleCrypto")
public class SubtleCrypto
{

    /*
        Constructors
    */
    public SubtleCrypto () {
    } 

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@649895
     */
    public native PromiseLike<ArrayBuffer> decrypt(UnionOfAes_85_sAndString algorithm, CryptoKey key, UnionOfArrayBufferAndArrayBufferView data);
    public native PromiseLike<ArrayBuffer> deriveBits(String algorithm, CryptoKey baseKey, @DoNotAutobox Number length);
    public native PromiseLike<ArrayBuffer> deriveBits(ConcatParams algorithm, CryptoKey baseKey, @DoNotAutobox Number length);
    public native PromiseLike<ArrayBuffer> deriveBits(DhKeyDeriveParams algorithm, CryptoKey baseKey, @DoNotAutobox Number length);
    public native PromiseLike<ArrayBuffer> deriveBits(EcdhKeyDeriveParams algorithm, CryptoKey baseKey, @DoNotAutobox Number length);
    public native PromiseLike<ArrayBuffer> deriveBits(HkdfCtrParams algorithm, CryptoKey baseKey, @DoNotAutobox Number length);
    public native PromiseLike<ArrayBuffer> deriveBits(Pbkdf2Params algorithm, CryptoKey baseKey, @DoNotAutobox Number length);
    /** 
      * tsd/browser/lib.es6.d.ts@650081
     */
    public native PromiseLike<ArrayBuffer> deriveBits(UnionOfCon_81_sAndString algorithm, CryptoKey baseKey, @DoNotAutobox Number length);
    /** 
      * tsd/browser/lib.es6.d.ts@650266
     */
    public native PromiseLike<CryptoKey> deriveKey(UnionOfCon_81_sAndString algorithm, CryptoKey baseKey, UnionOfAesDerivedKeyParamsAndConcatParamsAndHkdfCtrParamsAndHmacImportParamsAndPbkdf2ParamsAndString derivedKeyType, Boolean extractable, Array<String> keyUsages);
    public native PromiseLike<ArrayBuffer> digest(String algorithm, ArrayBufferView data);
    public native PromiseLike<ArrayBuffer> digest(String algorithm, ArrayBuffer data);
    public native PromiseLike<ArrayBuffer> digest(Algorithm algorithm, ArrayBufferView data);
    public native PromiseLike<ArrayBuffer> digest(Algorithm algorithm, ArrayBuffer data);
    /** 
      * tsd/browser/lib.es6.d.ts@650586
     */
    public native PromiseLike<ArrayBuffer> digest(UnionOfAlgorithmAndString algorithm, UnionOfArrayBufferAndArrayBufferView data);
    /** 
      * tsd/browser/lib.es6.d.ts@650676
     */
    public native PromiseLike<ArrayBuffer> encrypt(UnionOfAes_85_sAndString algorithm, CryptoKey key, UnionOfArrayBufferAndArrayBufferView data);
    /** 
      * tsd/browser/lib.es6.d.ts@650933
      * VERSION 1
     */
    public native PromiseLike<ArrayBuffer> exportKey(String format, CryptoKey key);
    /** 
      * tsd/browser/lib.es6.d.ts@651110
     */
    public native PromiseLike<UnionOfCryptoKeyAndCryptoKeyPair> generateKey(String algorithm, Boolean extractable, Array<String> keyUsages);
    public native PromiseLike<CryptoKey> generateKey(Pbkdf2Params algorithm, Boolean extractable, Array<String> keyUsages);
    public native PromiseLike<CryptoKeyPair> generateKey(DhKeyGenParams algorithm, Boolean extractable, Array<String> keyUsages);
    public native PromiseLike<CryptoKeyPair> generateKey(EcKeyGenParams algorithm, Boolean extractable, Array<String> keyUsages);
    public native PromiseLike<CryptoKeyPair> generateKey(RsaHashedKeyGenParams algorithm, Boolean extractable, Array<String> keyUsages);
    public native PromiseLike<CryptoKey> generateKey(AesKeyGenParams algorithm, Boolean extractable, Array<String> keyUsages);
    public native PromiseLike<CryptoKey> generateKey(HmacKeyGenParams algorithm, Boolean extractable, Array<String> keyUsages);
    /** 
      * tsd/browser/lib.es6.d.ts@651229
      * VERSION 1
     */
    public native PromiseLike<CryptoKeyPair> generateKey(UnionOfDhKeyGenParamsAndEcKeyGenParamsAndRsaHashedKeyGenParams algorithm, Boolean extractable, Array<String> keyUsages);
    /** 
      * tsd/browser/lib.es6.d.ts@651385
      * VERSION 2
     */
    public native PromiseLike<CryptoKey> generateKey(UnionOfAesKeyGenParamsAndHmacKeyGenParamsAndPbkdf2Params algorithm, Boolean extractable, Array<String> keyUsages);
    public native PromiseLike<CryptoKey> importKey(String format, ArrayBufferView keyData, String algorithm, Boolean extractable, Array<String> keyUsages);
    public native PromiseLike<CryptoKey> importKey(String format, ArrayBufferView keyData, HmacImportParams algorithm, Boolean extractable, Array<String> keyUsages);
    public native PromiseLike<CryptoKey> importKey(String format, ArrayBufferView keyData, DhImportKeyParams algorithm, Boolean extractable, Array<String> keyUsages);
    public native PromiseLike<CryptoKey> importKey(String format, ArrayBufferView keyData, EcKeyImportParams algorithm, Boolean extractable, Array<String> keyUsages);
    public native PromiseLike<CryptoKey> importKey(String format, ArrayBufferView keyData, RsaHashedImportParams algorithm, Boolean extractable, Array<String> keyUsages);
    public native PromiseLike<CryptoKey> importKey(String format, JsonWebKey keyData, String algorithm, Boolean extractable, Array<String> keyUsages);
    public native PromiseLike<CryptoKey> importKey(String format, JsonWebKey keyData, HmacImportParams algorithm, Boolean extractable, Array<String> keyUsages);
    public native PromiseLike<CryptoKey> importKey(String format, JsonWebKey keyData, DhImportKeyParams algorithm, Boolean extractable, Array<String> keyUsages);
    public native PromiseLike<CryptoKey> importKey(String format, JsonWebKey keyData, EcKeyImportParams algorithm, Boolean extractable, Array<String> keyUsages);
    public native PromiseLike<CryptoKey> importKey(String format, JsonWebKey keyData, RsaHashedImportParams algorithm, Boolean extractable, Array<String> keyUsages);
    /** 
      * tsd/browser/lib.es6.d.ts@651531
     */
    public native PromiseLike<CryptoKey> importKey(String format, JsonWebKey keyData, UnionOfDhImportKeyParamsAndEcKeyImportParamsAndHmacImportParamsAndRsaHashedImportParamsAndString algorithm, Boolean extractable, Array<String> keyUsages);
    public native PromiseLike<CryptoKey> importKey(String format, ArrayBuffer keyData, String algorithm, Boolean extractable, Array<String> keyUsages);
    public native PromiseLike<CryptoKey> importKey(String format, ArrayBuffer keyData, HmacImportParams algorithm, Boolean extractable, Array<String> keyUsages);
    public native PromiseLike<CryptoKey> importKey(String format, ArrayBuffer keyData, DhImportKeyParams algorithm, Boolean extractable, Array<String> keyUsages);
    public native PromiseLike<CryptoKey> importKey(String format, ArrayBuffer keyData, EcKeyImportParams algorithm, Boolean extractable, Array<String> keyUsages);
    public native PromiseLike<CryptoKey> importKey(String format, ArrayBuffer keyData, RsaHashedImportParams algorithm, Boolean extractable, Array<String> keyUsages);
    /** 
      * tsd/browser/lib.es6.d.ts@651750
      * VERSION 1
     */
    public native PromiseLike<CryptoKey> importKey(String format, UnionOfArrayBufferAndArrayBufferView keyData, UnionOfDhImportKeyParamsAndEcKeyImportParamsAndHmacImportParamsAndRsaHashedImportParamsAndString algorithm, Boolean extractable, Array<String> keyUsages);
    /** 
      * tsd/browser/lib.es6.d.ts@651990
      * VERSION 2
     */
    public native PromiseLike<CryptoKey> importKey(String format, UnionOfArrayBufferAndArrayBufferViewAndJsonWebKey keyData, UnionOfDhImportKeyParamsAndEcKeyImportParamsAndHmacImportParamsAndRsaHashedImportParamsAndString algorithm, Boolean extractable, Array<String> keyUsages);
    public native PromiseLike<ArrayBuffer> sign(String algorithm, CryptoKey key, ArrayBufferView data);
    public native PromiseLike<ArrayBuffer> sign(String algorithm, CryptoKey key, ArrayBuffer data);
    public native PromiseLike<ArrayBuffer> sign(AesCmacParams algorithm, CryptoKey key, ArrayBufferView data);
    public native PromiseLike<ArrayBuffer> sign(AesCmacParams algorithm, CryptoKey key, ArrayBuffer data);
    public native PromiseLike<ArrayBuffer> sign(EcdsaParams algorithm, CryptoKey key, ArrayBufferView data);
    public native PromiseLike<ArrayBuffer> sign(EcdsaParams algorithm, CryptoKey key, ArrayBuffer data);
    public native PromiseLike<ArrayBuffer> sign(RsaPssParams algorithm, CryptoKey key, ArrayBufferView data);
    public native PromiseLike<ArrayBuffer> sign(RsaPssParams algorithm, CryptoKey key, ArrayBuffer data);
    /** 
      * tsd/browser/lib.es6.d.ts@652225
     */
    public native PromiseLike<ArrayBuffer> sign(UnionOfAesCmacParamsAndEcdsaParamsAndRsaPssParamsAndString algorithm, CryptoKey key, UnionOfArrayBufferAndArrayBufferView data);
    public native PromiseLike<CryptoKey> unwrapKey(String format, ArrayBufferView wrappedKey, CryptoKey unwrappingKey, String unwrapAlgorithm, String unwrappedKeyAlgorithm, Boolean extractable, Array<String> keyUsages);
    public native PromiseLike<CryptoKey> unwrapKey(String format, ArrayBufferView wrappedKey, CryptoKey unwrappingKey, String unwrapAlgorithm, Algorithm unwrappedKeyAlgorithm, Boolean extractable, Array<String> keyUsages);
    public native PromiseLike<CryptoKey> unwrapKey(String format, ArrayBufferView wrappedKey, CryptoKey unwrappingKey, Algorithm unwrapAlgorithm, String unwrappedKeyAlgorithm, Boolean extractable, Array<String> keyUsages);
    public native PromiseLike<CryptoKey> unwrapKey(String format, ArrayBufferView wrappedKey, CryptoKey unwrappingKey, Algorithm unwrapAlgorithm, Algorithm unwrappedKeyAlgorithm, Boolean extractable, Array<String> keyUsages);
    public native PromiseLike<CryptoKey> unwrapKey(String format, ArrayBuffer wrappedKey, CryptoKey unwrappingKey, String unwrapAlgorithm, String unwrappedKeyAlgorithm, Boolean extractable, Array<String> keyUsages);
    public native PromiseLike<CryptoKey> unwrapKey(String format, ArrayBuffer wrappedKey, CryptoKey unwrappingKey, String unwrapAlgorithm, Algorithm unwrappedKeyAlgorithm, Boolean extractable, Array<String> keyUsages);
    public native PromiseLike<CryptoKey> unwrapKey(String format, ArrayBuffer wrappedKey, CryptoKey unwrappingKey, Algorithm unwrapAlgorithm, String unwrappedKeyAlgorithm, Boolean extractable, Array<String> keyUsages);
    public native PromiseLike<CryptoKey> unwrapKey(String format, ArrayBuffer wrappedKey, CryptoKey unwrappingKey, Algorithm unwrapAlgorithm, Algorithm unwrappedKeyAlgorithm, Boolean extractable, Array<String> keyUsages);
    /** 
      * tsd/browser/lib.es6.d.ts@652361
     */
    public native PromiseLike<CryptoKey> unwrapKey(String format, UnionOfArrayBufferAndArrayBufferView wrappedKey, CryptoKey unwrappingKey, UnionOfAlgorithmAndString unwrapAlgorithm, UnionOfAlgorithmAndString unwrappedKeyAlgorithm, Boolean extractable, Array<String> keyUsages);
    /** 
      * tsd/browser/lib.es6.d.ts@652593
     */
    public native PromiseLike<Boolean> verify(UnionOfAesCmacParamsAndEcdsaParamsAndRsaPssParamsAndString algorithm, CryptoKey key, UnionOfArrayBufferAndArrayBufferView signature, UnionOfArrayBufferAndArrayBufferView data);
    public native PromiseLike<ArrayBuffer> wrapKey(String format, CryptoKey key, CryptoKey wrappingKey, String wrapAlgorithm);
    public native PromiseLike<ArrayBuffer> wrapKey(String format, CryptoKey key, CryptoKey wrappingKey, Algorithm wrapAlgorithm);
    /** 
      * tsd/browser/lib.es6.d.ts@652752
     */
    public native PromiseLike<ArrayBuffer> wrapKey(String format, CryptoKey key, CryptoKey wrappingKey, UnionOfAlgorithmAndString wrapAlgorithm);
}
