/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v3v11v.api;

public class CThostFtdcTransferFutureToBankRspField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcTransferFutureToBankRspField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcTransferFutureToBankRspField obj) {
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
        jctpv6v3v11x64apiJNI.delete_CThostFtdcTransferFutureToBankRspField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setRetCode(String value) {
    jctpv6v3v11x64apiJNI.CThostFtdcTransferFutureToBankRspField_RetCode_set(swigCPtr, this, value);
  }

  public String getRetCode() {
    return jctpv6v3v11x64apiJNI.CThostFtdcTransferFutureToBankRspField_RetCode_get(swigCPtr, this);
  }

  public void setRetInfo(String value) {
    jctpv6v3v11x64apiJNI.CThostFtdcTransferFutureToBankRspField_RetInfo_set(swigCPtr, this, value);
  }

  public String getRetInfo() {
    return jctpv6v3v11x64apiJNI.CThostFtdcTransferFutureToBankRspField_RetInfo_get(swigCPtr, this);
  }

  public void setFutureAccount(String value) {
    jctpv6v3v11x64apiJNI.CThostFtdcTransferFutureToBankRspField_FutureAccount_set(swigCPtr, this, value);
  }

  public String getFutureAccount() {
    return jctpv6v3v11x64apiJNI.CThostFtdcTransferFutureToBankRspField_FutureAccount_get(swigCPtr, this);
  }

  public void setTradeAmt(double value) {
    jctpv6v3v11x64apiJNI.CThostFtdcTransferFutureToBankRspField_TradeAmt_set(swigCPtr, this, value);
  }

  public double getTradeAmt() {
    return jctpv6v3v11x64apiJNI.CThostFtdcTransferFutureToBankRspField_TradeAmt_get(swigCPtr, this);
  }

  public void setCustFee(double value) {
    jctpv6v3v11x64apiJNI.CThostFtdcTransferFutureToBankRspField_CustFee_set(swigCPtr, this, value);
  }

  public double getCustFee() {
    return jctpv6v3v11x64apiJNI.CThostFtdcTransferFutureToBankRspField_CustFee_get(swigCPtr, this);
  }

  public void setCurrencyCode(String value) {
    jctpv6v3v11x64apiJNI.CThostFtdcTransferFutureToBankRspField_CurrencyCode_set(swigCPtr, this, value);
  }

  public String getCurrencyCode() {
    return jctpv6v3v11x64apiJNI.CThostFtdcTransferFutureToBankRspField_CurrencyCode_get(swigCPtr, this);
  }

  public CThostFtdcTransferFutureToBankRspField() {
    this(jctpv6v3v11x64apiJNI.new_CThostFtdcTransferFutureToBankRspField(), true);
  }

}
