package com.yc.pos.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "ycpos_customers")
public class Customer {
    @Id
    @Column(name = "person_id", nullable = false)
    private int personId;

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "account_number", unique = true)
    private String accountNumber;

    @Column(name = "taxable", nullable = false)
    private boolean taxable;

    @Column(name = "tax_id", nullable = false)
    private String taxId;

    @Column(name = "sales_tax_code_id")
    private Integer salesTaxCodeId;

    @Column(name = "discount", nullable = false)
    private BigDecimal discount;

    @Column(name = "discount_type", nullable = false)
    private boolean discountType;

    @Column(name = "package_id")
    private Integer packageId;

    @Column(name = "points")
    private Integer points;

    @Column(name = "deleted", nullable = false)
    private boolean deleted;

    @Column(name = "date", nullable = false, updatable = false, insertable = false)
    private Timestamp date;

    @Column(name = "employee_id", nullable = false)
    private int employeeId;

    @Column(name = "consent", nullable = false)
    private boolean consent;

    // Getters and Setters
    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public boolean isTaxable() {
        return taxable;
    }

    public void setTaxable(boolean taxable) {
        this.taxable = taxable;
    }

    public String getTaxId() {
        return taxId;
    }

    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }

    public Integer getSalesTaxCodeId() {
        return salesTaxCodeId;
    }

    public void setSalesTaxCodeId(Integer salesTaxCodeId) {
        this.salesTaxCodeId = salesTaxCodeId;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public boolean isDiscountType() {
        return discountType;
    }

    public void setDiscountType(boolean discountType) {
        this.discountType = discountType;
    }

    public Integer getPackageId() {
        return packageId;
    }

    public void setPackageId(Integer packageId) {
        this.packageId = packageId;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public boolean isConsent() {
        return consent;
    }

    public void setConsent(boolean consent) {
        this.consent = consent;
    }
}
