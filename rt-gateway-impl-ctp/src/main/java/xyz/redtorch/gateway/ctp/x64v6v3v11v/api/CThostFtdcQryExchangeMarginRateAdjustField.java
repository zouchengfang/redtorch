/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v3v11v.api;

public class CThostFtdcQryExchangeMarginRateAdjustField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcQryExchangeMarginRateAdjustField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQryExchangeMarginRateAdjustField obj) {
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
        jctpv6v3v11x64apiJNI.delete_CThostFtdcQryExchangeMarginRateAdjustField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    jctpv6v3v11x64apiJNI.CThostFtdcQryExchangeMarginRateAdjustField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v3v11x64apiJNI.CThostFtdcQryExchangeMarginRateAdjustField_BrokerID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    jctpv6v3v11x64apiJNI.CThostFtdcQryExchangeMarginRateAdjustField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return jctpv6v3v11x64apiJNI.CThostFtdcQryExchangeMarginRateAdjustField_InstrumentID_get(swigCPtr, this);
  }

  public void setHedgeFlag(char value) {
    jctpv6v3v11x64apiJNI.CThostFtdcQryExchangeMarginRateAdjustField_HedgeFlag_set(swigCPtr, this, value);
  }

  public char getHedgeFlag() {
    return jctpv6v3v11x64apiJNI.CThostFtdcQryExchangeMarginRateAdjustField_HedgeFlag_get(swigCPtr, this);
  }

  public CThostFtdcQryExchangeMarginRateAdjustField() {
    this(jctpv6v3v11x64apiJNI.new_CThostFtdcQryExchangeMarginRateAdjustField(), true);
  }

}
