package com.example.despensappapplication.Class;

import java.util.ArrayList;
import java.util.List;

public class Service {


    public static final List<Menu> MENU_LIST(){
        List<Menu> menus = new ArrayList<>();

        Menu menu = new Menu("Stock crítico", "Conoce qué productos debes reponer en tu despensa. No esperes que se acaben.");
        Menu menu2 = new Menu("Caducidad", "Conoce qué productos vencen pronto en tu despensa. No los desperdicies.");
        Menu menu3 = new Menu("Consumo Mensual", "Conoce tu tendencia de consumo de productos mes a mes.");
        Menu menu4 = new Menu("Lista de Supermercado", "Elabora una lista de productos. Optimiza tu próxima visita al supermercado.");

        menus.add(menu);
        menus.add(menu2);
        menus.add(menu3);
        menus.add(menu4);
        return menus;
    }


}
