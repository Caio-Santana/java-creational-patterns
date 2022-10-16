package com.caio.creationalpatterns.factory;

public class FactoryDemo {
    public static void main(String[] args) {
        Website shop = WebsiteFactory.getWebsite(WebsiteType.SHOP);
        System.out.println(shop);
        System.out.println(shop.pages);
        System.out.println();

        Website blog = WebsiteFactory.getWebsite(WebsiteType.BLOG);
        System.out.println(blog);
        System.out.println(blog.pages);
    }
}
