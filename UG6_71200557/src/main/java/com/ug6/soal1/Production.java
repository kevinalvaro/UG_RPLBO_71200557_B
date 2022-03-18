package com.ug6.soal1;

import java.util.Iterator;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.time.format.FormatStyle;

public class Production {
    private int productionCapacity;
    private ArrayList<LocalDate> productionDate;
    private ArrayList<Long> productionDueDays;
    private double costCalculation = 0.0D;

    public Production(int productionCapacity, ArrayList<LocalDate> productionDate, ArrayList<Long> productionDueDays) {
        this.setProductionCapacity(productionCapacity);
        this.setProductionDate(productionDate);
        this.setProductionDueDays(productionDueDays);
    }

    public int getProductionCapacity() {
        return this.productionCapacity;
    }

    public void setProductionCapacity(int productionCapacity) {
        this.productionCapacity = productionCapacity;
    }

    public ArrayList<LocalDate> getProductionDate() {
        return this.productionDate;
    }

    protected void setProductionDate(ArrayList<LocalDate> productionDate) {
        this.productionDate = productionDate;
    }

    public double getCostCalculation() {
        return this.costCalculation;
    }

    public void setCostCalculation(double costCalculation) {
        this.costCalculation = costCalculation;
    }

    public ArrayList<Long> getProductionDueDays() {
        return this.productionDueDays;
    }

    public void setProductionDueDays(ArrayList<Long> productionDueDays) {
        this.productionDueDays = productionDueDays;
    }
    public void conductProduction(Phones phone) {
        long productionDuration = (long)this.getProductionCapacity() * 3L;
        LocalDate today = LocalDate.now();
        this.getProductionDate().add(today);
        LocalDate productionDueDate = today.plusDays(productionDuration);
        long daysBetweenProduction = ChronoUnit.DAYS.between(today, productionDueDate);
        double cost = (double)(this.getProductionCapacity() * 1000) * (double)daysBetweenProduction;
        this.setCostCalculation(cost);
        String bonusProductionDate = today.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
        String bonusProductionDueDate = productionDueDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));

        System.out.println("Congratulation");
        System.out.println("Begin To Produce Phone " + phone.getPhoneName());
        System.out.println("With code: " + phone.getPhoneCode());
        System.out.println("Production Date: " + today.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println("Production Due date: " + productionDueDate.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println("Days Before Due Date = " + ChronoUnit.DAYS.between(today, productionDueDate) + " Days");
        System.out.println("Calculation Production Cost: Rp " + this.getCostCalculation());
    }

    public void conductProduction(Phones phone, float productionRate) {
        if (productionRate <= 0.0F && productionRate >= 2.0F) {
            System.out.println("Please Input valid Production Rate");
        } else {
            long productionDuration = (long)((float)((long)this.getProductionCapacity() * 3L) * productionRate);
            LocalDate today = LocalDate.now();
            this.getProductionDate().add(today);
            LocalDate productionDueDate = today.plusDays(productionDuration);
            long daysBetweenProduction = ChronoUnit.DAYS.between(today, productionDueDate);
            String todayFormat = today.format(DateTimeFormatter.ISO_LOCAL_DATE);
            String productionDueDateFormat = productionDueDate.format(DateTimeFormatter.ISO_LOCAL_DATE);
            double cost = (double)(this.getProductionCapacity() * 1000) * (double)daysBetweenProduction * 2.0D;
            this.setCostCalculation(cost);

            System.out.println("Congratulation");
            System.out.println("Begin To Produce Phone " + phone.getPhoneName());
            System.out.println("With code: " + phone.getPhoneCode());
            System.out.println("Production Date: " + today.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
            System.out.println("Production Due date: " + productionDueDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
            System.out.println("Days Before Due Date = " + daysBetweenProduction + " Days");
            System.out.println("Calculation Production Cost: Rp " + (long)this.getCostCalculation());
        }
    }

    public boolean checkPhonesSpecification(String androidCode) {
        int counter = 0;
        boolean check = false;

        for(Iterator var4 = Codes.ANDROIDCODES.iterator(); var4.hasNext(); ++counter) {
            String androidLevel = (String)var4.next();
            check = !androidCode.equalsIgnoreCase(androidLevel) || counter >= 3;
        }
        return check;
    }

    public boolean checkPhonesSpecification(String androidCode, int ramCapacity, int romCapacity) {
        int counter = 0;
        boolean check = false;
        System.out.println("Starting with status " + check);

        for(Iterator var6 = Codes.ANDROIDCODES.iterator(); var6.hasNext(); ++counter) {
            String androidLevel = (String)var6.next();
            if (counter < Codes.ANDROIDCODES.size() - 1 && androidLevel.equalsIgnoreCase(androidCode) && romCapacity <= 256 && ramCapacity >= 4  && romCapacity >= 64 && ramCapacity <= 16 ) {
                check = true;
            }
            else if (androidLevel.equalsIgnoreCase(androidCode) && counter <= 4 ) {
                if (ramCapacity >= 1 && romCapacity >= 32&& ramCapacity <= 8  && romCapacity <= 128 ) {
                    check = true;
                }
            }else {

            }
        }
        System.out.println("Finish checking with status " + check);
        return check;
    }
}