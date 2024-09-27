package com.revature.helperfunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;
import java.util.*;

public class HelperFunctions {


    public static Map<String, String> returnProductButtonValues(WebElement productButton){
        Map<String, String> m = new HashMap<>();
        String prodName = productButton.findElement(By.xpath("//h5")).getText();
        m.put("productName", prodName);
        String prodPrice = productButton.findElement(By.xpath("//h6")).getText();
        m.put("productPrice", prodPrice);
        return m;
    }

    //return all info(minus description) in an order card. Pass one order element to get back values as map by key (same as text on order card before ":")
    public static Map<String, String> returnOrderInfo(WebElement order){
        Map<String, String> m = new HashMap<>();
        String orderItemName = order.findElement(By.xpath("//a/p")).getText();
        m.put("orderItem", orderItemName);
        String orderDateInfo = order.findElement(By.xpath("//p[contains(text(), 'date')]")).getText();
        orderDateInfo = orderDateInfo.substring(orderDateInfo.indexOf(":") + 1);
        m.put("orderDate", orderDateInfo);
        String orderTotalInfo = order.findElement(By.xpath("//p[contains(text(), 'total')]")).getText();
        orderTotalInfo = orderTotalInfo.substring(orderTotalInfo.indexOf("$") + 1);
        m.put("orderTotal", orderTotalInfo);
        String orderDetailIdInfo = order.findElement(By.xpath("//p[contains(text(), 'OrderDetail')]")).getText();
        orderDetailIdInfo = orderDetailIdInfo.substring(orderDetailIdInfo.indexOf(":") + 1);
        m.put("orderDetailId", orderDetailIdInfo);
        String orderIdInfo = order.findElement(By.xpath("//p[contains(text(), 'Order ID')]")).getText();
        orderIdInfo = orderIdInfo.substring(orderIdInfo.indexOf(":") + 1);
        m.put("orderId", orderIdInfo);
        String orderQuantityInfo = order.findElement(By.xpath("//p[contains(text(), 'OrderDetail')]")).getText();
        orderQuantityInfo = orderQuantityInfo.substring(orderQuantityInfo.indexOf(":") + 1);
        m.put("orderQuantity", orderQuantityInfo);
        String orderProductIdInfo  = order.findElement(By.xpath("//p[contains(text(), 'OrderDetail')]")).getText();
        orderProductIdInfo = orderProductIdInfo.substring(orderProductIdInfo.indexOf(":") + 1);
        m.put("orderProductId", orderProductIdInfo);
        return m;
    }

}
