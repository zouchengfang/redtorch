/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v3v11v.api;

public class CThostFtdcReqQueryTradeResultBySerialField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcReqQueryTradeResultBySerialField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcReqQueryTradeResultBySerialField obj) {
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
        jctpv6v3v11x64apiJNI.delete_CThostFtdcReqQueryTradeResultBySerialField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTradeCode(String value) {
    jctpv6v3v11x64apiJNI.CThostFtdcReqQueryTradeResultBySerialField_TradeCode_set(swigCPtr, this, value);
  }

  public String getTradeCode() {
    return jctpv6v3v11x64apiJNI.CThostFtdcReqQueryTradeResultBySerialField_TradeCode_get(swigCPtr, this);
  }

  public void setBankID(String value) {
    jctpv6v3v11x64apiJNI.CThostFtdcReqQueryTradeResultBySerialField_BankID_set(swigCPtr, this, value);
  }

  public String getBankID() {
    return jctpv6v3v11x64apiJNI.CThostFtdcReqQueryTradeResultBySerialField_BankID_get(swigCPtr, this);
  }

  public void setBankBranchID(String value) {
    jctpv6v3v11x64apiJNI.CThostFtdcReqQueryTradeResultBySerialField_BankBranchID_set(swigCPtr, this, value);
  }

  public String getBankBranchID() {
    return jctpv6v3v11x64apiJNI.CThostFtdcReqQueryTradeResultBySerialField_BankBranchID_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    jctpv6v3v11x64apiJNI.CThostFtdcReqQueryTradeResultBySerialField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v3v11x64apiJNI.CThostFtdcReqQueryTradeResultBySerialField_BrokerID_get(swigCPtr, this);
  }

  public void setBrokerBranchID(String value) {
    jctpv6v3v11x64apiJNI.CThostFtdcReqQueryTradeResultBySerialField_BrokerBranchID_set(swigCPtr, this, value);
  }

  public String getBrokerBranchID() {
    return jctpv6v3v11x64apiJNI.CThostFtdcReqQueryTradeResultBySerialField_BrokerBranchID_get(swigCPtr, this);
  }

  public void setTradeDate(String value) {
    jctpv6v3v11x64apiJNI.CThostFtdcReqQueryTradeResultBySerialField_TradeDate_set(swigCPtr, this, value);
  }

  public String getTradeDate() {
    return jctpv6v3v11x64apiJNI.CThostFtdcReqQueryTradeResultBySerialField_TradeDate_get(swigCPtr, this);
  }

  public void setTradeTime(String value) {
    jctpv6v3v11x64apiJNI.CThostFtdcReqQueryTradeResultBySerialField_TradeTime_set(swigCPtr, this, value);
  }

  public String getTradeTime() {
    return jctpv6v3v11x64apiJNI.CThostFtdcReqQueryTradeResultBySerialField_TradeTime_get(swigCPtr, this);
  }

  public void setBankSerial(String value) {
    jctpv6v3v11x64apiJNI.CThostFtdcReqQueryTradeResultBySerialField_BankSerial_set(swigCPtr, this, value);
  }

  public String getBankSerial() {
    return jctpv6v3v11x64apiJNI.CThostFtdcReqQueryTradeResultBySerialField_BankSerial_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    jctpv6v3v11x64apiJNI.CThostFtdcReqQueryTradeResultBySerialField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return jctpv6v3v11x64apiJNI.CThostFtdcReqQueryTradeResultBySerialField_TradingDay_get(swigCPtr, this);
  }

  public void setPlateSerial(int value) {
    jctpv6v3v11x64apiJNI.CThostFtdcReqQueryTradeResultBySerialField_PlateSerial_set(swigCPtr, this, value);
  }

  public int getPlateSerial() {
    return jctpv6v3v11x64apiJNI.CThostFtdcReqQueryTradeResultBySerialField_PlateSerial_get(swigCPtr, this);
  }

  public void setLastFragment(char value) {
    jctpv6v3v11x64apiJNI.CThostFtdcReqQueryTradeResultBySerialField_LastFragment_set(swigCPtr, this, value);
  }

  public char getLastFragment() {
    return jctpv6v3v11x64apiJNI.CThostFtdcReqQueryTradeResultBySerialField_LastFragment_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    jctpv6v3v11x64apiJNI.CThostFtdcReqQueryTradeResultBySerialField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return jctpv6v3v11x64apiJNI.CThostFtdcReqQueryTradeResultBySerialField_SessionID_get(swigCPtr, this);
  }

  public void setReference(int value) {
    jctpv6v3v11x64apiJNI.CThostFtdcReqQueryTradeResultBySerialField_Reference_set(swigCPtr, this, value);
  }

  public int getReference() {
    return jctpv6v3v11x64apiJNI.CThostFtdcReqQueryTradeResultBySerialField_Reference_get(swigCPtr, this);
  }

  public void setRefrenceIssureType(char value) {
    jctpv6v3v11x64apiJNI.CThostFtdcReqQueryTradeResultBySerialField_RefrenceIssureType_set(swigCPtr, this, value);
  }

  public char getRefrenceIssureType() {
    return jctpv6v3v11x64apiJNI.CThostFtdcReqQueryTradeResultBySerialField_RefrenceIssureType_get(swigCPtr, this);
  }

  public void setRefrenceIssure(String value) {
    jctpv6v3v11x64apiJNI.CThostFtdcReqQueryTradeResultBySerialField_RefrenceIssure_set(swigCPtr, this, value);
  }

  public String getRefrenceIssure() {
    return jctpv6v3v11x64apiJNI.CThostFtdcReqQueryTradeResultBySerialField_RefrenceIssure_get(swigCPtr, this);
  }

  public void setCustomerName(String value) {
    jctpv6v3v11x64apiJNI.CThostFtdcReqQueryTradeResultBySerialField_CustomerName_set(swigCPtr, this, value);
  }

  public String getCustomerName() {
    return jctpv6v3v11x64apiJNI.CThostFtdcReqQueryTradeResultBySerialField_CustomerName_get(swigCPtr, this);
  }

  public void setIdCardType(char value) {
    jctpv6v3v11x64apiJNI.CThostFtdcReqQueryTradeResultBySerialField_IdCardType_set(swigCPtr, this, value);
  }

  public char getIdCardType() {
    return jctpv6v3v11x64apiJNI.CThostFtdcReqQueryTradeResultBySerialField_IdCardType_get(swigCPtr, this);
  }

  public void setIdentifiedCardNo(String value) {
    jctpv6v3v11x64apiJNI.CThostFtdcReqQueryTradeResultBySerialField_IdentifiedCardNo_set(swigCPtr, this, value);
  }

  public String getIdentifiedCardNo() {
    return jctpv6v3v11x64apiJNI.CThostFtdcReqQueryTradeResultBySerialField_IdentifiedCardNo_get(swigCPtr, this);
  }

  public void setCustType(char value) {
    jctpv6v3v11x64apiJNI.CThostFtdcReqQueryTradeResultBySerialField_CustType_set(swigCPtr, this, value);
  }

  public char getCustType() {
    return jctpv6v3v11x64apiJNI.CThostFtdcReqQueryTradeResultBySerialField_CustType_get(swigCPtr, this);
  }

  public void setBankAccount(String value) {
    jctpv6v3v11x64apiJNI.CThostFtdcReqQueryTradeResultBySerialField_BankAccount_set(swigCPtr, this, value);
  }

  public String getBankAccount() {
    return jctpv6v3v11x64apiJNI.CThostFtdcReqQueryTradeResultBySerialField_BankAccount_get(swigCPtr, this);
  }

  public void setBankPassWord(String value) {
    jctpv6v3v11x64apiJNI.CThostFtdcReqQueryTradeResultBySerialField_BankPassWord_set(swigCPtr, this, value);
  }

  public String getBankPassWord() {
    return jctpv6v3v11x64apiJNI.CThostFtdcReqQueryTradeResultBySerialField_BankPassWord_get(swigCPtr, this);
  }

  public void setAccountID(String value) {
    jctpv6v3v11x64apiJNI.CThostFtdcReqQueryTradeResultBySerialField_AccountID_set(swigCPtr, this, value);
  }

  public String getAccountID() {
    return jctpv6v3v11x64apiJNI.CThostFtdcReqQueryTradeResultBySerialField_AccountID_get(swigCPtr, this);
  }

  public void setPassword(String value) {
    jctpv6v3v11x64apiJNI.CThostFtdcReqQueryTradeResultBySerialField_Password_set(swigCPtr, this, value);
  }

  public String getPassword() {
    return jctpv6v3v11x64apiJNI.CThostFtdcReqQueryTradeResultBySerialField_Password_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    jctpv6v3v11x64apiJNI.CThostFtdcReqQueryTradeResultBySerialField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return jctpv6v3v11x64apiJNI.CThostFtdcReqQueryTradeResultBySerialField_CurrencyID_get(swigCPtr, this);
  }

  public void setTradeAmount(double value) {
    jctpv6v3v11x64apiJNI.CThostFtdcReqQueryTradeResultBySerialField_TradeAmount_set(swigCPtr, this, value);
  }

  public double getTradeAmount() {
    return jctpv6v3v11x64apiJNI.CThostFtdcReqQueryTradeResultBySerialField_TradeAmount_get(swigCPtr, this);
  }

  public void setDigest(String value) {
    jctpv6v3v11x64apiJNI.CThostFtdcReqQueryTradeResultBySerialField_Digest_set(swigCPtr, this, value);
  }

  public String getDigest() {
    return jctpv6v3v11x64apiJNI.CThostFtdcReqQueryTradeResultBySerialField_Digest_get(swigCPtr, this);
  }

  public void setLongCustomerName(String value) {
    jctpv6v3v11x64apiJNI.CThostFtdcReqQueryTradeResultBySerialField_LongCustomerName_set(swigCPtr, this, value);
  }

  public String getLongCustomerName() {
    return jctpv6v3v11x64apiJNI.CThostFtdcReqQueryTradeResultBySerialField_LongCustomerName_get(swigCPtr, this);
  }

  public CThostFtdcReqQueryTradeResultBySerialField() {
    this(jctpv6v3v11x64apiJNI.new_CThostFtdcReqQueryTradeResultBySerialField(), true);
  }

}
