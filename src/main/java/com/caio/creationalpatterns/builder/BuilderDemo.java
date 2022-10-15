package com.caio.creationalpatterns.builder;

public class BuilderDemo {
    public static void main(String[] args) {

        System.out.println("LunchOrderBean");
        LunchOrderBean lunchOrderBean = new LunchOrderBean();

        lunchOrderBean.setBread("Wheat");
        lunchOrderBean.setCondiments("Lettuce");
        lunchOrderBean.setDressing("Mustard");
        lunchOrderBean.setMeat("Ham");

        System.out.println(lunchOrderBean.getBread());
        System.out.println(lunchOrderBean.getCondiments());
        System.out.println(lunchOrderBean.getDressing());
        System.out.println(lunchOrderBean.getMeat());

        System.out.println();
        System.out.println("LunchOrderTelescoping");
        LunchOrderTelescoping lunchOrderTelescoping = new LunchOrderTelescoping("Wheat", "Lettuce", "Mustard", "Ham");

        System.out.println(lunchOrderTelescoping.getBread());
        System.out.println(lunchOrderTelescoping.getCondiments());
        System.out.println(lunchOrderTelescoping.getDressing());
        System.out.println(lunchOrderTelescoping.getMeat());

        System.out.println();
        System.out.println("LunchOrder - Builder");

        LunchOrder.Builder builder = new LunchOrder.Builder();

        builder.bread("Wheat").condiments("Lettuce").dressing("Mustard").meat("Ham");

        LunchOrder lunchOrder = builder.build();

        System.out.println(lunchOrder.getBread());
        System.out.println(lunchOrder.getCondiments());
        System.out.println(lunchOrder.getDressing());
        System.out.println(lunchOrder.getMeat());

    }
}
