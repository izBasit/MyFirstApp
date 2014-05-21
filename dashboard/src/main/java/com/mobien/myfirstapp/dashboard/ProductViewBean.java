/*
 * Copyright 2013 Mobien Technologies Pvt. Ltd.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 * 
 * @author Basit Parkar
 * 
 * @date Feb 18, 2014
 */
package com.mobien.myfirstapp.dashboard;

/**
 * Bean for Product List View. Use different bean for execution of SO.
 * 
 * @version 1.0
 * @since Feb 18, 2014
 * @author Basit Parkar
 */
public class ProductViewBean {

	private String productCode, productName, productShortName;
	private String schemeCode;
	private String schemeName;
	private boolean hasScheme;
	private String productSubText, productRate, totalSchemeOnProduct,
			productCategory, productSubCategory, distributorCode,
			productBaseUOM;
	private int schemeCount;
	private String prodQuantity, lastOrderedDate, lastOrderedQty,
			lastInvoiceQty, prodAmt, VAT = "";

	private boolean isFocusProduct, isMustSelling;

	public ProductViewBean() {
		super();
		this.productCode = "";
		this.productName = "";
		this.productShortName = "";
		this.schemeCode = "";
		this.schemeName = "";
		this.hasScheme = false;
		this.productSubText = "";
		this.productRate = "";
		this.totalSchemeOnProduct = "";
		this.productCategory = "";
		this.productSubCategory = "";
		this.distributorCode = "";
		this.productBaseUOM = "";
		this.schemeCount = 0;
		this.prodQuantity = "";
		this.lastOrderedDate = "";
		this.lastOrderedQty = "";
		this.lastInvoiceQty = "";
		this.prodAmt = "";
		this.VAT = "";
		this.isMustSelling = false;
		this.isFocusProduct = false;
	}

	public boolean isFocusProduct() {
		return isFocusProduct;
	}

	public void setFocusProduct(boolean isFocusProduct) {
		this.isFocusProduct = isFocusProduct;
	}

	public boolean isMustSelling() {
		return isMustSelling;
	}

	public void setMustSelling(boolean isMustSelling) {
		this.isMustSelling = isMustSelling;
	}

	public String getVAT() {
		return VAT;
	}

	public void setVAT(String vAT) {
		VAT = vAT;
	}

	public String getProdAmt() {
		return prodAmt;
	}

	public void setProdAmt(String prodAmt) {
		this.prodAmt = prodAmt;
	}

	public String getLastInvoiceQty() {
		return lastInvoiceQty;
	}

	public void setLastInvoiceQty(String lastInvoiceQty) {
		this.lastInvoiceQty = lastInvoiceQty;
	}

	public String getProdQuantity() {
		return prodQuantity;
	}

	public void setProdQuantity(String prodQuantity) {
		this.prodQuantity = prodQuantity;
	}

	public String getLastOrderedDate() {
		return lastOrderedDate;
	}

	public void setLastOrderedDate(String lastOrderedDate) {
		this.lastOrderedDate = lastOrderedDate;
	}

	public String getLastOrderedQty() {
		return lastOrderedQty;
	}

	public void setLastOrderedQty(String lastOrderedQty) {
		this.lastOrderedQty = lastOrderedQty;
	}

	public int getSchemeCount() {
		return schemeCount;
	}

	public void setSchemeCount(int schemeCount) {
		this.schemeCount = schemeCount;
	}

	public String getProductSubText() {
		return productSubText;
	}

	public void setProductSubText(String productSubText) {
		this.productSubText = productSubText;
	}

	public String getProductRate() {
		return productRate;
	}

	public void setProductRate(String productRate) {
		this.productRate = productRate;
	}

	public String getTotalSchemeOnProduct() {
		return totalSchemeOnProduct;
	}

	public void setTotalSchemeOnProduct(String totalSchemeOnProduct) {
		this.totalSchemeOnProduct = totalSchemeOnProduct;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	public String getProductSubCategory() {
		return productSubCategory;
	}

	public void setProductSubCategory(String productSubCategory) {
		this.productSubCategory = productSubCategory;
	}

	public String getDistributorCode() {
		return distributorCode;
	}

	public void setDistributorCode(String distributorCode) {
		this.distributorCode = distributorCode;
	}

	public String getProductBaseUOM() {
		return productBaseUOM;
	}

	public void setProductBaseUOM(String productBaseUOM) {
		this.productBaseUOM = productBaseUOM;
	}

	public String getSchemeName() {
		return schemeName;
	}

	public void setSchemeName(String schemeName) {
		this.schemeName = schemeName;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductShortName() {
		return productShortName;
	}

	public void setProductShortName(String productShortName) {
		this.productShortName = productShortName;
	}

	public String getSchemeCode() {
		return schemeCode;
	}

	public void setSchemeCode(String schemeCode) {
		this.schemeCode = schemeCode;
	}

	public boolean isHasScheme() {
		return hasScheme;
	}

	public void setHasScheme(boolean hasScheme) {
		this.hasScheme = hasScheme;
	}

}
