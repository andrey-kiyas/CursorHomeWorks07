package com.CursorHomeWorks07.Shop;

import com.CursorHomeWorks07.Shop.ShopException.BadRequestException;
import com.CursorHomeWorks07.Shop.ShopException.ShopNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ShopService {

    public final ArrayList<Shop> shopArrayList = new ArrayList<>();

    public ArrayList<Shop> getShopList() {
        return shopArrayList;
    }

    public Shop createShop(Shop shop) throws BadRequestException {
        int isExists = 0;
        for (Shop findCreatedShops : shopArrayList) {
            if (findCreatedShops.getId() == shop.getId()) {
                isExists = 1;
                break;
            }
        }
        if (isExists == 0) {
            shopArrayList.add(shop);
        } else {
            throw new BadRequestException("Shop \"id=" + shop.getId() + "\" already exists");
        }
        return shop;
    }

    public Shop findByShopId(long id) throws ShopNotFoundException {
        for (Shop shop : shopArrayList) {
            if (id == shop.getId()) {
                return shop;
            }
        }
        throw new ShopNotFoundException("Shop \"id=" + id + "\" no found");
    }

    public void deleteShop(long id) throws ShopNotFoundException {
        shopArrayList.remove(findByShopId(id));
    }

    public Shop updateShop(Shop shop) throws ShopNotFoundException {
        for (Shop findShop : shopArrayList) {
            if (findShop.getId() == shop.getId()) {
                shopArrayList.remove(findShop);
                shopArrayList.add(shop);
                return shop;
            }
        }
        throw new ShopNotFoundException("Shop \"id=" + shop.getId() + "\" no found");
    }
}
