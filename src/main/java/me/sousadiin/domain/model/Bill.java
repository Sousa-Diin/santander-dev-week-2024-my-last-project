package me.sousadiin.domain.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity(name= "tb_bill")
public class Bill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descriptionBill;

    @Column(precision = 13, scale = 2)
    private BigDecimal amountToPay;

    private String date = "data do registro";

    @Column(precision = 13, scale = 2)
    private BigDecimal amountPaid;

    private String status = "Pendente";
    private int typePayment = 1;
    private String category = "undefined";
    private int codRule = 0;

    private int installment =  0;

    public int getInstallment() {
        return installment;
    }

    public void setInstallment(int installment) {
        this.installment = installment;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescriptionBill() {
        return descriptionBill;
    }

    public void setDescriptionBill(String descriptionBill) {
        this.descriptionBill = descriptionBill;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public BigDecimal getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(BigDecimal amountPaid) {
        this.amountPaid = amountPaid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getTypePayment() {
        return typePayment;
    }

    public void setTypePayment(int typePayment) {
        this.typePayment = typePayment;
    }

    public int getCodRule() {
        return codRule;
    }

    public void setCodRule(int codRule) {
        this.codRule = codRule;
    }
}
