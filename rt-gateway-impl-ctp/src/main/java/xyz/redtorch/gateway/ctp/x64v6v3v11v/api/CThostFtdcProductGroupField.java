/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v3v11v.api;

public class CThostFtdcProductGroupField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcProductGroupField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcProductGroupField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jctpv6v3v11x64apiJNI.delete_CThostFtdcProductGroupField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setProductID(String value) {
    jctpv6v3v11x64apiJNI.CThostFtdcProductGroupField_ProductID_set(swigCPtr, this, value);
  }

  public String getProductID() {
    return jctpv6v3v11x64apiJNI.CThostFtdcProductGroupField_ProductID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    jctpv6v3v11x64apiJNI.CThostFtdcProductGroupField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return jctpv6v3v11x64apiJNI.CThostFtdcProductGroupField_ExchangeID_get(swigCPtr, this);
  }

  public void setProductGroupID(String value) {
    jctpv6v3v11x64apiJNI.CThostFtdcProductGroupField_ProductGroupID_set(swigCPtr, this, value);
  }

  public String getProductGroupID() {
    return jctpv6v3v11x64apiJNI.CThostFtdcProductGroupField_ProductGroupID_get(swigCPtr, this);
  }

  public CThostFtdcProductGroupField() {
    this(jctpv6v3v11x64apiJNI.new_CThostFtdcProductGroupField(), true);
  }

}
