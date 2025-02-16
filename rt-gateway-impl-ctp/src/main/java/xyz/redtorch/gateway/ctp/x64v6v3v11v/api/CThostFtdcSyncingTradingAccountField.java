/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v3v11v.api;

public class CThostFtdcSyncingTradingAccountField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcSyncingTradingAccountField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcSyncingTradingAccountField obj) {
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
        jctpv6v3v11x64apiJNI.delete_CThostFtdcSyncingTradingAccountField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    jctpv6v3v11x64apiJNI.CThostFtdcSyncingTradingAccountField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v3v11x64apiJNI.CThostFtdcSyncingTradingAccountField_BrokerID_get(swigCPtr, this);
  }

  public void setAccountID(String value) {
    jctpv6v3v11x64apiJNI.CThostFtdcSyncingTradingAccountField_AccountID_set(swigCPtr, this, value);
  }

  public String getAccountID() {
    return jctpv6v3v11x64apiJNI.CThostFtdcSyncingTradingAccountField_AccountID_get(swigCPtr, this);
  }

  public void setPreMortgage(double value) {
    jctpv6v3v11x64apiJNI.CThostFtdcSyncingTradingAccountField_PreMortgage_set(swigCPtr, this, value);
  }

  public double getPreMortgage() {
    return jctpv6v3v11x64apiJNI.CThostFtdcSyncingTradingAccountField_PreMortgage_get(swigCPtr, this);
  }

  public void setPreCredit(double value) {
    jctpv6v3v11x64apiJNI.CThostFtdcSyncingTradingAccountField_PreCredit_set(swigCPtr, this, value);
  }

  public double getPreCredit() {
    return jctpv6v3v11x64apiJNI.CThostFtdcSyncingTradingAccountField_PreCredit_get(swigCPtr, this);
  }

  public void setPreDeposit(double value) {
    jctpv6v3v11x64apiJNI.CThostFtdcSyncingTradingAccountField_PreDeposit_set(swigCPtr, this, value);
  }

  public double getPreDeposit() {
    return jctpv6v3v11x64apiJNI.CThostFtdcSyncingTradingAccountField_PreDeposit_get(swigCPtr, this);
  }

  public void setPreBalance(double value) {
    jctpv6v3v11x64apiJNI.CThostFtdcSyncingTradingAccountField_PreBalance_set(swigCPtr, this, value);
  }

  public double getPreBalance() {
    return jctpv6v3v11x64apiJNI.CThostFtdcSyncingTradingAccountField_PreBalance_get(swigCPtr, this);
  }

  public void setPreMargin(double value) {
    jctpv6v3v11x64apiJNI.CThostFtdcSyncingTradingAccountField_PreMargin_set(swigCPtr, this, value);
  }

  public double getPreMargin() {
    return jctpv6v3v11x64apiJNI.CThostFtdcSyncingTradingAccountField_PreMargin_get(swigCPtr, this);
  }

  public void setInterestBase(double value) {
    jctpv6v3v11x64apiJNI.CThostFtdcSyncingTradingAccountField_InterestBase_set(swigCPtr, this, value);
  }

  public double getInterestBase() {
    return jctpv6v3v11x64apiJNI.CThostFtdcSyncingTradingAccountField_InterestBase_get(swigCPtr, this);
  }

  public void setInterest(double value) {
    jctpv6v3v11x64apiJNI.CThostFtdcSyncingTradingAccountField_Interest_set(swigCPtr, this, value);
  }

  public double getInterest() {
    return jctpv6v3v11x64apiJNI.CThostFtdcSyncingTradingAccountField_Interest_get(swigCPtr, this);
  }

  public void setDeposit(double value) {
    jctpv6v3v11x64apiJNI.CThostFtdcSyncingTradingAccountField_Deposit_set(swigCPtr, this, value);
  }

  public double getDeposit() {
    return jctpv6v3v11x64apiJNI.CThostFtdcSyncingTradingAccountField_Deposit_get(swigCPtr, this);
  }

  public void setWithdraw(double value) {
    jctpv6v3v11x64apiJNI.CThostFtdcSyncingTradingAccountField_Withdraw_set(swigCPtr, this, value);
  }

  public double getWithdraw() {
    return jctpv6v3v11x64apiJNI.CThostFtdcSyncingTradingAccountField_Withdraw_get(swigCPtr, this);
  }

  public void setFrozenMargin(double value) {
    jctpv6v3v11x64apiJNI.CThostFtdcSyncingTradingAccountField_FrozenMargin_set(swigCPtr, this, value);
  }

  public double getFrozenMargin() {
    return jctpv6v3v11x64apiJNI.CThostFtdcSyncingTradingAccountField_FrozenMargin_get(swigCPtr, this);
  }

  public void setFrozenCash(double value) {
    jctpv6v3v11x64apiJNI.CThostFtdcSyncingTradingAccountField_FrozenCash_set(swigCPtr, this, value);
  }

  public double getFrozenCash() {
    return jctpv6v3v11x64apiJNI.CThostFtdcSyncingTradingAccountField_FrozenCash_get(swigCPtr, this);
  }

  public void setFrozenCommission(double value) {
    jctpv6v3v11x64apiJNI.CThostFtdcSyncingTradingAccountField_FrozenCommission_set(swigCPtr, this, value);
  }

  public double getFrozenCommission() {
    return jctpv6v3v11x64apiJNI.CThostFtdcSyncingTradingAccountField_FrozenCommission_get(swigCPtr, this);
  }

  public void setCurrMargin(double value) {
    jctpv6v3v11x64apiJNI.CThostFtdcSyncingTradingAccountField_CurrMargin_set(swigCPtr, this, value);
  }

  public double getCurrMargin() {
    return jctpv6v3v11x64apiJNI.CThostFtdcSyncingTradingAccountField_CurrMargin_get(swigCPtr, this);
  }

  public void setCashIn(double value) {
    jctpv6v3v11x64apiJNI.CThostFtdcSyncingTradingAccountField_CashIn_set(swigCPtr, this, value);
  }

  public double getCashIn() {
    return jctpv6v3v11x64apiJNI.CThostFtdcSyncingTradingAccountField_CashIn_get(swigCPtr, this);
  }

  public void setCommission(double value) {
    jctpv6v3v11x64apiJNI.CThostFtdcSyncingTradingAccountField_Commission_set(swigCPtr, this, value);
  }

  public double getCommission() {
    return jctpv6v3v11x64apiJNI.CThostFtdcSyncingTradingAccountField_Commission_get(swigCPtr, this);
  }

  public void setCloseProfit(double value) {
    jctpv6v3v11x64apiJNI.CThostFtdcSyncingTradingAccountField_CloseProfit_set(swigCPtr, this, value);
  }

  public double getCloseProfit() {
    return jctpv6v3v11x64apiJNI.CThostFtdcSyncingTradingAccountField_CloseProfit_get(swigCPtr, this);
  }

  public void setPositionProfit(double value) {
    jctpv6v3v11x64apiJNI.CThostFtdcSyncingTradingAccountField_PositionProfit_set(swigCPtr, this, value);
  }

  public double getPositionProfit() {
    return jctpv6v3v11x64apiJNI.CThostFtdcSyncingTradingAccountField_PositionProfit_get(swigCPtr, this);
  }

  public void setBalance(double value) {
    jctpv6v3v11x64apiJNI.CThostFtdcSyncingTradingAccountField_Balance_set(swigCPtr, this, value);
  }

  public double getBalance() {
    return jctpv6v3v11x64apiJNI.CThostFtdcSyncingTradingAccountField_Balance_get(swigCPtr, this);
  }

  public void setAvailable(double value) {
    jctpv6v3v11x64apiJNI.CThostFtdcSyncingTradingAccountField_Available_set(swigCPtr, this, value);
  }

  public double getAvailable() {
    return jctpv6v3v11x64apiJNI.CThostFtdcSyncingTradingAccountField_Available_get(swigCPtr, this);
  }

  public void setWithdrawQuota(double value) {
    jctpv6v3v11x64apiJNI.CThostFtdcSyncingTradingAccountField_WithdrawQuota_set(swigCPtr, this, value);
  }

  public double getWithdrawQuota() {
    return jctpv6v3v11x64apiJNI.CThostFtdcSyncingTradingAccountField_WithdrawQuota_get(swigCPtr, this);
  }

  public void setReserve(double value) {
    jctpv6v3v11x64apiJNI.CThostFtdcSyncingTradingAccountField_Reserve_set(swigCPtr, this, value);
  }

  public double getReserve() {
    return jctpv6v3v11x64apiJNI.CThostFtdcSyncingTradingAccountField_Reserve_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    jctpv6v3v11x64apiJNI.CThostFtdcSyncingTradingAccountField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return jctpv6v3v11x64apiJNI.CThostFtdcSyncingTradingAccountField_TradingDay_get(swigCPtr, this);
  }

  public void setSettlementID(int value) {
    jctpv6v3v11x64apiJNI.CThostFtdcSyncingTradingAccountField_SettlementID_set(swigCPtr, this, value);
  }

  public int getSettlementID() {
    return jctpv6v3v11x64apiJNI.CThostFtdcSyncingTradingAccountField_SettlementID_get(swigCPtr, this);
  }

  public void setCredit(double value) {
    jctpv6v3v11x64apiJNI.CThostFtdcSyncingTradingAccountField_Credit_set(swigCPtr, this, value);
  }

  public double getCredit() {
    return jctpv6v3v11x64apiJNI.CThostFtdcSyncingTradingAccountField_Credit_get(swigCPtr, this);
  }

  public void setMortgage(double value) {
    jctpv6v3v11x64apiJNI.CThostFtdcSyncingTradingAccountField_Mortgage_set(swigCPtr, this, value);
  }

  public double getMortgage() {
    return jctpv6v3v11x64apiJNI.CThostFtdcSyncingTradingAccountField_Mortgage_get(swigCPtr, this);
  }

  public void setExchangeMargin(double value) {
    jctpv6v3v11x64apiJNI.CThostFtdcSyncingTradingAccountField_ExchangeMargin_set(swigCPtr, this, value);
  }

  public double getExchangeMargin() {
    return jctpv6v3v11x64apiJNI.CThostFtdcSyncingTradingAccountField_ExchangeMargin_get(swigCPtr, this);
  }

  public void setDeliveryMargin(double value) {
    jctpv6v3v11x64apiJNI.CThostFtdcSyncingTradingAccountField_DeliveryMargin_set(swigCPtr, this, value);
  }

  public double getDeliveryMargin() {
    return jctpv6v3v11x64apiJNI.CThostFtdcSyncingTradingAccountField_DeliveryMargin_get(swigCPtr, this);
  }

  public void setExchangeDeliveryMargin(double value) {
    jctpv6v3v11x64apiJNI.CThostFtdcSyncingTradingAccountField_ExchangeDeliveryMargin_set(swigCPtr, this, value);
  }

  public double getExchangeDeliveryMargin() {
    return jctpv6v3v11x64apiJNI.CThostFtdcSyncingTradingAccountField_ExchangeDeliveryMargin_get(swigCPtr, this);
  }

  public void setReserveBalance(double value) {
    jctpv6v3v11x64apiJNI.CThostFtdcSyncingTradingAccountField_ReserveBalance_set(swigCPtr, this, value);
  }

  public double getReserveBalance() {
    return jctpv6v3v11x64apiJNI.CThostFtdcSyncingTradingAccountField_ReserveBalance_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    jctpv6v3v11x64apiJNI.CThostFtdcSyncingTradingAccountField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return jctpv6v3v11x64apiJNI.CThostFtdcSyncingTradingAccountField_CurrencyID_get(swigCPtr, this);
  }

  public void setPreFundMortgageIn(double value) {
    jctpv6v3v11x64apiJNI.CThostFtdcSyncingTradingAccountField_PreFundMortgageIn_set(swigCPtr, this, value);
  }

  public double getPreFundMortgageIn() {
    return jctpv6v3v11x64apiJNI.CThostFtdcSyncingTradingAccountField_PreFundMortgageIn_get(swigCPtr, this);
  }

  public void setPreFundMortgageOut(double value) {
    jctpv6v3v11x64apiJNI.CThostFtdcSyncingTradingAccountField_PreFundMortgageOut_set(swigCPtr, this, value);
  }

  public double getPreFundMortgageOut() {
    return jctpv6v3v11x64apiJNI.CThostFtdcSyncingTradingAccountField_PreFundMortgageOut_get(swigCPtr, this);
  }

  public void setFundMortgageIn(double value) {
    jctpv6v3v11x64apiJNI.CThostFtdcSyncingTradingAccountField_FundMortgageIn_set(swigCPtr, this, value);
  }

  public double getFundMortgageIn() {
    return jctpv6v3v11x64apiJNI.CThostFtdcSyncingTradingAccountField_FundMortgageIn_get(swigCPtr, this);
  }

  public void setFundMortgageOut(double value) {
    jctpv6v3v11x64apiJNI.CThostFtdcSyncingTradingAccountField_FundMortgageOut_set(swigCPtr, this, value);
  }

  public double getFundMortgageOut() {
    return jctpv6v3v11x64apiJNI.CThostFtdcSyncingTradingAccountField_FundMortgageOut_get(swigCPtr, this);
  }

  public void setFundMortgageAvailable(double value) {
    jctpv6v3v11x64apiJNI.CThostFtdcSyncingTradingAccountField_FundMortgageAvailable_set(swigCPtr, this, value);
  }

  public double getFundMortgageAvailable() {
    return jctpv6v3v11x64apiJNI.CThostFtdcSyncingTradingAccountField_FundMortgageAvailable_get(swigCPtr, this);
  }

  public void setMortgageableFund(double value) {
    jctpv6v3v11x64apiJNI.CThostFtdcSyncingTradingAccountField_MortgageableFund_set(swigCPtr, this, value);
  }

  public double getMortgageableFund() {
    return jctpv6v3v11x64apiJNI.CThostFtdcSyncingTradingAccountField_MortgageableFund_get(swigCPtr, this);
  }

  public void setSpecProductMargin(double value) {
    jctpv6v3v11x64apiJNI.CThostFtdcSyncingTradingAccountField_SpecProductMargin_set(swigCPtr, this, value);
  }

  public double getSpecProductMargin() {
    return jctpv6v3v11x64apiJNI.CThostFtdcSyncingTradingAccountField_SpecProductMargin_get(swigCPtr, this);
  }

  public void setSpecProductFrozenMargin(double value) {
    jctpv6v3v11x64apiJNI.CThostFtdcSyncingTradingAccountField_SpecProductFrozenMargin_set(swigCPtr, this, value);
  }

  public double getSpecProductFrozenMargin() {
    return jctpv6v3v11x64apiJNI.CThostFtdcSyncingTradingAccountField_SpecProductFrozenMargin_get(swigCPtr, this);
  }

  public void setSpecProductCommission(double value) {
    jctpv6v3v11x64apiJNI.CThostFtdcSyncingTradingAccountField_SpecProductCommission_set(swigCPtr, this, value);
  }

  public double getSpecProductCommission() {
    return jctpv6v3v11x64apiJNI.CThostFtdcSyncingTradingAccountField_SpecProductCommission_get(swigCPtr, this);
  }

  public void setSpecProductFrozenCommission(double value) {
    jctpv6v3v11x64apiJNI.CThostFtdcSyncingTradingAccountField_SpecProductFrozenCommission_set(swigCPtr, this, value);
  }

  public double getSpecProductFrozenCommission() {
    return jctpv6v3v11x64apiJNI.CThostFtdcSyncingTradingAccountField_SpecProductFrozenCommission_get(swigCPtr, this);
  }

  public void setSpecProductPositionProfit(double value) {
    jctpv6v3v11x64apiJNI.CThostFtdcSyncingTradingAccountField_SpecProductPositionProfit_set(swigCPtr, this, value);
  }

  public double getSpecProductPositionProfit() {
    return jctpv6v3v11x64apiJNI.CThostFtdcSyncingTradingAccountField_SpecProductPositionProfit_get(swigCPtr, this);
  }

  public void setSpecProductCloseProfit(double value) {
    jctpv6v3v11x64apiJNI.CThostFtdcSyncingTradingAccountField_SpecProductCloseProfit_set(swigCPtr, this, value);
  }

  public double getSpecProductCloseProfit() {
    return jctpv6v3v11x64apiJNI.CThostFtdcSyncingTradingAccountField_SpecProductCloseProfit_get(swigCPtr, this);
  }

  public void setSpecProductPositionProfitByAlg(double value) {
    jctpv6v3v11x64apiJNI.CThostFtdcSyncingTradingAccountField_SpecProductPositionProfitByAlg_set(swigCPtr, this, value);
  }

  public double getSpecProductPositionProfitByAlg() {
    return jctpv6v3v11x64apiJNI.CThostFtdcSyncingTradingAccountField_SpecProductPositionProfitByAlg_get(swigCPtr, this);
  }

  public void setSpecProductExchangeMargin(double value) {
    jctpv6v3v11x64apiJNI.CThostFtdcSyncingTradingAccountField_SpecProductExchangeMargin_set(swigCPtr, this, value);
  }

  public double getSpecProductExchangeMargin() {
    return jctpv6v3v11x64apiJNI.CThostFtdcSyncingTradingAccountField_SpecProductExchangeMargin_get(swigCPtr, this);
  }

  public void setFrozenSwap(double value) {
    jctpv6v3v11x64apiJNI.CThostFtdcSyncingTradingAccountField_FrozenSwap_set(swigCPtr, this, value);
  }

  public double getFrozenSwap() {
    return jctpv6v3v11x64apiJNI.CThostFtdcSyncingTradingAccountField_FrozenSwap_get(swigCPtr, this);
  }

  public void setRemainSwap(double value) {
    jctpv6v3v11x64apiJNI.CThostFtdcSyncingTradingAccountField_RemainSwap_set(swigCPtr, this, value);
  }

  public double getRemainSwap() {
    return jctpv6v3v11x64apiJNI.CThostFtdcSyncingTradingAccountField_RemainSwap_get(swigCPtr, this);
  }

  public CThostFtdcSyncingTradingAccountField() {
    this(jctpv6v3v11x64apiJNI.new_CThostFtdcSyncingTradingAccountField(), true);
  }

}
